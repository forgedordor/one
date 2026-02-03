package defpackage;

import com.google.android.apps.messaging.ui.debug.cloudstore.d2d.D2dToolsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cybl extends cukc {
    private boolean n = false;

    public cybl() {
        x(new cybk(this));
    }

    @Override // defpackage.cukp
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        D2dToolsActivity d2dToolsActivity = (D2dToolsActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        d2dToolsActivity.s = (cogw) ahknVar.cD.b();
        d2dToolsActivity.t = (cukm) ahhkVar.f.b();
        d2dToolsActivity.u = ahhkVar.h;
        d2dToolsActivity.v = (baci) ahknVar.dg.b();
        d2dToolsActivity.w = (cpch) ahknVar.a.qj.b();
        d2dToolsActivity.x = ahhkVar.i;
    }
}
