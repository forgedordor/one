package defpackage;

import java.io.InterruptedIOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffei implements feyr {
    final /* synthetic */ ffej a;
    private boolean b;

    public ffei(ffej ffejVar) {
        this.a = ffejVar;
    }

    @Override // defpackage.feyr
    public final fezh a(ffba ffbaVar) {
        ffej ffejVar = this.a;
        Object obj = ffejVar.h;
        synchronized (obj) {
            ffejVar.j = false;
            ffejVar.k = ((ffam) ffbaVar.a()).a.b;
            ffejVar.l = ((ffam) ffbaVar.a()).d;
            obj.notifyAll();
            while (!this.b) {
                try {
                    obj.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            }
        }
        fezb fezbVarE = ffbaVar.c;
        fezf fezfVar = fezbVarE.d;
        if (fezfVar instanceof ffem) {
            fezbVarE = ((ffem) fezfVar).e(fezbVarE);
        }
        fezh fezhVarB = ffbaVar.b(fezbVarE);
        synchronized (obj) {
            ffejVar.i = fezhVarB;
            ffejVar.url = fezhVarB.a.a.g();
        }
        return fezhVarB;
    }

    public final void b() {
        Object obj = this.a.h;
        synchronized (obj) {
            this.b = true;
            obj.notifyAll();
        }
    }
}
