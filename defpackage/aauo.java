package defpackage;

import com.google.android.apps.messaging.datadonation.ui.DataDonationActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aauo extends cukc {
    private boolean n = false;

    public aauo() {
        x(new aaun(this));
    }

    @Override // defpackage.cukp
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        DataDonationActivity dataDonationActivity = (DataDonationActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        dataDonationActivity.s = (cogw) ahknVar.cD.b();
        dataDonationActivity.t = (cukm) ahhkVar.f.b();
        dataDonationActivity.u = ahhkVar.h;
        dataDonationActivity.v = (baci) ahknVar.dg.b();
        dataDonationActivity.w = (cpch) ahknVar.a.qj.b();
        dataDonationActivity.x = ahhkVar.i;
    }
}
