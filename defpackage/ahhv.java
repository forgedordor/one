package defpackage;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.sun.jna.Function;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahhv implements eyik {
    public final ahkn a;
    public final ahhe b;
    public final ahhw c;
    private final ahjr d;
    private final ahhh e;
    private final int f;

    public ahhv(ahkn ahknVar, ahjr ahjrVar, ahhh ahhhVar, ahhe ahheVar, ahhw ahhwVar, int i) {
        this.a = ahknVar;
        this.d = ahjrVar;
        this.e = ahhhVar;
        this.b = ahheVar;
        this.c = ahhwVar;
        this.f = i;
    }

    /* JADX WARN: Type inference failed for: r7v18, types: [abxm, java.lang.Object] */
    private final Object a() {
        int i = this.f;
        switch (i) {
            case 0:
                return egpy.a((ea) ((eyig) this.c.e).a);
            case 1:
                return new ehab((ea) ((eyig) this.c.e).a, (Executor) this.a.a.j.b());
            case 2:
                return new eils(new eibu((eigp) this.d.ac.b()));
            case 3:
                ahnh ahnhVar = this.a.a;
                aurx aurxVar = (aurx) ahnhVar.wc.b();
                fdjx fdjxVar = (fdjx) ahnhVar.oQ.b();
                ahjr ahjrVar = this.d;
                return new ause(aurxVar, fdjxVar, (bzox) ahjrVar.gw.b(), (bzrq) ahjrVar.om.b());
            case 4:
                ahnh ahnhVar2 = this.a.a;
                return new ckkv(ahnhVar2.pb, (fdjx) ahnhVar2.m.b());
            case 5:
                ahjr ahjrVar2 = this.d;
                efwo efwoVar = (efwo) ahjrVar2.b.b();
                ahnh ahnhVar3 = this.a.a;
                return new tqo(efwoVar, (aurx) ahnhVar3.wc.b(), (ceqp) ahjrVar2.o.b(), (crmx) ahnhVar3.pB.b(), (alrj) ahnhVar3.qi.b(), (fdjx) ahnhVar3.oQ.b(), (egbf) ahnhVar3.pG.b());
            case 6:
                ahhw ahhwVar = this.c;
                ea eaVar = (ea) ((eyig) ahhwVar.e).a;
                ehpg ehpgVar = (ehpg) ahhwVar.m.b();
                ahkn ahknVar = this.a;
                return ehbc.a(eaVar, ehpgVar, (egzo) ahknVar.aQ.b(), (Executor) ahknVar.a.j.b());
            case 7:
                ea eaVar2 = (ea) ((eyig) this.c.e).a;
                return ehpg.a(eaVar2, eaVar2);
            case 8:
                ahkn ahknVar2 = this.a;
                egyt egytVar = (egyt) ahknVar2.dj.b();
                return new bvel(egytVar);
            case 9:
                ahkn ahknVar3 = this.a;
                return new aipw(ahknVar3.a.zs, new aiqn(), (Executor) ahknVar3.p.b());
            case 10:
                ahhw ahhwVar2 = this.c;
                return new aomv((ea) ((eyig) ahhwVar2.e).a, ahhwVar2.f, ahhwVar2.s, this.a.b.hd);
            case 11:
                ahkn ahknVar4 = this.a;
                ahhw ahhwVar3 = this.c;
                return new aone(ahknVar4.t, ahknVar4.y, ahhwVar3.q, this.d.ac, ahhwVar3.r);
            case 12:
                return new aolw((Context) this.a.t.b());
            case 13:
                return new ssu();
            case 14:
                ahkn ahknVar5 = this.a;
                Context context = (Context) ahknVar5.t.b();
                crnp crnpVar = (crnp) ahknVar5.cI.b();
                ahnh ahnhVar4 = ahknVar5.a;
                return new dalj(context, crnpVar, (dakl) ahnhVar4.BK.b());
            case 15:
                return vcs.a((ea) ((eyig) this.c.e).a);
            case 16:
                return new abvt(Optional.of(eyie.a(this.a.a.HV)), Optional.of(this.c.h()));
            case 17:
                return Optional.of(new uiq());
            case 18:
                return Optional.of((ahsd) this.a.a.UB.b());
            case 19:
                bmft bmftVar = bmft.a;
                bmftVar.getClass();
                new ekph(bmftVar);
                return new uhs();
            case 20:
                return new ahhr();
            case 21:
                ahnh ahnhVar5 = this.a.a;
                return new anpm();
            case 22:
                ahkn ahknVar6 = this.a;
                ahjr ahjrVar3 = this.d;
                ahhw ahhwVar4 = this.c;
                ahnh ahnhVar6 = ahknVar6.a;
                eyik eyikVar = ahknVar6.cD;
                eyik eyikVar2 = ahnhVar6.CG;
                eyik eyikVar3 = ahnhVar6.uu;
                eyik eyikVar4 = ahnhVar6.wF;
                eyik eyikVar5 = ahnhVar6.wJ;
                eyik eyikVar6 = ahknVar6.t;
                eyik eyikVar7 = ahjrVar3.bE;
                eyik eyikVar8 = ahhwVar4.x;
                ahng ahngVar = ahknVar6.b;
                return new bags(eyikVar, eyikVar2, eyikVar3, eyikVar4, eyikVar5, eyikVar6, ahknVar6.aN, ahnhVar6.pf, ahnhVar6.Dt, ahnhVar6.CA, ahnhVar6.um, ahnhVar6.OJ, eyikVar7, eyikVar8, ahnhVar6.CF, ahnhVar6.JK, ahnhVar6.yx, ahngVar.he, ahhwVar4.y, ahjrVar3.J, ahnhVar6.sh, ahnhVar6.NR, ahngVar.hf, ahknVar6.y);
            case 23:
                ahnh ahnhVar7 = this.a.a;
                return new batj();
            case 24:
                ahng ahngVar2 = this.a.b;
                ahnh ahnhVar8 = ahngVar2.a.a;
                return Optional.of(new ahsg(ahnhVar8.m, ahnhVar8.UB, ahngVar2.hi));
            case 25:
                return new ulc();
            case 26:
                return Optional.of((val) this.e.c.b());
            case 27:
                ahhw ahhwVar5 = this.c;
                ahkn ahknVar7 = this.a;
                eyik eyikVar9 = ahhwVar5.e;
                eyik eyikVar10 = ahhwVar5.K;
                eyik eyikVar11 = ahhwVar5.N;
                ahng ahngVar3 = ahknVar7.b;
                return new uju(eyikVar9, eyikVar10, eyikVar11, ahngVar3.ht, ahhwVar5.O, ahhwVar5.Q, ahhwVar5.R, ahhwVar5.S, ahhwVar5.T, ahhwVar5.Z, ahhwVar5.aa, ahhwVar5.ab, ahhwVar5.ac, ahhwVar5.ad, ahhwVar5.ai, ahngVar3.hv, ahhwVar5.as, ahhwVar5.au, ahknVar7.a.ws, ahhwVar5.av, ahngVar3.hw, ahngVar3.hx, ahhwVar5.aw, ahhwVar5.ax);
            case 28:
                ahhe ahheVar = this.b;
                ahhw ahhwVar6 = this.c;
                return new dpbr(ahheVar.f, ahheVar.h, ahhwVar6.G, eyil.a(ahhwVar6.H), eyil.a(ahhwVar6.I), ahhwVar6.J, ahheVar.i);
            case 29:
                ahkn ahknVar8 = this.a;
                ahhw ahhwVar7 = this.c;
                return new dpuu(ahknVar8.lp, ahhwVar7.E, ahhwVar7.F);
            case 30:
                ahhe ahheVar2 = this.b;
                ahhw ahhwVar8 = this.c;
                return new dpwz(ahheVar2.f, ahhwVar8.C, ahhwVar8.D);
            case 31:
                return new dpvi(this.a.lp);
            case 32:
                return Optional.of(Boolean.valueOf(this.a.b.df()));
            case 33:
                ahhe ahheVar3 = this.b;
                ahhw ahhwVar9 = this.c;
                return new dpww(ahheVar3.f, ahhwVar9.C, ahhwVar9.D);
            case 34:
                ekgi ekgiVarH = ekgp.h(10);
                ekgiVarH.i(dnau.class, dnaw.a());
                ahng ahngVar4 = this.a.b;
                ekgiVarH.i(dnpz.class, (dphz) ahngVar4.hk.b());
                ekgiVarH.i(dnyn.class, dnyp.a());
                ekgiVarH.i(dnro.class, (dphz) ahngVar4.hl.b());
                ekgiVarH.i(doaa.class, doac.a());
                ekgiVarH.i(dota.class, dotg.a());
                ekgiVarH.i(doxo.class, doxr.a());
                ekgiVarH.i(dpao.class, dpaq.a());
                ekgiVarH.i(dqhd.class, dqig.a());
                ekgiVarH.i(doem.class, dofa.a());
                return ekgiVarH.c();
            case 35:
                ahng ahngVar5 = this.a.b;
                ekgi ekgiVarH2 = ekgp.h(9);
                ekgiVarH2.i(dpxe.b, ahngVar5.cg());
                ekgiVarH2.i(dpxe.a, dnaw.a());
                ekgiVarH2.i(dpxe.i, dnyp.a());
                ekgiVarH2.i(dpxe.c, doac.a());
                ekgiVarH2.i(dpxe.d, dotg.a());
                ekgiVarH2.i(dpxe.e, doxr.a());
                ekgiVarH2.i(dpxe.f, dpaq.a());
                ekgiVarH2.i(dpxe.g, dqig.a());
                ekgiVarH2.i(dpxe.h, dofa.a());
                return ekgiVarH2.c();
            case 36:
                return egvv.a((fcyh) this.a.a.Rm.b(), (ea) ((eyig) this.c.e).a);
            case 37:
                ahkn ahknVar9 = this.a;
                ahhw ahhwVar10 = this.c;
                return new dniv(ahknVar9.b.ho, ahhwVar10.L, ahhwVar10.M, this.d.jY);
            case 38:
                ahkn ahknVar10 = this.a;
                return new dnji(ahknVar10.a.m, ahknVar10.lp, ahknVar10.b.hr);
            case Maneuver.TYPE_DESTINATION /* 39 */:
                ahkn ahknVar11 = this.a;
                return new dnje(ahknVar11.a.m, ahknVar11.b.hm);
            case 40:
                return new ujh(this.c.p, this.a.b.he);
            case 41:
                ahhw ahhwVar11 = this.c;
                return new uji(ahhwVar11.p, ahhwVar11.P);
            case 42:
                ahnh ahnhVar9 = this.a.a;
                return new ukz();
            case 43:
                return new ujn(this.c.p, this.a.b.he);
            case 44:
                ahhw ahhwVar12 = this.c;
                return new ujo(ahhwVar12.p, ahhwVar12.P);
            case 45:
                return new ujt(this.a.b.he, this.c.P);
            case 46:
                ahkn ahknVar12 = this.a;
                ahhw ahhwVar13 = this.c;
                return new ujx(ahknVar12.b.he, ahhwVar13.U, ahhwVar13.p, ahhwVar13.Y);
            case 47:
                return new abvt(Optional.of(eyie.a(this.d.lV)), Optional.of(this.c.h()));
            case 48:
                ahhw ahhwVar14 = this.c;
                return new abvt(Optional.of(eyie.a(ahhwVar14.X)), Optional.of(ahhwVar14.h()));
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                fdjx fdjxVar2 = (fdjx) this.a.a.oQ.b();
                ahhw ahhwVar15 = this.c;
                ahhwVar15.w();
                ahhwVar15.j();
                ahhwVar15.i();
                return new doqs(fdjxVar2);
            case 50:
                return new dopm((Context) this.a.t.b(), new dopb(this.c.a.a.mk()));
            case 51:
                return new adid((ecjh) this.d.oX.b());
            case 52:
                ahhw ahhwVar16 = this.c;
                ahkn ahknVar13 = this.a;
                ahjr ahjrVar4 = this.d;
                return new ukf(ahhwVar16.e, ahknVar13.t, ahknVar13.b.he, ahhwVar16.U, ahjrVar4.oW, ahhwVar16.p, ahhwVar16.Y);
            case 53:
                return new uka(this.c.p, this.a.b.he);
            case 54:
                ahhw ahhwVar17 = this.c;
                return new ukb(ahhwVar17.p, ahhwVar17.P);
            case 55:
                return new ukd(this.a.b.he, this.c.P);
            case 56:
                ahhw ahhwVar18 = this.c;
                ahkn ahknVar14 = this.a;
                eyik eyikVar12 = ahhwVar18.ae;
                ahnh ahnhVar10 = ahknVar14.a;
                return new uky(eyikVar12, ahnhVar10.oQ, ahknVar14.ll, ahnhVar10.un, ahhwVar18.af, ahnhVar10.BK, ahhwVar18.ag, ahhwVar18.ah);
            case 57:
                ahkn ahknVar15 = this.a;
                return new aomc((Context) ahknVar15.t.b(), (eosd) ahknVar15.p.b(), (eosc) ahknVar15.y.b(), new aolx(), (ctce) ahknVar15.a.yp.b());
            case 58:
                return new aomd((fdjx) this.a.a.oQ.b());
            case 59:
                ahkn ahknVar16 = this.a;
                return new airc(ahknVar16.a.zs, new aiqn(), (Executor) ahknVar16.p.b());
            case 60:
                ahkn ahknVar17 = this.a;
                return new airh(ahknVar17.a.zs, new aiqn(), (Executor) ahknVar17.p.b());
            case 61:
                ahhw ahhwVar19 = this.c;
                return new ukn(ahhwVar19.ao, ahhwVar19.ap, ahhwVar19.aq, ahhwVar19.ar, this.a.b.hu);
            case 62:
                ahhw ahhwVar20 = this.c;
                ahkn ahknVar18 = this.a;
                return new ukh(ahhwVar20.ak, ahhwVar20.p, ahknVar18.cz, ahhwVar20.al, ahhwVar20.am, ahknVar18.t, ahhwVar20.e, ahknVar18.bM, ahhwVar20.J, ahhwVar20.an, ahknVar18.b.fe);
            case Function.ALT_CONVENTION /* 63 */:
                ahkn ahknVar19 = this.a;
                ahhw ahhwVar21 = this.c;
                return new ukl(ahhwVar21.aj, ahknVar19.a.qN, ahhwVar21.J);
            case 64:
                ahkn ahknVar20 = this.a;
                ahnh ahnhVar11 = ahknVar20.a;
                eyik eyikVar13 = ahnhVar11.zs;
                aiqn aiqnVar = new aiqn();
                return new aiqo(eyikVar13, aiqnVar, (Executor) ahknVar20.p.b());
            case 65:
                egxv egxvVar = (egxv) this.d.am.b();
                ahkn ahknVar21 = this.a;
                return new cywg(egxvVar, (Executor) ahknVar21.y.b(), (cden) ahknVar21.a.qN.b());
            case 66:
                return new cywh((Context) this.a.t.b());
            case 67:
                ahkn ahknVar22 = this.a;
                ahnh ahnhVar12 = ahknVar22.a;
                return new dakw();
            case 68:
                ahhw ahhwVar22 = this.c;
                ahkn ahknVar23 = this.a;
                return new uki(ahhwVar22.ak, ahknVar23.cz, ahhwVar22.p, ahknVar23.a.CF, ahknVar23.eK);
            case 69:
                return new ukj(this.c.ak, this.a.jX);
            case 70:
                return new ukk();
            case 71:
                return dnhz.a((lxq) this.c.at.b());
            case 72:
                return dnia.a((Activity) this.b.f.b(), (ea) ((eyig) this.c.e).a, Optional.empty());
            case 73:
                return new cqwi((ehrb) this.a.hD.b());
            case 74:
                return new dnhx((Activity) this.b.f.b());
            case 75:
                return Optional.of((dofb) this.a.b.hy.b());
            case 76:
                return new uio();
            case 77:
                ahhw ahhwVar23 = this.c;
                return new abvt(Optional.of(eyie.a(ahhwVar23.ay)), Optional.of(ahhwVar23.h()));
            case 78:
                ahhw ahhwVar24 = this.c;
                ahkn ahknVar24 = ahhwVar24.a;
                fcyh fcyhVar = (fcyh) ahknVar24.cz.b();
                ahjr ahjrVar5 = ahhwVar24.b;
                adfk adfkVar = new adfk(fcyhVar, new adht((ecjh) ahjrVar5.oY.b()), (dopm) ahhwVar24.V.b(), ahhwVar24.w(), (addt) ahjrVar5.lV.b(), (ehrb) ahhwVar24.d.n.b());
                ahhe ahheVar4 = this.b;
                ahkn ahknVar25 = this.a;
                Object obj = ((eyig) ahhwVar24.e).a;
                ahnh ahnhVar13 = ahknVar25.a;
                ?? C = ahheVar4.C();
                eyik eyikVar14 = ahnhVar13.Uk;
                ahnh ahnhVar14 = ahknVar24.a;
                return new adfc(adfkVar, (ea) obj, C, eyikVar14, new daog(ahnhVar14.BK), new adge(ahnhVar14.zs, new adfq(), (Executor) ahknVar24.p.b()));
            case 79:
                return new cywu(this.c.aN);
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                ahhw ahhwVar25 = this.c;
                ahkn ahknVar26 = ahhwVar25.a;
                ahnh ahnhVar15 = ahknVar26.a;
                eyik eyikVar15 = ahnhVar15.apa;
                ahng ahngVar6 = ahknVar26.b;
                eyik eyikVar16 = ahngVar6.hz;
                eyik eyikVar17 = ahhwVar25.aA;
                czdf czdfVar = new czdf(eyikVar15, eyikVar16, eyikVar17, eyikVar17);
                eyik eyikVar18 = ahhwVar25.aB;
                eyik eyikVar19 = ahknVar26.kL;
                eyik eyikVar20 = ahhwVar25.aF;
                eyik eyikVar21 = ahhwVar25.aE;
                czaj czajVar = new czaj(eyikVar18, eyikVar19, eyikVar21, eyikVar20, eyikVar21, eyikVar21);
                cyxg cyxgVar = new cyxg(ahknVar26.t, ahknVar26.kL, ahhwVar25.aH, ahhwVar25.aG, ahngVar6.hB, ahngVar6.hC);
                cyxm cyxmVar = new cyxm(ahknVar26.kL, ahhwVar25.aJ, ahhwVar25.aK, ahhwVar25.aj);
                czcv czcvVar = new czcv(ahknVar26.kL);
                czaw czawVar = new czaw(ahhwVar25.aB, ahknVar26.kL, ahhwVar25.aE, ahhwVar25.aL, ahhwVar25.az, ahhwVar25.aM);
                cyxx cyxxVar = new cyxx(ahhwVar25.aj, ahhwVar25.p, ahnhVar15.c, ahnhVar15.Dt, ahknVar26.eK, ahnhVar15.yw, ahhwVar25.aI, ahnhVar15.CF);
                cyvk cyvkVarS = ahhwVar25.s();
                cywx cywxVar = new cywx();
                ekgi ekgiVar = new ekgi();
                ekgiVar.i(evyz.CAMERA_GALLERY, czawVar);
                ekgiVar.i(evyz.EMOJI, cyxgVar);
                ekgiVar.i(evyz.GALLERY, czajVar);
                ekgiVar.i(evyz.GIF, czcvVar);
                ekgiVar.i(evyz.EXPRESSIVE_STICKER, cyxmVar);
                ekgiVar.i(evyz.LOCATION, czdfVar);
                ekgiVar.i(evyz.CONTACT, cyvkVarS);
                ekgiVar.i(evyz.FILE, cyxxVar);
                ekgiVar.i(evyz.CUSTOMIZATION, cywxVar);
                return ekgiVar.c();
            case 81:
                return new czde(this.a.a.qj);
            case 82:
                ((efwo) this.d.b.b()).getClass();
                return new Object() { // from class: uis
                };
            case 83:
                ahkn ahknVar27 = this.a;
                ahhw ahhwVar26 = this.c;
                ahhe ahheVar5 = this.b;
                ahjr ahjrVar6 = this.d;
                eyik eyikVar22 = ahknVar27.t;
                eyik eyikVar23 = ahhwVar26.aB;
                ahnh ahnhVar16 = ahknVar27.a;
                return new czai(eyikVar22, eyikVar23, ahknVar27.cD, ahnhVar16.ws, ahknVar27.da, ahheVar5.o, ahknVar27.y, ahknVar27.pP, ahnhVar16.BK, ahknVar27.oc, ahjrVar6.oW, ahhwVar26.aD, ahnhVar16.vh);
            case 84:
                ahhw ahhwVar27 = this.c;
                return new abvt(Optional.of(eyie.a(ahhwVar27.aC)), Optional.of(ahhwVar27.h()));
            case 85:
                fdjx fdjxVar3 = (fdjx) this.a.a.oQ.b();
                ahhw ahhwVar28 = this.c;
                return new adhk(fdjxVar3, (ea) ((eyig) ahhwVar28.e).a, ahhwVar28.j(), ahhwVar28.w(), (addt) this.d.lV.b(), ahhwVar28.i());
            case 86:
                ahkn ahknVar28 = this.a;
                Context context2 = (Context) ahknVar28.t.b();
                crma crmaVar = (crma) ahknVar28.da.b();
                ContentResolver contentResolverQ = ahknVar28.Q();
                eosc eoscVar = (eosc) ahknVar28.y.b();
                ahhw ahhwVar29 = this.c;
                return new czbv(context2, crmaVar, contentResolverQ, eoscVar, ahhwVar29.m(), ahhwVar29.t());
            case 87:
                ahhw ahhwVar30 = this.c;
                return new cyxf(ahhwVar30.p, this.a.b.hB, ahhwVar30.aG);
            case 88:
                return new cwjq();
            case 89:
                ahkn ahknVar29 = this.a;
                ahhw ahhwVar31 = this.c;
                return new cyxl(ahknVar29.t, ahknVar29.b.hD, ahhwVar31.aI);
            case 90:
                return new cvjo(this.a.cD);
            case 91:
                ahkn ahknVar30 = this.a;
                ahknVar30.Q();
                return new cyxk();
            case 92:
                ahkn ahknVar31 = this.a;
                Context context3 = (Context) ahknVar31.t.b();
                crma crmaVar2 = (crma) ahknVar31.da.b();
                ContentResolver contentResolverQ2 = ahknVar31.Q();
                eosc eoscVar2 = (eosc) ahknVar31.y.b();
                ahhw ahhwVar32 = this.c;
                return new czbp(context3, crmaVar2, contentResolverQ2, eoscVar2, ahhwVar32.m(), ahhwVar32.t());
            case 93:
                return true;
            case 94:
                return new cyww((crqv) this.a.aT.b(), (ekgp) this.c.aN.b());
            case 95:
                return new uln();
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                return new eidm((eigp) this.d.ac.b());
            case 97:
                ahhw ahhwVar33 = this.c;
                ahkn ahknVar32 = this.a;
                ahjr ahjrVar7 = this.d;
                eyik eyikVar24 = ahhwVar33.aR;
                ahng ahngVar7 = ahknVar32.b;
                ahnh ahnhVar17 = ahknVar32.a;
                return new ult(eyikVar24, ahnhVar17.adN, ahngVar7.hG, ahjrVar7.F, ahjrVar7.ac, ahngVar7.hF, ahnhVar17.FE, ahnhVar17.Vr, ahnhVar17.j);
            case 98:
                return new ulu(this.d.ac);
            case 99:
                return new ulg(this.a.t);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        int i = this.f;
        switch (i) {
            case VCardConstants.DEFAULT_PREF /* 100 */:
                return new ulj(this.c.aQ);
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                return new cvjk((eidm) this.c.aQ.b());
            case 102:
                ahjr ahjrVar = this.d;
                return Optional.of(new aiev(ahjrVar.oZ, ahjrVar.a.a.Vr));
            case 103:
                return Optional.of(new aiew());
            case 104:
                ahhw ahhwVar = this.c;
                ahhwVar.d.c.W();
                ahnh ahnhVar = ahhwVar.a.a;
                ahnhVar.aL();
                ekhx.r(new uus(), ahhwVar.u());
                return new ulf();
            case 105:
                ahkn ahknVar = this.a;
                Context context = (Context) ahknVar.t.b();
                cogw cogwVar = (cogw) ahknVar.cD.b();
                ahhw ahhwVar2 = this.c;
                egpr egprVar = (egpr) ahhwVar2.f.b();
                ahjr ahjrVar2 = this.d;
                return new czxl(context, cogwVar, ahhwVar2.aS, egprVar, (ea) ((eyig) ahhwVar2.e).a, eyie.a(ahjrVar2.dQ), ahhwVar2.aU, ahhwVar2.aV);
            case 106:
                return new aayl((ea) ((eyig) this.c.e).a);
            case 107:
                ahkn ahknVar2 = this.a;
                return new czxw((Context) ahknVar2.t.b(), (cogw) ahknVar2.cD.b(), (aaxw) this.c.aT.b());
            case 108:
                return new aaxw((Context) this.a.t.b());
            case 109:
                ahkn ahknVar3 = this.a;
                return new czxv((Context) ahknVar3.t.b(), (czxw) this.c.aU.b(), (clfb) this.d.dQ.b(), (eosc) ahknVar3.p.b());
            case 110:
                ahjr ahjrVar3 = this.d;
                ahhw ahhwVar3 = this.c;
                ahkn ahknVar4 = this.a;
                eyik eyikVar = ahhwVar3.aY;
                eyik eyikVar2 = ahknVar4.gF;
                czqs czqsVar = (czqs) eyikVar.b();
                ahnh ahnhVar2 = ahknVar4.a;
                ains ainsVar = (ains) ahnhVar2.c.b();
                return new dajd(ahjrVar3.oU, ahhwVar3.aX, eyikVar2, czqsVar, ainsVar, ahnhVar2.Uk, (dakl) ahnhVar2.BK.b(), (eigp) ahjrVar3.ac.b());
            case 111:
                ahkn ahknVar5 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar5.cA.b();
                ahnh ahnhVar3 = ahknVar5.a;
                return new cjya(fcyhVar, (fdjx) ahnhVar3.oS.b(), ahnhVar3.rc, ahnhVar3.ru, (Context) ahknVar5.t.b(), ahknVar5.gF, ahnhVar3.Wt, eyie.a(ahknVar5.nx), ahknVar5.eO);
            case 112:
                ahkn ahknVar6 = this.a;
                ahhw ahhwVar4 = this.c;
                ahjr ahjrVar4 = this.d;
                eyik eyikVar3 = ahknVar6.t;
                ahnh ahnhVar4 = ahknVar6.a;
                eyik eyikVar4 = ahknVar6.aT;
                eyik eyikVar5 = ahhwVar4.aX;
                eyik eyikVar6 = ahknVar6.gF;
                eyik eyikVar7 = ahnhVar4.c;
                ahng ahngVar = ahknVar6.b;
                return new czqs(eyikVar3, eyikVar4, eyikVar5, eyikVar6, eyikVar7, ahngVar.gZ, ahngVar.hN, ahnhVar4.PN, ahngVar.cZ, ahknVar6.cD, ahnhVar4.sd, ahjrVar4.ac, ahknVar6.aJ, ahnhVar4.rd, ahnhVar4.rq, ahjrVar4.pc, ahnhVar4.ri, ahngVar.hO, ahngVar.hP);
            case 113:
                ahjr ahjrVar5 = this.d;
                ahkn ahknVar7 = ahjrVar5.a;
                ahng ahngVar2 = ahknVar7.b;
                ahngVar2.dm();
                eyik eyikVar8 = ahngVar2.hR;
                eyik eyikVar9 = ahngVar2.hS;
                eyik eyikVar10 = ahjrVar5.ac;
                eyikVar8.getClass();
                eyikVar9.getClass();
                eyikVar10.getClass();
                int i2 = unx.a;
                ekgp.n(ckyd.SMS_TRANSPORT, ahjrVar5.pf, ckyd.MMS_TRANSPORT, ahjrVar5.pg, ckyd.RCS_FALLBACK, ahjrVar5.ph);
                int i3 = ckyb.a;
                ahngVar2.h();
                ahngVar2.dn();
                return Optional.of(new unj());
            case 114:
                return Optional.of(this.b.y());
            case 115:
                ahkn ahknVar8 = this.a;
                eyik eyikVar11 = ahknVar8.aQ;
                eyik eyikVar12 = ahknVar8.a.qK;
                return new ums(eyikVar12);
            case 116:
                return new cvuj(eyie.a(this.c.aZ));
            case 117:
                return Optional.of(this.b.x());
            case 118:
                ahhw ahhwVar5 = this.c;
                ahhwVar5.K();
                return new ulm();
            case 119:
                return new dajk(this.c.ba);
            case 120:
                ahkn ahknVar9 = this.a;
                eosc eoscVar = (eosc) ahknVar9.y.b();
                eyik eyikVar13 = ahknVar9.cD;
                ahnh ahnhVar5 = ahknVar9.a;
                eyik eyikVar14 = ahnhVar5.yw;
                eyik eyikVar15 = ahnhVar5.qr;
                eyik eyikVar16 = ahnhVar5.zF;
                cogw cogwVar2 = (cogw) eyikVar13.b();
                return new adaw(eoscVar, eyikVar14, eyikVar15, ahknVar9.aT, eyikVar16, ahknVar9.cE, cogwVar2);
            case 121:
                ahkn ahknVar10 = this.a;
                eosc eoscVar2 = (eosc) ahknVar10.aJ.b();
                eosc eoscVar3 = (eosc) ahknVar10.p.b();
                ahhw ahhwVar6 = this.c;
                return new dajp(eoscVar2, eoscVar3, ahhwVar6.ba, new arfi(ahknVar10.b.a.a.oO));
            case 122:
                return Optional.of(this.a.b.bN());
            case 123:
                ahkn ahknVar11 = this.a;
                ahnh ahnhVar6 = ahknVar11.a;
                return new umc(ahnhVar6.zs, (Executor) ahknVar11.p.b(), ahnhVar6.uM, (fdjx) ahnhVar6.oQ.b(), (fcyh) ahknVar11.cz.b(), (Context) ahknVar11.t.b());
            case 124:
                ahhw ahhwVar7 = this.c;
                ahhwVar7.b.j();
                ahhwVar7.a.a.s();
                return Optional.of(new svm((fdjx) ahhwVar7.J.b()));
            case 125:
                return Optional.of(this.b.u());
            case 126:
                return Optional.of(this.a.b.J());
            case 127:
                ahkn ahknVar12 = this.a;
                return new uui((eosd) ahknVar12.y.b(), (vcu) this.c.v.b(), (bbdl) ahknVar12.a.qG.b());
            case 128:
                return new utu(this.d.ac);
            case 129:
                ahnh ahnhVar7 = this.a.a;
                return new utt(ahnhVar7.Wj, ahnhVar7.qi);
            case 130:
                return new eijj();
            case 131:
                ahjr ahjrVar6 = this.d;
                ahhw ahhwVar8 = this.c;
                ahkn ahknVar13 = this.a;
                eyik eyikVar17 = ahjrVar6.fZ;
                eyik eyikVar18 = ahhwVar8.p;
                eyik eyikVar19 = ahhwVar8.aj;
                eyik eyikVar20 = ahhwVar8.aO;
                eyik eyikVar21 = ahhwVar8.aP;
                ahnh ahnhVar8 = ahknVar13.a;
                return new cwjz(eyikVar17, eyikVar18, eyikVar19, eyikVar20, eyikVar21, ahnhVar8.yw, ahknVar13.jt, ahnhVar8.up, ahhwVar8.P, ahknVar13.b.he, ahnhVar8.BK, ahnhVar8.yx);
            case 132:
                return new cwjy(this.a.t);
            case 133:
                return new cwka(this.a.b.hX);
            case 134:
                return new cqei();
            case 135:
                return Optional.of(new aihw(this.d.oZ));
            case 136:
                return new cvpa();
            case 137:
                ahkn ahknVar14 = this.a;
                ahhw ahhwVar9 = this.c;
                ahnh ahnhVar9 = ahknVar14.a;
                ahng ahngVar3 = ahknVar14.b;
                eyik eyikVar22 = ahknVar14.t;
                eyik eyikVar23 = ahngVar3.hL;
                eyik eyikVar24 = ahnhVar9.Dt;
                eyik eyikVar25 = ahnhVar9.wF;
                eyik eyikVar26 = ahnhVar9.BB;
                eyik eyikVar27 = ahnhVar9.BH;
                eyik eyikVar28 = ahngVar3.iB;
                eyik eyikVar29 = ahnhVar9.Uk;
                eyik eyikVar30 = ahngVar3.fe;
                eyil.a(ahnhVar9.wt);
                eyil.a(ahnhVar9.Hf);
                return new cwqw(eyikVar22, eyikVar23, eyikVar24, eyikVar25, eyikVar26, eyikVar27, eyikVar28, eyikVar29, ahhwVar9.an, eyikVar30);
            case 138:
                return new crme();
            case 139:
                ahkn ahknVar15 = this.a;
                ahnh ahnhVar10 = ahknVar15.a;
                return new cwqu(ahnhVar10.BM, ahnhVar10.BK, ahnhVar10.c, ahknVar15.jX, ahknVar15.jW);
            case 140:
                ahkn ahknVar16 = this.a;
                ahnh ahnhVar11 = ahknVar16.a;
                ahnhVar11.al();
                this.c.J();
                Optional.of((ujl) ahknVar16.b.ht.b());
                return new cvnp();
            case 141:
                return Optional.of((uzw) this.a.a.ajT.b());
            case 142:
                return new dajl();
            case 143:
                eg egVar = (eg) this.b.j.b();
                ahhw ahhwVar10 = this.c;
                ahkn ahknVar17 = this.a;
                ahjr ahjrVar7 = this.d;
                ahnh ahnhVar12 = ahknVar17.a;
                eyik eyikVar31 = ahnhVar12.Uk;
                eyik eyikVar32 = ahnhVar12.Wj;
                eigp eigpVar = (eigp) ahjrVar7.ac.b();
                return new tlh(egVar, ahhwVar10.bm, eyikVar31, ahjrVar7.oU, eyikVar32, eigpVar, ahnhVar12.vR);
            case 144:
                ahhe ahheVar = this.b;
                ahjr ahjrVar8 = this.d;
                ahhw ahhwVar11 = this.c;
                ahkn ahknVar18 = this.a;
                ahnh ahnhVar13 = ahknVar18.a;
                eyik eyikVar33 = ahjrVar8.hj;
                eyik eyikVar34 = ahjrVar8.dx;
                eyik eyikVar35 = ahnhVar13.BK;
                eyik eyikVar36 = ahjrVar8.F;
                eosc eoscVar4 = (eosc) ahknVar18.y.b();
                eyik eyikVar37 = ahhwVar11.f;
                return new BlockAndReportSpamCallbacks(ahheVar.j, eyikVar33, ahhwVar11.bl, eyikVar34, eyikVar35, eyikVar37, eyikVar36, eoscVar4);
            case 145:
                return new tix((eg) this.b.j.b());
            case 146:
                return cecf.a((ea) ((eyig) this.c.e).a);
            case 147:
                return new csyg();
            case 148:
                return new ahro();
            case 149:
                return new srr();
            case 150:
                return new dabm(this.a.a.c);
            case 151:
                return new cwug(this.d.hX, this.a.a.vR);
            case 152:
                return new cwuj((Context) this.a.t.b());
            case 153:
                ahkn ahknVar19 = this.a;
                return new upo(ahknVar19.dL, (apwn) ahknVar19.a.Bg.b());
            case 154:
                ahkn ahknVar20 = this.a;
                ahnh ahnhVar14 = ahknVar20.a;
                return new vbv((fdjx) ahnhVar14.m.b(), (fcyh) ahknVar20.bM.b(), (fcyh) ahknVar20.cz.b(), (cmfo) ahnhVar14.ajS.b(), (egyt) ahknVar20.dj.b());
            case 155:
                return new eijm((eigp) this.d.ac.b());
            case 156:
                ahhw ahhwVar12 = this.c;
                Object obj = ((eyig) ahhwVar12.e).a;
                eyik eyikVar38 = ahhwVar12.br;
                eyik eyikVar39 = ahhwVar12.bk;
                eyik eyikVar40 = ahhwVar12.B;
                ahjr ahjrVar9 = ahhwVar12.b;
                ahkn ahknVar21 = ahhwVar12.a;
                ahnh ahnhVar15 = ahknVar21.a;
                eyik eyikVar41 = ahhwVar12.bs;
                eyik eyikVar42 = ahnhVar15.BK;
                ahng ahngVar4 = ahknVar21.b;
                return Optional.of(new uxp((ea) obj, eyikVar38, eyikVar39, eyikVar40, eyikVar41, eyikVar42, ahngVar4.hy, ahngVar4.iH, ahjrVar9.oD, ahngVar4.iI, ahngVar4.iJ));
            case 157:
                return new uzn((Context) this.a.t.b());
            case 158:
                ahhw ahhwVar13 = this.c;
                return Optional.of(new uve((ea) ((eyig) ahhwVar13.e).a, ahhwVar13.b.oU));
            case 159:
                return Optional.of((cwsp) this.c.bu.b());
            case 160:
                ahhw ahhwVar14 = this.c;
                ahkn ahknVar22 = this.a;
                Context context2 = (Context) ahknVar22.t.b();
                ahnh ahnhVar16 = ahknVar22.a;
                fdjx fdjxVar = (fdjx) ahnhVar16.m.b();
                fcyh fcyhVar2 = (fcyh) ahknVar22.cz.b();
                Optional optionalOf = Optional.of((vch) this.e.f.b());
                ahjr ahjrVar10 = this.d;
                eyik eyikVar43 = ahknVar22.cE;
                eyik eyikVar44 = ahjrVar10.ar;
                dzuc dzucVar = (dzuc) eyikVar43.b();
                ahng ahngVar5 = ahknVar22.b;
                return new cwsp(context2, fdjxVar, fcyhVar2, ahhwVar14.bt, optionalOf, eyikVar44, dzucVar, ahngVar5.iP, ahhwVar14.bk, ahhwVar14.bs, ahnhVar16.BK, ahngVar5.hy, ahhwVar14.B);
            case 161:
                return Optional.of((ztw) this.a.b.iL.b());
            case 162:
                return Optional.of((uzp) this.e.g.b());
            case 163:
                return Optional.of((vbg) this.c.bv.b());
            case 164:
                ahhw ahhwVar15 = this.c;
                return new vbg((fdjx) ahhwVar15.J.b(), ahhwVar15.G());
            case 165:
                ahhw ahhwVar16 = this.c;
                ahkn ahknVar23 = this.a;
                ahjr ahjrVar11 = this.d;
                ahnh ahnhVar17 = ahknVar23.a;
                return new cmdo(ahhwVar16.bw, ahknVar23.aQ, ahjrVar11.ac, (fdjx) ahnhVar17.oS.b());
            case 166:
                ahkn ahknVar24 = this.a;
                ahjr ahjrVar12 = this.d;
                ahnh ahnhVar18 = ahknVar24.a;
                return new cmdi(ahnhVar18.aei, ahknVar24.t, ahknVar24.dR, ahjrVar12.dN, (fdjx) ahnhVar18.oS.b());
            case 167:
                ahkn ahknVar25 = this.a;
                return new auwh((fcyh) ahknVar25.bM.b(), (fcyh) ahknVar25.cz.b());
            case 168:
                ahnh ahnhVar19 = this.a.a;
                fdjx fdjxVar2 = (fdjx) ahnhVar19.m.b();
                ahhw ahhwVar17 = this.c;
                eyik eyikVar45 = ahhwVar17.b.pM;
                eyik eyikVar46 = ahnhVar19.Wv;
                czqt czqtVar = new czqt((czqs) eyikVar45.b());
                ahng ahngVar6 = ahhwVar17.a.b;
                return new ajec(fdjxVar2, eyikVar46, ekhx.r(czqtVar, new ajeh(ahngVar6.ji, ahngVar6.jj)));
            case 169:
                return aced.a((ea) ((eyig) this.c.e).a);
            case 170:
                ahkn ahknVar26 = this.a;
                eyik eyikVar47 = ahknVar26.cI;
                ahnh ahnhVar20 = ahknVar26.a;
                return new acsd(ahnhVar20.qj, (crnp) eyikVar47.b(), ahnhVar20.BK, this.d.gb, this.c.bB);
            case 171:
                return new addl((cpch) this.a.a.qj.b(), (Context) this.b.f.b(), (eigp) this.d.ac.b());
            case 172:
                ahjr ahjrVar13 = this.d;
                return Optional.of(new accl(ahjrVar13.b, ahjrVar13.a.a.pG));
            case 173:
                ahjr ahjrVar14 = this.d;
                return Optional.of(new cytk(Optional.of((bvqv) ahjrVar14.a.a.Yb.b()), ahjrVar14.pN));
            case 174:
                return Optional.of(new absj(this.b.Q));
            case 175:
                ahjr ahjrVar15 = this.d;
                ahkn ahknVar27 = this.a;
                ahhw ahhwVar18 = this.c;
                return new badj(ahjrVar15.dP, ahknVar27.a.Jd, ahhwVar18.bG);
            case 176:
                return new axgc(this.d.ac, this.c.aQ);
            case 177:
                ahhw ahhwVar19 = this.c;
                ahkn ahknVar28 = this.a;
                Object obj2 = ((eyig) ahhwVar19.e).a;
                eyik eyikVar48 = ahhwVar19.bI;
                ahnh ahnhVar21 = ahknVar28.a;
                eyik eyikVar49 = ahknVar28.gF;
                eyik eyikVar50 = ahnhVar21.c;
                eyik eyikVar51 = ahnhVar21.pf;
                cuge cugeVarO = ahhwVar19.o();
                czqx czqxVar = (czqx) eyikVar48.b();
                eyik eyikVar52 = ahhwVar19.bJ;
                eyik eyikVar53 = ahhwVar19.bK;
                return new cwyl((ea) obj2, ahhwVar19.aX, eyikVar49, eyikVar50, eyikVar51, ahhwVar19.aY, cugeVarO, czqxVar, eyikVar52, eyikVar53);
            case 178:
                return new czqx(this.a.a.pf);
            case 179:
                ahkn ahknVar29 = this.a;
                ahnh ahnhVar22 = ahknVar29.a;
                cjxi cjxiVar = (cjxi) ahnhVar22.yf.b();
                cpdm cpdmVar = (cpdm) ahnhVar22.Wt.b();
                ahkn ahknVar30 = this.c.a;
                crqv crqvVar = (crqv) ahknVar30.aT.b();
                ahnh ahnhVar23 = ahknVar30.a;
                return new cjrp(cjxiVar, cpdmVar, new cpdk(crqvVar, (cpdm) ahnhVar23.Wt.b(), (crsg) ahknVar30.b.hN.b(), (eosc) ahknVar30.y.b(), (cmlb) ahnhVar23.rd.b(), (cebq) ahnhVar23.rq.b(), (cebf) ahnhVar23.yg.b(), (eosc) ahknVar30.aJ.b(), (eosc) ahknVar30.p.b()), (eosc) ahknVar29.y.b(), (eosc) ahknVar29.p.b(), (cogw) ahknVar29.cD.b());
            case 180:
                ahkn ahknVar31 = this.a;
                return new cjqw((cogw) ahknVar31.cD.b(), (eosc) ahknVar31.y.b(), (cjxi) ahknVar31.a.yf.b(), this.c.aX);
            case 181:
                ahhw ahhwVar20 = this.c;
                ahkn ahknVar32 = this.a;
                return new czsm((ea) ((eyig) ahhwVar20.e).a, ahknVar32.b.jq, ahknVar32.gF, ahknVar32.a.c, ahhwVar20.aX);
            case 182:
                ahkn ahknVar33 = this.a;
                ahhw ahhwVar21 = this.c;
                ahnh ahnhVar24 = ahknVar33.a;
                return new cwyo(ahknVar33.aT, ahnhVar24.c, ahknVar33.cD, eyil.a(ahhwVar21.bO));
            case 183:
                ahkn ahknVar34 = this.a;
                eyik eyikVar54 = this.c.bN;
                ahng ahngVar7 = ahknVar34.b;
                return new cqrt(ahngVar7.v, ahngVar7.A, eyie.a(eyikVar54), (eosc) ahknVar34.p.b());
            case 184:
                ahkn ahknVar35 = this.a;
                ahnh ahnhVar25 = ahknVar35.b.a.a;
                return new cqrj(new cqse((aghv) ahnhVar25.xl.b(), ahnhVar25.qr), ahknVar35.a.qr);
            case 185:
                ahkn ahknVar36 = this.a;
                ahhw ahhwVar22 = this.c;
                ahnh ahnhVar26 = ahknVar36.a;
                return new czut(ahknVar36.gF, ahnhVar26.c, ahnhVar26.pf, ahnhVar26.Uk, ahnhVar26.yf, ahnhVar26.Wj, ahknVar36.y, ahknVar36.aJ, ahhwVar22.aY, ahnhVar26.rd, ahnhVar26.rq, ahhwVar22.aX, ahnhVar26.rW, ahnhVar26.qi);
            case 186:
                ahkn ahknVar37 = this.a;
                return new czru(ahknVar37.y, ahknVar37.aJ, ahknVar37.a.ZG);
            case 187:
                ahhe ahheVar2 = this.b;
                eyik eyikVar55 = ahheVar2.f;
                Context context3 = (Context) eyikVar55.b();
                Activity activity = (Activity) eyikVar55.b();
                ahkn ahknVar38 = this.a;
                eosc eoscVar5 = (eosc) ahknVar38.y.b();
                einm einmVar = (einm) ahheVar2.e.b();
                eigp eigpVar2 = (eigp) this.d.ac.b();
                acxq acxqVar = new acxq(this.c.B());
                tlt tltVar = (tlt) ahheVar2.p.b();
                ahng ahngVar8 = ahknVar38.b;
                ahnh ahnhVar27 = ahknVar38.a;
                return new acwj(context3, activity, eoscVar5, einmVar, eigpVar2, acxqVar, tltVar, ahnhVar27.pQ, ahngVar8.jC, Optional.of(new cwde()), ahngVar8.jy, (arpr) ahnhVar27.Be.b(), ahngVar8.jD);
            case 188:
                ahhw ahhwVar23 = this.c;
                return new acxj(Optional.of(ahhwVar23.c()), ahhwVar23.aQ);
            case 189:
                return ekhx.o(this.c.D());
            case 190:
                ahkn ahknVar39 = this.a;
                return new czug((cjsd) ahknVar39.a.aaY.b(), (cjtk) ahknVar39.b.jE.b(), (agzy) this.c.bU.b());
            case 191:
                ahkn ahknVar40 = this.a;
                cogw cogwVar3 = (cogw) ahknVar40.cD.b();
                egzh egzhVar = (egzh) ahknVar40.aQ.b();
                ahhw ahhwVar24 = this.c;
                ahnh ahnhVar28 = ahknVar40.a;
                return new agzy(ahknVar40.aT, cogwVar3, egzhVar, ahhwVar24.bT, ahnhVar28.aaV);
            case 192:
                return new ahac(this.a.a.pQ);
            case 193:
                return new ctgt(this.a.a.pQ);
            case 194:
                ahjr ahjrVar16 = this.d;
                ahhw ahhwVar25 = this.c;
                eyik eyikVar56 = ahhwVar25.ce;
                return new adcm(ahjrVar16.ac, eyie.a(ahhwVar25.bZ), eyie.a(eyikVar56), (ehbb) ahhwVar25.n.b());
            case 195:
                ahkn ahknVar41 = this.a;
                return new cvbm(ahknVar41.b.jH, ahknVar41.aQ);
            case 196:
                ahhw ahhwVar26 = this.c;
                return ekgp.n(cvbb.DELETE, ahhwVar26.f(), cvbb.ARCHIVE, ahhwVar26.e(), cvbb.MARK_AS_READ_OR_UNREAD, ahhwVar26.g());
            case 197:
                return ((addf) this.c.z()).a("animated-delete-icon.json");
            case 198:
                return addg.a(this.c.z());
            case 199:
                return ((addf) this.c.z()).a("animated-mark-as-unread-icon.json");
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        int i = this.f;
        switch (i) {
            case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
                return ((addf) this.c.z()).a("animated-mark-as-read-icon.json");
            case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                return new cdiw(this.c.n(), this.a.ei);
            case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                return Optional.of((adbt) this.a.op.b());
            case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                return Optional.of((cyqw) this.c.ck.b());
            case 204:
                ahhw ahhwVar = this.c;
                ahjr ahjrVar = this.d;
                ea eaVar = (ea) ((eyig) ahhwVar.e).a;
                efwo efwoVar = (efwo) ahjrVar.b.b();
                egpr egprVar = (egpr) ahhwVar.f.b();
                ahkn ahknVar = this.a;
                ahhe ahheVar = this.b;
                return new cyqw(eaVar, efwoVar, egprVar, ahhwVar.ci, ahknVar.a.Uk, ahhwVar.cj, ahheVar.C, ahheVar.E);
            case 205:
                return new cyrb();
            case 206:
                ahjr ahjrVar2 = this.d;
                efwo efwoVar2 = (efwo) ahjrVar2.b.b();
                ahnh ahnhVar = this.a.a;
                return new bvoq(efwoVar2, ahnhVar.pG, ahnhVar.rK, ahjrVar2.bZ, ahjrVar2.ov, ahnhVar.anY, ahjrVar2.dx(), (bvmv) ahjrVar2.of.b(), ahnhVar.pQ, (fdjx) ahnhVar.m.b(), (fdjx) ahnhVar.oQ.b());
            case 207:
                ahhe ahheVar2 = this.b;
                ahkn ahknVar2 = this.a;
                ahhw ahhwVar2 = this.c;
                ahnh ahnhVar2 = ahknVar2.a;
                return new cwvw(ahheVar2.f, ahnhVar2.qP, ahnhVar2.wF, ahknVar2.de, ahhwVar2.cr, ahknVar2.b.jJ, ahnhVar2.qi, ahnhVar2.adE, ahnhVar2.Be);
            case 208:
                return Optional.of(new adba((ekgb) this.c.cq.b()));
            case 209:
                ahhw ahhwVar3 = this.c;
                return adaz.a(ahhwVar3.u(), ahhwVar3.p(), ahhwVar3.r(), ahhwVar3.q(), ahhwVar3.k(), this.a.b.jI, ahhwVar3.cp);
            case 210:
                ahkn ahknVar3 = this.a;
                eosc eoscVar = (eosc) ahknVar3.y.b();
                ahnh ahnhVar3 = ahknVar3.a;
                dqsn dqsnVar = (dqsn) ahnhVar3.qq.b();
                ahjr ahjrVar3 = this.d;
                return new agzm(eoscVar, dqsnVar, ahnhVar3.ws, ahknVar3.b.G, ahjrVar3.U);
            case 211:
                return new acns((Context) this.a.t.b());
            case 212:
                return new aghz((ains) this.a.a.pb.b());
            case 213:
                return new acuy((Context) this.b.f.b(), (egpr) this.c.f.b(), (fdjx) this.a.a.oQ.b());
            case 214:
                eg egVar = (eg) this.b.j.b();
                ahhw ahhwVar4 = this.c;
                ahkn ahknVar4 = this.a;
                ahjr ahjrVar4 = this.d;
                return new aays(egVar, ahhwVar4.ct, ahknVar4.a.c, (eigp) ahjrVar4.ac.b());
            case 215:
                ahkn ahknVar5 = this.a;
                ahjr ahjrVar5 = this.d;
                return new aayu(eyie.a(ahknVar5.cD), ahjrVar5.gY, ahknVar5.cK, ahknVar5.a.qi);
            case 216:
                ahhw ahhwVar5 = this.c;
                return new acgx(ahhwVar5.cv, ahhwVar5.cw, this.a.a.aaV);
            case 217:
                ahhe ahheVar3 = this.b;
                return ekgp.p("IMessagePromo", ahheVar3.e(), "DittoBatteryPromo", ahheVar3.d(), "VerifiedSmsInvestigativeRpcPromo", ahheVar3.f(), "BlockListAutoMigratedPromo", ahheVar3.c(), "GaiaPairingPromo", new achi());
            case 218:
                ahhe ahheVar4 = this.b;
                return ekgp.m("DataDonationNotification", ahheVar4.B(), "ScheduledSendTooltip", ahheVar4.w());
            case 219:
                ahhw ahhwVar6 = this.c;
                ekhv ekhvVarI = ekhx.i(3);
                ekhvVarI.j(ahhwVar6.C());
                ekhvVarI.c(ahhwVar6.l());
                ahkn ahknVar6 = ahhwVar6.a;
                ahnh ahnhVar4 = ahknVar6.a;
                ekhvVarI.c(new ahan(ahnhVar4.GA, ahnhVar4.Uk, ahhwVar6.cz, (eosc) ahknVar6.y.b()));
                return ekhvVarI.g();
            case 220:
                ahhw ahhwVar7 = this.c;
                ahkn ahknVar7 = this.a;
                ahjr ahjrVar6 = this.d;
                Object obj = ((eyig) ahhwVar7.e).a;
                ahnh ahnhVar5 = ahknVar7.a;
                ahng ahngVar = ahknVar7.b;
                return new cwxu((ea) obj, ahknVar7.kk, ahngVar.jO, ahnhVar5.oS, ahknVar7.cD, ahngVar.jP, ahjrVar6.b);
            case 221:
                ahkn ahknVar8 = this.a;
                return new aise(ahknVar8.a.rc, ahknVar8.eO);
            case 222:
                return Optional.of(this.b.v());
            case 223:
                return Optional.of(this.c.d());
            case 224:
                ahhe ahheVar5 = this.b;
                return ekhx.s(ahheVar5.r(), ahheVar5.s(), (egps) this.c.bV.b());
            case 225:
                return Optional.of(new acvb(new arez(this.a.b.a.a.oO)));
            case 226:
                ahhw ahhwVar8 = this.c;
                ahkn ahknVar9 = ahhwVar8.a;
                ahnh ahnhVar6 = ahknVar9.a;
                fdjx fdjxVar = (fdjx) ahnhVar6.oS.b();
                ahjr ahjrVar7 = ahhwVar8.b;
                efwo efwoVar3 = (efwo) ahjrVar7.b.b();
                ea eaVar2 = (ea) ((eyig) ahhwVar8.e).a;
                eyik eyikVar = ahnhVar6.aah;
                eyik eyikVar2 = ahhwVar8.n;
                ahhe ahheVar6 = ahhwVar8.d;
                return Optional.of(new daut(fdjxVar, efwoVar3, eaVar2, eyikVar, eyikVar2, ahnhVar6.pG, ahheVar6.E, ahheVar6.D, ahknVar9.dj, ahknVar9.aT, ahjrVar7.oz, ahnhVar6.aaV));
            case 227:
                return new acsi();
            case 228:
                return new acsy((acsi) this.c.cG.b());
            case 229:
                return Optional.of((agwh) this.c.cI.b());
            case 230:
                ahhw ahhwVar9 = this.c;
                egpr egprVar2 = (egpr) ahhwVar9.f.b();
                ehbb ehbbVar = (ehbb) ahhwVar9.n.b();
                ahjr ahjrVar8 = this.d;
                eigp eigpVar = (eigp) ahjrVar8.ac.b();
                ahkn ahknVar10 = this.a;
                return new agwh(egprVar2, ehbbVar, eigpVar, (Optional) ahknVar10.cK.b(), ahknVar10.a.qi, ahjrVar8.ap, ahjrVar8.au, ahjrVar8.bu, ahknVar10.b.jQ);
            case 231:
                return new eilo((eigp) this.d.ac.b());
            case 232:
                ahnh ahnhVar7 = this.a.a;
                return new cjnk(ahnhVar7.qr, ahnhVar7.c);
            case 233:
                ahhw ahhwVar10 = this.c;
                ahkn ahknVar11 = this.a;
                Object obj2 = ((eyig) ahhwVar10.e).a;
                ahnh ahnhVar8 = ahknVar11.a;
                return new cztt((ea) obj2, ahknVar11.b.jE, ahnhVar8.aaY, ahnhVar8.Uk);
            case 234:
                ahng ahngVar2 = this.a.b;
                ahkn ahknVar12 = ahngVar2.a;
                eosc eoscVar2 = (eosc) ahknVar12.p.b();
                ahnh ahnhVar9 = ahknVar12.a;
                return Optional.of(new adiz(eoscVar2, ahngVar2.N, ahngVar2.W, ahngVar2.X, ahnhVar9.KR, (Context) ahknVar12.t.b(), ahnhVar9.KQ, (eosc) ahnhVar9.j.b()));
            case 235:
                ahhw ahhwVar11 = this.c;
                ahkn ahknVar13 = this.a;
                return new czrp((ea) ((eyig) ahhwVar11.e).a, ahhwVar11.cR, (fdjx) ahknVar13.a.oS.b(), ahhwVar11.aY, ahhwVar11.aX, (agzy) ahhwVar11.bU.b());
            case 236:
                ahkn ahknVar14 = this.a;
                ahnh ahnhVar10 = ahknVar14.a;
                fdjx fdjxVar2 = (fdjx) ahnhVar10.oS.b();
                fdjx fdjxVar3 = (fdjx) ahnhVar10.m.b();
                ahhw ahhwVar12 = this.c;
                return new czrg(fdjxVar2, fdjxVar3, ahhwVar12.aY, ahknVar14.aT, ahnhVar10.Wt, (cqbm) ahnhVar10.rY.b(), ahknVar14.aP, ahnhVar10.rq, ahnhVar10.rd, ahnhVar10.PT);
            case 237:
                ahkn ahknVar15 = this.a;
                ahnh ahnhVar11 = ahknVar15.a;
                apqb apqbVarU = ahknVar15.b.U();
                aurx aurxVar = (aurx) ahnhVar11.wc.b();
                ahhe ahheVar7 = this.b;
                return new actb(apqbVarU, aurxVar, ahheVar7.R, (autx) ahnhVar11.MP.b());
            case 238:
                ahkn ahknVar16 = this.a;
                eyik eyikVar3 = ahknVar16.a.qr;
                eyik eyikVar4 = ahknVar16.n;
                return new auwu(eyikVar3, eyikVar4, (eosc) ahknVar16.y.b());
            case 239:
                ahhw ahhwVar13 = this.c;
                return new acze(ahhwVar13.E(), (bvel) ahhwVar13.o.b(), (egzh) this.a.aQ.b());
            case 240:
                return Optional.of(this.c.b());
            case 241:
                ahkn ahknVar17 = this.a;
                ahnh ahnhVar12 = ahknVar17.a;
                return new dath((fdjx) ahnhVar12.oS.b(), (dhkw) ahknVar17.dJ.b(), ahknVar17.b.bC(), (egbf) ahnhVar12.pG.b(), (egyt) ahknVar17.dj.b());
            case 242:
                ahng ahngVar3 = this.a.b;
                return new abyr((dtah) ahngVar3.jW.b(), ahngVar3.jY);
            case 243:
                return new abzl(this.a.a.pQ);
            case 244:
                ahhw ahhwVar14 = this.c;
                eg egVar2 = (eg) ahhwVar14.d.j.b();
                ahkn ahknVar18 = ahhwVar14.a;
                eyik eyikVar5 = ahknVar18.b.hT;
                eyik eyikVar6 = ahhwVar14.dg;
                ahnh ahnhVar13 = ahknVar18.a;
                return Optional.of(new addp(egVar2, eyikVar5, eyikVar6, ahnhVar13.yx, ahnhVar13.un, ahnhVar13.Uk));
            case 245:
                return Optional.of((dmyw) this.c.df.b());
            case 246:
                ahkn ahknVar19 = this.a;
                Context context = (Context) ahknVar19.t.b();
                fcyh fcyhVar = (fcyh) ahknVar19.cz.b();
                ahhw ahhwVar15 = this.c;
                lxq lxqVar = (lxq) ahhwVar15.at.b();
                Optional optionalOf = Optional.of(new dmir(null));
                ahhwVar15.a.a.oQ.getClass();
                return uje.a(context, fcyhVar, lxqVar, optionalOf, (srx) ahknVar19.oc.b(), (egqi) ahknVar19.ll.b(), Optional.of(ahhwVar15.v()), Optional.empty(), ahknVar19.b.kg);
            case 247:
                dlvl dlvlVar = (dlvl) this.c.db.b();
                ahkn ahknVar20 = this.a;
                eony eonyVar = (eony) ahknVar20.lp.b();
                ahng ahngVar4 = ahknVar20.b;
                eygg eyggVarA = eyie.a(ahngVar4.jZ);
                ahjr ahjrVar9 = this.d;
                return new dlus(dlvlVar, eonyVar, eyggVarA, eyie.a(ahjrVar9.pT), ahjrVar9.pR, ahngVar4.kd);
            case 248:
                return new dlvl((Context) this.a.t.b(), (fdjx) this.c.da.b());
            case 249:
                return dpbp.a((fcyh) this.a.cA.b());
            case 250:
                return Optional.of(this.a.b.j());
            case 251:
                return new ahhs(this);
            case 252:
                ahkn ahknVar21 = this.a;
                return new acog((eosc) ahknVar21.p.b(), ahknVar21.hD);
            case 253:
                ahjr ahjrVar10 = this.d;
                ahkn ahknVar22 = ahjrVar10.a;
                return Optional.of(new acdh((Context) ahknVar22.t.b(), ahknVar22.b.ki, (fdjx) ahknVar22.a.oS.b(), ahjrVar10.E()));
            case 254:
                return Optional.of(this.b.t());
            case 255:
                return Optional.of((acnz) this.c.dl.b());
            case 256:
                ahhe ahheVar8 = this.b;
                ahhw ahhwVar16 = this.c;
                return new acnz(ahheVar8.b(), (fdjx) ahhwVar16.J.b(), (lvc) ahhwVar16.dk.b());
            case 257:
                return ehoq.a((ea) ((eyig) this.c.e).a);
            case 258:
                return Optional.of(new adbn(this.a.b.kk));
            case 259:
                return Optional.of((acvp) this.c.f0do.b());
            case 260:
                ahhw ahhwVar17 = this.c;
                ahjr ahjrVar11 = this.d;
                ahkn ahknVar23 = this.a;
                Object obj3 = ((eyig) ahhwVar17.e).a;
                ahnh ahnhVar14 = ahknVar23.a;
                return new acvp((ea) obj3, ahjrVar11.b, (fdjx) ahnhVar14.m.b(), Optional.of(ahknVar23.b.F()), ahnhVar14.pb);
            case 261:
                return Optional.of((agxy) this.a.b.jQ.b());
            case 262:
                return new ague(this.a.a.qi);
            case 263:
                return new cdpf((eigp) this.d.ac.b(), this.a.b.kl);
            case 264:
                ahjr ahjrVar12 = this.d;
                return new ekph(new clpo((fdjx) ahjrVar12.a.a.oS.b(), (clhx) ahjrVar12.pC.b()));
            case 265:
                return new ahht();
            case 266:
                return adkk.a((ea) ((eyig) this.c.e).a);
            case 267:
                ahhw ahhwVar18 = this.c;
                return new afft(ahhwVar18.e, ahhwVar18.K, ahhwVar18.dw, ahhwVar18.dx);
            case 268:
                ahhe ahheVar9 = this.b;
                return new affk(ahheVar9.j, this.c.e, ahheVar9.h, ahheVar9.l);
            case 269:
                ahhw ahhwVar19 = this.c;
                return new affj((dnho) ahhwVar19.au.b(), (dnhx) ahhwVar19.aw.b());
            case 270:
                return afml.a((ea) ((eyig) this.c.e).a);
            case 271:
                ea eaVar3 = (ea) ((eyig) this.c.e).a;
                if (eaVar3 instanceof ctig) {
                    return (ctig) eaVar3;
                }
                throw new IllegalStateException(a.M(eaVar3, ctiu.class));
            case 272:
                return new ahhu(this);
            case 273:
                return new cupo((Context) this.b.f.b(), (crpp) this.a.aU.b());
            case 274:
                return Optional.of(this.b.p());
            case 275:
                return new cusd();
            case 276:
                return new cgld((Context) this.a.t.b());
            case 277:
                return Optional.of(this.a.b.bM());
            case 278:
                ahhw ahhwVar20 = this.c;
                ahkn ahknVar24 = this.a;
                return new ehcq((ea) ((eyig) ahhwVar20.e).a, (egzo) ahknVar24.aQ.b(), (Executor) ahknVar24.a.j.b());
            case 279:
                ahkn ahknVar25 = this.a;
                Context context2 = (Context) ahknVar25.t.b();
                ahnh ahnhVar15 = ahknVar25.a;
                return new cuos(context2, (fdjx) ahnhVar15.m.b(), ahnhVar15.Uk, this.d.I, ahnhVar15.pf);
            case 280:
                ahhw ahhwVar21 = this.c;
                ahkn ahknVar26 = this.a;
                return ehrk.a(ahhwVar21.A(), (ea) ((eyig) ahhwVar21.e).a, ahknVar26.b.kt.b());
            case 281:
                ahkn ahknVar27 = this.a;
                Context context3 = (Context) ahknVar27.t.b();
                ahhw ahhwVar22 = this.c;
                eyik eyikVar7 = ahknVar27.cD;
                ahnh ahnhVar16 = ahknVar27.a;
                eyik eyikVar8 = ahnhVar16.Uk;
                cogw cogwVar = (cogw) eyikVar7.b();
                ExecutorService executorService = (ExecutorService) ahknVar27.p.b();
                return new cukm(context3, ahknVar27.da, eyikVar8, ahhwVar22.dK, cogwVar, executorService, ahnhVar16.Wv, ahnhVar16.pB, ahnhVar16.Jd, ahnhVar16.c);
            case 282:
                ahkn ahknVar28 = this.a;
                return new cuka(ahknVar28.eO, ahknVar28.a.rc, ahknVar28.aT);
            case 283:
                return Optional.of((abvk) this.a.b.ku.b());
            case 284:
                return Optional.of((srf) this.c.dN.b());
            case 285:
                return new srf();
            case 286:
                ahkn ahknVar29 = this.a;
                return new afhj((crqv) ahknVar29.aT.b(), (crqx) ahknVar29.gF.b(), (Context) ahknVar29.t.b(), (egyt) ahknVar29.dj.b(), (eosc) ahknVar29.y.b(), (eosc) ahknVar29.p.b(), (egzh) ahknVar29.aQ.b(), (afgn) ahknVar29.b.hU.b());
            case 287:
                ea eaVar4 = (ea) ((eyig) this.c.e).a;
                if (eaVar4 instanceof cvve) {
                    return (cvve) eaVar4;
                }
                throw new IllegalStateException(a.M(eaVar4, cvvn.class));
            case 288:
                ea eaVar5 = (ea) ((eyig) this.c.e).a;
                if (eaVar5 instanceof cynn) {
                    return (cynn) eaVar5;
                }
                throw new IllegalStateException(a.M(eaVar5, cyno.class));
            case 289:
                return new baid(this.c.bG);
            case 290:
                ahkn ahknVar30 = this.a;
                ahjr ahjrVar13 = this.d;
                ahhe ahheVar10 = this.b;
                ahhw ahhwVar23 = this.c;
                ahnh ahnhVar17 = ahknVar30.a;
                ahng ahngVar5 = ahknVar30.b;
                return new cyos(ahknVar30.no, ahngVar5.gZ, ahnhVar17.c, ahnhVar17.pQ, ahnhVar17.EG, ahknVar30.hS, ahjrVar13.mS, ahnhVar17.FP, ahheVar10.e, ahjrVar13.ac, ahnhVar17.qj, ahhwVar23.cl, ahngVar5.hb, ahnhVar17.rJ);
            case 291:
                ea eaVar6 = (ea) ((eyig) this.c.e).a;
                if (eaVar6 instanceof cyrn) {
                    return (cyrn) eaVar6;
                }
                throw new IllegalStateException(a.M(eaVar6, cysg.class));
            case 292:
                ahhw ahhwVar24 = this.c;
                ahkn ahknVar31 = this.a;
                ahjr ahjrVar14 = this.d;
                return new cyrh(ahhwVar24.dU, ahknVar31.no, ahjrVar14.ac, ahknVar31.a.pQ, ahknVar31.hD);
            case 293:
                ahkn ahknVar32 = this.a;
                Context context4 = (Context) ahknVar32.t.b();
                ahhw ahhwVar25 = this.c;
                ahnh ahnhVar18 = ahknVar32.a;
                return new czav(context4, ahhwVar25.aj, (ains) ahnhVar18.c.b(), (cqmr) ahknVar32.eK.b(), (cqsu) ahnhVar18.xi.b(), (bxfu) ahknVar32.eB.b(), ahnhVar18.Uk, (cqxl) ahnhVar18.Dv.b(), (cogw) ahknVar32.cD.b());
            case 294:
                ahkn ahknVar33 = this.a;
                Context context5 = (Context) ahknVar33.t.b();
                eosc eoscVar3 = (eosc) ahknVar33.y.b();
                ahhw ahhwVar26 = this.c;
                ahjr ahjrVar15 = this.d;
                return new czbo(context5, eoscVar3, (lvj) ((eyig) ahhwVar26.e).a, (egxv) ahjrVar15.am.b(), (eigp) ahjrVar15.ac.b(), (egzh) ahknVar33.aQ.b(), ahhwVar26.m(), (crma) ahknVar33.da.b(), (cogw) ahknVar33.cD.b(), ahhwVar26.t());
            case 295:
                ahkn ahknVar34 = this.a;
                return new daae((fdjx) ahknVar34.a.oS.b(), (dach) ahknVar34.b.ff.b(), this.c.F());
            case 296:
                ea eaVar7 = (ea) ((eyig) this.c.e).a;
                if (eaVar7 instanceof datn) {
                    return (datn) eaVar7;
                }
                throw new IllegalStateException(a.M(eaVar7, daua.class));
            case 297:
                ahkn ahknVar35 = this.a;
                egvh egvhVarEl = ahknVar35.el();
                ahng.dk();
                ahnh ahnhVar19 = ahknVar35.a;
                eosd eosdVar = (eosd) ahnhVar19.j.b();
                fcyh fcyhVar2 = (fcyh) ahnhVar19.Rm.b();
                ejud ejudVar = ejud.a;
                ejwi ejwiVar = (ejwi) ((eyig) ahknVar35.i).a;
                ejwi.j(eyie.a(ahknVar35.b.kD));
                return egvz.a(egvhVarEl, eosdVar, fcyhVar2, ejudVar, ejwiVar, ejwi.j(false));
            case 298:
                return new syb();
            case 299:
                return new cgwy();
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.fcsu
    public final Object b() {
        int i = this.f;
        int i2 = i / 100;
        if (i2 == 0) {
            return a();
        }
        if (i2 == 1) {
            return c();
        }
        if (i2 == 2) {
            return d();
        }
        switch (i) {
            case 300:
                ahhw ahhwVar = this.c;
                return new abvt(Optional.of(eyie.a(ahhwVar.ed)), Optional.of(ahhwVar.h()));
            case 301:
                return new adea();
            case 302:
                return ((ejwt) ejwi.j((ehmt) this.c.ef.b())).a;
            case 303:
                return ehmw.a((ea) ((eyig) this.c.e).a);
            default:
                throw new AssertionError(i);
        }
    }
}
