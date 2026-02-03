package defpackage;

import com.google.android.apps.messaging.cloudstore.fi.FiAccountConfirmationActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class trx extends cukc {
    private boolean n = false;

    public trx() {
        x(new trw(this));
    }

    @Override // defpackage.cukp
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        FiAccountConfirmationActivity fiAccountConfirmationActivity = (FiAccountConfirmationActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        fiAccountConfirmationActivity.s = (cogw) ahknVar.cD.b();
        fiAccountConfirmationActivity.t = (cukm) ahhkVar.f.b();
        fiAccountConfirmationActivity.u = ahhkVar.h;
        fiAccountConfirmationActivity.v = (baci) ahknVar.dg.b();
        fiAccountConfirmationActivity.w = (cpch) ahknVar.a.qj.b();
        fiAccountConfirmationActivity.x = ahhkVar.i;
    }
}
