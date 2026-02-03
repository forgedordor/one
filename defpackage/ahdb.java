package defpackage;

import com.google.android.apps.messaging.privacy.settings.PrivacySettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ahdb extends aiic {
    private boolean L = false;

    public ahdb() {
        x(new ahda(this));
    }

    @Override // defpackage.aiih, defpackage.cukt, defpackage.cukr, defpackage.cukp
    protected final void B() {
        if (this.L) {
            return;
        }
        this.L = true;
        PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        privacySettingsActivity.s = (cogw) ahknVar.cD.b();
        privacySettingsActivity.t = (cukm) ahhkVar.f.b();
        privacySettingsActivity.u = ahhkVar.h;
        privacySettingsActivity.v = (baci) ahknVar.dg.b();
        ahnh ahnhVar = ahknVar.a;
        privacySettingsActivity.w = (cpch) ahnhVar.qj.b();
        privacySettingsActivity.x = ahhkVar.i;
        privacySettingsActivity.A = ahnhVar.Wy;
        privacySettingsActivity.B = ahnhVar.wF;
        privacySettingsActivity.C = ahknVar.da;
        privacySettingsActivity.D = ahhkVar.k;
        privacySettingsActivity.E = (eigp) ahknVar.aI.b();
        privacySettingsActivity.F = ahhkVar.f;
        privacySettingsActivity.G = ahknVar.b.mW;
        privacySettingsActivity.I = ahhkVar.c.bu;
        privacySettingsActivity.J = ahnhVar.adO;
        privacySettingsActivity.K = (eg) ahhkVar.g.b();
        ((aiic) privacySettingsActivity).n = ahnhVar.adE;
    }
}
