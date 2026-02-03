package defpackage;

import com.google.android.apps.messaging.ui.debug.DebugMmsConfigActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cxsv extends cukc {
    private boolean n = false;

    public cxsv() {
        x(new cxsu(this));
    }

    @Override // defpackage.cukp
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        DebugMmsConfigActivity debugMmsConfigActivity = (DebugMmsConfigActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        debugMmsConfigActivity.s = (cogw) ahknVar.cD.b();
        debugMmsConfigActivity.t = (cukm) ahhkVar.f.b();
        debugMmsConfigActivity.u = ahhkVar.h;
        debugMmsConfigActivity.v = (baci) ahknVar.dg.b();
        debugMmsConfigActivity.w = (cpch) ahknVar.a.qj.b();
        debugMmsConfigActivity.x = ahhkVar.i;
    }
}
