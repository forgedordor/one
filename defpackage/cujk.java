package defpackage;

import com.google.android.apps.messaging.ui.ClassZeroActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cujk extends cukc {
    private boolean n = false;

    public cujk() {
        x(new cujj(this));
    }

    @Override // defpackage.cukp
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        ClassZeroActivity classZeroActivity = (ClassZeroActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        classZeroActivity.s = (cogw) ahknVar.cD.b();
        classZeroActivity.t = (cukm) ahhkVar.f.b();
        classZeroActivity.u = ahhkVar.h;
        classZeroActivity.v = (baci) ahknVar.dg.b();
        ahnh ahnhVar = ahknVar.a;
        classZeroActivity.w = (cpch) ahnhVar.qj.b();
        classZeroActivity.x = ahhkVar.i;
        classZeroActivity.r = (aycg) ahknVar.b.ee.b();
        classZeroActivity.n = ahnhVar.c;
        classZeroActivity.o = ahnhVar.pf;
    }
}
