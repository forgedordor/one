package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.SimSelectionSettingsActivity;
import com.google.android.apps.messaging.ui.conversation.rbm.OpenRbmDeepLinkActivity;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.libraries.user.profile.photopicker.fragment.devicephotos.DevicePhotosFragment;
import com.google.chat.smartmessaging.penpal.ui.EmotifyActivity;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahhj implements eyik {
    private final ahkn a;
    private final ahho b;
    private final ahhk c;
    private final int d;

    public ahhj(ahkn ahknVar, ahho ahhoVar, ahhk ahhkVar, int i) {
        this.a = ahknVar;
        this.b = ahhoVar;
        this.c = ahhkVar;
        this.d = i;
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [efyb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [efxn, java.lang.Object] */
    private final Object a() {
        int i = this.d;
        switch (i) {
            case 0:
                Activity activity = this.c.a;
                if (activity != null) {
                    return activity;
                }
                throw new IllegalStateException("Attempted use of the activity when it is null");
            case 1:
                ahkn ahknVar = this.a;
                Context context = (Context) ahknVar.t.b();
                ahhk ahhkVar = this.c;
                eyik eyikVar = ahknVar.cD;
                ahnh ahnhVar = ahknVar.a;
                return new cukm(context, ahknVar.da, ahnhVar.Uk, ahhkVar.e, (cogw) eyikVar.b(), (ExecutorService) ahknVar.p.b(), ahnhVar.Wv, ahnhVar.pB, ahnhVar.Jd, ahnhVar.c);
            case 2:
                ahkn ahknVar2 = this.a;
                return new cuka(ahknVar2.eO, ahknVar2.a.rc, ahknVar2.aT);
            case 3:
                eg egVar = (eg) this.c.g.b();
                ahkn ahknVar3 = this.a;
                return new crmk(egVar, (cogw) ahknVar3.cD.b(), (crlz) ahknVar3.da.b());
            case 4:
                Activity activity2 = (Activity) this.c.d.b();
                try {
                    eg egVar2 = (eg) activity2;
                    egVar2.getClass();
                    return egVar2;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Expected activity to be a FragmentActivity: ".concat(String.valueOf(String.valueOf(activity2))), e);
                }
            case 5:
                ahkn ahknVar4 = this.a;
                ahng ahngVar = ahknVar4.b;
                ahnh ahnhVar2 = ahknVar4.a;
                eyik eyikVar2 = ahnhVar2.adI;
                eyik eyikVar3 = ahngVar.mU;
                eyikVar3.getClass();
                return new cuhd(eyikVar2, Optional.of(new cuhq(eyikVar3)), ahnhVar2.adE, ahnhVar2.adH);
            case 6:
                ahhk ahhkVar2 = this.c;
                Context context2 = (Context) ahhkVar2.d.b();
                ahkn ahknVar5 = this.a;
                return new abbf(context2, eyie.a(ahhkVar2.j), ahknVar5.b.mV, (eosc) ahknVar5.p.b(), ahknVar5.a.yw, ahknVar5.oj);
            case 7:
                ahkn ahknVar6 = this.a;
                return new abbc((Context) ahknVar6.t.b(), (cogw) ahknVar6.cD.b(), (eosc) ahknVar6.p.b());
            case 8:
                return new daip(this.a.b.jy);
            case 9:
                return tgc.a((Activity) this.c.d.b());
            case 10:
                return new tlt();
            case 11:
                efxf efxfVar = (efxf) this.c.w.b();
                efxfVar.getClass();
                return efxfVar;
            case 12:
                ahhk ahhkVar3 = this.c;
                ehnu ehnuVar = (ehnu) ahhkVar3.o.b();
                ?? AD = ahhkVar3.aD();
                ejwi ejwiVarAx = ahhkVar3.ax();
                egac egacVarAq = ahhkVar3.aq();
                egpr egprVar = (egpr) ahhkVar3.v.b();
                efzn efznVar = (efzn) ahhkVar3.p.b();
                egaz egazVar = (egaz) ahhkVar3.q.b();
                ahkn ahknVar7 = this.a;
                return new efxj(ehnuVar, AD, ejwiVarAx, egacVarAq, egprVar, efznVar, egazVar, (egaa) ahknVar7.b.nn.b(), (efyt) ahknVar7.a.aox.b(), (ejwi) ((eyig) ahhkVar3.r).a, ejwi.j(egba.a()));
            case 13:
                return ehop.a(this.c.ay(), null);
            case 14:
                ahhk ahhkVar4 = this.c;
                return new egaf((ehnu) ahhkVar4.o.b(), (efzn) ahhkVar4.p.b(), (egaz) ahhkVar4.q.b(), (ejwi) ((eyig) ahhkVar4.r).a, (ehna) ahhkVar4.t.b());
            case 15:
                ahhk ahhkVar5 = this.c;
                ahng ahngVar2 = ahhkVar5.b.b;
                efzm efzmVar = (efzm) ahngVar2.mX.b();
                ejwi ejwiVarAx2 = ahhkVar5.ax();
                return new efzn(ekhx.r(efzmVar, ejwiVarAx2.g() ? new efwu(ejwiVarAx2) : new efwv()));
            case 16:
                return new egaz((ehnu) this.c.o.b());
            case 17:
                ahhk ahhkVar6 = this.c;
                return new ehna((ehnu) ahhkVar6.o.b(), ahhkVar6.aL());
            case 18:
                return ejwi.j(efwo.b(this.c.aq().g()));
            case 19:
                ahhk ahhkVar7 = this.c;
                return new egah((ehnu) ahhkVar7.o.b(), (efzn) ahhkVar7.p.b(), (egaz) ahhkVar7.q.b(), (ejwi) ((eyig) ahhkVar7.r).a, (ehna) ahhkVar7.t.b());
            case 20:
                final ehnu ehnuVar2 = (ehnu) this.c.o.b();
                ehnuVar2.getClass();
                return new egpv(new fcsu() { // from class: egpw
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return ehnuVar2.a();
                    }
                }, ehnuVar2, ehnuVar2.P());
            case 21:
                ahhk ahhkVar8 = this.c;
                ehnu ehnuVar3 = (ehnu) ahhkVar8.o.b();
                ?? AE = ahhkVar8.aE();
                ejwi ejwiVarAx3 = ahhkVar8.ax();
                egac egacVarAq2 = ahhkVar8.aq();
                egpr egprVar2 = (egpr) ahhkVar8.v.b();
                efzn efznVar2 = (efzn) ahhkVar8.p.b();
                egaz egazVar2 = (egaz) ahhkVar8.q.b();
                ahkn ahknVar8 = this.a;
                return new efxv(ehnuVar3, AE, ejwiVarAx3, egacVarAq2, egprVar2, efznVar2, egazVar2, (egaa) ahknVar8.b.nn.b(), (efyt) ahknVar8.a.aox.b(), (ejwi) ((eyig) ahhkVar8.r).a, ejwi.j(egba.a()));
            case 22:
                ahnh ahnhVar3 = this.a.a;
                cden cdenVar = (cden) ahnhVar3.qN.b();
                ahhk ahhkVar9 = this.c;
                return new abxv(cdenVar, (efxf) ahhkVar9.x.b(), (Activity) ahhkVar9.d.b(), ahnhVar3.c);
            case 23:
                ahhk ahhkVar10 = this.c;
                return new uix((Activity) ahhkVar10.d.b(), (daip) ahhkVar10.l.b(), (cvoh) ahhkVar10.z.b());
            case 24:
                return new cvoh();
            case 25:
                return new uiy((Activity) this.c.d.b());
            case 26:
                return new ujf((eg) this.c.g.b());
            case 27:
                ahhk ahhkVar11 = this.c;
                eg egVar3 = (eg) ahhkVar11.g.b();
                ahkn ahknVar9 = this.a;
                return new uld(egVar3, ahhkVar11.D, ahknVar9.a.qr, (cogw) ahknVar9.cD.b());
            case 28:
                return new abwu(Optional.empty());
            case 29:
                return new upn();
            case 30:
                return new uup((eg) this.c.g.b());
            case 31:
                return aatm.a((Activity) this.c.d.b());
            case 32:
                return Optional.of(this.a.b.x());
            case 33:
                ahhk ahhkVar12 = this.c;
                ahkn ahknVar10 = this.a;
                egej egejVar = (egej) ahknVar10.a.pI.b();
                eosc eoscVar = (eosc) ahknVar10.p.b();
                abfv abfvVar = (abfv) ahknVar10.lT.b();
                eyik eyikVar4 = ahhkVar12.y;
                ahng ahngVar3 = ahknVar10.b;
                return new abhx(eyikVar4, ahngVar3.no, egejVar, eoscVar, abfvVar, ahngVar3.np);
            case 34:
                return Optional.of((acbn) this.c.J.b());
            case 35:
                ahkn ahknVar11 = this.a;
                return new acbn();
            case 36:
                return new abdw(this.c.L);
            case 37:
                Activity activity3 = (Activity) this.c.d.b();
                ahkn ahknVar12 = this.a;
                eyik eyikVar5 = ahknVar12.bM;
                ahnh ahnhVar4 = ahknVar12.a;
                return new abdu(activity3, ahnhVar4.LC, (fcyh) eyikVar5.b(), (fdjx) ahnhVar4.m.b());
            case 38:
                return new abwy((fdjx) this.c.N.b());
            case Maneuver.TYPE_DESTINATION /* 39 */:
                fcyh fcyhVar = (fcyh) this.a.a.Rm.b();
                ehnu ehnuVar4 = (ehnu) this.c.o.b();
                fcyhVar.getClass();
                ehnuVar4.getClass();
                return ehou.a(fcyhVar, ehnuVar4.P());
            case 40:
                return Optional.of(this.c.w());
            case 41:
                return Optional.of(this.c.v());
            case 42:
                return Optional.of(this.c.x());
            case 43:
                ahhk ahhkVar13 = this.c;
                Object objAF = ahhkVar13.aF();
                Activity activity4 = (Activity) ahhkVar13.d.b();
                boolean z = activity4 instanceof eg;
                ehrd ehrdVar = (ehrd) this.a.b.kt.b();
                if (!z) {
                    throw new IllegalStateException("must use FragmentActivity");
                }
                final eg egVar4 = (eg) activity4;
                return new ehrb(new ehri((ehrj) objAF, new fcsu() { // from class: ehre
                    @Override // defpackage.fcsu
                    public final Object b() {
                        eg egVar5 = egVar4;
                        return (ehqv) raw.f(egVar5).d(egVar5);
                    }
                }), new ehqy(egVar4, ehrdVar), true);
            case 44:
                return new eidm((eigp) this.a.aI.b());
            case 45:
                return Optional.of(this.c.u());
            case 46:
                ahhk ahhkVar14 = this.c;
                final Activity activity5 = (Activity) ahhkVar14.d.b();
                ahkn ahknVar13 = ahhkVar14.b;
                ahnh ahnhVar5 = ahknVar13.a;
                egej egejVar2 = (egej) ahnhVar5.pI.b();
                fdjx fdjxVar = (fdjx) ahnhVar5.m.b();
                ahng ahngVar4 = ahknVar13.b;
                eyik eyikVar6 = ahngVar4.mw;
                final avmp avmpVar = (avmp) ahnhVar5.Jm.b();
                final eyik eyikVar7 = ahngVar4.kH;
                activity5.getClass();
                egejVar2.getClass();
                fdjxVar.getClass();
                eyikVar6.getClass();
                avmpVar.getClass();
                eyikVar7.getClass();
                acas acasVar = new acas();
                dyun dyunVarK = dyuo.k();
                ((dyug) dyunVarK).b = ejud.a;
                dyunVarK.b(dyus.a(activity5, new Runnable() { // from class: agww
                    @Override // java.lang.Runnable
                    public final void run() {
                        avmpVar.l(activity5, null);
                    }
                }));
                dyunVarK.c(new dyuw());
                acasVar.a = dyunVarK.e();
                acasVar.d(new accc() { // from class: agwx
                    @Override // defpackage.accc
                    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                        View viewInflate = layoutInflater.inflate(R.layout.penpal_express_sign_in, viewGroup, false);
                        viewInflate.getClass();
                        return viewInflate;
                    }

                    @Override // defpackage.accc
                    public final /* synthetic */ void b() {
                    }
                });
                acasVar.c(new Function() { // from class: agwy
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        Log.d("PenpalOnboarding", "PenpalOptionsModule.getPenpalOptions - user clicks through sell page with sign in");
                        ((agxn) eyikVar7.b()).c();
                        return null;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return Optional.of(acasVar.a());
            case 47:
                ahhk ahhkVar15 = this.c;
                Activity activity6 = (Activity) ahhkVar15.d.b();
                eyik eyikVar8 = ahhkVar15.b.b.kR;
                activity6.getClass();
                eyikVar8.getClass();
                ahho ahhoVar = ahhkVar15.c;
                return Optional.of(daxh.b(activity6, ahhoVar.bw, ahhoVar.bx, ahhoVar.by, false));
            case 48:
                ahhk ahhkVar16 = this.c;
                Activity activity7 = (Activity) ahhkVar16.d.b();
                eyik eyikVar9 = ahhkVar16.b.b.kR;
                activity7.getClass();
                eyikVar9.getClass();
                ahho ahhoVar2 = ahhkVar16.c;
                return Optional.of(daxh.b(activity7, ahhoVar2.bw, ahhoVar2.bx, ahhoVar2.by, true));
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return new acby();
            case 50:
                ahkn ahknVar14 = this.a;
                ahng ahngVar5 = ahknVar14.b;
                return new accg();
            case 51:
                ahkn ahknVar15 = this.a;
                return new acch((ecjh) ahknVar15.b.ns.b(), (fdjx) ahknVar15.a.m.b());
            case 52:
                return Optional.of((abxa) this.c.ac.b());
            case 53:
                ahng ahngVar6 = this.a.b;
                return new abxa((abxp) ahngVar6.nv.b(), ahngVar6.nw);
            case 54:
                ahkn ahknVar16 = this.a;
                eosc eoscVar2 = (eosc) ahknVar16.y.b();
                eosc eoscVar3 = (eosc) ahknVar16.aJ.b();
                eyik eyikVar10 = ahknVar16.dj;
                ahnh ahnhVar6 = ahknVar16.a;
                bveo bveoVarBC = ahknVar16.bC();
                eyik eyikVar11 = ahnhVar6.zP;
                eyik eyikVar12 = ahnhVar6.GT;
                egyt egytVar = (egyt) eyikVar10.b();
                ahho ahhoVar3 = this.b;
                ((AccessibilityManager) ((Context) ahknVar16.b.a.t.b()).getSystemService("accessibility")).getClass();
                return new acut(eoscVar2, eoscVar3, bveoVarBC, eyikVar11, eyikVar12, egytVar, ahhoVar3.ae, ahknVar16.aQ);
            case 55:
                ahhk ahhkVar17 = this.c;
                return acwc.a((eg) ahhkVar17.g.b(), ahhkVar17.an);
            case 56:
                ahhk ahhkVar18 = this.c;
                ahkn ahknVar17 = this.a;
                return new acxo(ahhkVar18.C(), (Context) ahknVar17.t.b(), (eosc) ahknVar17.aJ.b(), ahknVar17.a.adD, new aczb());
            case 57:
                ahkn ahknVar18 = this.a;
                eosc eoscVar4 = (eosc) ahknVar18.y.b();
                eyik eyikVar13 = ahknVar18.cD;
                ahnh ahnhVar7 = ahknVar18.a;
                return new adaw(eoscVar4, ahnhVar7.yw, ahnhVar7.qr, ahknVar18.aT, ahnhVar7.zF, ahknVar18.cE, (cogw) eyikVar13.b());
            case 58:
                return new adms((cogw) this.a.cD.b(), this.c.K());
            case 59:
                ahhk ahhkVar19 = this.c;
                ahkn ahknVar19 = this.a;
                ahnh ahnhVar8 = ahknVar19.a;
                ahng ahngVar7 = ahknVar19.b;
                return new cphz(ahhkVar19.ah, ahngVar7.jr, ahnhVar8.pl, ahngVar7.js);
            case 60:
                ahkn ahknVar20 = this.a;
                ahnh ahnhVar9 = ahknVar20.a;
                return new cphv((cpch) ahnhVar9.qj.b(), (cogv) ahnhVar9.qm.b(), ahnhVar9.Ap, (cogt) ahknVar20.cX.b());
            case 61:
                return new cmdp(this.a.a.BC);
            case 62:
                return new teu((Context) this.a.t.b());
            case com.sun.jna.Function.ALT_CONVENTION /* 63 */:
                return Optional.of(this.a.b.bP());
            case 64:
                ahkn ahknVar21 = this.a;
                cogw cogwVar = (cogw) ahknVar21.cD.b();
                ahnh ahnhVar10 = ahknVar21.a;
                eyik eyikVar14 = ahnhVar10.c;
                fdjx fdjxVar2 = (fdjx) ahnhVar10.oS.b();
                ahhk ahhkVar20 = this.c;
                return new adas(cogwVar, eyikVar14, fdjxVar2, ahhkVar20.D, (eg) ahhkVar20.g.b(), ahnhVar10.qr);
            case 65:
                ahnh ahnhVar11 = this.a.a;
                return new bacu(ahnhVar11.uP, ahnhVar11.qG, ahnhVar11.ye, ahnhVar11.sh);
            case 66:
                ahnh ahnhVar12 = this.a.a;
                return new anpm();
            case 67:
                ahkn ahknVar22 = this.a;
                ahhk ahhkVar21 = this.c;
                ahho ahhoVar4 = this.b;
                ahnh ahnhVar13 = ahknVar22.a;
                eyik eyikVar15 = ahknVar22.cD;
                eyik eyikVar16 = ahnhVar13.CG;
                eyik eyikVar17 = ahnhVar13.uu;
                eyik eyikVar18 = ahnhVar13.wF;
                eyik eyikVar19 = ahnhVar13.wJ;
                eyik eyikVar20 = ahknVar22.t;
                eyik eyikVar21 = ahknVar22.aN;
                eyik eyikVar22 = ahnhVar13.pf;
                eyik eyikVar23 = ahnhVar13.Dt;
                eyik eyikVar24 = ahnhVar13.CA;
                eyik eyikVar25 = ahnhVar13.um;
                eyik eyikVar26 = ahnhVar13.OJ;
                eyik eyikVar27 = ahnhVar13.CH;
                ahng ahngVar8 = ahknVar22.b;
                return new bags(eyikVar15, eyikVar16, eyikVar17, eyikVar18, eyikVar19, eyikVar20, eyikVar21, eyikVar22, eyikVar23, eyikVar24, eyikVar25, eyikVar26, eyikVar27, ahhkVar21.aq, ahnhVar13.CF, ahnhVar13.JK, ahnhVar13.yx, ahngVar8.he, ahhkVar21.as, ahhoVar4.d, ahnhVar13.sh, ahnhVar13.NR, ahngVar8.hf, ahknVar22.y);
            case 68:
                ahnh ahnhVar14 = this.a.a;
                return new batj();
            case 69:
                ahhk ahhkVar22 = this.c;
                return new acgx(ahhkVar22.au, ahhkVar22.aw, this.a.a.aaV);
            case 70:
                ahhk ahhkVar23 = this.c;
                achu achuVar = (achu) ahhkVar23.c.bA.b();
                ahkn ahknVar23 = ahhkVar23.b;
                ahnh ahnhVar15 = ahknVar23.a;
                achg achgVar = new achg(achuVar, (dakl) ahnhVar15.BK.b());
                return ekgp.p("IMessagePromo", achgVar, "DittoBatteryPromo", new achd(), "VerifiedSmsInvestigativeRpcPromo", new achh((csve) ahnhVar15.qO.b()), "BlockListAutoMigratedPromo", ahhkVar23.y(), "GaiaPairingPromo", new achi());
            case 71:
                ahhk ahhkVar24 = this.c;
                return ekgp.m("DataDonationNotification", ahhkVar24.aC(), "ScheduledSendTooltip", (ache) ahhkVar24.av.b());
            case 72:
                return new aiho();
            case 73:
                return new umn();
            case 74:
                return new srq();
            case 75:
                return new sro(this.a.a.yx);
            case 76:
                ahkn ahknVar24 = this.a;
                ahhk ahhkVar25 = this.c;
                ahnh ahnhVar16 = ahknVar24.a;
                return new abxu(ahknVar24.cD, ahhkVar25.aB, ahnhVar16.c, ahnhVar16.tG, ahknVar24.p, ahknVar24.y);
            case 77:
                return new acci(this.a.a.qr);
            case 78:
                ahnh ahnhVar17 = this.a.a;
                return new abya((fdjx) ahnhVar17.oS.b(), ahnhVar17.pJ);
            case 79:
                ahhk ahhkVar26 = this.c;
                return Optional.of(absa.a(ahhkVar26.b.dz, eyie.a(ahhkVar26.aI)));
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                ahkn ahknVar25 = this.a;
                Context context3 = (Context) ahknVar25.t.b();
                ahhk ahhkVar27 = this.c;
                abse abseVar = (abse) ahhkVar27.aG.b();
                ahnh ahnhVar18 = ahknVar25.a;
                return new absd(context3, ahhkVar27.aE, ahhkVar27.aF, abseVar, ahknVar25.cI, ahnhVar18.Uk, ahhkVar27.aH, ahnhVar18.pb);
            case 81:
                return new absi((Context) this.c.d.b());
            case 82:
                return Optional.of((abgm) this.a.a.LE.b());
            case 83:
                ahkn ahknVar26 = this.a;
                return new abse((crny) ahknVar26.a.pf.b(), (crma) ahknVar26.da.b());
            case 84:
                ahkn ahknVar27 = this.a;
                return new abni(ahknVar27.b.eQ, ahknVar27.eK, ahknVar27.a.c);
            case 85:
                ahkn ahknVar28 = this.a;
                eyik eyikVar28 = ahknVar28.a.qr;
                eyik eyikVar29 = ahknVar28.n;
                return new auwu(eyikVar28, eyikVar29, (eosc) ahknVar28.y.b());
            case 86:
                return new afhu((Activity) this.c.d.b());
            case 87:
                return new afjt(this.c.aM);
            case 88:
                abyt abytVar = new abyt(this.b.bB);
                ahng ahngVar9 = this.a.b;
                ahkn ahknVar29 = ahngVar9.a;
                ahnh ahnhVar19 = ahknVar29.a;
                cyri cyriVar = new cyri(ahnhVar19.afs);
                tsn tsnVar = new tsn(ahngVar9.nC, ahnhVar19.ws, ahnhVar19.pQ, ahnhVar19.oQ);
                fdjx fdjxVar3 = (fdjx) ahnhVar19.oS.b();
                Optional optional = (Optional) ahnhVar19.Ih.b();
                agtg agtgVar = (agtg) ahngVar9.mw.b();
                eyik eyikVar30 = ahknVar29.dj;
                return ekhx.v(abytVar, cyriVar, tsnVar, new agwv(fdjxVar3, optional, agtgVar, ahnhVar19.pG, (egyt) eyikVar30.b()), new abxy((fdjx) ahnhVar19.oS.b(), (Optional) ahnhVar19.WJ.b(), ahnhVar19.pG, (egyt) eyikVar30.b()), new ctge(ahnhVar19.pH), new afju[0]);
            case 89:
                return Optional.of(this.c.p());
            case 90:
                ahkn ahknVar30 = this.a;
                eyik eyikVar31 = ahknVar30.aQ;
                ahnh ahnhVar20 = ahknVar30.a;
                return new agnm(ahnhVar20.S(), (egzh) eyikVar31.b(), (agoo) ahnhVar20.aeO.b());
            case 91:
                ahkn ahknVar31 = this.a;
                return new agnq(ahknVar31.aI, ahknVar31.aQ, this.c.aR, ahknVar31.a.aeO, ahknVar31.b.jG);
            case 92:
                ahkn ahknVar32 = this.a;
                eosc eoscVar5 = (eosc) ahknVar32.y.b();
                eosc eoscVar6 = (eosc) ahknVar32.p.b();
                ahnh ahnhVar21 = this.b.a.a;
                ahnh ahnhVar22 = ahknVar32.a;
                return new agmw(eoscVar5, eoscVar6, ahnhVar22.S(), new agni(ahnhVar21.rF), (agoo) ahnhVar22.aeO.b(), ahnhVar22.aeQ);
            case 93:
                return ahcg.a((Activity) this.c.d.b());
            case 94:
                return new ahdv();
            case 95:
                return new ctgc();
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                ahkn ahknVar33 = this.a;
                return new aise(ahknVar33.a.rc, ahknVar33.eO);
            case 97:
                return new dopm((Context) this.a.t.b(), new dopb(this.c.b.a.mk()));
            case 98:
                Activity activity8 = (Activity) this.c.d.b();
                if (!(activity8 instanceof SimSelectionSettingsActivity)) {
                    throw new IllegalStateException(a.L(activity8, cuyx.class, "Attempt to inject a Activity wrapper of type "));
                }
                SimSelectionSettingsActivity simSelectionSettingsActivity = (SimSelectionSettingsActivity) activity8;
                simSelectionSettingsActivity.getClass();
                return simSelectionSettingsActivity;
            case 99:
                ahkn ahknVar34 = this.a;
                return new cvum(this.c.aZ, ahknVar34.a.c);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        int i = this.d;
        switch (i) {
            case VCardConstants.DEFAULT_PREF /* 100 */:
                return Optional.of(this.a.b.bN());
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                return new cvun(eyie.a(this.c.bb));
            case 102:
                return Optional.of((cvum) this.c.ba.b());
            case 103:
                return Optional.of(new cvut());
            case 104:
                return new cthu(this.a.b.iF);
            case 105:
                Activity activity = (Activity) this.c.d.b();
                if (!(activity instanceof OpenRbmDeepLinkActivity)) {
                    throw new IllegalStateException(a.L(activity, cwnt.class, "Attempt to inject a Activity wrapper of type "));
                }
                OpenRbmDeepLinkActivity openRbmDeepLinkActivity = (OpenRbmDeepLinkActivity) activity;
                openRbmDeepLinkActivity.getClass();
                return openRbmDeepLinkActivity;
            case 106:
                return new cwpm();
            case 107:
                ahkn ahknVar = this.a;
                ahnh ahnhVar = ahknVar.a;
                eyik eyikVar = ahnhVar.zs;
                aiqn aiqnVar = new aiqn();
                return new aiqo(eyikVar, aiqnVar, (Executor) ahknVar.p.b());
            case 108:
                return new dnhi((Activity) this.c.d.b(), Optional.empty(), (dngc) this.a.lo.b());
            case 109:
                return ujp.a((aqgw) this.a.b.jl.b());
            case 110:
                return new czcp(this.c.bk);
            case 111:
                return new cvjo(this.a.cD);
            case 112:
                return new czsq((eosc) this.a.y.b());
            case 113:
                ahhk ahhkVar = this.c;
                dacu dacuVar = (dacu) new dale((eg) ahhkVar.g.b(), dadc.class).b(ahhkVar.bp);
                dacuVar.getClass();
                return dacuVar;
            case 114:
                ahkn ahknVar2 = this.a;
                Context context = (Context) ahknVar2.t.b();
                ahnh ahnhVar2 = ahknVar2.a;
                bxuz bxuzVar = (bxuz) ahnhVar2.Rz.b();
                ahng ahngVar = ahknVar2.b;
                bxwh bxwhVar = (bxwh) ahngVar.ky.b();
                bxum bxumVarFy = ahnhVar2.fy();
                dach dachVar = (dach) ahngVar.ff.b();
                ahhk ahhkVar2 = this.c;
                ahkn ahknVar3 = ahhkVar2.b;
                ahnh ahnhVar3 = ahknVar3.a;
                eyik eyikVar2 = ahknVar3.t;
                eyik eyikVar3 = ahnhVar3.Hh;
                eyik eyikVar4 = ahknVar3.p;
                eyik eyikVar5 = ahknVar3.y;
                eyik eyikVar6 = ahhkVar2.bn;
                eyik eyikVar7 = ahnhVar3.Hl;
                eyik eyikVar8 = ahknVar3.gF;
                eyik eyikVar9 = ahknVar3.cD;
                return new dadc(context, bxuzVar, bxwhVar, bxumVarFy, dachVar, new dace(eyikVar2, eyikVar3, eyikVar4, eyikVar5, eyikVar6, eyikVar7, eyikVar8, eyikVar9, ahknVar3.kN, ahnhVar3.Qp), new daca(eyikVar9, ahnhVar3.Hl, ahknVar3.y, ahnhVar3.MF, eyikVar6, ahknVar3.gF, ahnhVar3.GB), (axjf) ahnhVar2.so.b(), (cxum) ahhkVar2.bo.b(), (eosc) ahknVar2.p.b(), new dabt(ahhkVar2.K()), (dabl) ahngVar.E.b(), (ajfo) ahnhVar2.vh.b(), ahngVar.kA);
            case 115:
                ahkn ahknVar4 = this.a;
                return new daig((Context) ahknVar4.t.b(), (cqjk) ahknVar4.no.b(), ahknVar4.a.qi);
            case 116:
                ahnh ahnhVar4 = this.a.a;
                return new cxum((cqjy) ahnhVar4.Ci.b(), (dakl) ahnhVar4.BK.b());
            case 117:
                ahhk ahhkVar3 = this.c;
                Activity activity2 = (Activity) ahhkVar3.d.b();
                ahkn ahknVar5 = this.a;
                return new dpjc(activity2, ahhkVar3.X(), ahhkVar3.Y(), (dngc) ahknVar5.lo.b(), (fdjx) ahhkVar3.N.b(), Optional.of(Boolean.valueOf(((eoth) new apcd(ahknVar5.b.a.a.oO).a.b()).a("bugle.fix_view_focus_clear_on_keyboard_close"))));
            case 118:
                ahhk ahhkVar4 = this.c;
                return new dpkn((Activity) ahhkVar4.d.b(), new dpkh(ahhkVar4.b.lo));
            case 119:
                ahhk ahhkVar5 = this.c;
                return new dpjo((Activity) ahhkVar5.d.b(), new dpks(ahhkVar5.d, ahhkVar5.b.lo));
            case 120:
                ahkn ahknVar6 = this.a;
                Context context2 = (Context) ahknVar6.t.b();
                ecjl ecjlVar = (ecjl) ahknVar6.jI.b();
                context2.getClass();
                ecjlVar.getClass();
                dple dpleVar = dple.a;
                dpleVar.getClass();
                return dndl.a(context2, ecjlVar, dpleVar, "keyboard", "keyboard");
            case 121:
                ahhk ahhkVar6 = this.c;
                return new lxo((eg) ahhkVar6.g.b(), ahhkVar6.ad());
            case 122:
                return new ecyz(((edhg) this.c.bN.b()).k());
            case 123:
                ahhk ahhkVar7 = this.c;
                edhg edhgVar = (edhg) new lxo((eg) ahhkVar7.g.b(), ahhkVar7.af()).a(edhg.class);
                edhgVar.getClass();
                return edhgVar;
            case 124:
                return new edhj(this.a.b.nO);
            case 125:
                return new edgi((eddp) this.c.bw.b());
            case 126:
                return new eddp((Context) this.a.t.b());
            case 127:
                Context context3 = (Context) this.a.t.b();
                ahhk ahhkVar8 = this.c;
                ejwi ejwiVar = (ejwi) ahhkVar8.bz.b();
                eupp euppVarAA = ahhkVar8.aA();
                List list = dbyl.m;
                dbyi dbyiVar = new dbyi(context3, "OBAKE");
                dbyiVar.f = (String) ejwiVar.f();
                if (fbgv.a.get().y()) {
                    dbyiVar.g = new dbyu() { // from class: edgu
                        @Override // defpackage.dbyu
                        public final dbyw a() {
                            return dbyw.c(86129221, eyen.LOGGER_DEFERRING_PROVIDER);
                        }
                    };
                }
                return new edgw(context3, dbyiVar.c(), euppVarAA);
            case 128:
                return ((eduq) this.c.by.b()).a;
            case 129:
                ahhk ahhkVar9 = this.c;
                return new eduq((eg) ahhkVar9.g.b(), ahhkVar9.aI());
            case 130:
                return ((eduq) this.c.by.b()).c.c();
            case 131:
                euqq euqqVar = ((eduq) this.c.by.b()).d;
                euqqVar.getClass();
                return euqqVar;
            case 132:
                return new edga((edgd) this.c.bH.b(), (eosc) this.a.aJ.b());
            case 133:
                ahkn ahknVar7 = this.a;
                Context context4 = (Context) ahknVar7.t.b();
                ahhk ahhkVar10 = this.c;
                return new edgg((fbqm) ahhkVar10.bD.b(), (eosc) ahknVar7.aJ.b(), new edgb(context4, "oauth2:https://www.googleapis.com/auth/peopleapi.readonly"), (ejwi) ahhkVar10.bE.b(), (edgh) ahhkVar10.bG.b());
            case 134:
                edgj edgjVar = edgj.PROD;
                edgjVar.getClass();
                return new fcox((String) edgk.a.get(edgjVar), 443).a();
            case 135:
                return ((eduq) this.c.by.b()).b;
            case 136:
                return new edgh((dbra) this.c.bF.b());
            case 137:
                Context context5 = (Context) this.a.t.b();
                dboh dbohVar = new dboh(new Bundle());
                dcfd dcfdVar = dbog.a;
                return new dbra(context5, dbohVar);
            case 138:
                eusa eusaVar = (eusa) this.c.bA.b();
                etug etugVar = (etug) etul.a.createBuilder();
                etuh etuhVar = (etuh) etuk.a.createBuilder();
                etuhVar.copyOnWrite();
                etuk etukVar = (etuk) etuhVar.instance;
                etukVar.d = 1;
                etukVar.b |= 2;
                etuhVar.copyOnWrite();
                etuk etukVar2 = (etuk) etuhVar.instance;
                etukVar2.c = 5;
                etukVar2.b |= 1;
                String str = eusaVar.d;
                etuhVar.copyOnWrite();
                etuk etukVar3 = (etuk) etuhVar.instance;
                str.getClass();
                etukVar3.b |= 4;
                etukVar3.e = str;
                exwb exwbVarB = exwb.b(eusaVar.c);
                if (exwbVarB == null) {
                    exwbVarB = exwb.UNKNOWN_APPLICATION;
                }
                etuhVar.copyOnWrite();
                etuk etukVar4 = (etuk) etuhVar.instance;
                etukVar4.f = exwbVarB.cL;
                etukVar4.b |= 8;
                etugVar.copyOnWrite();
                etul etulVar = (etul) etugVar.instance;
                etuk etukVar5 = (etuk) etuhVar.build();
                etukVar5.getClass();
                etulVar.c = etukVar5;
                etulVar.b = 1 | etulVar.b;
                etul etulVar2 = (etul) etugVar.build();
                etulVar2.getClass();
                return etulVar2;
            case 139:
                ettu ettuVar = (ettu) ettv.a.createBuilder();
                ettuVar.copyOnWrite();
                ettv ettvVar = (ettv) ettuVar.instance;
                ettvVar.b |= 1;
                ettvVar.c = true;
                ettv ettvVar2 = (ettv) ettuVar.build();
                ettvVar2.getClass();
                return ettvVar2;
            case 140:
                ahhk ahhkVar11 = this.c;
                return new edlp((edgc) ahhkVar11.bI.b(), (eosc) this.a.aJ.b(), (etul) ahhkVar11.bJ.b());
            case 141:
                ahhk ahhkVar12 = this.c;
                return new edlh((edgc) ahhkVar12.bI.b(), (eosc) this.a.aJ.b(), (etul) ahhkVar12.bJ.b());
            case 142:
                ahhk ahhkVar13 = this.c;
                eddo eddoVar = (eddo) ahhkVar13.bP.b();
                ahkn ahknVar8 = this.a;
                return new edau(eddoVar, (eosc) ahknVar8.aJ.b(), ahhkVar13.ae(), (ejxm) ahknVar8.b.nO.b(), ahhkVar13.ag(), (eczz) ahhkVar13.bT.b());
            case 143:
                return new eddo(new eddr((Context) this.c.b.t.b()));
            case 144:
                ahhk ahhkVar14 = this.c;
                return new eddy((ejwi) ahhkVar14.bQ.b(), ((Activity) ahhkVar14.d.b()).getResources());
            case 145:
                ahhk ahhkVar15 = this.c;
                Activity activity3 = (Activity) ahhkVar15.d.b();
                eddk eddkVarAI = ahhkVar15.aI();
                String stringExtra = activity3.getIntent().getStringExtra("com.google.profile.photopicker.ACCOUNT");
                if (!TextUtils.isEmpty(stringExtra)) {
                    for (Account account : eddkVarAI.a()) {
                        if (account.name.equals(stringExtra)) {
                            return ejwi.j(new eddm(activity3, account, eddkVarAI));
                        }
                    }
                }
                return ejud.a;
            case 146:
                edgv edgvVar = (edgv) this.c.bC.b();
                ahng ahngVar2 = this.a.b;
                return new ednl(edgvVar, (ejxm) ahngVar2.nO.b(), (ejxm) ahngVar2.nO.b());
            case 147:
                Intent intent = ((eg) this.c.g.b()).getIntent();
                if (intent.getLongExtra("IMAGE_ID", -1L) != -1 && intent.getData() == null) {
                    return new edaa(ejwi.j(new edjr(intent.getLongExtra("IMAGE_ID", -1L))), ejwi.i(intent.getStringExtra("IMAGE_DISPLAY_NAME")));
                }
                if (intent.getData() == null || intent.getLongExtra("IMAGE_ID", -1L) != -1) {
                    ejud ejudVar = ejud.a;
                    return new edaa(ejudVar, ejudVar);
                }
                Uri data = intent.getData();
                data.getClass();
                return new edaa(ejwi.j(new edjs(data)), ejud.a);
            case 148:
                return new edbo(this.c.ah());
            case 149:
                return new edco(this.c.aj());
            case 150:
                return new edcx(this.c.ai());
            case 151:
                return new edot(this.c.ak());
            case 152:
                ahhk ahhkVar16 = this.c;
                eddo eddoVar2 = (eddo) ahhkVar16.bP.b();
                ahkn ahknVar9 = this.a;
                return new edod(eddoVar2, (eosc) ahknVar9.aJ.b(), ahhkVar16.ae(), (ejxm) ahknVar9.b.nO.b());
            case 153:
                ahhk ahhkVar17 = this.c;
                return new edqn(ahhkVar17.al(), ahhkVar17.ak(), ahhkVar17.am(), (eduq) ahhkVar17.by.b());
            case 154:
                return new edom(((edhg) this.c.bN.b()).b());
            case 155:
                return new edri(this.c.al());
            case 156:
                ahhk ahhkVar18 = this.c;
                return new edtf(((edhk) ahhkVar18.ce.b()).b(), (edmj) ahhkVar18.cf.b());
            case 157:
                ahhk ahhkVar19 = this.c;
                eg egVar = (eg) ahhkVar19.g.b();
                ahkn ahknVar10 = ahhkVar19.b;
                eyik eyikVar10 = ahhkVar19.bI;
                eyik eyikVar11 = ahknVar10.aJ;
                eyik eyikVar12 = ahhkVar19.bJ;
                eyik eyikVar13 = ahhkVar19.bv;
                edhk edhkVar = (edhk) new lxo(egVar, new edhl(new edmq(eyikVar10, eyikVar11, eyikVar12, eyikVar13, ahhkVar19.bx), new edmk(eyikVar11, ahhkVar19.cd, ahhkVar19.bP, eyikVar13, ahhkVar19.bw))).a(edhk.class);
                edhkVar.getClass();
                return edhkVar;
            case 158:
                dvdf dvdfVarA = ((dvdg) this.a.a.anX.b()).a((Account) ((ejwi) this.c.bE.b()).c());
                dvdfVarA.getClass();
                return dvdfVarA;
            case 159:
                return ((edhk) this.c.ce.b()).a();
            case 160:
                ahhk ahhkVar20 = this.c;
                return new edtb((ecpy) ahhkVar20.ch.b(), (Context) this.a.t.b(), (ejwi) ahhkVar20.bE.b(), (edgv) ahhkVar20.bC.b(), (edmj) ahhkVar20.cf.b(), (edmz) ahhkVar20.cj.b(), (eusa) ahhkVar20.bA.b());
            case 161:
                Context context6 = (Context) this.a.t.b();
                return ecpy.c(context6, new CronetEngine.Builder(context6).build());
            case 162:
                edmz edmzVar = (edmz) ((lxo) this.c.ci.b()).a(edmz.class);
                edmzVar.getClass();
                return edmzVar;
            case 163:
                return new edtl(this.c.am());
            case 164:
                return new edmz();
            case 165:
                ahhk ahhkVar21 = this.c;
                return new edgl((eg) ahhkVar21.g.b(), ((eduq) ahhkVar21.by.b()).f.a(new ecyh(ejud.a).a));
            case 166:
                ahhk ahhkVar22 = this.c;
                eg egVar2 = (eg) ahhkVar22.g.b();
                eduy eduyVar = (eduy) ahhkVar22.cp.b();
                dsvh dsvhVar = (dsvh) this.a.b.jc.b();
                eyik eyikVar14 = ahhkVar22.cq;
                edut edutVarAo = ahhkVar22.ao();
                return new eduw(egVar2, eduyVar, dsvhVar, edutVarAo, ahhkVar22.cu, ahhkVar22.cv);
            case 167:
                ahhk ahhkVar23 = this.c;
                return new eduy((edgv) ahhkVar23.bC.b(), (edgp) ahhkVar23.co.b(), (edmz) ahhkVar23.cj.b());
            case 168:
                return new edgp(this.a.b.nO);
            case 169:
                return new edoj();
            case 170:
                return new edoq();
            case 171:
                return new edsv();
            case 172:
                return new edrg();
            case 173:
                return new edry();
            case 174:
                return new edtj();
            case 175:
                ahhk ahhkVar24 = this.c;
                eg egVar3 = (eg) ahhkVar24.g.b();
                eduy eduyVar2 = (eduy) ahhkVar24.cp.b();
                dsvh dsvhVar2 = (dsvh) this.a.b.jc.b();
                eyik eyikVar15 = ahhkVar24.cq;
                edut edutVarAo2 = ahhkVar24.ao();
                return new edve(egVar3, eduyVar2, dsvhVar2, edutVarAo2, ahhkVar24.cv);
            case 176:
                return new edba();
            case 177:
                return new DevicePhotosFragment();
            case 178:
                return new edpn();
            case 179:
                return new ehor((Activity) this.c.d.b(), ekon.a);
            case 180:
                ahhk ahhkVar25 = this.c;
                return new ehsf((efxf) ahhkVar25.x.b(), (Activity) ahhkVar25.d.b());
            case 181:
                Activity activity4 = (Activity) this.c.d.b();
                if (!(activity4 instanceof EmotifyActivity)) {
                    throw new IllegalStateException(a.L(activity4, ejdt.class, "Attempt to inject a Activity wrapper of type "));
                }
                EmotifyActivity emotifyActivity = (EmotifyActivity) activity4;
                emotifyActivity.getClass();
                return emotifyActivity;
            case 182:
                return Optional.of((abvd) this.a.b.ll.b());
            case 183:
                ahhk ahhkVar26 = this.c;
                this.a.bC();
                return new cigd();
            case 184:
                return ehon.a((eg) this.c.g.b());
            case 185:
                return ehmw.b((ehnu) this.c.o.b());
            case 186:
                return new absg((Optional) this.c.aJ.b());
            case 187:
                ahkn ahknVar11 = this.a;
                return new afdm((egyt) ahknVar11.dj.b(), (agmw) this.c.aR.b(), ahknVar11.a.S(), (eosc) ahknVar11.p.b(), (egzh) ahknVar11.aQ.b());
            case 188:
                return new dnty((Activity) this.c.d.b());
            case 189:
                ahhk ahhkVar27 = this.c;
                Context context7 = (Context) ahhkVar27.d.b();
                ahkn ahknVar12 = this.a;
                return ukx.a(context7, ahknVar12.a.adG, ahknVar12.jX, ahhkVar27.cN);
            case 190:
                ahkn ahknVar13 = this.a;
                return new ukw((Optional) ahknVar13.jX.b(), (aidr) ahknVar13.cV.b());
            case 191:
                return new edby();
            case 192:
                return new edcj();
            case 193:
                return new ecyw();
            case 194:
                kuk kukVar = (eg) this.c.g.b();
                ejwl.b(kukVar instanceof edux, "Activity has to implement PhotoPickerNavigationProvider");
                eduu eduuVarE = ((edux) kukVar).E();
                eduuVarE.getClass();
                return eduuVarE;
            case 195:
                return new edgm(((Context) this.a.t.b()).getPackageManager());
            case 196:
                ahhk ahhkVar28 = this.c;
                acag acagVarR = ahhkVar28.r();
                Activity activity5 = (Activity) ahhkVar28.d.b();
                eyik eyikVar16 = ahhkVar28.b.aI;
                ekgb ekgbVarA = acae.a(acagVarR, new acar(activity5, (eigp) eyikVar16.b(), ahhkVar28.cV), new acap((Activity) ahhkVar28.d.b(), (eigp) eyikVar16.b(), ahhkVar28.q(), ahhkVar28.O), ahhkVar28.t(), ahhkVar28.s(), new acef((Activity) ahhkVar28.d.b(), (eigp) eyikVar16.b(), ahhkVar28.q(), (aceg) ahhkVar28.cY.b(), ahhkVar28.O), ahhkVar28.L());
                ekgbVarA.getClass();
                return ekgbVarA;
            case 197:
                ahhk ahhkVar29 = this.c;
                Activity activity6 = (Activity) ahhkVar29.d.b();
                ahnh ahnhVar5 = this.a.a;
                return new acaq(activity6, ahnhVar5.Uk, ahnhVar5.ws, ahhkVar29.q());
            case 198:
                ahhk ahhkVar30 = this.c;
                return new acah((Activity) ahhkVar30.d.b(), this.b.bV, ahhkVar30.q());
            case 199:
                return new acaj(this.a.a.Ci);
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.fcsu
    public final Object b() {
        int i = this.d;
        int i2 = i / 100;
        if (i2 == 0) {
            return a();
        }
        if (i2 == 1) {
            return c();
        }
        switch (i) {
            case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
                return new aceg();
            case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                return Optional.of((dpir) this.c.bu.b());
            case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                ahkn ahknVar = this.a;
                crqx crqxVar = (crqx) ahknVar.gF.b();
                ahhk ahhkVar = this.c;
                return new dafv(crqxVar, ahhkVar.db, (aijh) ahknVar.a.Uk.b(), (achu) this.b.bA.b(), (Context) ahhkVar.d.b());
            case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                return new dabm(this.a.a.c);
            case 204:
                return new ctfn(this.c.g);
            case 205:
                ahhk ahhkVar2 = this.c;
                ahnh ahnhVar = this.a.a;
                return new csdg(ahhkVar2.dd, ahnhVar.HB, ahnhVar.HA, ahnhVar.Ha, ahnhVar.HE, ahnhVar.GN, (fdjx) ahnhVar.oS.b());
            case 206:
                return ekhx.o(crtg.a(this.a.b.a.a.lE()));
            case 207:
                return new ctfp(this.a.a.BC);
            case 208:
                return new ctfo();
            default:
                throw new AssertionError(i);
        }
    }
}
