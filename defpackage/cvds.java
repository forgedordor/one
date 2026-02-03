package defpackage;

import com.google.android.apps.messaging.ui.appsettings.protectionandsafety.ProtectionSafetySettingsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cvds extends aiic {
    private boolean L = false;

    public cvds() {
        x(new cvdr(this));
    }

    @Override // defpackage.aiih, defpackage.cukt, defpackage.cukr, defpackage.cukp
    protected final void B() {
        if (this.L) {
            return;
        }
        this.L = true;
        ProtectionSafetySettingsActivity protectionSafetySettingsActivity = (ProtectionSafetySettingsActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        protectionSafetySettingsActivity.s = (cogw) ahknVar.cD.b();
        protectionSafetySettingsActivity.t = (cukm) ahhkVar.f.b();
        protectionSafetySettingsActivity.u = ahhkVar.h;
        protectionSafetySettingsActivity.v = (baci) ahknVar.dg.b();
        ahnh ahnhVar = ahknVar.a;
        protectionSafetySettingsActivity.w = (cpch) ahnhVar.qj.b();
        protectionSafetySettingsActivity.x = ahhkVar.i;
        protectionSafetySettingsActivity.A = ahnhVar.Wy;
        protectionSafetySettingsActivity.B = ahnhVar.wF;
        protectionSafetySettingsActivity.C = ahknVar.da;
        protectionSafetySettingsActivity.D = ahhkVar.k;
        protectionSafetySettingsActivity.E = (eigp) ahknVar.aI.b();
        protectionSafetySettingsActivity.F = ahhkVar.f;
        protectionSafetySettingsActivity.G = ahknVar.b.mW;
        protectionSafetySettingsActivity.I = ahhkVar.c.bu;
        protectionSafetySettingsActivity.J = ahnhVar.adO;
        protectionSafetySettingsActivity.K = (eg) ahhkVar.g.b();
        ((aiic) protectionSafetySettingsActivity).n = ahnhVar.adE;
    }
}
