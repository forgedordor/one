package defpackage;

import com.google.android.apps.messaging.ui.debug.DebugPrefsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cxtb extends cukc {
    private boolean n = false;

    public cxtb() {
        x(new cxta(this));
    }

    @Override // defpackage.cukp
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        DebugPrefsActivity debugPrefsActivity = (DebugPrefsActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        debugPrefsActivity.s = (cogw) ahknVar.cD.b();
        debugPrefsActivity.t = (cukm) ahhkVar.f.b();
        debugPrefsActivity.u = ahhkVar.h;
        debugPrefsActivity.v = (baci) ahknVar.dg.b();
        debugPrefsActivity.w = (cpch) ahknVar.a.qj.b();
        debugPrefsActivity.x = ahhkVar.i;
    }
}
