package defpackage;

import com.google.android.apps.messaging.messagedetails.MessageDetailsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class afkq extends cukn {
    private boolean n = false;

    public afkq() {
        x(new afkp(this));
    }

    @Override // defpackage.cukt, defpackage.cukr, defpackage.cukp
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        MessageDetailsActivity messageDetailsActivity = (MessageDetailsActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        messageDetailsActivity.s = (cogw) ahknVar.cD.b();
        messageDetailsActivity.t = (cukm) ahhkVar.f.b();
        messageDetailsActivity.u = ahhkVar.h;
        messageDetailsActivity.v = (baci) ahknVar.dg.b();
        ahnh ahnhVar = ahknVar.a;
        messageDetailsActivity.w = (cpch) ahnhVar.qj.b();
        messageDetailsActivity.x = ahhkVar.i;
        messageDetailsActivity.A = ahnhVar.Wy;
        messageDetailsActivity.B = ahnhVar.wF;
        messageDetailsActivity.C = ahknVar.da;
        messageDetailsActivity.D = ahhkVar.k;
        messageDetailsActivity.E = (eigp) ahknVar.aI.b();
        messageDetailsActivity.F = ahhkVar.f;
        messageDetailsActivity.G = ahknVar.b.mW;
        messageDetailsActivity.I = ahhkVar.c.bu;
        messageDetailsActivity.J = ahnhVar.adO;
        messageDetailsActivity.K = (eg) ahhkVar.g.b();
    }
}
