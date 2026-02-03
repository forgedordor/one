package defpackage;

import com.google.android.apps.messaging.privacy.identitydetails.IdentityDetailsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahcd extends cukf {
    private boolean n = false;

    public ahcd() {
        x(new ahcc(this));
    }

    @Override // defpackage.cukr, defpackage.cukp
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        IdentityDetailsActivity identityDetailsActivity = (IdentityDetailsActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        identityDetailsActivity.s = (cogw) ahknVar.cD.b();
        identityDetailsActivity.t = (cukm) ahhkVar.f.b();
        identityDetailsActivity.u = ahhkVar.h;
        identityDetailsActivity.v = (baci) ahknVar.dg.b();
        ahnh ahnhVar = ahknVar.a;
        identityDetailsActivity.w = (cpch) ahnhVar.qj.b();
        identityDetailsActivity.x = ahhkVar.i;
        identityDetailsActivity.A = ahnhVar.Wy;
        identityDetailsActivity.B = ahnhVar.wF;
        identityDetailsActivity.C = ahknVar.da;
        identityDetailsActivity.D = ahhkVar.k;
        identityDetailsActivity.E = (eigp) ahknVar.aI.b();
        identityDetailsActivity.F = ahhkVar.f;
        identityDetailsActivity.G = ahknVar.b.mW;
    }
}
