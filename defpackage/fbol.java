package defpackage;

import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbol implements Comparable {
    public static final fbok a = new fboj();
    private static final long d;
    private static final long e;
    private static final long f;
    public final fbok b;
    public final long c;
    private volatile boolean g;

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        d = nanos;
        e = -nanos;
        f = TimeUnit.SECONDS.toNanos(1L);
    }

    private fbol(fbok fbokVar, long j, long j2) {
        this.b = fbokVar;
        long jMin = Math.min(d, Math.max(e, j2));
        this.c = j + jMin;
        this.g = jMin <= 0;
    }

    public static fbol c(long j, TimeUnit timeUnit) {
        return d(j, timeUnit, a);
    }

    public static fbol d(long j, TimeUnit timeUnit, fbok fbokVar) {
        timeUnit.getClass();
        return new fbol(fbokVar, System.nanoTime(), timeUnit.toNanos(j));
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(fbol fbolVar) {
        e(fbolVar);
        return Long.compare(this.c, fbolVar.c);
    }

    public final long b(TimeUnit timeUnit) {
        long jNanoTime = System.nanoTime();
        if (!this.g && this.c - jNanoTime <= 0) {
            this.g = true;
        }
        return timeUnit.convert(this.c - jNanoTime, TimeUnit.NANOSECONDS);
    }

    public final void e(fbol fbolVar) {
        fbok fbokVar = this.b;
        fbok fbokVar2 = fbolVar.b;
        if (fbokVar == fbokVar2) {
            return;
        }
        throw new AssertionError("Tickers (" + fbokVar.toString() + " and " + fbokVar2.toString() + ") don't match. Custom Ticker should only be used in tests!");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fbol)) {
            return false;
        }
        fbol fbolVar = (fbol) obj;
        return this.b == fbolVar.b && this.c == fbolVar.c;
    }

    public final boolean f(fbol fbolVar) {
        e(fbolVar);
        return this.c - fbolVar.c < 0;
    }

    public final boolean g() {
        if (!this.g) {
            if (this.c - System.nanoTime() > 0) {
                return false;
            }
            this.g = true;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.b, Long.valueOf(this.c));
    }

    public final String toString() {
        long jB = b(TimeUnit.NANOSECONDS);
        long jAbs = Math.abs(jB);
        long j = f;
        long j2 = jAbs / j;
        long jAbs2 = Math.abs(jB) % j;
        StringBuilder sb = new StringBuilder();
        if (jB < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (jAbs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        fbok fbokVar = this.b;
        if (fbokVar != a) {
            sb.append(a.b(fbokVar, " (ticker=", ")"));
        }
        return sb.toString();
    }
}
