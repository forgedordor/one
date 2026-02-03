package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcjd implements Runnable {
    final /* synthetic */ fcjf a;

    public fcjd(fcjf fcjfVar) {
        this.a = fcjfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fcjf fcjfVar = this.a;
        if (!fcjfVar.e) {
            fcjfVar.f = null;
            return;
        }
        long jA = fcjfVar.d - fcjfVar.a();
        if (jA > 0) {
            fcjfVar.f = fcjfVar.a.schedule(new fcje(fcjfVar), jA, TimeUnit.NANOSECONDS);
            return;
        }
        fcjfVar.e = false;
        fcjfVar.f = null;
        fcjfVar.c.run();
    }
}
