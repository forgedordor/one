package defpackage;

import com.google.android.apps.messaging.conversation.settings.InfoAndOptionsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class uqw extends upu {
    private boolean n = false;

    public uqw() {
        x(new uqv(this));
    }

    @Override // defpackage.uqs, defpackage.cukt, defpackage.cukr, defpackage.cukp
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        InfoAndOptionsActivity infoAndOptionsActivity = (InfoAndOptionsActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        infoAndOptionsActivity.s = (cogw) ahknVar.cD.b();
        infoAndOptionsActivity.t = (cukm) ahhkVar.f.b();
        infoAndOptionsActivity.u = ahhkVar.h;
        infoAndOptionsActivity.v = (baci) ahknVar.dg.b();
        ahnh ahnhVar = ahknVar.a;
        infoAndOptionsActivity.w = (cpch) ahnhVar.qj.b();
        infoAndOptionsActivity.x = ahhkVar.i;
        infoAndOptionsActivity.A = ahnhVar.Wy;
        infoAndOptionsActivity.B = ahnhVar.wF;
        infoAndOptionsActivity.C = ahknVar.da;
        infoAndOptionsActivity.D = ahhkVar.k;
        infoAndOptionsActivity.E = (eigp) ahknVar.aI.b();
        infoAndOptionsActivity.F = ahhkVar.f;
        infoAndOptionsActivity.G = ahknVar.b.mW;
        infoAndOptionsActivity.I = ahhkVar.c.bu;
        infoAndOptionsActivity.J = ahnhVar.adO;
        infoAndOptionsActivity.K = (eg) ahhkVar.g.b();
    }
}
