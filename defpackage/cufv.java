package defpackage;

import com.google.android.apps.messaging.suggestions.settings.SmartActionSettingsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cufv extends aiic {
    private boolean L = false;

    public cufv() {
        x(new cufu(this));
    }

    @Override // defpackage.aiih, defpackage.cukt, defpackage.cukr, defpackage.cukp
    protected final void B() {
        if (this.L) {
            return;
        }
        this.L = true;
        SmartActionSettingsActivity smartActionSettingsActivity = (SmartActionSettingsActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        smartActionSettingsActivity.s = (cogw) ahknVar.cD.b();
        smartActionSettingsActivity.t = (cukm) ahhkVar.f.b();
        smartActionSettingsActivity.u = ahhkVar.h;
        smartActionSettingsActivity.v = (baci) ahknVar.dg.b();
        ahnh ahnhVar = ahknVar.a;
        smartActionSettingsActivity.w = (cpch) ahnhVar.qj.b();
        smartActionSettingsActivity.x = ahhkVar.i;
        smartActionSettingsActivity.A = ahnhVar.Wy;
        smartActionSettingsActivity.B = ahnhVar.wF;
        smartActionSettingsActivity.C = ahknVar.da;
        smartActionSettingsActivity.D = ahhkVar.k;
        smartActionSettingsActivity.E = (eigp) ahknVar.aI.b();
        smartActionSettingsActivity.F = ahhkVar.f;
        smartActionSettingsActivity.G = ahknVar.b.mW;
        smartActionSettingsActivity.I = ahhkVar.c.bu;
        smartActionSettingsActivity.J = ahnhVar.adO;
        smartActionSettingsActivity.K = (eg) ahhkVar.g.b();
        ((aiic) smartActionSettingsActivity).n = ahnhVar.adE;
    }
}
