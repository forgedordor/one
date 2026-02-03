package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehwc {
    public ehwe a;
    private long b = -1;

    public final ehwd a() {
        return new ehvy(this.a, this.b);
    }

    public final void b(long j, TimeUnit timeUnit) {
        ejwl.a(true);
        this.b = TimeUnit.MILLISECONDS.convert(j, timeUnit);
    }
}
