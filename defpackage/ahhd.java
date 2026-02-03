package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahhd implements eyik {
    public final ahkn a;
    public final ahjr b;
    private final ahhh c;
    private final ahhe d;
    private final int e;

    public ahhd(ahkn ahknVar, ahjr ahjrVar, ahhh ahhhVar, ahhe ahheVar, int i) {
        this.a = ahknVar;
        this.b = ahjrVar;
        this.c = ahhhVar;
        this.d = ahheVar;
        this.e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v12, types: [ehnu] */
    @Override // defpackage.fcsu
    public final Object b() {
        String str = "Expected activity to be a FragmentActivity: ";
        switch (this.e) {
            case 0:
                return new einm((eigp) this.b.ac.b());
            case 1:
                ahnh ahnhVar = this.a.a;
                return new anpm();
            case 2:
                return new ahhb();
            case 3:
                return new ahhc();
            case 4:
                Activity activity = this.d.a;
                if (activity != null) {
                    return activity;
                }
                throw new IllegalStateException("Attempted use of the activity when it is null");
            case 5:
                dpjc dpjcVarW = ((dpjh) ((eyhx) ((ehnu) this.d.g.b()).a).bb()).W();
                dpjcVarW.getClass();
                return dpjcVarW;
            case 6:
                Activity activity2 = this.d.a;
                try {
                    ejwi ejwiVarJ = activity2 == null ? ejud.a : ejwi.j((eg) activity2);
                    str = this.d.ah;
                    return ehop.a(ejwiVarJ, str);
                } catch (ClassCastException e) {
                    throw new IllegalStateException(str.concat(String.valueOf(String.valueOf(activity2))), e);
                }
            case 7:
                dnhi dnhiVarV = ((dnhk) ((eyhx) ((ehnu) this.d.g.b()).a).bb()).V();
                dnhiVarV.getClass();
                return dnhiVarV;
            case 8:
                Activity activity3 = (Activity) this.d.f.b();
                try {
                    return (eg) activity3;
                } catch (ClassCastException e2) {
                    throw new IllegalStateException("Expected activity to be a FragmentActivity: ".concat(activity3.toString()), e2);
                }
            case 9:
                ahhe ahheVar = this.d;
                return new uip();
            case 10:
                return uiw.a((ehnu) this.d.g.b());
            case 11:
                return uiu.a((ehnu) this.d.g.b());
            case 12:
                ehrb ehrbVarAu = ((cpcl) ((eyhx) ((ehnu) this.d.g.b()).a).bb()).au();
                ehrbVarAu.getClass();
                return ehrbVarAu;
            case 13:
                crmk crmkVarN = ((crml) ((eyhx) ((ehnu) this.d.g.b()).a).bb()).N();
                crmkVarN.getClass();
                return crmkVarN;
            case 14:
                return tlv.a((ehnu) this.d.g.b());
            case 15:
                upn upnVarF = ((upm) ((eyhx) ((ehnu) this.d.g.b()).a).bb()).f();
                upnVarF.getClass();
                return upnVarF;
            case 16:
                ctgc ctgcVarO = ((ctfm) ((eyhx) ((ehnu) this.d.g.b()).a).bb()).O();
                ctgcVarO.getClass();
                return ctgcVarO;
            case 17:
                return new eidm((eigp) this.b.ac.b());
            case 18:
                eyie.a(this.d.s);
                return Optional.empty();
            case 19:
                ahkn ahknVar = this.a;
                egyt egytVar = (egyt) ahknVar.dj.b();
                return new bvel(egytVar);
            case 20:
                ahhe ahheVar2 = this.d;
                ahjr ahjrVar = ahheVar2.c;
                return new ulb();
            case 21:
                ahkn ahknVar2 = this.a;
                return new ula();
            case 22:
                uld uldVarE = ((ule) ((eyhx) ((ehnu) this.d.g.b()).a).bb()).e();
                uldVarE.getClass();
                return uldVarE;
            case 23:
                return new umn();
            case 24:
                afza afzaVar = (afza) this.c.l.b();
                ahhe ahheVar3 = this.d;
                eyik eyikVar = ahheVar3.v;
                fdjx fdjxVar = (fdjx) eyikVar.b();
                lvc lvcVar = (lvc) ahheVar3.w.b();
                ekgi ekgiVarH = ekgp.h(55);
                ekgiVarH.i(agau.class, new agay(ahheVar3.q()));
                eyik eyikVar2 = ahheVar3.f;
                Context context = (Context) eyikVar2.b();
                ahjr ahjrVar2 = ahheVar3.c;
                efwo efwoVar = (efwo) ahjrVar2.b.b();
                ahkn ahknVar3 = ahheVar3.b;
                ahng ahngVar = ahknVar3.b;
                ekgiVarH.i(agaz.class, new agba(context, efwoVar, ahngVar.iF));
                ekgiVarH.i(agbb.class, new agbc((Context) eyikVar2.b(), ahjrVar2.oU));
                ekgiVarH.i(agbf.class, new agbh((Context) eyikVar2.b()));
                Context context2 = (Context) eyikVar2.b();
                ahnh ahnhVar2 = ahknVar3.a;
                eyik eyikVar3 = ahheVar3.o;
                ekgiVarH.i(agbi.class, new agbk(context2, eyikVar3, ahnhVar2.Uk));
                ekgiVarH.i(agbl.class, new agbn((Context) eyikVar2.b()));
                ekgiVarH.i(agbo.class, new agbp((Context) eyikVar2.b(), (avbr) ahngVar.hL.b()));
                Activity activity4 = (Activity) eyikVar2.b();
                ains ainsVar = (ains) ahnhVar2.pQ.b();
                eyik eyikVar4 = ahjrVar2.pJ;
                ekgiVarH.i(agbt.class, new agbv(activity4, eyikVar4, ainsVar));
                ekgiVarH.i(agbx.class, new agbz((Activity) eyikVar2.b(), ahjrVar2.dx, ahheVar3.x));
                ekgiVarH.i(agbq.class, new agca((Context) eyikVar2.b(), ahjrVar2.dx));
                ekgiVarH.i(agcb.class, new agce((Activity) eyikVar2.b(), ahheVar3.a(), (fdjx) ahnhVar2.m.b()));
                ekgiVarH.i(agcf.class, new agcg((Activity) eyikVar2.b()));
                ekgiVarH.i(agch.class, new agci((Context) eyikVar2.b(), (efwo) ahjrVar2.b.b(), (daau) ahngVar.iC.b()));
                ekgiVarH.i(agcn.class, new agcq((Context) eyikVar2.b(), ahheVar3.z(), ahheVar3.q()));
                ekgiVarH.i(agcs.class, new agct((Context) eyikVar2.b()));
                ekgiVarH.i(agcu.class, new agcv((Activity) eyikVar2.b(), ahnhVar2.Uk, (Optional) ahnhVar2.BL.b(), (dajg) ahheVar3.A.b()));
                ekgiVarH.i(agcy.class, new agcx((Context) eyikVar2.b(), (efwo) ahjrVar2.b.b(), ahngVar.J(), (bxle) ahknVar3.eJ.b()));
                ekgiVarH.i(aggv.class, new aggw((Context) eyikVar2.b()));
                ekgiVarH.i(agcz.class, new agda((Context) eyikVar2.b(), (efwo) ahjrVar2.b.b(), ahjrVar2.oU));
                ekgiVarH.i(agdb.class, new agdd((Context) eyikVar2.b(), (avmp) ahjrVar2.dx.b()));
                ekgiVarH.i(agde.class, new agdf((Context) eyikVar2.b(), (uqm) eyikVar4.b()));
                ekgiVarH.i(agdg.class, new agdh((Context) eyikVar2.b(), (ajso) ahjrVar2.dw.b()));
                ekgiVarH.i(agdi.class, new agdj((Context) eyikVar2.b(), ahknVar3.cx(), (dakl) ahnhVar2.BK.b()));
                ekgiVarH.i(agdk.class, new agdl((afgk) ahheVar3.B.b()));
                ekgiVarH.i(agdn.class, new agdr((Context) eyikVar2.b(), ahheVar3.z(), ahheVar3.q(), Optional.of(new czqe()), (bxle) ahknVar3.eJ.b()));
                eyik eyikVar5 = ahheVar3.j;
                ekgiVarH.i(agdu.class, new agdv((eg) eyikVar5.b()));
                ekgiVarH.i(agdw.class, new agdz((Context) eyikVar2.b(), (fcyh) ahknVar3.bM.b(), (fdjx) eyikVar.b(), ahjrVar2.dB, ahnhVar2.pd, ahjrVar2.S));
                ekgiVarH.i(ageb.class, new agea((Context) eyikVar2.b(), ahnhVar2.vS));
                ekgiVarH.i(agec.class, new agee((cdoj) ahjrVar2.dy.b(), ahheVar3.q()));
                ekgiVarH.i(ageg.class, new ageh((Context) eyikVar2.b()));
                ekgiVarH.i(agei.class, new agel((Optional) ahheVar3.D.b(), (Activity) eyikVar2.b(), (efxf) ahheVar3.E.b()));
                ekgiVarH.i(agem.class, new agen((Context) eyikVar2.b()));
                Context context3 = (Context) eyikVar2.b();
                agax agaxVarQ = ahheVar3.q();
                efwo efwoVar2 = (efwo) ahjrVar2.b.b();
                egej egejVar = (egej) ahnhVar2.pI.b();
                exwb exwbVar = exwb.ANDROID_MESSAGES;
                exwbVar.getClass();
                ekgiVarH.i(ageo.class, new ages(context3, agaxVarQ, efwoVar2, egejVar, new ecyl(exwbVar), (fcyh) ahknVar3.cA.b(), ahnhVar2.tF));
                ahheVar3.q();
                ekgiVarH.i(aget.class, new agev());
                ekgiVarH.i(agew.class, new agex((eg) eyikVar5.b()));
                ekgiVarH.i(agey.class, new agfa((Context) eyikVar2.b(), (fdjx) ahnhVar2.oQ.b(), ahjrVar2.oU));
                ekgiVarH.i(agfb.class, new agfc((Context) eyikVar2.b()));
                ekgiVarH.i(agff.class, new agfh(eyikVar3));
                ekgiVarH.i(agfi.class, new agfj(ahheVar3.q()));
                ekgiVarH.i(agfk.class, new agfl((Context) eyikVar2.b()));
                ekgiVarH.i(agfm.class, new agfn((Context) eyikVar2.b(), (efwo) ahjrVar2.b.b(), (daau) ahngVar.iC.b()));
                ekgiVarH.i(agfo.class, new agfp((Context) eyikVar2.b(), (efwo) ahjrVar2.b.b(), (daau) ahngVar.iC.b()));
                ekgiVarH.i(agfq.class, new agfr((Activity) eyikVar2.b(), ahknVar3.oj, ahjrVar2.oU));
                ekgiVarH.i(agfs.class, new agft((Context) eyikVar2.b()));
                ekgiVarH.i(agfu.class, new agfw((Context) eyikVar2.b(), (avbr) ahngVar.hL.b()));
                ekgiVarH.i(agfx.class, new agfz((Context) eyikVar2.b()));
                ekgiVarH.i(agga.class, new aggb((Context) eyikVar2.b(), ahjrVar2.dx, (efwo) ahjrVar2.b.b()));
                ekgiVarH.i(aggy.class, new aghe((Optional) ahjrVar2.jv.b(), (fdjx) ahnhVar2.oQ.b(), (ddnn) ahknVar3.ix.b(), (dnhb) ahheVar3.i.b(), (crma) ahknVar3.da.b()));
                ekgiVarH.i(aggd.class, new agge((Context) eyikVar2.b(), (avbr) ahngVar.hL.b()));
                ekgiVarH.i(aggf.class, new aggi((Context) eyikVar2.b(), ahheVar3.F));
                ekgiVarH.i(aggj.class, new aggm((Context) ahknVar3.t.b(), ahheVar3.q(), (abvt) ahjrVar2.oW.b()));
                ekgiVarH.i(aggn.class, new aggo((Context) eyikVar2.b(), ahknVar3.cx(), (dakl) ahnhVar2.BK.b()));
                ekgiVarH.i(aggp.class, new aggq((Context) eyikVar2.b()));
                ekgiVarH.i(aggr.class, new aggs((Context) eyikVar2.b()));
                ekgiVarH.i(aggt.class, new aggu((dbap) ahjrVar2.oA.b(), (dbay) ahheVar3.G.b()));
                ekgp ekgpVarC = ekgiVarH.c();
                eyik eyikVar6 = ahheVar3.d.l;
                return new afzi(afzaVar, fdjxVar, lvcVar, ekgpVarC, ekgp.n(agag.class, new agaf((afza) eyikVar6.b()), agaq.class, new agap((afza) eyikVar6.b()), agat.class, new agas((afza) eyikVar6.b())));
            case 25:
                fcyh fcyhVar = (fcyh) this.a.a.Rm.b();
                ahhe ahheVar4 = this.d;
                eyha eyhaVar = (eyha) ahheVar4.d.b.b();
                ehnu ehnuVar = (ehnu) ahheVar4.g.b();
                eyhaVar.getClass();
                ehnuVar.getClass();
                fcyhVar.getClass();
                ecem.c();
                fdjx fdjxVarB = fdjy.b(fcyhVar.plus(new fdmt(null)));
                egva egvaVar = new egva(eyhaVar, ehnuVar, fdjxVarB);
                eyhaVar.a(egvaVar);
                ehnuVar.P().c(egvaVar);
                return fdjxVarB;
            case 26:
                return ehon.a((eg) this.d.j.b());
            case 27:
                ahkn ahknVar4 = this.a;
                return new agbe((fcyh) ahknVar4.cA.b(), (ajsn) ahknVar4.a.Qp.b(), this.b.F);
            case 28:
                ahjr ahjrVar3 = this.b;
                ahhe ahheVar5 = this.d;
                ahkn ahknVar5 = this.a;
                eyik eyikVar7 = ahheVar5.z;
                eyik eyikVar8 = ahknVar5.gF;
                czqs czqsVar = (czqs) eyikVar7.b();
                ahnh ahnhVar3 = ahknVar5.a;
                ains ainsVar2 = (ains) ahnhVar3.c.b();
                return new dajd(ahjrVar3.oU, ahheVar5.y, eyikVar8, czqsVar, ainsVar2, ahnhVar3.Uk, (dakl) ahnhVar3.BK.b(), (eigp) ahjrVar3.ac.b());
            case 29:
                ahkn ahknVar6 = this.a;
                fcyh fcyhVar2 = (fcyh) ahknVar6.cA.b();
                ahnh ahnhVar4 = ahknVar6.a;
                return new cjya(fcyhVar2, (fdjx) ahnhVar4.oS.b(), ahnhVar4.rc, ahnhVar4.ru, (Context) ahknVar6.t.b(), ahknVar6.gF, ahnhVar4.Wt, eyie.a(ahknVar6.nx), ahknVar6.eO);
            case 30:
                ahkn ahknVar7 = this.a;
                ahhe ahheVar6 = this.d;
                ahjr ahjrVar4 = this.b;
                eyik eyikVar9 = ahknVar7.t;
                ahnh ahnhVar5 = ahknVar7.a;
                eyik eyikVar10 = ahknVar7.aT;
                eyik eyikVar11 = ahheVar6.y;
                eyik eyikVar12 = ahknVar7.gF;
                eyik eyikVar13 = ahnhVar5.c;
                ahng ahngVar2 = ahknVar7.b;
                return new czqs(eyikVar9, eyikVar10, eyikVar11, eyikVar12, eyikVar13, ahngVar2.gZ, ahngVar2.hN, ahnhVar5.PN, ahngVar2.cZ, ahknVar7.cD, ahnhVar5.sd, ahjrVar4.ac, ahknVar7.aJ, ahnhVar5.rd, ahnhVar5.rq, ahjrVar4.pc, ahnhVar5.ri, ahngVar2.hO, ahngVar2.hP);
            case 31:
                return new afgk((Activity) this.d.f.b());
            case 32:
                return Optional.of((acbn) this.d.C.b());
            case 33:
                ahkn ahknVar8 = this.a;
                return new acbn();
            case 34:
                efxf efxfVarAp = ((efxo) eygm.a(((ehnu) this.d.g.b()).a, efxo.class)).ap();
                efxfVarAp.getClass();
                return efxfVarAp;
            case 35:
                return Optional.of(this.a.b.cL());
            case 36:
                return new dbay(this.d.a(), (dbap) this.b.oA.b());
            case 37:
                ahhe ahheVar7 = this.d;
                return new cujc((Context) ahheVar7.f.b(), (fdjx) ahheVar7.v.b(), (lvc) ahheVar7.w.b(), (cujd) this.c.m.b());
            case 38:
                eyie.a(this.d.J);
                return Optional.empty();
            case Maneuver.TYPE_DESTINATION /* 39 */:
                ahhe ahheVar8 = this.d;
                return Optional.of(absa.a(ahheVar8.b.dz, eyie.a(ahheVar8.P)));
            case 40:
                ahkn ahknVar9 = this.a;
                Context context4 = (Context) ahknVar9.t.b();
                ahhe ahheVar9 = this.d;
                abse abseVar = (abse) ahheVar9.N.b();
                ahnh ahnhVar6 = ahknVar9.a;
                return new absd(context4, ahheVar9.L, ahheVar9.M, abseVar, ahknVar9.cI, ahnhVar6.Uk, ahheVar9.O, ahnhVar6.pb);
            case 41:
                return new absi((Context) this.d.f.b());
            case 42:
                return Optional.of((abgm) this.a.a.LE.b());
            case 43:
                ahkn ahknVar10 = this.a;
                return new abse((crny) ahknVar10.a.pf.b(), (crma) ahknVar10.da.b());
            case 44:
                ahkn ahknVar11 = this.a;
                return new abni(ahknVar11.b.eQ, ahknVar11.eK, ahknVar11.a.c);
            case 45:
                acxm acxmVarI = ((acye) ((eyhx) ((ehnu) this.d.g.b()).a).bb()).i();
                acxmVarI.getClass();
                return acxmVarI;
            case 46:
                ahhe ahheVar10 = this.d;
                ahkn ahknVar12 = this.a;
                ahnh ahnhVar7 = ahknVar12.a;
                ahng ahngVar3 = ahknVar12.b;
                return new cphz(ahheVar10.T, ahngVar3.jr, ahnhVar7.pl, ahngVar3.js);
            case 47:
                ahkn ahknVar13 = this.a;
                ahnh ahnhVar8 = ahknVar13.a;
                return new cphv((cpch) ahnhVar8.qj.b(), (cogv) ahnhVar8.qm.b(), ahnhVar8.Ap, (cogt) ahknVar13.cX.b());
            case 48:
                return new cmdp(this.a.a.BC);
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return new teu((Context) this.a.t.b());
            case 50:
                return Optional.of(this.a.b.bP());
            case 51:
                return Optional.of(this.a.b.x());
            case 52:
                afjt afjtVarL = ((afjv) ((eyhx) ((ehnu) this.d.g.b()).a).bb()).l();
                afjtVarL.getClass();
                return afjtVarL;
            case 53:
                ahdv ahdvVarO = ((ahdw) ((eyhx) ((ehnu) this.d.g.b()).a).bb()).o();
                ahdvVarO.getClass();
                return ahdvVarO;
            case 54:
                eyie.a(this.d.ab);
                return Optional.empty();
            case 55:
                return ehmw.b((ehnu) this.d.g.b());
            case 56:
                return Optional.of((dpir) this.d.h.b());
            case 57:
                ahkn ahknVar14 = this.a;
                crqx crqxVar = (crqx) ahknVar14.gF.b();
                ahhe ahheVar11 = this.d;
                return new dafv(crqxVar, ahheVar11.af, (aijh) ahknVar14.a.Uk.b(), (achu) this.b.oU.b(), (Context) ahheVar11.f.b());
            default:
                return new dabm(this.a.a.c);
        }
    }
}
