package defpackage;

import com.google.android.apps.messaging.welcome.v1.SignedInWelcomeActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class datj extends cukc {
    private boolean n = false;

    public datj() {
        x(new dati(this));
    }

    @Override // defpackage.cukp
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        SignedInWelcomeActivity signedInWelcomeActivity = (SignedInWelcomeActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        signedInWelcomeActivity.s = (cogw) ahknVar.cD.b();
        signedInWelcomeActivity.t = (cukm) ahhkVar.f.b();
        signedInWelcomeActivity.u = ahhkVar.h;
        signedInWelcomeActivity.v = (baci) ahknVar.dg.b();
        signedInWelcomeActivity.w = (cpch) ahknVar.a.qj.b();
        signedInWelcomeActivity.x = ahhkVar.i;
    }
}
