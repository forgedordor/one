package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eaef implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ eosd b;
    final /* synthetic */ long c;
    final /* synthetic */ TimeUnit d;

    public eaef(Runnable runnable, eosd eosdVar, long j, TimeUnit timeUnit) {
        this.a = runnable;
        this.b = eosdVar;
        this.c = j;
        this.d = timeUnit;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
        eadw.a(this.b.schedule(this, this.c, this.d));
    }
}
