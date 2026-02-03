package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecgv implements echr {
    public final ecgu a;
    private final ecgt b;
    private final long c;
    private long d;

    public ecgv(ecgu ecguVar, ecgt ecgtVar, long j, TimeUnit timeUnit) {
        this.a = ecguVar;
        this.b = ecgtVar;
        this.c = timeUnit.toMillis(j);
        this.d = ecgtVar.a();
    }

    @Override // defpackage.echr
    public final void a(int i) {
        ecgu ecguVar = this.a;
        ecguVar.a(i);
        ecgt ecgtVar = this.b;
        if (ecgtVar.a() - this.d >= this.c) {
            ecguVar.b();
            this.d = ecgtVar.a();
        }
    }

    @Override // defpackage.echr, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.b();
    }
}
