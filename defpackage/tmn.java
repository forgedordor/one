package defpackage;

import com.google.android.apps.messaging.cloudstore.accounts.FiAccountActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tmn extends aiic {
    private boolean L = false;

    public tmn() {
        x(new tmm(this));
    }

    @Override // defpackage.aiih, defpackage.cukt, defpackage.cukr, defpackage.cukp
    protected final void B() {
        if (this.L) {
            return;
        }
        this.L = true;
        FiAccountActivity fiAccountActivity = (FiAccountActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        fiAccountActivity.s = (cogw) ahknVar.cD.b();
        fiAccountActivity.t = (cukm) ahhkVar.f.b();
        fiAccountActivity.u = ahhkVar.h;
        fiAccountActivity.v = (baci) ahknVar.dg.b();
        ahnh ahnhVar = ahknVar.a;
        fiAccountActivity.w = (cpch) ahnhVar.qj.b();
        fiAccountActivity.x = ahhkVar.i;
        fiAccountActivity.A = ahnhVar.Wy;
        fiAccountActivity.B = ahnhVar.wF;
        fiAccountActivity.C = ahknVar.da;
        fiAccountActivity.D = ahhkVar.k;
        fiAccountActivity.E = (eigp) ahknVar.aI.b();
        fiAccountActivity.F = ahhkVar.f;
        fiAccountActivity.G = ahknVar.b.mW;
        fiAccountActivity.I = ahhkVar.c.bu;
        fiAccountActivity.J = ahnhVar.adO;
        fiAccountActivity.K = (eg) ahhkVar.g.b();
        ((aiic) fiAccountActivity).n = ahnhVar.adE;
    }
}
