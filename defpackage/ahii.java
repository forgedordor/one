package defpackage;

import android.content.Context;
import androidx.car.app.hardware.info.EnergyProfile;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahii implements eyik {
    private final ahkn a;
    private final ahij b;
    private final int c;

    public ahii(ahkn ahknVar, ahij ahijVar, int i) {
        this.a = ahknVar;
        this.b = ahijVar;
        this.c = i;
    }

    @Override // defpackage.fcsu
    public final Object b() {
        switch (this.c) {
            case 0:
                ahkn ahknVar = this.a;
                eyik eyikVar = ahknVar.t;
                ahnh ahnhVar = ahknVar.a;
                return new syx(eyikVar, ahnhVar.pb, ahknVar.p, ahnhVar.AB, ahknVar.lk, ahknVar.cE, ahnhVar.xh, ahnhVar.adI, ahnhVar.qo, ahknVar.b.pr);
            case 1:
                ahij ahijVar = this.b;
                ahkn ahknVar2 = this.a;
                return new esty(ahijVar.a, (ScheduledExecutorService) ahknVar2.p.b(), (fbpc) ahknVar2.a.Mj.b(), ejwi.j((List) ahknVar2.b.ps.b()));
            case 2:
                ahkn ahknVar3 = this.a;
                Context context = (Context) ahknVar3.t.b();
                abpk abpkVar = (abpk) ahknVar3.a.LB.b();
                ahij ahijVar2 = this.b;
                return new abfa(context, abpkVar, ahijVar2.e, (abte) ahijVar2.f.b(), (abtp) ahijVar2.g.b());
            case 3:
                return new ekph("Bugle_DittoSatellite");
            case 4:
                ahkn ahknVar4 = this.a;
                return new abte(ahknVar4.aI, ahknVar4.a.us, ahknVar4.dK);
            case 5:
                return new abtp(this.a.a.c);
            case 6:
                ahkn ahknVar5 = this.a;
                ahnh ahnhVar2 = ahknVar5.a;
                eyik eyikVar2 = ahnhVar2.LC;
                eyik eyikVarA = eyil.a(ahnhVar2.LB);
                ahij ahijVar3 = this.b;
                ahng ahngVar = ahknVar5.b;
                return new abmr(eyikVar2, eyikVarA, ahknVar5.p, ahnhVar2.j, ahnhVar2.c, ahngVar.nf, ahknVar5.lT, ahnhVar2.us, eyil.a(ahijVar3.j));
            case 7:
                return new abpo(this.b.i);
            case 8:
                ahng ahngVar2 = this.a.b;
                ekgi ekgiVarH = ekgp.h(11);
                ekgiVarH.i(111, ahngVar2.ok);
                ekgiVarH.i(110, ahngVar2.ol);
                ekgiVarH.i(109, ahngVar2.nq);
                ekgiVarH.i(100, ahngVar2.om);
                ekgiVarH.i(108, ahngVar2.on);
                ekgiVarH.i(Integer.valueOf(EnergyProfile.EVCONNECTOR_TYPE_OTHER), ahngVar2.oi);
                ekgiVarH.i(207, ahngVar2.oo);
                ekgiVarH.i(106, ahngVar2.op);
                ekgiVarH.i(105, ahngVar2.oq);
                ekgiVarH.i(104, ahngVar2.or);
                ekgiVarH.i(107, ahngVar2.pu);
                return ekgiVarH.c();
            case 9:
                return new cdee(this.b.o);
            case 10:
                ahkn ahknVar6 = this.a;
                ahij ahijVar4 = this.b;
                eyik eyikVar3 = ahijVar4.n;
                eyik eyikVar4 = ahijVar4.m;
                return ekgp.o("CMS", ahknVar6.b.pB, "Bugle", ahijVar4.l, "GDitto", eyikVar4, "RCS", eyikVar3);
            case 11:
                return new cdbv(eyie.a(this.a.a.xj));
            case 12:
                ahkn ahknVar7 = this.a;
                eyik eyikVar5 = ahknVar7.t;
                ahnh ahnhVar3 = ahknVar7.a;
                eygg eyggVarA = eyie.a(ahnhVar3.rK);
                eyik eyikVar6 = ahknVar7.cA;
                return new cdcf(eyikVar5, eyggVarA, ahnhVar3.pI, ahknVar7.dh, (fcyh) eyikVar6.b(), (fdjx) ahnhVar3.m.b());
            case 13:
                ahkn ahknVar8 = this.a;
                ahnh ahnhVar4 = ahknVar8.a;
                return new cddp((cejj) ahnhVar4.tJ.b(), (eosc) ahknVar8.y.b(), ahnhVar4.sh, ahknVar8.lW);
            case 14:
                return Optional.of(new agjm());
            case 15:
                ahkn ahknVar9 = this.a;
                return new damw(ahknVar9.a.zs, (Executor) ahknVar9.p.b());
            case 16:
                ahkn ahknVar10 = this.a;
                return new dans(Optional.of(ahknVar10.X()), (eosc) ahknVar10.y.b(), (cogw) ahknVar10.cD.b());
            case 17:
                ahkn ahknVar11 = this.a;
                return new danv(Optional.of(ahknVar11.X()), (eosc) ahknVar11.y.b(), (cogw) ahknVar11.cD.b());
            case 18:
                ahij ahijVar5 = this.b;
                ahkn ahknVar12 = this.a;
                return new darp(ahijVar5.u, (fcyh) ahknVar12.bM.b(), (fcyh) ahknVar12.cz.b(), (fdjx) ahknVar12.a.m.b());
            case 19:
                ahkn ahknVar13 = this.a;
                ahnh ahnhVar5 = ahknVar13.a;
                eyik eyikVar7 = ahnhVar5.QG;
                return new dars(ahnhVar5.alr, ahknVar13.mU, ahknVar13.np, ahnhVar5.Vr, (aqmq) eyikVar7.b(), (fcyh) ahknVar13.cz.b(), ahknVar13.t);
            default:
                return new darv((fdjx) this.a.a.m.b());
        }
    }
}
