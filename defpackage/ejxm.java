package defpackage;

import j$.time.Duration;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejxm {
    public boolean a;
    private final ejya b;
    private long c;
    private long d;

    public ejxm() {
        this.b = ejya.b;
    }

    public static ejxm b() {
        ejxm ejxmVar = new ejxm();
        ejxmVar.f();
        return ejxmVar;
    }

    public static ejxm c(ejya ejyaVar) {
        ejxm ejxmVar = new ejxm(ejyaVar);
        ejxmVar.f();
        return ejxmVar;
    }

    private final long h() {
        return this.a ? (this.b.a() - this.d) + this.c : this.c;
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(h(), TimeUnit.NANOSECONDS);
    }

    public final Duration d() {
        return Duration.ofNanos(h());
    }

    public final void e() {
        this.c = 0L;
        this.a = false;
    }

    public final void f() {
        ejwl.m(!this.a, "This stopwatch is already running.");
        this.a = true;
        this.d = this.b.a();
    }

    public final void g() {
        long jA = this.b.a();
        ejwl.m(this.a, "This stopwatch is already stopped.");
        this.a = false;
        this.c += jA - this.d;
    }

    public final String toString() {
        String str;
        long jH = h();
        TimeUnit timeUnit = TimeUnit.DAYS.convert(jH, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.DAYS : TimeUnit.HOURS.convert(jH, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.HOURS : TimeUnit.MINUTES.convert(jH, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.MINUTES : TimeUnit.SECONDS.convert(jH, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.SECONDS : TimeUnit.MILLISECONDS.convert(jH, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.MILLISECONDS : TimeUnit.MICROSECONDS.convert(jH, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jH / TimeUnit.NANOSECONDS.convert(1L, timeUnit)));
        switch (ejxl.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return a.q(str, str2, " ");
    }

    public ejxm(ejya ejyaVar) {
        ejyaVar.getClass();
        this.b = ejyaVar;
    }
}
