package defpackage;

import com.google.android.apps.messaging.ui.gaia.verification.GaiaPairingVerificationActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cyts extends cukc {
    private boolean n = false;

    public cyts() {
        x(new cytr(this));
    }

    @Override // defpackage.cukp
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        GaiaPairingVerificationActivity gaiaPairingVerificationActivity = (GaiaPairingVerificationActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        gaiaPairingVerificationActivity.s = (cogw) ahknVar.cD.b();
        gaiaPairingVerificationActivity.t = (cukm) ahhkVar.f.b();
        gaiaPairingVerificationActivity.u = ahhkVar.h;
        gaiaPairingVerificationActivity.v = (baci) ahknVar.dg.b();
        gaiaPairingVerificationActivity.w = (cpch) ahknVar.a.qj.b();
        gaiaPairingVerificationActivity.x = ahhkVar.i;
    }
}
