package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;
import com.google.android.apps.messaging.conversation2.viewmodel.ConversationViewModel;
import com.google.android.rcs.client.profile.RcsProfileService;
import com.sun.jna.Function;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahia implements eyik {
    public final ahkn a;
    public final ahhk b;
    public final ahib c;
    private final ahho d;
    private final int e;

    public ahia(ahkn ahknVar, ahho ahhoVar, ahhk ahhkVar, ahib ahibVar, int i) {
        this.a = ahknVar;
        this.d = ahhoVar;
        this.b = ahhkVar;
        this.c = ahibVar;
        this.e = i;
    }

    private final Object a() {
        int i = this.e;
        switch (i) {
            case 0:
                ahib ahibVar = this.c;
                ea eaVar = (ea) ((eyig) ahibVar.d).a;
                ehpg ehpgVar = (ehpg) ahibVar.e.b();
                ahkn ahknVar = this.a;
                return ehbc.a(eaVar, ehpgVar, (egzo) ahknVar.aQ.b(), (Executor) ahknVar.a.j.b());
            case 1:
                ea eaVar2 = (ea) ((eyig) this.c.d).a;
                return ehpg.a(eaVar2, eaVar2);
            case 2:
                return egvv.a((fcyh) this.a.a.Rm.b(), (ea) ((eyig) this.c.d).a);
            case 3:
                return tgq.a((ea) ((eyig) this.c.d).a);
            case 4:
                return ufl.a((ea) ((eyig) this.c.d).a);
            case 5:
                return new eimz((ea) ((eyig) this.c.d).a, (einm) this.a.b.nT.b(), ejwi.j(new eimw()));
            case 6:
                return new ehab((ea) ((eyig) this.c.d).a, (Executor) this.a.a.j.b());
            case 7:
                return egpy.a((ea) ((eyig) this.c.d).a);
            case 8:
                ahhk ahhkVar = this.b;
                ahib ahibVar2 = this.c;
                return new dpbr(ahhkVar.d, ahhkVar.bu, ahibVar2.q, eyil.a(ahibVar2.r), eyil.a(ahibVar2.s), ahibVar2.g, ahhkVar.bi);
            case 9:
                ahkn ahknVar2 = this.a;
                ahib ahibVar3 = this.c;
                return new dpuu(ahknVar2.lp, ahibVar3.o, ahibVar3.p);
            case 10:
                ahhk ahhkVar2 = this.b;
                ahib ahibVar4 = this.c;
                return new dpwz(ahhkVar2.d, ahibVar4.m, ahibVar4.n);
            case 11:
                return new dpvi(this.a.lp);
            case 12:
                return Optional.of(Boolean.valueOf(this.a.b.df()));
            case 13:
                ahhk ahhkVar3 = this.b;
                ahib ahibVar5 = this.c;
                return new dpww(ahhkVar3.d, ahibVar5.m, ahibVar5.n);
            case 14:
                ekgi ekgiVarH = ekgp.h(10);
                ekgiVarH.i(dnau.class, dnaw.a());
                ahng ahngVar = this.a.b;
                ekgiVarH.i(dnpz.class, (dphz) ahngVar.hk.b());
                ekgiVarH.i(dnyn.class, dnyp.a());
                ekgiVarH.i(dnro.class, (dphz) ahngVar.hl.b());
                ekgiVarH.i(doaa.class, doac.a());
                ekgiVarH.i(dota.class, dotg.a());
                ekgiVarH.i(doxo.class, doxr.a());
                ekgiVarH.i(dpao.class, dpaq.a());
                ekgiVarH.i(dqhd.class, dqig.a());
                ekgiVarH.i(doem.class, dofa.a());
                return ekgiVarH.c();
            case 15:
                ekgi ekgiVarH2 = ekgp.h(9);
                ekgiVarH2.i(dpxe.b, this.a.b.cg());
                ekgiVarH2.i(dpxe.a, dnaw.a());
                ekgiVarH2.i(dpxe.i, dnyp.a());
                ekgiVarH2.i(dpxe.c, doac.a());
                ekgiVarH2.i(dpxe.d, dotg.a());
                ekgiVarH2.i(dpxe.e, doxr.a());
                ekgiVarH2.i(dpxe.f, dpaq.a());
                ekgiVarH2.i(dpxe.g, dqig.a());
                ekgiVarH2.i(dpxe.h, dofa.a());
                return ekgiVarH2.c();
            case 16:
                ahkn ahknVar3 = this.a;
                return new dnji(ahknVar3.a.m, ahknVar3.lp, ahknVar3.b.hr);
            case 17:
                return xfj.a();
            case 18:
                ahkn ahknVar4 = this.a;
                return new uqf((eosc) ahknVar4.p.b(), ahknVar4.a.pf);
            case 19:
                return Optional.of(this.a.b.cL());
            case 20:
                return new bagc(this.d.ca);
            case 21:
                eg egVar = (eg) this.b.g.b();
                ahib ahibVar6 = this.c;
                ahkn ahknVar5 = this.a;
                ahho ahhoVar = this.d;
                eyik eyikVar = ahknVar5.aI;
                ahnh ahnhVar = ahknVar5.a;
                eyik eyikVar2 = ahnhVar.Uk;
                eyik eyikVar3 = ahnhVar.Wj;
                eigp eigpVar = (eigp) eyikVar.b();
                return new tlh(egVar, ahibVar6.A, eyikVar2, ahhoVar.bA, eyikVar3, eigpVar, ahnhVar.vR);
            case 22:
                ahhk ahhkVar4 = this.b;
                ahho ahhoVar2 = this.d;
                ahib ahibVar7 = this.c;
                ahkn ahknVar6 = this.a;
                ahnh ahnhVar2 = ahknVar6.a;
                eyik eyikVar4 = ahnhVar2.Jm;
                eyik eyikVar5 = ahnhVar2.BK;
                eosc eoscVar = (eosc) ahknVar6.y.b();
                return new BlockAndReportSpamCallbacks(ahhkVar4.g, ahhoVar2.ak, ahibVar7.z, eyikVar4, eyikVar5, ahibVar7.l, ahhoVar2.k, eoscVar);
            case 23:
                return new tix((eg) this.b.g.b());
            case 24:
                ahkn ahknVar7 = this.a;
                egyt egytVar = (egyt) ahknVar7.dj.b();
                eosc eoscVar2 = (eosc) ahknVar7.y.b();
                ahnh ahnhVar3 = ahknVar7.a;
                return new urh(egytVar, eoscVar2, ahnhVar3.zP, ahknVar7.kC, (aslv) ahnhVar3.IF.b());
            case 25:
                ahkn ahknVar8 = this.a;
                ahnh ahnhVar4 = ahknVar8.a;
                return new bagg(ahnhVar4.adA, ahnhVar4.wF, ahknVar8.de, ahknVar8.dL, ahknVar8.id);
            case 26:
                return utg.a((ea) ((eyig) this.c.d).a);
            case 27:
                return ((ejwt) ejwi.j((ehmt) this.c.F.b())).a;
            case 28:
                return ehmw.a((ea) ((eyig) this.c.d).a);
            case 29:
                return new uta((ains) this.a.a.c.b());
            case 30:
                ahkn ahknVar9 = this.a;
                egyt egytVar2 = (egyt) ahknVar9.dj.b();
                return new bvel(egytVar2);
            case 31:
                return uvm.a((ea) ((eyig) this.c.d).a);
            case 32:
                ahkn ahknVar10 = this.a;
                Context context = (Context) ahknVar10.t.b();
                fcyh fcyhVar = (fcyh) ahknVar10.cz.b();
                ahib ahibVar8 = this.c;
                lxq lxqVar = (lxq) ahibVar8.J.b();
                Optional optionalOf = Optional.of(new dmir(null));
                ahibVar8.K();
                return uje.a(context, fcyhVar, lxqVar, optionalOf, (srx) ahknVar10.oc.b(), (egqi) ahknVar10.ll.b(), Optional.of(ujg.a((dmjz) ahibVar8.O.b())), Optional.empty(), ahknVar10.b.kg);
            case 33:
                return dnia.a((Activity) this.b.d.b(), (ea) ((eyig) this.c.d).a, Optional.empty());
            case 34:
                dlvl dlvlVar = (dlvl) this.c.L.b();
                ahkn ahknVar11 = this.a;
                eony eonyVar = (eony) ahknVar11.lp.b();
                ahng ahngVar2 = ahknVar11.b;
                return new dlus(dlvlVar, eonyVar, eyie.a(ahngVar2.jZ), eyie.a(ahngVar2.ob), ahngVar2.nZ, ahngVar2.kd);
            case 35:
                return new dlvl((Context) this.a.t.b(), (fdjx) this.c.K.b());
            case 36:
                return dpbp.a((fcyh) this.a.cA.b());
            case 37:
                return Optional.of(this.a.b.j());
            case 38:
                return new ahhy(this);
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return aaua.a((ea) ((eyig) this.c.d).a);
            case 40:
                ahkn ahknVar12 = this.a;
                ahho ahhoVar3 = this.d;
                return new aauk(ahknVar12.no, ahknVar12.a.Uk, ahhoVar3.bA);
            case 41:
                ahkn ahknVar13 = this.a;
                return new aarn(ahknVar13.y, ahknVar13.p, ahknVar13.cD, this.c.S);
            case 42:
                ahho ahhoVar4 = this.d;
                return ekgp.m("AllMessagesDonationConversationCollector", ahhoVar4.a(), "RecentMessagesDonationConversationCollector", ahhoVar4.b());
            case 43:
                ahkn ahknVar14 = this.a;
                return new aaux((eosc) ahknVar14.p.b(), (aasx) ahknVar14.b.jN.b());
            case 44:
                ahkn ahknVar15 = this.a;
                return new abte(ahknVar15.aI, ahknVar15.a.us, ahknVar15.dK);
            case 45:
                return new abtp(this.a.a.c);
            case 46:
                ahib ahibVar9 = this.c;
                ahkn ahknVar16 = this.a;
                return new abkx(ahibVar9.Z, ahknVar16.lV, ahknVar16.lT, ahknVar16.p);
            case 47:
                ahkn ahknVar17 = this.a;
                ahnh ahnhVar5 = ahknVar17.a;
                eyik eyikVar6 = ahnhVar5.LC;
                eyik eyikVarA = eyil.a(ahnhVar5.LB);
                ahib ahibVar10 = this.c;
                ahng ahngVar3 = ahknVar17.b;
                return new abmr(eyikVar6, eyikVarA, ahknVar17.p, ahnhVar5.j, ahnhVar5.c, ahngVar3.nf, ahknVar17.lT, ahnhVar5.us, eyil.a(ahibVar10.Y));
            case 48:
                return new abpo(this.c.X);
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                ekgi ekgiVarH3 = ekgp.h(11);
                ahng ahngVar4 = this.a.b;
                ekgiVarH3.i(111, ahngVar4.ok);
                ekgiVarH3.i(110, ahngVar4.ol);
                ekgiVarH3.i(109, ahngVar4.nq);
                ekgiVarH3.i(100, ahngVar4.om);
                ekgiVarH3.i(108, ahngVar4.on);
                ekgiVarH3.i(Integer.valueOf(EnergyProfile.EVCONNECTOR_TYPE_OTHER), ahngVar4.oi);
                ekgiVarH3.i(207, ahngVar4.oo);
                ekgiVarH3.i(106, ahngVar4.op);
                ekgiVarH3.i(105, ahngVar4.oq);
                ekgiVarH3.i(104, ahngVar4.or);
                ekgiVarH3.i(107, this.b.cJ);
                return ekgiVarH3.c();
            case 50:
                return ehoq.a((ea) ((eyig) this.c.d).a);
            case 51:
                return new ekph("Bugle_DittoSatellite");
            case 52:
                ahkn ahknVar18 = this.a;
                Context context2 = (Context) ahknVar18.t.b();
                fcyh fcyhVar2 = (fcyh) ahknVar18.bM.b();
                fcyh fcyhVar3 = (fcyh) ahknVar18.cz.b();
                ahnh ahnhVar6 = ahknVar18.a;
                return new abno(context2, fcyhVar2, fcyhVar3, (fdjx) ahnhVar6.m.b(), ahnhVar6.c, ahnhVar6.LC);
            case 53:
                ahnh ahnhVar7 = this.a.a;
                return new abyd((axky) ahnhVar7.HN.b(), (fdjx) ahnhVar7.m.b());
            case 54:
                ahkn ahknVar19 = this.a;
                return new abye((eigp) ahknVar19.aI.b(), (egzh) ahknVar19.aQ.b());
            case 55:
                ahib ahibVar11 = this.c;
                ahkn ahknVar20 = this.a;
                return new ehcq((ea) ((eyig) ahibVar11.d).a, (egzo) ahknVar20.aQ.b(), (Executor) ahknVar20.a.j.b());
            case 56:
                return new egda(this.c.I());
            case 57:
                ahkn ahknVar21 = this.a;
                return new acim(ahknVar21.a.qr, ahknVar21.eO);
            case 58:
                ahkn ahknVar22 = this.a;
                ahho ahhoVar5 = this.d;
                return new acjx(ahknVar22.t, ahknVar22.p, ahknVar22.y, ahknVar22.cD, ahhoVar5.k, ahknVar22.a.yx, ahhoVar5.o);
            case 59:
                return adgv.a((ea) ((eyig) this.c.d).a);
            case 60:
                return afdt.a((ea) ((eyig) this.c.d).a);
            case 61:
                return new eils(this.a.b.ct());
            case 62:
                ahkn ahknVar23 = this.a;
                ahib ahibVar12 = this.c;
                ahnh ahnhVar8 = ahknVar23.a;
                return new agkh(ahknVar23.eO, ahibVar12.an, ahnhVar8.rc, (fdjx) ahnhVar8.m.b());
            case Function.ALT_CONVENTION /* 63 */:
                ahkn ahknVar24 = this.a;
                return new ajjs(ahknVar24.a.tG, (fcyh) ahknVar24.bM.b());
            case 64:
                return agxg.a((ea) ((eyig) this.c.d).a);
            case 65:
                return aifl.a((ea) ((eyig) this.c.d).a);
            case 66:
                return aifq.a((ea) ((eyig) this.c.d).a);
            case 67:
                return aifx.a((ea) ((eyig) this.c.d).a);
            case 68:
                ea eaVar3 = (ea) ((eyig) this.c.d).a;
                if (eaVar3 instanceof cdjj) {
                    return (cdjj) eaVar3;
                }
                throw new IllegalStateException(a.M(eaVar3, cdjn.class));
            case 69:
                ea eaVar4 = (ea) ((eyig) this.c.d).a;
                if (eaVar4 instanceof cufy) {
                    return (cufy) eaVar4;
                }
                throw new IllegalStateException(a.M(eaVar4, cugb.class));
            case 70:
                ea eaVar5 = (ea) ((eyig) this.c.d).a;
                if (eaVar5 instanceof cusf) {
                    return (cusf) eaVar5;
                }
                throw new IllegalStateException(a.M(eaVar5, cust.class));
            case 71:
                ahho ahhoVar6 = this.d;
                ahkn ahknVar25 = this.a;
                eyik eyikVar7 = ahhoVar6.ce;
                eyik eyikVar8 = ahknVar25.b.jn;
                eyik eyikVar9 = ahknVar25.gF;
                czqs czqsVar = (czqs) eyikVar7.b();
                ahnh ahnhVar9 = ahknVar25.a;
                ains ainsVar = (ains) ahnhVar9.c.b();
                return new dajd(ahhoVar6.bA, eyikVar8, eyikVar9, czqsVar, ainsVar, ahnhVar9.Uk, (dakl) ahnhVar9.BK.b(), (eigp) ahknVar25.aI.b());
            case 72:
                ahhk ahhkVar5 = this.b;
                ahkn ahknVar26 = this.a;
                return new cuok(ahhkVar5.d, ahknVar26.a.Dt, ahknVar26.aT);
            case 73:
                return new cuvc(this.a.aT);
            case 74:
                return new ciev((RcsProfileService) this.a.a.Ns.b());
            case 75:
                ahkn ahknVar27 = this.a;
                ahnh ahnhVar10 = ahknVar27.a;
                return new cvdg(ahnhVar10.rc, ahnhVar10.rd, ahnhVar10.ru, ahnhVar10.sh, (fdjx) ahnhVar10.oS.b(), ahknVar27.b.ou, ahnhVar10.sh, ahnhVar10.sP);
            case 76:
                ahkn ahknVar28 = this.a;
                ahnh ahnhVar11 = ahknVar28.a;
                fdjx fdjxVar = (fdjx) ahnhVar11.oS.b();
                fdjx fdjxVar2 = (fdjx) ahnhVar11.m.b();
                ahho ahhoVar7 = this.d;
                return new czrg(fdjxVar, fdjxVar2, ahhoVar7.ce, ahknVar28.aT, ahnhVar11.Wt, (cqbm) ahnhVar11.rY.b(), ahknVar28.aP, ahnhVar11.rq, ahnhVar11.rd, ahnhVar11.PT);
            case 77:
                Context context3 = (Context) this.b.d.b();
                ahkn ahknVar29 = this.a;
                ahnh ahnhVar12 = ahknVar29.a;
                return new cuva(context3, ahnhVar12.cv(), ahnhVar12.cu(), ahknVar29.aT, ahnhVar12.pQ, ahknVar29.aI);
            case 78:
                return new ahhz(this);
            case 79:
                ahkn ahknVar30 = this.a;
                ahnh ahnhVar13 = ahknVar30.a;
                return new vbv((fdjx) ahnhVar13.m.b(), (fcyh) ahknVar30.bM.b(), (fcyh) ahknVar30.cz.b(), (cmfo) ahnhVar13.ajS.b(), (egyt) ahknVar30.dj.b());
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                return Optional.of((uzw) this.a.a.ajT.b());
            case 81:
                ahhk ahhkVar6 = this.b;
                ahib ahibVar13 = this.c;
                ahkn ahknVar31 = this.a;
                ahnh ahnhVar14 = ahknVar31.a;
                return new cvbo(ahhkVar6.d, ahibVar13.aG, ahknVar31.aI, ahnhVar14.c);
            case 82:
                ahkn ahknVar32 = this.a;
                return new cvbm(ahknVar32.b.jH, ahknVar32.aQ);
            case 83:
                ahib ahibVar14 = this.c;
                ea eaVar6 = (ea) ((eyig) ahibVar14.d).a;
                ehbb ehbbVar = (ehbb) ahibVar14.f.b();
                ahkn ahknVar33 = this.a;
                ahho ahhoVar8 = this.d;
                ahhk ahhkVar7 = this.b;
                ahnh ahnhVar15 = ahknVar33.a;
                return new cveu(eaVar6, ehbbVar, ahnhVar15.BD, ahnhVar15.BC, ahnhVar15.Uk, ahhoVar8.bA, ahhkVar7.aW, (fdjx) ahnhVar15.m.b());
            case 84:
                ahib ahibVar15 = this.c;
                ea eaVar7 = (ea) ((eyig) ahibVar15.d).a;
                ehbb ehbbVar2 = (ehbb) ahibVar15.f.b();
                ahnh ahnhVar16 = this.a.a;
                return new cvdq(eaVar7, ehbbVar2, ahnhVar16.GD, ahnhVar16.Uk, (fdjx) ahnhVar16.m.b());
            case 85:
                ahib ahibVar16 = this.c;
                ahkn ahknVar34 = this.a;
                ea eaVar8 = (ea) ((eyig) ahibVar16.d).a;
                ahnh ahnhVar17 = ahknVar34.a;
                return new cved(eaVar8, ahnhVar17.pH, ahnhVar17.pG, ahnhVar17.Uk, (fdjx) ahnhVar17.oS.b());
            case 86:
                return new cavr(this.a.a.rF);
            case 87:
                ahkn ahknVar35 = this.a;
                ahho ahhoVar9 = this.d;
                return new uoq(ahknVar35.cD, ahknVar35.p, ahknVar35.y, ahhoVar9.g, ahknVar35.a.qG, ahhoVar9.c);
            case 88:
                ahng ahngVar5 = this.a.b;
                return new cwoo(ahngVar5.eQ, ahngVar5.ox, ahngVar5.mN);
            case 89:
                ahib ahibVar17 = this.c;
                ctec ctecVarJ = ahibVar17.j();
                cvov cvovVarK = ahibVar17.k();
                cvru cvruVarR = ahibVar17.r();
                cvtb cvtbVarS = ahibVar17.s();
                cvti cvtiVarT = ahibVar17.t();
                cvrn cvrnVar = new cvrn(ahibVar17.c.d);
                cvrk cvrkVarQ = ahibVar17.q();
                cvri cvriVarP = ahibVar17.p();
                cvpv cvpvVarL = ahibVar17.l();
                cvqe cvqeVarM = ahibVar17.m();
                cvqq cvqqVarN = ahibVar17.n();
                cvqx cvqxVarO = ahibVar17.o();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new cvoc(cvpvVarL, new cvod(-1, false, false, true)));
                arrayList.add(new cvoc(cvrnVar, new cvod(0, true, true, true)));
                arrayList.add(new cvoc(cvtiVarT, new cvod(1, false, true, false)));
                arrayList.add(new cvoc(cvrkVarQ, new cvod(2, true, true, true)));
                arrayList.add(new cvoc(cvtbVarS, new cvod(6, true, true, false)));
                arrayList.add(new cvoc(cvruVarR, new cvod(7, false, false, false)));
                arrayList.add(new cvoc(cvovVarK, new cvod(8, false, false, false)));
                arrayList.add(new cvoc(ctecVarJ, new cvod(9, true, true, true)));
                arrayList.add(new cvoc(cvriVarP, new cvod(10, true, true, true)));
                arrayList.add(new cvoc(cvqeVarM, new cvod(11, false, true, true)));
                arrayList.add(new cvoc(cvqqVarN, new cvod(12, false, true, true)));
                arrayList.add(new cvoc(cvqxVarO, new cvod(13, false, true, true)));
                ekgb ekgbVarD = ekgb.D(arrayList);
                ekgbVarD.getClass();
                return ekgbVarD;
            case 90:
                ahkn ahknVar36 = this.a;
                return new cvok(ahknVar36.aI, ahknVar36.a.c);
            case 91:
                return new eiji();
            case 92:
                return new Object() { // from class: cvoi
                };
            case 93:
                return new cteh();
            case 94:
                this.c.L();
                ahkn ahknVar37 = this.a;
                return new cted();
            case 95:
                return cecf.a((ea) ((eyig) this.c.d).a);
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                ahkn ahknVar38 = this.a;
                ahnh ahnhVar18 = ahknVar38.a;
                return new cvoz((Long) ahnhVar18.zz.b());
            case 97:
                return new cvpa();
            case 98:
                ahkn ahknVar39 = this.a;
                return new cvox(ahknVar39.a.rc, ahknVar39.eO);
            case 99:
                ahkn ahknVar40 = this.a;
                return new cvoj(ahknVar40.aI, ahknVar40.a.c);
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.fcsu
    public final Object b() {
        int i = this.e;
        if (i / 100 == 0) {
            return a();
        }
        switch (i) {
            case VCardConstants.DEFAULT_PREF /* 100 */:
                return Optional.of((cwpm) this.b.bg.b());
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                return new cvol();
            case 102:
                return new cvpp(this.a.a.qr);
            case 103:
                ahkn ahknVar = this.a;
                return new cvpu();
            case 104:
                ahib ahibVar = this.c;
                cvqe cvqeVarM = ahibVar.m();
                cvqq cvqqVarN = ahibVar.n();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new cvoc(cvqeVarM, new cvod(1, false, true, true)));
                arrayList.add(new cvoc(cvqqVarN, new cvod(2, false, true, true)));
                ekgb ekgbVarD = ekgb.D(arrayList);
                ekgbVarD.getClass();
                return ekgbVarD;
            case 105:
                ea eaVar = (ea) ((eyig) this.c.d).a;
                if (eaVar instanceof cvtv) {
                    return (cvtv) eaVar;
                }
                throw new IllegalStateException(a.M(eaVar, cvtw.class));
            case 106:
                ahkn ahknVar2 = this.a;
                ahnh ahnhVar = ahknVar2.a;
                return new cvtu(ahknVar2.dj, ahknVar2.y, ahnhVar.sX, ahknVar2.aQ, ahknVar2.b.dH);
            case 107:
                return new cwjq();
            case 108:
                return new axgc(this.a.aI, this.b.T);
            case 109:
                ahkn ahknVar3 = this.a;
                ahnh ahnhVar2 = ahknVar3.a;
                fdjx fdjxVar = (fdjx) ahnhVar2.m.b();
                ahho ahhoVar = this.d;
                eyik eyikVar = ahnhVar2.Pk;
                eyik eyikVar2 = ahnhVar2.qi;
                eyik eyikVar3 = ahnhVar2.pT;
                eyik eyikVar4 = ahnhVar2.xr;
                eyik eyikVar5 = ahnhVar2.vR;
                awhr awhrVar = (awhr) ahnhVar2.zl.b();
                return new asoq(fdjxVar, eyikVar, ahknVar3.cD, ahhoVar.c, ahhoVar.g, ahhoVar.f, eyikVar2, eyikVar3, eyikVar4, ahknVar3.b.oD, eyikVar5, awhrVar);
            case 110:
                ahkn ahknVar4 = this.a;
                return new afxx(ahknVar4.a.zs, new afxr(), (Executor) ahknVar4.p.b(), ahknVar4.cE);
            case 111:
                ahkn ahknVar5 = this.a;
                ahib ahibVar2 = this.c;
                ahnh ahnhVar3 = ahknVar5.a;
                return new badj(ahnhVar3.adB, ahnhVar3.Jd, ahibVar2.bd);
            case 112:
                return new cwwd(this.a.a.uP, this.b.T);
            case 113:
                return Optional.of(this.a.b.J());
            case 114:
                ahkn ahknVar6 = this.a;
                ahnh ahnhVar4 = ahknVar6.a;
                cjxi cjxiVar = (cjxi) ahnhVar4.yf.b();
                cpdm cpdmVar = (cpdm) ahnhVar4.Wt.b();
                ahkn ahknVar7 = this.c.a;
                crqv crqvVar = (crqv) ahknVar7.aT.b();
                ahnh ahnhVar5 = ahknVar7.a;
                return new cjrp(cjxiVar, cpdmVar, new cpdk(crqvVar, (cpdm) ahnhVar5.Wt.b(), (crsg) ahknVar7.b.hN.b(), (eosc) ahknVar7.y.b(), (cmlb) ahnhVar5.rd.b(), (cebq) ahnhVar5.rq.b(), (cebf) ahnhVar5.yg.b(), (eosc) ahknVar7.aJ.b(), (eosc) ahknVar7.p.b()), (eosc) ahknVar6.y.b(), (eosc) ahknVar6.p.b(), (cogw) ahknVar6.cD.b());
            case 115:
                ahib ahibVar3 = this.c;
                ahnh ahnhVar6 = ahibVar3.a.a;
                return new cxyh(ahibVar3.u(), new cyak(ahnhVar6.qK, (fdjx) ahnhVar6.oQ.b()));
            case 116:
                return new cyab((fcyh) this.a.cz.b());
            case 117:
                return new cxzz((fcyh) this.a.cz.b());
            case 118:
                ahkn ahknVar8 = this.a;
                return new cyad(ahknVar8.a.zP, (fcyh) ahknVar8.cz.b());
            case 119:
                return new cxyt(this.c.u());
            case 120:
                ea eaVar2 = (ea) ((eyig) this.c.d).a;
                if (eaVar2 instanceof cyar) {
                    return (cyar) eaVar2;
                }
                throw new IllegalStateException(a.M(eaVar2, cyav.class));
            case 121:
                ahnh ahnhVar7 = this.a.a;
                return new cybf((axky) ahnhVar7.HN.b(), (fdjx) ahnhVar7.m.b(), (Context) this.b.d.b());
            case 122:
                ea eaVar3 = (ea) ((eyig) this.c.d).a;
                if (eaVar3 instanceof cybv) {
                    return (cybv) eaVar3;
                }
                throw new IllegalStateException(a.M(eaVar3, cyci.class));
            case 123:
                ahkn ahknVar9 = this.c.a;
                egyt egytVar = (egyt) ahknVar9.dj.b();
                ahnh ahnhVar8 = ahknVar9.a;
                return new cyfu(new cyda(egytVar, (egbf) ahnhVar8.pG.b(), (egej) ahnhVar8.pI.b(), Optional.of(ahnhVar8.dJ()), ahnhVar8.afG, (fdjx) ahnhVar8.m.b()), (Context) this.b.d.b());
            case 124:
                ahnh ahnhVar9 = this.a.a;
                return new cydk((axky) ahnhVar9.HN.b(), (fdjx) ahnhVar9.m.b(), (Context) this.b.d.b());
            case 125:
                ahkn ahknVar10 = this.a;
                ahnh ahnhVar10 = ahknVar10.a;
                eygg eyggVarA = eyie.a(ahnhVar10.tJ);
                ahho ahhoVar2 = this.d;
                return new cyjq(eyggVarA, ahknVar10.b.oI, ahhoVar2.d, ahnhVar10.LU, (eosc) ahknVar10.p.b(), (eosc) ahknVar10.aJ.b());
            case 126:
                ea eaVar4 = (ea) ((eyig) this.c.d).a;
                if (eaVar4 instanceof cyml) {
                    return (cyml) eaVar4;
                }
                throw new IllegalStateException(a.M(eaVar4, cymy.class));
            case 127:
                ahkn ahknVar11 = this.a;
                Context context = (Context) ahknVar11.t.b();
                cogw cogwVar = (cogw) ahknVar11.cD.b();
                ahnh ahnhVar11 = ahknVar11.a;
                return new cymk(context, cogwVar, (cbmx) ahnhVar11.amO.b(), (fdjx) ahnhVar11.oQ.b());
            case 128:
                return new baid(this.c.bd);
            case 129:
                ahkn ahknVar12 = this.a;
                ahib ahibVar4 = this.c;
                ahnh ahnhVar12 = ahknVar12.a;
                ahng ahngVar = ahknVar12.b;
                return new cyos(ahknVar12.no, ahngVar.gZ, ahnhVar12.c, ahnhVar12.pQ, ahnhVar12.EG, ahknVar12.hS, ahnhVar12.Yx, ahnhVar12.FP, ahngVar.nT, ahknVar12.aI, ahnhVar12.qj, ahibVar4.by, ahngVar.hb, ahnhVar12.rJ);
            case 130:
                ahkn ahknVar13 = this.a;
                Context context2 = (Context) ahknVar13.t.b();
                ahhk ahhkVar = this.b;
                ahnh ahnhVar13 = ahknVar13.a;
                return new czav(context2, ahhkVar.bh, (ains) ahnhVar13.c.b(), (cqmr) ahknVar13.eK.b(), (cqsu) ahnhVar13.xi.b(), (bxfu) ahknVar13.eB.b(), ahnhVar13.Uk, (cqxl) ahnhVar13.Dv.b(), (cogw) ahknVar13.cD.b());
            case 131:
                ahib ahibVar5 = this.c;
                ahkn ahknVar14 = this.a;
                ea eaVar5 = (ea) ((eyig) ahibVar5.d).a;
                daoe daoeVar = (daoe) ahknVar14.b.hX.b();
                tlt tltVar = (tlt) this.b.n.b();
                ahkn ahknVar15 = ahibVar5.a;
                return new cyuq(eaVar5, daoeVar, tltVar, new cujr(ahknVar15.b.hX, ahknVar15.a.BK));
            case 132:
                return new czqx(this.a.a.pf);
            case 133:
                ahkn ahknVar16 = this.a;
                ahnh ahnhVar14 = ahknVar16.a;
                return new cjtw((cjxi) ahnhVar14.yf.b(), (cogw) ahknVar16.cD.b(), (cebq) ahnhVar14.rq.b());
            case 134:
                ahnh ahnhVar15 = this.a.a;
                return new cjrv((fdjx) ahnhVar15.oS.b(), ahnhVar15.rd);
            case 135:
                return new dabm(this.a.a.c);
            case 136:
                ahkn ahknVar17 = this.a;
                Context context3 = (Context) ahknVar17.t.b();
                ahnh ahnhVar16 = ahknVar17.a;
                return new baix(context3, (cpbn) ahnhVar16.qo.b(), ahnhVar16.qi);
            case 137:
                ahib ahibVar6 = this.c;
                ahkn ahknVar18 = this.a;
                ea eaVar6 = (ea) ((eyig) ahibVar6.d).a;
                ahibVar6.f();
                ahng ahngVar2 = ahknVar18.b;
                dakz dakzVar = (dakz) new dalf(eaVar6, dakz.class).b(new fcsu() { // from class: dakx
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return new dakz();
                    }
                });
                dakzVar.getClass();
                return dakzVar;
            case 138:
                ahkn ahknVar19 = this.a;
                ahnh ahnhVar17 = ahknVar19.a;
                return new dakw();
            case 139:
                return dnhz.a((lxq) this.c.J.b());
            case 140:
                ahhk ahhkVar2 = this.b;
                ahib ahibVar7 = this.c;
                return new doma(ahhkVar2.d, ahibVar7.bJ, ahibVar7.bK, this.a.lo, ahibVar7.g);
            case 141:
                return new donx();
            case 142:
                ahhk ahhkVar3 = this.b;
                ahkn ahknVar20 = this.a;
                ahib ahibVar8 = this.c;
                ahnh ahnhVar18 = ahknVar20.a;
                eyik eyikVar6 = ahnhVar18.j;
                eyik eyikVar7 = ahknVar20.lp;
                eyik eyikVar8 = ahknVar20.y;
                eyik eyikVar9 = ahnhVar18.oQ;
                ahng ahngVar3 = ahknVar20.b;
                return new dmpx(ahhkVar3.d, eyikVar6, eyikVar7, eyikVar8, eyikVar9, ahibVar8.N, ahngVar3.kb, ahngVar3.oa);
            case 143:
                return new dqav(this.b.d, this.c.bN);
            case 144:
                return new dqao(this.c.g);
            case 145:
                ahkn ahknVar21 = this.a;
                return new dpxx((dnfb) ahknVar21.lq.b(), (dnga) ahknVar21.b.ho.b());
            case 146:
                Context context4 = (Context) this.a.t.b();
                ahib ahibVar9 = this.c;
                return new dnsd(context4, (fdjx) ahibVar9.g.b(), ahibVar9.w());
            case 147:
                ahhk ahhkVar4 = this.b;
                ahib ahibVar10 = this.c;
                return new dnxf(ahhkVar4.d, ahibVar10.g, ahibVar10.bJ, this.a.lo);
            case 148:
                return new dnxc(this.c.bT);
            case 149:
                ahib ahibVar11 = this.c;
                ahkn ahknVar22 = this.a;
                ea eaVar7 = (ea) ((eyig) ahibVar11.d).a;
                ahnh ahnhVar19 = ahknVar22.a;
                return new dnve(eaVar7, (dnvi) ahnhVar19.IO.b(), new agwc((ea) ((eyig) ahibVar11.d).a), (Optional) this.b.cG.b(), (Optional) ahibVar11.bS.b(), (fdjx) ahnhVar19.m.b());
            case 150:
                return Optional.of((dnwx) this.a.b.lm.b());
            case 151:
                ahhk ahhkVar5 = this.b;
                ahib ahibVar12 = this.c;
                return new dobl(ahhkVar5.d, ahibVar12.g, ahibVar12.bJ, this.a.lo);
            case 152:
                return new dobn(this.c.A());
            case 153:
                ahkn ahknVar23 = this.a;
                return new dpxx((dnfb) ahknVar23.lq.b(), (dnga) ahknVar23.b.pc.b());
            case 154:
                return new doun(this.b.bu, this.c.n);
            case 155:
                ahib ahibVar13 = this.c;
                return new doug(ahibVar13.g, ahibVar13.n);
            case 156:
                return new dowi(this.c.ca, this.a.lo);
            case 157:
                return new dpzn((Context) this.b.d.b());
            case 158:
                return Optional.of(Boolean.valueOf(((eoth) new argd(this.a.b.a.a.oO).a.b()).a("bugle.should_hugo_search_ignore_on_back_pressed_when_search_bar_hidden")));
            case 159:
                return new dobn(this.c.A());
            case 160:
                ahkn ahknVar24 = this.a;
                return new dpxx((dnfb) ahknVar24.lq.b(), (dnga) ahknVar24.b.pf.b());
            case 161:
                vux vuxVar = (vux) this.a.b.hu.b();
                vuxVar.getClass();
                return new dpdh(vuxVar, 10);
            case 162:
                lxq lxqVar = (lxq) this.c.J.b();
                lxqVar.getClass();
                ConversationViewModel conversationViewModel = (ConversationViewModel) new lxo(lxqVar).a(ConversationViewModel.class);
                Object objB = conversationViewModel.d.b();
                objB.getClass();
                Object objB2 = conversationViewModel.e.b();
                objB2.getClass();
                return new dnhl((dnih) objB, (dnhq) objB2);
            case 163:
                return new edgt(this.a.b.nO);
            case 164:
                ahhk ahhkVar6 = this.b;
                ahng ahngVar4 = this.a.b;
                return new edfd(ahhkVar6.bR, ahngVar4.iZ, ahngVar4.jc);
            case 165:
                ahhk ahhkVar7 = this.b;
                ahng ahngVar5 = this.a.b;
                return new edek(ahhkVar7.bR, ahngVar5.iZ, ahngVar5.jc);
            case 166:
                ahib ahibVar14 = this.c;
                ahhk ahhkVar8 = this.b;
                ea eaVar8 = (ea) ((eyig) ahibVar14.d).a;
                efxf efxfVar = (efxf) ahhkVar8.x.b();
                ejwi ejwiVarJ = ejwi.j("google");
                return new egky(eaVar8, efxfVar, ejwiVarJ, (eigp) this.a.aI.b());
            case 167:
                ahhk ahhkVar9 = this.b;
                ahib ahibVar15 = this.c;
                ahkn ahknVar25 = this.a;
                return ehrk.a(ahhkVar9.aF(), (ea) ((eyig) ahibVar15.d).a, ahknVar25.b.kt.b());
            case 168:
                ea eaVar9 = (ea) ((eyig) this.c.d).a;
                if (eaVar9 instanceof ejfn) {
                    return (ejfn) eaVar9;
                }
                throw new IllegalStateException(a.M(eaVar9, ejfr.class));
            case 169:
                return new syb();
            case 170:
                return new cgwy();
            case 171:
                return Optional.of(new uiq());
            case 172:
                ahib ahibVar16 = this.c;
                return new abvt(Optional.of(eyie.a(ahibVar16.cq)), Optional.of(ahibVar16.c()));
            case 173:
                return new adea();
            default:
                throw new AssertionError(i);
        }
    }
}
