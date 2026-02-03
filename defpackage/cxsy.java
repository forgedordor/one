package defpackage;

import com.google.android.apps.messaging.ui.debug.DebugMobileConfigurationActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cxsy extends cukc {
    private boolean n = false;

    public cxsy() {
        x(new cxsx(this));
    }

    @Override // defpackage.cukp
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        DebugMobileConfigurationActivity debugMobileConfigurationActivity = (DebugMobileConfigurationActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        debugMobileConfigurationActivity.s = (cogw) ahknVar.cD.b();
        debugMobileConfigurationActivity.t = (cukm) ahhkVar.f.b();
        debugMobileConfigurationActivity.u = ahhkVar.h;
        debugMobileConfigurationActivity.v = (baci) ahknVar.dg.b();
        debugMobileConfigurationActivity.w = (cpch) ahknVar.a.qj.b();
        debugMobileConfigurationActivity.x = ahhkVar.i;
    }
}
