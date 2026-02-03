package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahnq implements eyik {
    private final ahkn a;
    private final ahho b;
    private final ahhk c;
    private final ahnr d;
    private final int e;

    public ahnq(ahkn ahknVar, ahho ahhoVar, ahhk ahhkVar, ahnr ahnrVar, int i) {
        this.a = ahknVar;
        this.b = ahhoVar;
        this.c = ahhkVar;
        this.d = ahnrVar;
        this.e = i;
    }

    @Override // defpackage.fcsu
    public final Object b() {
        switch (this.e) {
            case 1:
                return Optional.of((cvun) this.c.bc.b());
            case 2:
                ahkn ahknVar = this.a.b.a;
                bvur bvurVar = (bvur) ahknVar.dL.b();
                ahnh ahnhVar = ahknVar.a;
                acgu acguVar = (acgu) ahnhVar.ws.b();
                eyik eyikVar = ahnhVar.QN;
                bwtv bwtvVar = new bwtv(bvurVar, acguVar, (aptw) eyikVar.b());
                bwtw bwtwVar = new bwtw();
                bwtx bwtxVar = new bwtx();
                return ekhx.v(bwtvVar, bwtwVar, bwtxVar, new bwty(), new bwtz((Context) ahknVar.t.b(), (aptw) eyikVar.b()), new bwua((aptw) eyikVar.b()), new bwud((Context) ahknVar.t.b(), ahnhVar.pQ, (aptw) eyikVar.b()));
            case 3:
                ahkn ahknVar2 = this.a;
                ahnh ahnhVar2 = ahknVar2.a;
                return new bagg(ahnhVar2.adA, ahnhVar2.wF, ahknVar2.de, ahknVar2.dL, ahknVar2.id);
            case 4:
                return Optional.of((uqm) this.b.cr.b());
            case 5:
                ahkn ahknVar3 = this.a;
                Context context = (Context) ahknVar3.t.b();
                ahnh ahnhVar3 = ahknVar3.a;
                return new baix(context, (cpbn) ahnhVar3.qo.b(), ahnhVar3.qi);
            case 6:
                return new cvnw(new cvmt());
            case 7:
                ahkn ahknVar4 = this.a;
                return new aomc((Context) ahknVar4.t.b(), (eosd) ahknVar4.p.b(), (eosc) ahknVar4.y.b(), new aolx(), (ctce) ahknVar4.a.yp.b());
            case 8:
                ahkn ahknVar5 = this.a;
                return new airc(ahknVar5.a.zs, new aiqn(), (Executor) ahknVar5.p.b());
            case 9:
                ahkn ahknVar6 = this.a;
                return new airh(ahknVar6.a.zs, new aiqn(), (Executor) ahknVar6.p.b());
            case 10:
                ahho ahhoVar = this.b;
                ahkn ahknVar7 = this.a;
                eyik eyikVar2 = ahhoVar.ce;
                eyik eyikVar3 = ahknVar7.b.jn;
                eyik eyikVar4 = ahknVar7.gF;
                czqs czqsVar = (czqs) eyikVar2.b();
                ahnh ahnhVar4 = ahknVar7.a;
                ains ainsVar = (ains) ahnhVar4.c.b();
                return new dajd(ahhoVar.bA, eyikVar3, eyikVar4, czqsVar, ainsVar, ahnhVar4.Uk, (dakl) ahnhVar4.BK.b(), (eigp) ahknVar7.aI.b());
            case 11:
                return Optional.of(this.a.b.L());
            case 12:
                ahng ahngVar = this.a.b;
                return Optional.of(new cwmp(ahngVar.a.hD, ahngVar.ma));
            case 13:
                return Optional.of(this.a.b.bM());
            case 14:
                return Optional.of(new ahsn(this.a.b.pd));
            case 15:
                ahho ahhoVar2 = this.b;
                ahkn ahknVar8 = ahhoVar2.a;
                ahng ahngVar2 = ahknVar8.b;
                ahngVar2.dm();
                eyik eyikVar5 = ahngVar2.hR;
                eyik eyikVar6 = ahngVar2.hS;
                eyikVar5.getClass();
                eyikVar6.getClass();
                ahngVar2.a.aI.getClass();
                int i = unx.a;
                ekgp.n(ckyd.SMS_TRANSPORT, ahngVar2.nW, ckyd.MMS_TRANSPORT, ahngVar2.nX, ckyd.RCS_FALLBACK, ahhoVar2.bZ);
                int i2 = ckyb.a;
                ahngVar2.h();
                ahngVar2.dn();
                return Optional.of(new unj());
            case 16:
                Object objB = this.d.p.b();
                objB.getClass();
                return (cwkr) objB;
            case 17:
                return new cwkr();
            case 18:
                ahkn ahknVar9 = this.a;
                ahnh ahnhVar5 = ahknVar9.a;
                return new ajfk((fdjx) ahnhVar5.oQ.b(), (fcyh) ahknVar9.cz.b(), (cogw) ahknVar9.cD.b(), ahnhVar5.uM, ahnhVar5.rc);
            case 19:
                ahhk ahhkVar = this.c;
                Context context2 = (Context) ahhkVar.d.b();
                ahkn ahknVar10 = this.a;
                cqmb cqmbVar = (cqmb) ahknVar10.cU.b();
                ahnh ahnhVar6 = ahknVar10.a;
                acgu acguVar2 = (acgu) ahnhVar6.ws.b();
                crba crbaVar = (crba) ahknVar10.jt.b();
                crqv crqvVar = (crqv) ahknVar10.aT.b();
                ajhd ajhdVar = (ajhd) ahnhVar6.yw.b();
                cogw cogwVar = (cogw) ahknVar10.cD.b();
                eyik eyikVar7 = this.b.cs;
                eyik eyikVar8 = ahnhVar6.BQ;
                aykm aykmVar = (aykm) eyikVar7.b();
                ahnr ahnrVar = this.d;
                return new cwoz(context2, cqmbVar, acguVar2, crbaVar, crqvVar, ajhdVar, cogwVar, eyikVar8, aykmVar, eyie.a(ahhkVar.bb), ahnrVar.m(), (eigp) ahknVar10.aI.b(), ahnrVar.s, ahknVar10.b.kR);
            case 20:
                return Optional.of((ztw) this.a.b.iL.b());
            case 21:
                return new bxqt();
            case 22:
                return new cwuj((Context) this.a.t.b());
            case 23:
                ahkn ahknVar11 = this.a;
                return new aiqr(ahknVar11.a.zs, new aiqn(), (Executor) ahknVar11.p.b());
            case 24:
                ahkn ahknVar12 = this.a;
                ahnr ahnrVar2 = this.d;
                return new dniv(ahknVar12.b.ho, ahnrVar2.u, ahnrVar2.v, ahknVar12.lo);
            case 25:
                ahkn ahknVar13 = this.a;
                return new dnji(ahknVar13.a.m, ahknVar13.lp, ahknVar13.b.hr);
            default:
                ahkn ahknVar14 = this.a;
                return new dnje(ahknVar14.a.m, ahknVar14.b.hm);
        }
    }
}
