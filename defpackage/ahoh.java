package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;
import com.google.android.apps.messaging.conversation2.viewmodel.ConversationViewModel;
import com.google.android.apps.messaging.gaia.signoutaccount.SignOutAccountViewModel;
import com.google.android.apps.messaging.home.minidetailspage.MiniConversationDetailsPageViewModel;
import com.google.android.apps.messaging.joinvialink.JoinViaLinkViewModel;
import com.google.android.apps.messaging.messagedetails.viewmodel.MessageDetailsViewModel;
import com.google.android.apps.messaging.multishare.viewmodel.MultiShareViewModel;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.startchat.viewmodel.StartChatViewModel;
import com.google.android.apps.messaging.ui.conversation.details.CdpOpeningArguments;
import com.google.android.apps.messaging.ui.conversation.details.ConversationDetailsViewModel;
import com.google.android.apps.messaging.welcome.v1.viewmodel.AccountWelcomeViewModel;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.sun.jna.Function;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahoh implements eyik {
    public final ahkn a;
    public final ahjr b;
    public final ahoi c;
    private final ahhh d;
    private final int e;

    public ahoh(ahkn ahknVar, ahjr ahjrVar, ahhh ahhhVar, ahoi ahoiVar, int i) {
        this.a = ahknVar;
        this.b = ahjrVar;
        this.d = ahhhVar;
        this.c = ahoiVar;
        this.e = i;
    }

    private final Object a() {
        Object cvzpVar;
        int i = this.e;
        switch (i) {
            case 0:
                return new AccountWelcomeViewModel(this.c.f);
            case 1:
                ahkn ahknVar = this.a;
                Context context = (Context) ahknVar.t.b();
                ahhh ahhhVar = this.d;
                dava davaVar = (dava) ahhhVar.r.b();
                ahoi ahoiVar = this.c;
                ahjr ahjrVar = this.b;
                dazt daztVarBa = ahoiVar.ba();
                ahng ahngVar = ahknVar.b;
                return new daym(context, davaVar, daztVarBa, ahjrVar.oz, ahhhVar.u, ahjrVar.ox, ahjrVar.pY, ahhhVar.v, ahngVar.I, ahjrVar.I, Optional.of(ahjrVar.gP), ahjrVar.ap, (fdjx) ahoiVar.e.b(), (fdjx) ahknVar.a.m.b(), ahngVar.kU, ahngVar.jp, ahngVar.kV);
            case 2:
                ahoi ahoiVar2 = this.c;
                return egwg.a((fcyh) ahoiVar2.d.b(), ahoiVar2.hu);
            case 3:
                ahkn ahknVar2 = this.a;
                egvh egvhVarEl = ahknVar2.el();
                ahng ahngVar2 = ahknVar2.b;
                ahng.dk();
                ahnh ahnhVar = ahknVar2.a;
                eosd eosdVar = (eosd) ahnhVar.j.b();
                fcyh fcyhVar = (fcyh) ahnhVar.Rm.b();
                ejwi ejwiVarH = ejwi.h();
                ejwi ejwiVar = (ejwi) ahknVar2.i.b();
                ejwi.j(eyie.a(ahngVar2.kD));
                return egvz.a(egvhVarEl, eosdVar, fcyhVar, ejwiVarH, ejwiVar, ejwi.j(false));
            case 4:
                ahoi ahoiVar3 = this.c;
                ConversationId conversationId = (ConversationId) ahoiVar3.j.b();
                fdjx fdjxVar = (fdjx) ahoiVar3.e.b();
                fdpl fdplVar = (fdpl) ahoiVar3.m.b();
                Optional.empty();
                return new ConversationDetailsViewModel(conversationId, fdjxVar, fdplVar, (afzc) this.d.l.b(), ahoiVar3.aY());
            case 5:
                return vqf.a((OpenConversation2Arguments) this.c.i.b());
            case 6:
                return vrf.a((lwn) this.c.h.b());
            case 7:
                ahoi ahoiVar4 = this.c;
                return vqq.a((Conversation) ahoiVar4.l.b(), (fdjx) ahoiVar4.e.b());
            case 8:
                ahoi ahoiVar5 = this.c;
                ConversationId conversationId2 = (ConversationId) ahoiVar5.j.b();
                ajlm ajlmVar = (ajlm) ahoiVar5.k.b();
                ahjr ahjrVar2 = this.b;
                return vqp.a(conversationId2, ajlmVar, (ajln) ahjrVar2.au.b(), (zum) ahjrVar2.pQ.b());
            case 9:
                return vrg.a((OpenConversation2Arguments) this.c.i.b());
            case 10:
                return new ahbf((fdjx) this.c.e.b());
            case 11:
                return new cwjo(this.c.o);
            case 12:
                return new vjn((Context) this.a.t.b(), (afzc) this.d.l.b());
            case 13:
                ahoi ahoiVar6 = this.c;
                fdjx fdjxVar2 = (fdjx) ahoiVar6.e.b();
                ahkn ahknVar3 = this.a;
                Context context2 = (Context) ahknVar3.t.b();
                fdpl fdplVar2 = (fdpl) ahoiVar6.m.b();
                ConversationId conversationId3 = (ConversationId) ahoiVar6.j.b();
                ageo ageoVar = new ageo();
                eyik eyikVar = ahoiVar6.q;
                eyik eyikVar2 = ahoiVar6.t;
                eyik eyikVar3 = ahoiVar6.u;
                lwn lwnVar = (lwn) ahoiVar6.h.b();
                ahng ahngVar3 = ahknVar3.b;
                cvzpVar = new cvzp(fdjxVar2, context2, fdplVar2, conversationId3, ageoVar, eyikVar, eyikVar2, eyikVar3, lwnVar, ahoiVar6.O, ahngVar3.kY, ahoiVar6.o, (asgm) ahngVar3.kW.b(), (ardk) ahknVar3.a.Bd.b(), ahngVar3.ay(), this.d.l, this.b.au);
                break;
            case 14:
                return new aaft();
            case 15:
                ahoi ahoiVar7 = this.c;
                return new cway((fdjx) ahoiVar7.e.b(), (fdpl) ahoiVar7.m.b(), (fdpl) ahoiVar7.r.b(), this.d.x, ahoiVar7.s);
            case 16:
                ahoi ahoiVar8 = this.c;
                return vqs.a((Conversation) ahoiVar8.l.b(), (fdjx) ahoiVar8.e.b());
            case 17:
                return new cwfa((fdjx) this.a.a.oS.b());
            case 18:
                ahoi ahoiVar9 = this.c;
                fdjx fdjxVar3 = (fdjx) ahoiVar9.e.b();
                fdpl fdplVar3 = (fdpl) ahoiVar9.m.b();
                ConversationId conversationId4 = (ConversationId) ahoiVar9.j.b();
                fdpl fdplVar4 = (fdpl) ahoiVar9.r.b();
                ahkn ahknVar4 = this.a;
                cssf cssfVar = (cssf) ahknVar4.a.uo.b();
                ahng ahngVar4 = ahknVar4.b;
                return new cwbh(fdjxVar3, fdplVar3, conversationId4, fdplVar4, cssfVar, ahngVar4.kW, ahngVar4.ar());
            case 19:
                ahkn ahknVar5 = this.a;
                Context context3 = (Context) ahknVar5.t.b();
                ahoi ahoiVar10 = this.c;
                fdjx fdjxVar4 = (fdjx) ahoiVar10.e.b();
                fdpl fdplVar5 = (fdpl) ahoiVar10.m.b();
                fdpl fdplVar6 = (fdpl) ahoiVar10.r.b();
                ConversationId conversationId5 = (ConversationId) ahoiVar10.j.b();
                fdpl fdplVar7 = (fdpl) ahoiVar10.v.b();
                ahng ahngVar5 = ahknVar5.b;
                arqu arquVarAI = ahngVar5.aI();
                ahhh ahhhVar2 = this.d;
                eyik eyikVar4 = ahoiVar10.x;
                eyik eyikVar5 = ahngVar5.kW;
                aqlb aqlbVarAr = ahngVar5.ar();
                aqla aqlaVarAq = ahngVar5.aq();
                return new cwam(context3, fdjxVar4, fdplVar5, fdplVar6, conversationId5, fdplVar7, arquVarAI, ahhhVar2.l, eyikVar4, ahoiVar10.F, ahoiVar10.J, ahoiVar10.M, ahoiVar10.N, eyikVar5, aqlbVarAr, aqlaVarAq);
            case 20:
                ahoi ahoiVar11 = this.c;
                return vri.a((fdjx) ahoiVar11.e.b(), (fdpl) ahoiVar11.r.b(), (fdpl) ahoiVar11.m.b());
            case 21:
                ahkn ahknVar6 = this.a;
                Context context4 = (Context) ahknVar6.t.b();
                ahoi ahoiVar12 = this.c;
                fdpl fdplVar8 = (fdpl) ahoiVar12.r.b();
                fdpl fdplVar9 = (fdpl) ahoiVar12.m.b();
                fdjx fdjxVar5 = (fdjx) ahoiVar12.e.b();
                afzc afzcVar = (afzc) this.d.l.b();
                ahnh ahnhVar2 = ahknVar6.a;
                return new vfn(context4, fdplVar8, fdplVar9, fdjxVar5, afzcVar, (aisp) ahnhVar2.zF.b(), Optional.of((cwdc) ahoiVar12.w.b()), ahnhVar2.tb, ahnhVar2.RH, ahoiVar12.bo());
            case 22:
                return new cwdc((fdjx) this.c.e.b(), this.a.a.pQ);
            case 23:
                ahkn ahknVar7 = this.a;
                Context context5 = (Context) ahknVar7.t.b();
                ahoi ahoiVar13 = this.c;
                fdjx fdjxVar6 = (fdjx) ahoiVar13.e.b();
                ahnh ahnhVar3 = ahknVar7.a;
                eyik eyikVar6 = ahnhVar3.BO;
                fdpl fdplVar10 = (fdpl) ahoiVar13.r.b();
                fdpl fdplVar11 = (fdpl) ahoiVar13.m.b();
                fdpl fdplVar12 = (fdpl) ahoiVar13.y.b();
                aqcg aqcgVarBw = ahnhVar3.bw();
                csze cszeVarLH = ahnhVar3.lH();
                ahjr ahjrVar3 = this.b;
                cszj cszjVarAQ = ahoiVar13.aQ();
                eyik eyikVar7 = ahjrVar3.ap;
                eyik eyikVar8 = ahnhVar3.tb;
                ahhh ahhhVar3 = this.d;
                ahng ahngVar6 = ahknVar7.b;
                asit asitVarAS = ahngVar6.aS();
                cszm cszmVarAR = ahoiVar13.aR();
                aqla aqlaVarAq2 = ahngVar6.aq();
                eyik eyikVar9 = ahnhVar3.RH;
                asiu asiuVarAT = ahngVar6.aT();
                cvzpVar = new vpp(context5, fdjxVar6, eyikVar6, fdplVar10, fdplVar11, fdplVar12, aqcgVarBw, cszeVarLH, cszjVarAQ, ahoiVar13.E, eyikVar7, eyikVar8, ahhhVar3.l, asitVarAS, cszmVarAR, aqlaVarAq2, eyikVar9, asiuVarAT, ahoiVar13.bo());
                break;
            case 24:
                ahoi ahoiVar14 = this.c;
                return vpz.a((fdjx) ahoiVar14.e.b(), (Conversation) ahoiVar14.l.b());
            case 25:
                ahkn ahknVar8 = this.a;
                Context context6 = (Context) ahknVar8.t.b();
                ahoi ahoiVar15 = this.c;
                fdjx fdjxVar7 = (fdjx) ahoiVar15.e.b();
                ahnh ahnhVar4 = ahknVar8.a;
                return new voz(context6, fdjxVar7, ahnhVar4.lH(), ahnhVar4.BO, ahoiVar15.D, (ahax) ahoiVar15.n.b());
            case 26:
                ahkn ahknVar9 = this.a;
                fcyh fcyhVar2 = (fcyh) ahknVar9.bM.b();
                ahoi ahoiVar16 = this.c;
                return new wwd(fcyhVar2, (wre) ahoiVar16.z.b(), ahoiVar16.y(), (vuc) ahknVar9.b.kX.b());
            case 27:
                return new wre();
            case 28:
                return vwr.a((lwn) this.c.h.b());
            case 29:
                ahoi ahoiVar17 = this.c;
                ConversationId conversationId6 = (ConversationId) ahoiVar17.j.b();
                ahkn ahknVar10 = this.a;
                return new wrt(conversationId6, (fcyh) ahknVar10.bM.b(), (fcyh) ahknVar10.cz.b(), (byeq) ahknVar10.a.sG.b(), ahoiVar17.bl());
            case 30:
                return new wsc();
            case 31:
                ahkn ahknVar11 = this.a;
                Context context7 = (Context) ahknVar11.t.b();
                ahoi ahoiVar18 = this.c;
                return new vev(context7, (fdjx) ahoiVar18.e.b(), (fdpl) ahoiVar18.r.b(), (ConversationId) ahoiVar18.j.b(), (afzc) this.d.l.b(), (OpenConversation2Arguments) ahoiVar18.i.b(), (fdpl) ahoiVar18.m.b(), (fdpl) ahoiVar18.H.b(), ahoiVar18.I, ahknVar11.b.aa);
            case 32:
                ahoi ahoiVar19 = this.c;
                return vqa.a((ajlu) ahoiVar19.G.b(), (fdjx) ahoiVar19.e.b());
            case 33:
                return vqb.a((Conversation) this.c.l.b());
            case 34:
                ahkn ahknVar12 = this.a;
                return new upo(ahknVar12.dL, (apwn) ahknVar12.a.Bg.b());
            case 35:
                Context context8 = (Context) this.a.t.b();
                ahoi ahoiVar20 = this.c;
                return new vmi(context8, (ConversationId) ahoiVar20.j.b(), (afzc) this.d.l.b(), ahoiVar20.bg(), (fdjx) ahoiVar20.e.b());
            case 36:
                bxwx bxwxVar = (bxwx) this.c.K.b();
                bxuu.a(bxwxVar);
                return bxwxVar;
            case 37:
                ahkn ahknVar13 = this.a;
                return new bxwx((bxzz) ahknVar13.a.Ry.b(), (Executor) ahknVar13.y.b());
            case 38:
                return new cwbr((ains) this.a.a.pQ.b());
            case Maneuver.TYPE_DESTINATION /* 39 */:
                ahkn ahknVar14 = this.a;
                Context context9 = (Context) ahknVar14.t.b();
                ahoi ahoiVar21 = this.c;
                fdjx fdjxVar8 = (fdjx) ahoiVar21.e.b();
                ConversationId conversationId7 = (ConversationId) ahoiVar21.j.b();
                ahjr ahjrVar4 = this.b;
                ahhh ahhhVar4 = this.d;
                ahnh ahnhVar5 = ahknVar14.a;
                return new cwje(context9, fdjxVar8, ahoiVar21.Q, conversationId7, ahoiVar21.R, ahoiVar21.M, ahoiVar21.S, ahjrVar4.pX, ahhhVar4.l, ahoiVar21.N);
            case 40:
                return vrc.a((Conversation) this.c.l.b());
            case 41:
                Context context10 = (Context) this.a.t.b();
                afzc afzcVar2 = (afzc) this.d.l.b();
                ahoi ahoiVar22 = this.c;
                return new vjw(context10, afzcVar2, (fdjx) ahoiVar22.e.b(), (fdpl) ahoiVar22.m.b());
            case 42:
                Context context11 = (Context) this.a.t.b();
                ahoi ahoiVar23 = this.c;
                return new vpv(context11, (ConversationId) ahoiVar23.j.b(), (afzc) this.d.l.b(), (fdjx) ahoiVar23.e.b());
            case 43:
                Context context12 = (Context) this.a.t.b();
                ahoi ahoiVar24 = this.c;
                return new cvxj(context12, (fdjx) ahoiVar24.e.b(), (fdpl) ahoiVar24.m.b(), (fdpl) ahoiVar24.r.b(), (ConversationId) ahoiVar24.j.b(), ahoiVar24.bn(), this.d.l, ahoiVar24.U, ahoiVar24.Z);
            case 44:
                return new vlr((Context) this.a.t.b(), (afzc) this.d.l.b());
            case 45:
                ahkn ahknVar15 = this.a;
                Context context13 = (Context) ahknVar15.t.b();
                ahoi ahoiVar25 = this.c;
                return new cvxv(context13, (fdpl) ahoiVar25.m.b(), (fdpl) ahoiVar25.r.b(), (fdjx) ahoiVar25.e.b(), (fdpl) ahoiVar25.H.b(), (Conversation) ahoiVar25.l.b(), ahoiVar25.bn(), (fdjx) ahknVar15.a.oS.b(), ahoiVar25.W, (egyt) ahknVar15.dj.b(), this.b.jI, ahoiVar25.X, ahoiVar25.Y, ahknVar15.dL);
            case 46:
                return Integer.valueOf(cvur.a((CdpOpeningArguments) this.c.V.b()));
            case 47:
                return cvus.a((lwn) this.c.h.b());
            case 48:
                return new cvxy(this.a.t);
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                ahkn ahknVar16 = this.a;
                return new cvya(ahknVar16.t, ahknVar16.dL);
            case 50:
                ahoi ahoiVar26 = this.c;
                return new cvvx((fdjx) ahoiVar26.e.b(), (fdpl) ahoiVar26.m.b(), (ConversationId) ahoiVar26.j.b(), ahoiVar26.ar, ahoiVar26.at);
            case 51:
                ahkn ahknVar17 = this.a;
                Context context14 = (Context) ahknVar17.t.b();
                ahoi ahoiVar27 = this.c;
                return new cvwe(context14, (fdjx) ahoiVar27.e.b(), (fdpl) ahoiVar27.m.b(), ahoiVar27.ab, ahoiVar27.ac, ahoiVar27.af, ahoiVar27.al, ahoiVar27.ao, ahoiVar27.ap, ahoiVar27.aq, (arpr) ahknVar17.a.Be.b());
            case 52:
                Context context15 = (Context) this.a.t.b();
                afzc afzcVar3 = (afzc) this.d.l.b();
                ahoi ahoiVar28 = this.c;
                return new vky(context15, afzcVar3, (fdpl) ahoiVar28.m.b(), (fdpl) ahoiVar28.r.b());
            case 53:
                Context context16 = (Context) this.a.t.b();
                afzc afzcVar4 = (afzc) this.d.l.b();
                ahoi ahoiVar29 = this.c;
                return new vis(context16, afzcVar4, (fdpl) ahoiVar29.r.b(), (fdpl) ahoiVar29.m.b(), (ajlu) ahoiVar29.G.b(), (fdjx) ahoiVar29.e.b());
            case 54:
                ahkn ahknVar18 = this.a;
                Context context17 = (Context) ahknVar18.t.b();
                ahoi ahoiVar30 = this.c;
                fdjx fdjxVar9 = (fdjx) ahoiVar30.e.b();
                ahjr ahjrVar5 = this.b;
                ajln ajlnVar = (ajln) ahjrVar5.au.b();
                ahax ahaxVar = (ahax) ahoiVar30.n.b();
                cssw csswVar = (cssw) ahknVar18.kL.b();
                cqdn cqdnVar = (cqdn) ahjrVar5.S.b();
                ahnh ahnhVar6 = ahknVar18.a;
                return new vkk(context17, fdjxVar9, ajlnVar, ahaxVar, csswVar, cqdnVar, ahnhVar6.pQ, (dalj) ahoiVar30.ad.b(), (eigp) ahjrVar5.ac.b(), (afzc) this.d.l.b(), (arpr) ahnhVar6.Be.b(), ahoiVar30.ae, (fdpl) ahoiVar30.m.b());
            case 55:
                ahkn ahknVar19 = this.a;
                Context context18 = (Context) ahknVar19.t.b();
                crnp crnpVar = (crnp) ahknVar19.cI.b();
                ahnh ahnhVar7 = ahknVar19.a;
                return new dalj(context18, crnpVar, (dakl) ahnhVar7.BK.b());
            case 56:
                return new aghz((ains) this.a.a.pb.b());
            case 57:
                return new vfe(this.c.j());
            case 58:
                ahoi ahoiVar31 = this.c;
                return new tlj((ahax) ahoiVar31.n.b(), ahoiVar31.bk());
            case 59:
                ahkn ahknVar20 = this.a;
                Context context19 = (Context) ahknVar20.t.b();
                ahoi ahoiVar32 = this.c;
                return new tkd(context19, (fdjx) ahoiVar32.e.b(), (fcyh) ahknVar20.cz.b(), (afzc) this.d.l.b(), this.b.hj, (tiy) ahoiVar32.ag.b());
            case 60:
                return new tiy((Context) this.a.t.b(), (aaft) this.c.q.b());
            case 61:
                ahkn ahknVar21 = this.a;
                Context context20 = (Context) ahknVar21.t.b();
                ahoi ahoiVar33 = this.c;
                return new tkk(context20, (fdjx) ahoiVar33.e.b(), (fcyh) ahknVar21.cz.b(), (afzc) this.d.l.b(), this.b.hj, (tiy) ahoiVar33.ag.b());
            case 62:
                ahkn ahknVar22 = this.a;
                Context context21 = (Context) ahknVar22.t.b();
                ahoi ahoiVar34 = this.c;
                return new tku(context21, (fdjx) ahoiVar34.e.b(), (fcyh) ahknVar22.cz.b(), (afzc) this.d.l.b(), this.b.hj, (tiy) ahoiVar34.ag.b());
            case Function.ALT_CONVENTION /* 63 */:
                ahoi ahoiVar35 = this.c;
                return new xrd((fdpl) ahoiVar35.H.b(), (Context) this.a.t.b(), (ahax) ahoiVar35.n.b(), (xre) ahoiVar35.an.b());
            case 64:
                ahoi ahoiVar36 = this.c;
                ConversationId conversationId8 = (ConversationId) ahoiVar36.j.b();
                ahkn ahknVar23 = this.a;
                ahnh ahnhVar8 = ahknVar23.a;
                return new xrp(conversationId8, (fdjx) ahnhVar8.m.b(), (fdjx) ahnhVar8.oS.b(), (cogw) ahknVar23.cD.b(), (ajln) this.b.au.b(), (fdpl) ahoiVar36.m.b(), ahoiVar36.am, ahknVar23.b.ap());
            case 65:
                ahoi ahoiVar37 = this.c;
                fdpl fdplVar13 = (fdpl) ahoiVar37.H.b();
                fdpl fdplVar14 = (fdpl) ahoiVar37.m.b();
                ConversationId conversationId9 = (ConversationId) ahoiVar37.j.b();
                fdjx fdjxVar10 = (fdjx) ahoiVar37.e.b();
                ahkn ahknVar24 = this.a;
                return new xsc(fdplVar13, fdplVar14, conversationId9, fdjxVar10, (Context) ahknVar24.t.b(), (ajln) this.b.au.b(), (cogw) ahknVar24.cD.b(), (zuh) this.d.o.b());
            case 66:
                return new agib(this.c.aL());
            case 67:
                ahkn ahknVar25 = this.a;
                Context context22 = (Context) ahknVar25.t.b();
                ahoi ahoiVar38 = this.c;
                return new vkv(context22, (fdpl) ahoiVar38.m.b(), (ConversationId) ahoiVar38.j.b(), (ahax) ahoiVar38.n.b(), (fdjx) ahoiVar38.e.b(), (arpr) ahknVar25.a.Be.b(), (cogw) ahknVar25.cD.b(), (vkk) ahoiVar38.af.b(), (cssw) ahknVar25.kL.b(), (dalj) ahoiVar38.ad.b(), (eigp) this.b.ac.b(), ahoiVar38.aK(), ahoiVar38.ae);
            case 68:
                ahoi ahoiVar39 = this.c;
                return new cvwh((fdjx) ahoiVar39.e.b(), (fdpl) ahoiVar39.m.b(), (fdpl) ahoiVar39.H.b(), ahoiVar39.ab, ahoiVar39.ap, ahoiVar39.as, ahoiVar39.al, ahoiVar39.ao, (arpr) this.a.a.Be.b());
            case 69:
                Context context23 = (Context) this.a.t.b();
                ahoi ahoiVar40 = this.c;
                return new vlc(context23, (fdjx) ahoiVar40.e.b(), (ajvr) this.b.aq.b(), (fdpl) ahoiVar40.m.b(), (fdpl) ahoiVar40.r.b());
            case 70:
                ahkn ahknVar26 = this.a;
                Context context24 = (Context) ahknVar26.t.b();
                ahoi ahoiVar41 = this.c;
                fdjx fdjxVar11 = (fdjx) ahoiVar41.e.b();
                fdpl fdplVar15 = (fdpl) ahoiVar41.r.b();
                fdpl fdplVar16 = (fdpl) ahoiVar41.y.b();
                fdpl fdplVar17 = (fdpl) ahoiVar41.m.b();
                fdpl fdplVar18 = (fdpl) ahoiVar41.H.b();
                ConversationId conversationId10 = (ConversationId) ahoiVar41.j.b();
                ahhh ahhhVar5 = this.d;
                ahax ahaxVar2 = (ahax) ahoiVar41.n.b();
                ahjr ahjrVar6 = this.b;
                eigp eigpVar = (eigp) ahjrVar6.ac.b();
                ahnh ahnhVar9 = ahknVar26.a;
                cssf cssfVar2 = (cssf) ahnhVar9.uo.b();
                Optional optionalOf = Optional.of((cwdc) ahoiVar41.w.b());
                aqhc aqhcVar = (aqhc) ahnhVar9.QL.b();
                ahng ahngVar7 = ahknVar26.b;
                cvzpVar = new cvyx(context24, fdjxVar11, fdplVar15, fdplVar16, fdplVar17, fdplVar18, conversationId10, ahhhVar5.x, ahhhVar5.l, ahoiVar41.av, ahaxVar2, eigpVar, ahjrVar6.pZ, ahoiVar41.J, cssfVar2, optionalOf, aqhcVar);
                break;
            case 71:
                return new uta((ains) this.a.a.c.b());
            case 72:
                ahkn ahknVar27 = this.a;
                Context context25 = (Context) ahknVar27.t.b();
                ahoi ahoiVar42 = this.c;
                fdjx fdjxVar12 = (fdjx) ahoiVar42.e.b();
                ahnh ahnhVar10 = ahknVar27.a;
                fdjx fdjxVar13 = (fdjx) ahnhVar10.m.b();
                ConversationId conversationId11 = (ConversationId) ahoiVar42.j.b();
                fdpl fdplVar19 = (fdpl) ahoiVar42.m.b();
                fdpl fdplVar20 = (fdpl) ahoiVar42.y.b();
                fduj fdujVar = (fduj) ahoiVar42.aA.b();
                ahjr ahjrVar7 = this.b;
                return new cvwo(context25, fdjxVar12, fdjxVar13, conversationId11, fdplVar19, fdplVar20, fdujVar, ahoiVar42.bn(), (aofc) ahjrVar7.I.b(), (ajln) ahjrVar7.au.b(), (aqhc) ahnhVar10.QL.b());
            case 73:
                ahoi ahoiVar43 = this.c;
                return wad.a((fdjx) ahoiVar43.e.b(), (vzk) ahoiVar43.az.b());
            case 74:
                ahkn ahknVar28 = this.a;
                Context context26 = (Context) ahknVar28.t.b();
                ahoi ahoiVar44 = this.c;
                ConversationId conversationId12 = (ConversationId) ahoiVar44.j.b();
                fdpl fdplVar21 = (fdpl) ahoiVar44.H.b();
                fdpl fdplVar22 = (fdpl) ahoiVar44.m.b();
                wre wreVar = (wre) ahoiVar44.z.b();
                fcyh fcyhVar3 = (fcyh) ahknVar28.cz.b();
                fcyh fcyhVar4 = (fcyh) ahknVar28.cA.b();
                ahnh ahnhVar11 = ahknVar28.a;
                eyik eyikVar10 = ahnhVar11.tB;
                eyik eyikVar11 = ahoiVar44.v;
                ahng ahngVar8 = ahknVar28.b;
                arqu arquVarAI2 = ahngVar8.aI();
                aqbh aqbhVar = (aqbh) ahnhVar11.qa.b();
                Duration duration = wag.a;
                return new vzk(context26, conversationId12, fdplVar21, fdplVar22, wreVar, fcyhVar3, fcyhVar4, eyikVar10, eyikVar11, arquVarAI2, aqbhVar, ahngVar8.la, (arvu) ahnhVar11.tA.b(), (fdpl) ahoiVar44.ay.b(), (aquo) ahnhVar11.pl.b(), (arwb) ahnhVar11.yJ.b());
            case 75:
                ahoi ahoiVar45 = this.c;
                return vqy.a((fdpl) ahoiVar45.ax.b(), (ajlu) ahoiVar45.G.b());
            case 76:
                return vqz.a((ajlu) this.c.G.b());
            case 77:
                ahkn ahknVar29 = this.a;
                Context context27 = (Context) ahknVar29.t.b();
                ahoi ahoiVar46 = this.c;
                return new cwbw(context27, (fdjx) ahoiVar46.e.b(), ahknVar29.a.pQ, ahoiVar46.x, ahoiVar46.aC, ahoiVar46.aD, ahoiVar46.aE);
            case 78:
                Context context28 = (Context) this.a.t.b();
                ahoi ahoiVar47 = this.c;
                return new vie(context28, (fdjx) ahoiVar47.e.b(), (fdpl) ahoiVar47.m.b(), (ajlu) ahoiVar47.G.b(), (fdpl) ahoiVar47.r.b(), (ConversationId) ahoiVar47.j.b(), (afzc) this.d.l.b(), Optional.of((cwdc) ahoiVar47.w.b()), this.b.au);
            case 79:
                Context context29 = (Context) this.a.t.b();
                afzc afzcVar5 = (afzc) this.d.l.b();
                ahoi ahoiVar48 = this.c;
                return new cwcn(context29, afzcVar5, (fdpl) ahoiVar48.r.b(), (fdpl) ahoiVar48.m.b(), (fdjx) ahoiVar48.e.b(), Optional.of((cwdc) ahoiVar48.w.b()));
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                Context context30 = (Context) this.a.t.b();
                ahoi ahoiVar49 = this.c;
                return new vmo(context30, (fdjx) ahoiVar49.e.b(), (fdpl) ahoiVar49.m.b(), Optional.of((cwdc) ahoiVar49.w.b()), (afzc) this.d.l.b(), (ajln) this.b.au.b());
            case 81:
                ahoi ahoiVar50 = this.c;
                fdjx fdjxVar14 = (fdjx) ahoiVar50.e.b();
                fdpl fdplVar23 = (fdpl) ahoiVar50.m.b();
                fdpl fdplVar24 = (fdpl) ahoiVar50.r.b();
                cphv cphvVar = (cphv) this.d.w.b();
                ahkn ahknVar30 = this.a;
                ahnh ahnhVar12 = ahknVar30.a;
                eyik eyikVar12 = ahnhVar12.qj;
                eyik eyikVar13 = ahnhVar12.so;
                cwdc cwdcVar = (cwdc) ahoiVar50.w.b();
                eyik eyikVar14 = ahoiVar50.s;
                ahng ahngVar9 = ahknVar30.b;
                return new cwct(fdjxVar14, fdplVar23, fdplVar24, cphvVar, eyikVar12, eyikVar13, cwdcVar, eyikVar14, ahngVar9.az(), ahngVar9.kY);
            case 82:
                ahoi ahoiVar51 = this.c;
                ConversationId conversationId13 = (ConversationId) ahoiVar51.j.b();
                fdjx fdjxVar15 = (fdjx) ahoiVar51.e.b();
                zww zwwVarAx = ahoiVar51.ax();
                eyik eyikVar15 = ahoiVar51.fC;
                Optional.empty();
                ahkn ahknVar31 = this.a;
                zim zimVarAp = ahoiVar51.ap();
                eyik eyikVar16 = ahoiVar51.fD;
                eyik eyikVar17 = ahoiVar51.fF;
                eyik eyikVar18 = ahoiVar51.fH;
                ahng ahngVar10 = ahknVar31.b;
                boolean zDi = ahngVar10.di();
                ahjr ahjrVar8 = this.b;
                ahnh ahnhVar13 = ahknVar31.a;
                eyik eyikVar19 = ahnhVar13.pl;
                eyik eyikVar20 = this.d.l;
                afzc afzcVar6 = (afzc) eyikVar20.b();
                afza afzaVar = (afza) eyikVar20.b();
                diii diiiVar = (diii) ahoiVar51.di.b();
                fdpl fdplVar25 = (fdpl) ahoiVar51.ax.b();
                eyik eyikVar21 = ahoiVar51.eM;
                aalo aaloVarAC = ahoiVar51.aC();
                Optional optionalOf2 = Optional.of(new dmgn());
                fdpl fdplVar26 = (fdpl) ahoiVar51.m.b();
                Optional optionalOf3 = Optional.of((agtj) ahoiVar51.fN.b());
                Optional optionalOf4 = Optional.of((agva) ahoiVar51.fO.b());
                eyik eyikVar22 = ahnhVar13.RH;
                eyik eyikVar23 = ahoiVar51.fP;
                eyik eyikVar24 = ahoiVar51.fQ;
                eyik eyikVar25 = ahoiVar51.fR;
                aqkm aqkmVar = (aqkm) ahngVar10.jo.b();
                cvzpVar = new ConversationViewModel(conversationId13, fdjxVar15, zwwVarAx, eyikVar15, zimVarAp, ahoiVar51.bL, ahoiVar51.bS, eyikVar16, eyikVar17, eyikVar18, zDi, ahjrVar8.qc, eyikVar19, afzcVar6, afzaVar, diiiVar, fdplVar25, eyikVar21, aaloVarAC, optionalOf2, fdplVar26, optionalOf3, optionalOf4, eyikVar23, eyikVar24, eyikVar25, eyikVar22, aqkmVar);
                break;
            case 83:
                return new xvd();
            case 84:
                ahkn ahknVar32 = this.a;
                Context context31 = (Context) ahknVar32.t.b();
                ahoi ahoiVar52 = this.c;
                fdjx fdjxVar16 = (fdjx) ahoiVar52.e.b();
                ahhh ahhhVar6 = this.d;
                return new ctfl(context31, fdjxVar16, ahhhVar6.l, this.b.au, ahoiVar52.q, ahknVar32.a.aio);
            case 85:
                ahkn ahknVar33 = this.a;
                return new zqt(ahknVar33.b.Z(), (fdjx) this.c.e.b(), (fcyh) ahknVar33.cz.b(), (efwo) this.b.b.b(), ahknVar33.a.pJ);
            case 86:
                ahkn ahknVar34 = this.a;
                ahnh ahnhVar14 = ahknVar34.a;
                fdjx fdjxVar17 = (fdjx) ahnhVar14.oS.b();
                ahoi ahoiVar53 = this.c;
                return new xuj(fdjxVar17, (fdjx) ahoiVar53.e.b(), (fdpl) ahoiVar53.r.b(), (fdpl) ahoiVar53.aL.b(), ahnhVar14.zi, ahknVar34.cD);
            case 87:
                return vra.a((ajlu) this.c.G.b());
            case 88:
                ahkn ahknVar35 = this.a;
                Context context32 = (Context) ahknVar35.t.b();
                ahoi ahoiVar54 = this.c;
                ConversationId conversationId14 = (ConversationId) ahoiVar54.j.b();
                ahax ahaxVar3 = (ahax) ahoiVar54.n.b();
                dalj daljVar = (dalj) ahoiVar54.ad.b();
                ajmh ajmhVar = (ajmh) ahoiVar54.Q.b();
                fdjx fdjxVar18 = (fdjx) ahoiVar54.e.b();
                zqm zqmVar = (zqm) ahoiVar54.aK.b();
                cssw csswVar2 = (cssw) ahknVar35.kL.b();
                ahnh ahnhVar15 = ahknVar35.a;
                return new vhr(context32, conversationId14, ahaxVar3, daljVar, ajmhVar, fdjxVar18, zqmVar, csswVar2, (appk) ahnhVar15.HQ.b(), (cqdr) ahknVar35.lk.b(), ahoiVar54.bn(), (fduj) ahoiVar54.aA.b(), (arvu) ahnhVar15.tA.b(), (yrn) ahoiVar54.aP.b());
            case 89:
                return new yrn((yjr) this.c.aO.b());
            case 90:
                ahoi ahoiVar55 = this.c;
                return new yjr((ykc) ahoiVar55.aN.b(), (fdjx) ahoiVar55.e.b(), (fcyh) this.a.bM.b(), Optional.of(ahoiVar55.bp()));
            case 91:
                ahnh ahnhVar16 = this.a.a;
                return new ykc((ains) ahnhVar16.pQ.b(), (fdjx) ahnhVar16.m.b());
            case 92:
                ahkn ahknVar36 = this.a;
                Context context33 = (Context) ahknVar36.t.b();
                ahoi ahoiVar56 = this.c;
                aaft aaftVar = (aaft) ahoiVar56.q.b();
                afzc afzcVar7 = (afzc) this.d.l.b();
                ahnh ahnhVar17 = ahknVar36.a;
                return new xtq(context33, aaftVar, afzcVar7, (cqbm) ahnhVar17.sX.b(), (fdjx) ahoiVar56.e.b(), ahnhVar17.c);
            case 93:
                Context context34 = (Context) this.a.t.b();
                ahoi ahoiVar57 = this.c;
                return new vjg(context34, (ConversationId) ahoiVar57.j.b(), (zqm) ahoiVar57.aK.b(), (afzc) this.d.l.b(), Optional.of((aaef) ahoiVar57.aS.b()), (ahax) ahoiVar57.n.b(), ahoiVar57.aT);
            case 94:
                Context context35 = (Context) this.a.t.b();
                ahoi ahoiVar58 = this.c;
                return new aaeq(context35, ahoiVar58.ay(), (afzc) this.d.l.b(), (fdjx) ahoiVar58.e.b());
            case 95:
                ahoi ahoiVar59 = this.c;
                Optional optionalOf5 = Optional.of((aaef) ahoiVar59.aS.b());
                ahjr ahjrVar9 = this.b;
                ahkn ahknVar37 = this.a;
                return new vjl(optionalOf5, ahoiVar59.n, ahjrVar9.kf, ahknVar37.a.pJ, (efwo) ahjrVar9.b.b(), (fdjx) ahoiVar59.e.b(), (fcyh) ahknVar37.cz.b());
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                ahkn ahknVar38 = this.a;
                Context context36 = (Context) ahknVar38.t.b();
                ahoi ahoiVar60 = this.c;
                return new vij(context36, (fdjx) ahoiVar60.e.b(), (zqm) ahoiVar60.aK.b(), (ahax) ahoiVar60.n.b(), ahoiVar60.aV, (apso) ahknVar38.a.QW.b(), (afzc) this.d.l.b(), (ConversationId) ahoiVar60.j.b());
            case 97:
                return Optional.of(this.c.k());
            case 98:
                ahkn ahknVar39 = this.a;
                Context context37 = (Context) ahknVar39.t.b();
                fcyh fcyhVar5 = (fcyh) ahknVar39.bM.b();
                ahoi ahoiVar61 = this.c;
                return new www(context37, fcyhVar5, (fdjx) ahoiVar61.e.b(), (ajmh) ahoiVar61.Q.b(), (wre) ahoiVar61.z.b(), (zwf) ahknVar39.b.ld.b(), ahoiVar61.v(), ahknVar39.a.tB);
            case 99:
                ahoi ahoiVar62 = this.c;
                return new zwe((fduj) ahoiVar62.aA.b(), (fdpl) ahoiVar62.m.b(), (fdpl) ahoiVar62.r.b(), ahoiVar62.bn(), this.a.b.Z());
            default:
                throw new AssertionError(i);
        }
        return cvzpVar;
    }

    private final Object c() {
        int i = this.e;
        switch (i) {
            case VCardConstants.DEFAULT_PREF /* 100 */:
                ahkn ahknVar = this.a;
                Context context = (Context) ahknVar.t.b();
                ahoi ahoiVar = this.c;
                return new vmg(context, (fdjx) ahoiVar.e.b(), (zqm) ahoiVar.aK.b(), (crma) ahknVar.da.b(), (srw) ahknVar.a.aaX.b(), (afzc) this.d.l.b());
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                ahkn ahknVar2 = this.a;
                Context context2 = (Context) ahknVar2.t.b();
                ahoi ahoiVar2 = this.c;
                return new vmv(context2, (zqm) ahoiVar2.aK.b(), (afzc) this.d.l.b(), ahoiVar2.aV, Optional.of((aaef) ahoiVar2.aS.b()), (ahax) ahoiVar2.n.b(), ahknVar2.b.X(), (bxle) ahknVar2.eJ.b(), ahoiVar2.aT);
            case 102:
                Context context3 = (Context) this.a.t.b();
                ahoi ahoiVar3 = this.c;
                return new xci(context3, (fdjx) ahoiVar3.e.b(), (wre) ahoiVar3.z.b(), (ahax) ahoiVar3.n.b());
            case 103:
                return vqr.a((fdpl) this.c.r.b());
            case 104:
                ahoi ahoiVar4 = this.c;
                return new admf((fdpl) ahoiVar4.m.b(), (fdjx) ahoiVar4.e.b());
            case 105:
                return Optional.of(true);
            case 106:
                ahoi ahoiVar5 = this.c;
                fdjx fdjxVar = (fdjx) ahoiVar5.e.b();
                OpenConversation2Arguments openConversation2Arguments = (OpenConversation2Arguments) ahoiVar5.i.b();
                ahhh ahhhVar = this.d;
                afzc afzcVar = (afzc) ahhhVar.l.b();
                ahkn ahknVar3 = this.a;
                ahnh ahnhVar = ahknVar3.a;
                cssf cssfVar = (cssf) ahnhVar.uo.b();
                zqm zqmVar = (zqm) ahoiVar5.aK.b();
                fdpl fdplVar = (fdpl) ahoiVar5.m.b();
                fdpl fdplVar2 = (fdpl) ahoiVar5.r.b();
                ajlu ajluVar = (ajlu) ahoiVar5.G.b();
                ahng ahngVar = ahknVar3.b;
                return new aajt(fdjxVar, openConversation2Arguments, afzcVar, cssfVar, zqmVar, fdplVar, fdplVar2, ajluVar, ahngVar.lf, ahhhVar.x, (aajz) ahoiVar5.dk.b(), (ygn) ahoiVar5.bf.b(), (admf) ahoiVar5.bd.b(), ahngVar.lL, ahnhVar.yw, ahngVar.lM);
            case 107:
                ahoi ahoiVar6 = this.c;
                return new aake((fdjx) ahoiVar6.e.b(), (aakh) ahoiVar6.bh.b(), (zqi) ahoiVar6.dj.b(), this.a.b.lf);
            case 108:
                Context context4 = (Context) this.a.t.b();
                ahoi ahoiVar7 = this.c;
                return new aakh(context4, (fdjx) ahoiVar7.e.b(), ahoiVar7.Q, (ygn) ahoiVar7.bf.b(), (aako) ahoiVar7.bg.b());
            case 109:
                return new ygn();
            case 110:
                ahkn ahknVar4 = this.a;
                return new aako((fdjx) ahknVar4.a.oQ.b(), (ecjh) ahknVar4.b.lg.b(), (cogw) ahknVar4.cD.b());
            case 111:
                ahkn ahknVar5 = this.a;
                ahoi ahoiVar8 = this.c;
                return new zqi(ahknVar5.gD, ahoiVar8.bV, (apqo) ahknVar5.b.lp.b(), (diii) ahoiVar8.di.b());
            case 112:
                ahkn ahknVar6 = this.a;
                ahnh ahnhVar2 = ahknVar6.a;
                fdjx fdjxVar2 = (fdjx) ahnhVar2.m.b();
                ahoi ahoiVar9 = this.c;
                fdjx fdjxVar3 = (fdjx) ahoiVar9.e.b();
                dnih dnihVar = (dnih) ahoiVar9.bL.b();
                dnhq dnhqVar = (dnhq) ahoiVar9.bS.b();
                Optional optional = (Optional) ahoiVar9.de.b();
                xlm xlmVar = (xlm) ahoiVar9.dg.b();
                xfx xfxVar = (xfx) ahoiVar9.dh.b();
                lwn lwnVar = (lwn) ahoiVar9.h.b();
                eyik eyikVar = ahnhVar2.Bq;
                ahng ahngVar2 = ahknVar6.b;
                eyik eyikVar2 = ahngVar2.lI;
                eyik eyikVar3 = ahngVar2.lH;
                Optional optionalOf = Optional.of((dnuy) ahnhVar2.aiT.b());
                ccyf ccyfVarHp = ahnhVar2.hp();
                boolean zDh = ahngVar2.dh();
                aisp aispVar = (aisp) ahnhVar2.zF.b();
                eyik eyikVar4 = ahnhVar2.ws;
                eyik eyikVar5 = ahnhVar2.tb;
                Context context5 = (Context) ahknVar6.t.b();
                aaft aaftVar = (aaft) ahoiVar9.q.b();
                ConversationId conversationId = (ConversationId) ahoiVar9.j.b();
                aqbh aqbhVar = (aqbh) ahnhVar2.qa.b();
                eyik eyikVar6 = ahngVar2.lz;
                eyik eyikVar7 = ahngVar2.jl;
                ahnz ahnzVar = (ahnz) ahoiVar9.cx.b();
                eyik eyikVar8 = ahngVar2.je;
                eyik eyikVar9 = ahngVar2.lK;
                eyik eyikVar10 = ahnhVar2.DY;
                eyik eyikVar11 = ahnhVar2.DZ;
                eyik eyikVar12 = ahnhVar2.RH;
                fdpl fdplVarBn = ahoiVar9.bn();
                fduj fdujVarBo = ahoiVar9.bo();
                cogw cogwVar = (cogw) ahknVar6.cD.b();
                vut vutVarK = ahngVar2.k();
                aqkd aqkdVarAl = ahngVar2.al();
                arjw arjwVarAD = ahngVar2.aD();
                asgk asgkVar = (asgk) ahngVar2.hj.b();
                return new xfi(fdjxVar2, fdjxVar3, dnihVar, dnhqVar, ahoiVar9.cN, ahoiVar9.cQ, ahoiVar9.cG, optional, xlmVar, xfxVar, ahoiVar9.cL, lwnVar, eyikVar, eyikVar2, eyikVar3, optionalOf, ccyfVarHp, zDh, aispVar, eyikVar4, eyikVar5, context5, aaftVar, conversationId, aqbhVar, eyikVar6, eyikVar7, ahoiVar9.bX, ahnzVar, eyikVar8, eyikVar9, eyikVar10, eyikVar11, fdplVarBn, eyikVar12, fdujVarBo, cogwVar, vutVarK, aqkdVarAl, arjwVarAD, asgkVar);
            case 113:
                return xcj.a((xdz) this.c.bR.b());
            case 114:
                ahkn ahknVar7 = this.a;
                Context context6 = (Context) ahknVar7.t.b();
                ahoi ahoiVar10 = this.c;
                fdjx fdjxVar4 = (fdjx) ahoiVar10.e.b();
                ahnh ahnhVar3 = ahknVar7.a;
                fdjx fdjxVar5 = (fdjx) ahnhVar3.m.b();
                wre wreVar = (wre) ahoiVar10.z.b();
                eyik eyikVar13 = ahoiVar10.bM;
                xgt xgtVarF = ahoiVar10.F();
                Optional optional2 = (Optional) eyikVar13.b();
                fduj fdujVar = (fduj) ahoiVar10.aA.b();
                vtx vtxVarM = ahoiVar10.m();
                aisp aispVar2 = (aisp) ahnhVar3.zF.b();
                ahng ahngVar3 = ahknVar7.b;
                return new xdz(context6, fdjxVar4, fdjxVar5, wreVar, xgtVarF, ahoiVar10.G, optional2, fdujVar, vtxVarM, aispVar2, ahngVar3.ad(), ahngVar3.ae(), (ardn) ahnhVar3.yI.b(), ahoiVar10.bh());
            case 115:
                return wkp.a((wiq) this.c.bJ.b());
            case 116:
                ahkn ahknVar8 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar8.bM.b();
                ahnh ahnhVar4 = ahknVar8.a;
                fdjx fdjxVar6 = (fdjx) ahnhVar4.m.b();
                ahoi ahoiVar11 = this.c;
                fdjx fdjxVar7 = (fdjx) ahoiVar11.e.b();
                wre wreVar2 = (wre) ahoiVar11.z.b();
                eyik eyikVar14 = ahoiVar11.bu;
                wmp wmpVarV = ahoiVar11.v();
                wli wliVarBr = ahoi.br();
                wjc wjcVar = (wjc) eyikVar14.b();
                fduj fdujVar2 = (fduj) ahoiVar11.aA.b();
                ahng ahngVar4 = ahknVar8.b;
                return new wiq(fcyhVar, fdjxVar6, fdjxVar7, wreVar2, wmpVarV, wliVarBr, wjcVar, fdujVar2, ahngVar4.m(), ahoiVar11.q(), ahoiVar11.D(), ahoiVar11.bH, ahngVar4.lo, ahoiVar11.r(), ahngVar4.aa(), ahnhVar4.tB, cohb.a(), (woh) ahoiVar11.bo.b(), (wkt) ahoiVar11.bI.b(), ahngVar4.jl, (dlvl) ahoiVar11.bj.b(), (vuc) ahngVar4.kX.b(), ahoiVar11.bt);
            case 117:
                ahkn ahknVar9 = this.a;
                fcyh fcyhVar2 = (fcyh) ahknVar9.bM.b();
                ahoi ahoiVar12 = this.c;
                return new wjc(fcyhVar2, (fdjx) ahoiVar12.e.b(), (wre) ahoiVar12.z.b(), ahoiVar12.w(), (woh) ahoiVar12.bo.b(), ahoiVar12.x(), (aptx) ahknVar9.a.Dw.b(), ahoiVar12.bt);
            case 118:
                dlvl dlvlVar = (dlvl) this.c.bj.b();
                ahkn ahknVar10 = this.a;
                eony eonyVar = (eony) ahknVar10.lp.b();
                ahng ahngVar5 = ahknVar10.b;
                eygg eyggVarA = eyie.a(ahngVar5.jZ);
                ahjr ahjrVar = this.b;
                return new dlus(dlvlVar, eonyVar, eyggVarA, eyie.a(ahjrVar.pT), ahjrVar.pR, ahngVar5.kd);
            case 119:
                return new dlvl((Context) this.a.t.b(), (fdjx) this.c.bi.b());
            case 120:
                return dpbp.a((fcyh) this.a.cA.b());
            case 121:
                return new wpe((fduj) this.c.aA.b(), wah.a(), this.a.b.o());
            case 122:
                return new wox();
            case 123:
                ahoi ahoiVar13 = this.c;
                return wos.a((vwo) ahoiVar13.A.b(), ahoiVar13.bn, this.a.b.lh);
            case 124:
                ahkn ahknVar11 = this.a;
                ahnh ahnhVar5 = ahknVar11.a;
                fdjx fdjxVar8 = (fdjx) ahnhVar5.oQ.b();
                fdjx fdjxVar9 = (fdjx) ahnhVar5.m.b();
                fcyh fcyhVar3 = (fcyh) ahknVar11.cz.b();
                bxno bxnoVar = (bxno) ahnhVar5.NR.b();
                ahoi ahoiVar14 = this.c;
                fduj fdujVar3 = (fduj) ahoiVar14.aA.b();
                Conversation conversation = (Conversation) ahoiVar14.l.b();
                doht dohtVarA = wah.a();
                aptx aptxVar = (aptx) ahnhVar5.Dw.b();
                amvu amvuVarV = this.b.V();
                ahng ahngVar6 = ahknVar11.b;
                return new wor(fdjxVar8, fdjxVar9, fcyhVar3, bxnoVar, fdujVar3, conversation, dohtVarA, aptxVar, amvuVarV, ahngVar6.l(), ahngVar6.ah(), (aqzg) ahnhVar5.Os.b(), (ains) ahnhVar5.pb.b());
            case 125:
                ahkn ahknVar12 = this.a;
                fdjx fdjxVar10 = (fdjx) ahknVar12.a.m.b();
                ahoi ahoiVar15 = this.c;
                vul vulVar = (vul) ahoiVar15.bp.b();
                eygg eyggVarA2 = eyie.a(ahoiVar15.br);
                ahng ahngVar7 = ahknVar12.b;
                return new vuh(fdjxVar10, vulVar, eyggVarA2, eyie.a(ahngVar7.kX), ahngVar7.ag(), cohb.a(), eyie.a(ahoiVar15.m), eyie.a(ahoiVar15.bs));
            case 126:
                return new vul();
            case 127:
                ahkn ahknVar13 = this.a;
                fdjx fdjxVar11 = (fdjx) ahknVar13.a.m.b();
                fcyh fcyhVar4 = (fcyh) ahknVar13.bM.b();
                vtg vtgVar = new vtg();
                ahoi ahoiVar16 = this.c;
                return new vtm(fdjxVar11, fcyhVar4, vtgVar, ahoiVar16.aN(), ahoiVar16.bq);
            case 128:
                return cqte.a(this.a.a.qK);
            case 129:
                ahkn ahknVar14 = this.a;
                ahnh ahnhVar6 = ahknVar14.a;
                return new airv((fdjx) ahnhVar6.m.b(), ahnhVar6.zs, new aiqn(), (Executor) ahknVar14.p.b());
            case 130:
                return xaz.a((xay) this.c.bG.b());
            case 131:
                return new ahny(this);
            case 132:
                ahnh ahnhVar7 = this.a.a;
                return new zue((cmxn) ahnhVar7.xO.b(), (ajmh) this.c.Q.b(), (aisp) ahnhVar7.zF.b());
            case 133:
                return vqc.a((Conversation) this.c.l.b());
            case 134:
                ahoi ahoiVar17 = this.c;
                eyik eyikVar15 = ahoiVar17.by;
                return ekhx.v(ahoiVar17.aq(), ahoiVar17.aD(), (vwm) eyikVar15.b(), ahoiVar17.h(), (vwm) ahoiVar17.bA.b(), (vwm) ahoiVar17.bB.b(), ahoiVar17.C());
            case 135:
                return new agxz(this.a.b.kH);
            case 136:
                return new yim();
            case 137:
                return new vai(this.a.a.rF);
            case 138:
                return new ynm((fdjx) this.c.e.b());
            case 139:
                ahoi ahoiVar18 = this.c;
                return new zqh((ajmh) ahoiVar18.Q.b(), (fdjx) ahoiVar18.e.b());
            case 140:
                return new ekph(this.c.ar());
            case 141:
                return new zon();
            case 142:
                return Boolean.valueOf(vrb.a((OpenConversation2Arguments) this.c.i.b()));
            case 143:
                return new wkt();
            case 144:
                return Optional.of((val) this.d.c.b());
            case 145:
                return new ConcurrentHashMap();
            case 146:
                return new wvy(this.c.z(), (ains) this.a.a.pQ.b());
            case 147:
                return new wvh();
            case 148:
                ahoi ahoiVar19 = this.c;
                return new wvc((fdjx) ahoiVar19.e.b(), ahoiVar19.A(), (fdpl) ahoiVar19.r.b(), (fdpl) ahoiVar19.m.b(), this.a.a.abN);
            case 149:
                return wkq.a((wiq) this.c.bJ.b());
            case 150:
                ahoi ahoiVar20 = this.c;
                fdjx fdjxVar12 = (fdjx) ahoiVar20.e.b();
                ahkn ahknVar15 = this.a;
                return new xhv(fdjxVar12, (Context) ahknVar15.t.b(), (Map) ahoiVar20.cL.b(), (ahog) ahoiVar20.cM.b(), ahknVar15.a.Bq, ahknVar15.b.lG, ahoiVar20.H(), (cogw) ahknVar15.cD.b());
            case 151:
                ahoi ahoiVar21 = this.c;
                ekgi ekgiVarH = ekgp.h(9);
                ekgiVarH.i(xgx.class, ahoiVar21.I());
                ekgiVarH.i(xgy.class, ahoiVar21.J());
                ekgiVarH.i(xgz.class, ahoiVar21.K());
                ekgiVarH.i(xha.class, ahoiVar21.L());
                ekgiVarH.i(xhc.class, ahoiVar21.M());
                ekgiVarH.i(xhd.class, ahoiVar21.N());
                ekgiVarH.i(xhe.class, ahoiVar21.O());
                ekgiVarH.i(xhf.class, ahoiVar21.P());
                ekgiVarH.i(xhg.class, ahoiVar21.Q());
                return ekgiVarH.h();
            case 152:
                egxv egxvVar = (egxv) this.b.am.b();
                ahkn ahknVar16 = this.a;
                return new cywg(egxvVar, (Executor) ahknVar16.y.b(), (cden) ahknVar16.a.qN.b());
            case 153:
                return new cywh((Context) this.a.t.b());
            case 154:
                return new dpoa((fdjx) this.c.e.b());
            case 155:
                return new ahnz(this);
            case 156:
                ahoi ahoiVar22 = this.c;
                eyik eyikVar16 = ahoiVar22.cl;
                wbb wbbVarO = ahoiVar22.o();
                ahob ahobVar = (ahob) eyikVar16.b();
                dnhq dnhqVar2 = (dnhq) ahoiVar22.bS.b();
                wre wreVar3 = (wre) ahoiVar22.z.b();
                ahkn ahknVar17 = this.a;
                dptk dptkVarBe = ahoiVar22.be();
                wcf wcfVarP = ahoiVar22.p();
                was wasVarN = ahoiVar22.n();
                ahng ahngVar8 = ahknVar17.b;
                return new wek(wbbVarO, ahobVar, dnhqVar2, wreVar3, dptkVarBe, wcfVarP, wasVarN, ahngVar8.lv, ahoiVar22.s(), ahngVar8.at(), ahngVar8.au(), eyie.a(ahoiVar22.bt));
            case 157:
                ahoi ahoiVar23 = this.c;
                return xaf.a((xad) ahoiVar23.cf.b(), ahoiVar23.cg);
            case 158:
                return new ahoa(this);
            case 159:
                ahkn ahknVar18 = this.a;
                fdjx fdjxVar13 = (fdjx) ahknVar18.a.m.b();
                ahoi ahoiVar24 = this.c;
                return new wqm(fdjxVar13, (ConversationId) ahoiVar24.j.b(), (fdpl) ahoiVar24.m.b(), (ajln) this.b.au.b(), ahknVar18.b.l(), ahoiVar24.y(), (wsf) ahoiVar24.bY.b(), (wre) ahoiVar24.z.b(), ahoiVar24.l(), ahoiVar24.ca);
            case 160:
                ahoi ahoiVar25 = this.c;
                return new wsf((fdjx) ahoiVar25.e.b(), (fcyh) this.a.bM.b(), (wre) ahoiVar25.z.b(), ahoiVar25.y(), wai.a());
            case 161:
                ahoi ahoiVar26 = this.c;
                return ekhx.t((wqe) ahoiVar26.bZ.b(), (wqe) ahoiVar26.bR.b(), ahoiVar26.G(), (wqe) ahoiVar26.bb.b());
            case 162:
                ahkn ahknVar19 = this.a;
                Context context7 = (Context) ahknVar19.t.b();
                ahoi ahoiVar27 = this.c;
                return new wyf(context7, (fdjx) ahoiVar27.e.b(), (wre) ahoiVar27.z.b(), (aihi) ahknVar19.b.kP.b(), ahoiVar27.B(), (ahax) ahoiVar27.n.b(), (afzc) this.d.l.b(), (cogw) ahknVar19.cD.b(), ahoiVar27.v(), (crma) ahknVar19.da.b(), (aaft) ahoiVar27.q.b(), ahknVar19.a.tB);
            case 163:
                ahoi ahoiVar28 = this.c;
                fdjx fdjxVar14 = (fdjx) ahoiVar28.e.b();
                fdpl fdplVar3 = (fdpl) ahoiVar28.H.b();
                fdpl fdplVar4 = (fdpl) ahoiVar28.r.b();
                ahkn ahknVar20 = this.a;
                fdpl fdplVarBn2 = ahoiVar28.bn();
                fcyh fcyhVar5 = (fcyh) ahknVar20.cA.b();
                ahjr ahjrVar2 = this.b;
                eyik eyikVar17 = ahoiVar28.cd;
                chlz chlzVarEq = ahjrVar2.eq();
                yir yirVar = (yir) eyikVar17.b();
                ahhh ahhhVar2 = this.d;
                return new aher(fdjxVar14, fdplVar3, fdplVar4, fdplVarBn2, fcyhVar5, chlzVarEq, yirVar, (cphz) ahhhVar2.x.b(), (chna) ahknVar20.b.I.b(), (xvf) ahhhVar2.n.b(), (wre) ahoiVar28.z.b());
            case 164:
                return new yir();
            case 165:
                return xba.a((xay) this.c.bG.b());
            case 166:
                ahoi ahoiVar29 = this.c;
                return new wgt((xbl) ahoiVar29.bb.b(), Optional.of((wwe) ahoiVar29.aX.b()), Optional.of((wtm) ahoiVar29.ci.b()), Optional.of((wxl) ahoiVar29.cc.b()));
            case 167:
                Context context8 = (Context) this.a.t.b();
                ahoi ahoiVar30 = this.c;
                return new wtx(context8, (fdjx) ahoiVar30.e.b(), (ajmh) ahoiVar30.Q.b(), (wre) ahoiVar30.z.b(), ahoiVar30.at());
            case 168:
                return new ahob(this);
            case 169:
                return Optional.of(this.a.b.j());
            case 170:
                ahkn ahknVar21 = this.a;
                return dpul.a((Context) ahknVar21.t.b(), Optional.of(ahknVar21.b.cf()));
            case 171:
                return new ahoc(this);
            case 172:
                return new dpzv((fdjx) this.a.a.m.b());
            case 173:
                ahoi ahoiVar31 = this.c;
                eyik eyikVar18 = ahoiVar31.cs;
                ujz ujzVarD = ahoiVar31.d();
                dmmc dmmcVar = (dmmc) eyikVar18.b();
                ahkn ahknVar22 = this.a;
                ahng ahngVar9 = ahknVar22.b;
                return ujs.a(ujzVarD, dmmcVar, ahngVar9.lx, ahknVar22.cE, ahngVar9.ly);
            case 174:
                return new ahod(this);
            case 175:
                return new dmrc((chx) this.c.co.b());
            case 176:
                return dmnh.a((Context) this.a.t.b());
            case 177:
                return new ahoe(this);
            case 178:
                return ujp.a((aqgw) this.a.b.jl.b());
            case 179:
                return new ahof(this);
            case 180:
                ahkn ahknVar23 = this.a;
                Context context9 = (Context) ahknVar23.t.b();
                ahoi ahoiVar32 = this.c;
                fdjx fdjxVar15 = (fdjx) ahoiVar32.e.b();
                ahhh ahhhVar3 = this.d;
                ahjr ahjrVar3 = this.b;
                eyik eyikVar19 = ahoiVar32.j;
                eyik eyikVar20 = ahknVar23.gF;
                eyik eyikVar21 = ahknVar23.aT;
                eigp eigpVar = (eigp) ahjrVar3.ac.b();
                return new uwl(context9, fdjxVar15, ahoiVar32.bL, ahoiVar32.bV, ahoiVar32.cB, ahoiVar32.cC, ahoiVar32.cE, ahoiVar32.cF, eyikVar19, ahoiVar32.bM, eyikVar20, eyikVar21, ahhhVar3.d, ahjrVar3.oK, eigpVar);
            case 181:
                return Optional.of(this.c.g());
            case 182:
                return new uzn((Context) this.a.t.b());
            case 183:
                return Optional.of((ztw) this.a.b.iL.b());
            case 184:
                return Optional.of(this.c.e());
            case 185:
                return Optional.of((uzp) this.d.g.b());
            case 186:
                return Optional.of(this.c.i());
            case 187:
                ahkn ahknVar24 = this.a;
                ahnh ahnhVar8 = ahknVar24.a;
                return new vbv((fdjx) ahnhVar8.m.b(), (fcyh) ahknVar24.bM.b(), (fcyh) ahknVar24.cz.b(), (cmfo) ahnhVar8.ajS.b(), (egyt) ahknVar24.dj.b());
            case 188:
                return Optional.of(this.c.aZ());
            case 189:
                return Optional.of((xgm) this.c.cJ.b());
            case 190:
                ahoi ahoiVar33 = this.c;
                fdjx fdjxVar16 = (fdjx) ahoiVar33.e.b();
                ahkn ahknVar25 = this.a;
                return new xgm(fdjxVar16, (fcyh) ahknVar25.bM.b(), (Context) ahknVar25.t.b(), (dmdo) ahoiVar33.cI.b(), (ahax) ahoiVar33.n.b(), ahoiVar33.bb(), ahknVar25.a.ws, (crma) ahknVar25.da.b(), (afzc) this.d.l.b(), (zud) ahknVar25.b.jf.b());
            case 191:
                ahkn ahknVar26 = this.a;
                Context context10 = (Context) ahknVar26.t.b();
                ahoi ahoiVar34 = this.c;
                return new dmdo(context10, ahoiVar34.cH, (fdjx) ahoiVar34.e.b(), (fdjx) ahknVar26.a.oQ.b(), ahoiVar34.cn, (dnhq) ahoiVar34.bS.b(), ahoiVar34.bb(), Optional.of(ahoiVar34.E()), ahknVar26.b.ch());
            case 192:
                ahoi ahoiVar35 = this.c;
                eyik eyikVar22 = ahoiVar35.cs;
                ujz ujzVarD2 = ahoiVar35.d();
                dmmc dmmcVar2 = (dmmc) eyikVar22.b();
                ahng ahngVar10 = this.a.b;
                return xga.a(ujzVarD2, dmmcVar2, ahngVar10.lB, ahngVar10.lC, ahngVar10.ly);
            case 193:
                return new ahog(this);
            case 194:
                ahoi ahoiVar36 = this.c;
                aomc aomcVar = (aomc) ahoiVar36.cO.b();
                ahkn ahknVar27 = this.a;
                ahnh ahnhVar9 = ahknVar27.a;
                fdjx fdjxVar17 = (fdjx) ahnhVar9.oQ.b();
                fdjx fdjxVar18 = (fdjx) ahoiVar36.e.b();
                Context context11 = (Context) ahknVar27.t.b();
                egqi egqiVar = (egqi) ahknVar27.ll.b();
                aomd aomdVar = (aomd) ahoiVar36.cP.b();
                dakl daklVar = (dakl) ahnhVar9.BK.b();
                fduj fdujVar4 = (fduj) ahoiVar36.aA.b();
                ahng ahngVar11 = ahknVar27.b;
                return new xmd(aomcVar, fdjxVar17, fdjxVar18, context11, egqiVar, aomdVar, daklVar, fdujVar4, ahoiVar36.bV, ahngVar11.Q(), ahngVar11.lH, ahoiVar36.cZ, (airc) ahoiVar36.da.b(), (airh) ahoiVar36.db.b(), Optional.of((dlzf) ahoiVar36.cW.b()), (cult) ahoiVar36.dd.b());
            case 195:
                ahkn ahknVar28 = this.a;
                return new aomc((Context) ahknVar28.t.b(), (eosd) ahknVar28.p.b(), (eosc) ahknVar28.y.b(), new aolx(), (ctce) ahknVar28.a.yp.b());
            case 196:
                return new aomd((fdjx) this.a.a.oQ.b());
            case 197:
                ahoi ahoiVar37 = this.c;
                return xmf.a((dqey) ahoiVar37.cY.b(), (fdjx) ahoiVar37.e.b(), (cqwi) this.a.b.kR.b());
            case 198:
                return new ahnt(this);
            case 199:
                ahoi ahoiVar38 = this.c;
                return xme.a(ahoiVar38.R(), ahoiVar38.d(), this.a.a.HK, (xmd) ahoiVar38.cQ.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        int i = this.e;
        switch (i) {
            case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
                return new ahnu(this);
            case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                return new dlxh(this.b.jZ, this.a.t);
            case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                return new dlwq(this.b.jZ, this.a.t);
            case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                return Optional.of(new dlxp(true));
            case 204:
                ahjr ahjrVar = this.b;
                ahkn ahknVar = this.a;
                return new dlze(ahjrVar.ka, ahknVar.a.m, ahknVar.b.lw, this.c.cW);
            case 205:
                return new xlo();
            case 206:
                ahkn ahknVar2 = this.a;
                return new airc(ahknVar2.a.zs, new aiqn(), (Executor) ahknVar2.p.b());
            case 207:
                ahkn ahknVar3 = this.a;
                return new airh(ahknVar3.a.zs, new aiqn(), (Executor) ahknVar3.p.b());
            case 208:
                ahoi ahoiVar = this.c;
                return new cult((fdjx) ahoiVar.e.b(), (Optional) ahoiVar.dc.b());
            case 209:
                return Optional.of(this.a.b.bM());
            case 210:
                return Optional.of((dofb) this.a.b.hy.b());
            case 211:
                ahoi ahoiVar2 = this.c;
                fdjx fdjxVar = (fdjx) ahoiVar2.e.b();
                ahkn ahknVar4 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar4.cA.b();
                xkw xkwVarS = ahoiVar2.S();
                AudioManager audioManager = (AudioManager) ahknVar4.ok.b();
                crma crmaVar = (crma) ahknVar4.da.b();
                afzc afzcVar = (afzc) this.d.l.b();
                yil yilVar = (yil) ahoiVar2.df.b();
                eyik eyikVar = ahknVar4.b.lI;
                ahnh ahnhVar = ahknVar4.a;
                eyik eyikVar2 = ahnhVar.tb;
                eyik eyikVar3 = ahnhVar.RH;
                fdpl fdplVarBn = ahoiVar2.bn();
                fduj fdujVarBo = ahoiVar2.bo();
                return new xlm(fdjxVar, fcyhVar, ahoiVar2.cQ, xkwVarS, audioManager, crmaVar, afzcVar, yilVar, eyikVar, ahoiVar2.cZ, eyikVar2, fdplVarBn, eyikVar3, fdujVarBo);
            case 212:
                return new yil();
            case 213:
                ahkn ahknVar5 = this.a;
                Context context = (Context) ahknVar5.t.b();
                ahoi ahoiVar3 = this.c;
                fdjx fdjxVar2 = (fdjx) ahoiVar3.e.b();
                fdpl fdplVar = (fdpl) ahoiVar3.m.b();
                ahnh ahnhVar2 = ahknVar5.a;
                eyik eyikVar4 = ahnhVar2.Bq;
                eyik eyikVar5 = ahnhVar2.ws;
                ahng ahngVar = ahknVar5.b;
                eyik eyikVar6 = ahngVar.lJ;
                wre wreVar = (wre) ahoiVar3.z.b();
                eyik eyikVar7 = ahngVar.lz;
                eyik eyikVar8 = ahngVar.jl;
                eyik eyikVar9 = ahnhVar2.tb;
                eyik eyikVar10 = ahnhVar2.RH;
                return new xfx(context, fdjxVar2, fdplVar, eyikVar4, ahoiVar3.cK, eyikVar5, eyikVar6, wreVar, eyikVar7, eyikVar8, eyikVar9, ahoiVar3.bn(), eyikVar10, ahoiVar3.bo());
            case 214:
                return new diii();
            case 215:
                return new xux();
            case 216:
                ahoi ahoiVar4 = this.c;
                fdjx fdjxVar3 = (fdjx) ahoiVar4.e.b();
                ConversationId conversationId = (ConversationId) ahoiVar4.j.b();
                ahkn ahknVar6 = this.a;
                return new aafo(fdjxVar3, conversationId, ahknVar6.b.lb, ahoiVar4.bg(), ahoiVar4.az(), (ajfx) ahknVar6.ij.b());
            case 217:
                return new cvpt((fcyh) this.a.bM.b(), (fdjx) this.c.e.b());
            case 218:
                ahkn ahknVar7 = this.a;
                Context context2 = (Context) ahknVar7.t.b();
                fcyh fcyhVar2 = (fcyh) ahknVar7.cz.b();
                ahoi ahoiVar5 = this.c;
                fdjx fdjxVar4 = (fdjx) ahoiVar5.e.b();
                ConversationId conversationId2 = (ConversationId) ahoiVar5.j.b();
                ahjr ahjrVar2 = this.b;
                return new tfq(context2, fcyhVar2, fdjxVar4, conversationId2, ahjrVar2.l(), (aglr) ahjrVar2.ee.b(), (afzc) this.d.l.b(), (tfx) ahoiVar5.dq.b());
            case 219:
                ahkn ahknVar8 = this.a;
                cogw cogwVar = (cogw) ahknVar8.cD.b();
                teu teuVar = (teu) this.d.A.b();
                ahjr ahjrVar3 = this.b;
                anty antyVar = (anty) ahjrVar3.ap.b();
                eyik eyikVar11 = ahknVar8.a.Wp;
                ahoi ahoiVar6 = this.c;
                return new tfx(cogwVar, teuVar, antyVar, eyikVar11, ahjrVar3.qa, (fdpl) ahoiVar6.dp.b(), (ConversationId) ahoiVar6.j.b());
            case 220:
                ahoi ahoiVar7 = this.c;
                return vqd.a((Conversation) ahoiVar7.l.b(), (fdjx) ahoiVar7.e.b());
            case 221:
                ahkn ahknVar9 = this.a;
                Context context3 = (Context) ahknVar9.t.b();
                fcyh fcyhVar3 = (fcyh) ahknVar9.cz.b();
                ahoi ahoiVar8 = this.c;
                return new cvta(context3, fcyhVar3, (fdjx) ahoiVar8.e.b(), (ConversationId) ahoiVar8.j.b(), ahoiVar8.aV(), (aaft) ahoiVar8.q.b());
            case 222:
                ahkn ahknVar10 = this.a;
                Context context4 = (Context) ahknVar10.t.b();
                ahoi ahoiVar9 = this.c;
                return new cvsi(context4, ahoiVar9.dt, ahknVar10.a.GC, ahoiVar9.q, (ConversationId) ahoiVar9.j.b(), (fcyh) ahknVar10.cz.b(), (fdjx) ahoiVar9.e.b());
            case 223:
                fdpl fdplVar2 = (fdpl) this.c.m.b();
                ahkn ahknVar11 = this.a;
                return new cvsn(fdplVar2, ahknVar11.od, (cpgf) this.b.cB.b(), (fdjx) ahknVar11.a.oS.b());
            case 224:
                ahkn ahknVar12 = this.a;
                Context context5 = (Context) ahknVar12.t.b();
                fcyh fcyhVar4 = (fcyh) ahknVar12.cz.b();
                ahoi ahoiVar10 = this.c;
                return new cvrt(context5, fcyhVar4, (fdjx) ahoiVar10.e.b(), (ConversationId) ahoiVar10.j.b(), ahoiVar10.aU(), (tlj) ahoiVar10.ak.b(), (tdu) ahoiVar10.dv.b());
            case 225:
                return new tdu();
            case 226:
                ahkn ahknVar13 = this.a;
                Context context6 = (Context) ahknVar13.t.b();
                fcyh fcyhVar5 = (fcyh) ahknVar13.cz.b();
                ahoi ahoiVar11 = this.c;
                fdjx fdjxVar5 = (fdjx) ahoiVar11.e.b();
                ConversationId conversationId3 = (ConversationId) ahoiVar11.j.b();
                eyik eyikVar12 = this.d.l;
                cvph cvphVarAS = ahoiVar11.aS();
                afzc afzcVar2 = (afzc) eyikVar12.b();
                ahnh ahnhVar3 = ahknVar13.a;
                return new cvou(context6, fcyhVar5, fdjxVar5, conversationId3, cvphVarAS, afzcVar2, (cpga) ahnhVar3.Wj.b(), ahnhVar3.yw, ahoiVar11.dy, (tlj) ahoiVar11.ak.b(), (tdu) ahoiVar11.dv.b());
            case 227:
                return new cvpo(this.b.F, (eosd) this.a.y.b());
            case 228:
                ahkn ahknVar14 = this.a;
                return new cvox(ahknVar14.a.rc, ahknVar14.eO);
            case 229:
                ahkn ahknVar15 = this.a;
                Context context7 = (Context) ahknVar15.t.b();
                fcyh fcyhVar6 = (fcyh) ahknVar15.cz.b();
                ahoi ahoiVar12 = this.c;
                return new cvqd(context7, fcyhVar6, (fdjx) ahoiVar12.e.b(), (afzc) this.d.l.b(), this.b.fR(), (fdpl) ahoiVar12.r.b());
            case 230:
                ahkn ahknVar16 = this.a;
                Context context8 = (Context) ahknVar16.t.b();
                fcyh fcyhVar7 = (fcyh) ahknVar16.cz.b();
                ahoi ahoiVar13 = this.c;
                return new cvqp(context8, fcyhVar7, (fdjx) ahoiVar13.e.b(), (afzc) this.d.l.b(), (crmx) ahknVar16.a.pB.b(), this.b.fS(), (fdpl) ahoiVar13.r.b());
            case 231:
                ahkn ahknVar17 = this.a;
                Context context9 = (Context) ahknVar17.t.b();
                fcyh fcyhVar8 = (fcyh) ahknVar17.cz.b();
                ahoi ahoiVar14 = this.c;
                return new cvqw(context9, fcyhVar8, (fdjx) ahoiVar14.e.b(), ahknVar17.a.Uk, this.b.oU, ahoiVar14.aT());
            case 232:
                ahkn ahknVar18 = this.a;
                Context context10 = (Context) ahknVar18.t.b();
                fcyh fcyhVar9 = (fcyh) ahknVar18.cz.b();
                ahoi ahoiVar15 = this.c;
                return new agjd(context10, fcyhVar9, (fdjx) ahoiVar15.e.b(), (ConversationId) ahoiVar15.j.b(), (fdpl) ahoiVar15.m.b(), (ajln) this.b.au.b(), (arpr) ahknVar18.a.Be.b(), ahoiVar15.ae, (cogw) ahknVar18.cD.b());
            case 233:
                ahkn ahknVar19 = this.a;
                Context context11 = (Context) ahknVar19.t.b();
                ahoi ahoiVar16 = this.c;
                return new aaim(context11, (fdjx) ahoiVar16.e.b(), (aaiu) ahoiVar16.dE.b(), (afzc) this.d.l.b(), ahknVar19.b.lQ);
            case 234:
                ahkn ahknVar20 = this.a;
                fdjx fdjxVar6 = (fdjx) ahknVar20.a.oQ.b();
                ahng ahngVar2 = ahknVar20.b;
                return new aaiu(fdjxVar6, (ecjh) ahngVar2.lN.b(), (cogw) ahknVar20.cD.b(), ahngVar2.lO, ahngVar2.lP);
            case 235:
                Context context12 = (Context) this.a.t.b();
                ahoi ahoiVar17 = this.c;
                return new aaja(context12, (fdjx) ahoiVar17.e.b(), (fdpl) ahoiVar17.dG.b(), (Conversation) ahoiVar17.l.b());
            case 236:
                ahoi ahoiVar18 = this.c;
                return vpy.a((Conversation) ahoiVar18.l.b(), (fdjx) ahoiVar18.e.b());
            case 237:
                return new tck((tdw) this.c.dI.b(), new tek());
            case 238:
                ahoi ahoiVar19 = this.c;
                return new tef((tdu) ahoiVar19.dv.b(), (fdjx) ahoiVar19.e.b());
            case 239:
                return Optional.of((xpn) this.c.dK.b());
            case 240:
                ahoi ahoiVar20 = this.c;
                fdjx fdjxVar7 = (fdjx) ahoiVar20.e.b();
                ConversationId conversationId4 = (ConversationId) ahoiVar20.j.b();
                fdpl fdplVar3 = (fdpl) ahoiVar20.m.b();
                fdpl fdplVar4 = (fdpl) ahoiVar20.r.b();
                fdpl fdplVar5 = (fdpl) ahoiVar20.dp.b();
                ahnh ahnhVar4 = this.a.a;
                return new xpn(fdjxVar7, conversationId4, fdplVar3, fdplVar4, fdplVar5, ahnhVar4.GA, ahnhVar4.BD);
            case 241:
                ahoi ahoiVar21 = this.c;
                fdjx fdjxVar8 = (fdjx) ahoiVar21.e.b();
                ahkn ahknVar21 = this.a;
                Context context13 = (Context) ahknVar21.t.b();
                ajmh ajmhVar = (ajmh) ahoiVar21.Q.b();
                ahnh ahnhVar5 = ahknVar21.a;
                return new yya(fdjxVar8, context13, ajmhVar, (cliy) ahnhVar5.tb.b(), (aqts) ahnhVar5.DY.b(), (aqtr) ahnhVar5.DZ.b(), ahoiVar21.bn(), ahknVar21.b.aE());
            case 242:
                return new zvo(this.c.aP(), (aisp) this.a.a.zF.b());
            case 243:
                return new zuf((dzuc) this.a.cE.b());
            case 244:
                return Optional.of((abvd) this.a.b.ll.b());
            case 245:
                return Optional.of((dnwx) this.a.b.lm.b());
            case 246:
                ahoi ahoiVar22 = this.c;
                fdjx fdjxVar9 = (fdjx) ahoiVar22.e.b();
                ahkn ahknVar22 = this.a;
                return new zvn(fdjxVar9, (fdjx) ahknVar22.a.m.b(), ahoiVar22.Q, (cqdr) ahknVar22.lk.b(), (zuf) ahoiVar22.dO.b(), (zvo) ahoiVar22.dN.b(), (Optional) ahoiVar22.dQ.b());
            case 247:
                return Optional.of((agxn) this.a.b.kH.b());
            case 248:
                ahkn ahknVar23 = this.a;
                Context context14 = (Context) ahknVar23.t.b();
                ahoi ahoiVar23 = this.c;
                fdjx fdjxVar10 = (fdjx) ahoiVar23.e.b();
                ahhh ahhhVar = this.d;
                zvl zvlVarAu = ahoiVar23.au();
                zvn zvnVar = (zvn) ahoiVar23.dR.b();
                lwn lwnVar = (lwn) ahoiVar23.h.b();
                ConversationId conversationId5 = (ConversationId) ahoiVar23.j.b();
                fdpl fdplVar6 = (fdpl) ahoiVar23.v.b();
                arqu arquVarAI = ahknVar23.b.aI();
                ahnh ahnhVar6 = ahknVar23.a;
                return new zvc(context14, fdjxVar10, ahhhVar.l, zvlVarAu, zvnVar, lwnVar, conversationId5, fdplVar6, arquVarAI, (Optional) ahnhVar6.IP.b(), (Optional) ahoiVar23.dP.b(), (Optional) ahoiVar23.dQ.b(), Optional.of((dnuy) ahnhVar6.aiT.b()));
            case 249:
                return new cvpp(this.a.a.qr);
            case 250:
                return Optional.of((zbu) this.c.dX.b());
            case 251:
                ahkn ahknVar24 = this.a;
                Context context15 = (Context) ahknVar24.t.b();
                ahoi ahoiVar24 = this.c;
                fdjx fdjxVar11 = (fdjx) ahoiVar24.e.b();
                eyik eyikVar13 = ahoiVar24.dV;
                eyik eyikVar14 = ahoiVar24.dW;
                ahng ahngVar3 = ahknVar24.b;
                return new zbu(context15, fdjxVar11, eyikVar13, eyikVar14, ahngVar3.ii, ahoiVar24.aY, ahngVar3.lU);
            case 252:
                return zar.a(this.a.a.abL);
            case 253:
                ahoi ahoiVar25 = this.c;
                return vrl.a((ajlu) ahoiVar25.G.b(), (fdjx) ahoiVar25.e.b());
            case 254:
                ahkn ahknVar25 = this.a;
                return new ynh((Context) ahknVar25.t.b(), (ConnectivityManager) ahknVar25.dO.b(), (fdjx) this.c.e.b(), (egpm) ahknVar25.dR.b(), (fdjx) ahknVar25.a.m.b(), (fcyh) ahknVar25.cA.b(), ahknVar25.b.V());
            case 255:
                ahkn ahknVar26 = this.a;
                Context context16 = (Context) ahknVar26.t.b();
                ahnh ahnhVar7 = ahknVar26.a;
                return new baix(context16, (cpbn) ahnhVar7.qo.b(), ahnhVar7.qi);
            case 256:
                ahkn ahknVar27 = this.a;
                Context context17 = (Context) ahknVar27.t.b();
                cqjk cqjkVar = (cqjk) ahknVar27.no.b();
                ahnh ahnhVar8 = ahknVar27.a;
                cpga cpgaVar = (cpga) ahnhVar8.Wj.b();
                ahng ahngVar4 = ahknVar27.b;
                return new ynk(context17, cqjkVar, cpgaVar, (aprc) ahngVar4.lU.b(), ahnhVar8.tB, ahngVar4.av());
            case 257:
                ahoi ahoiVar26 = this.c;
                yow yowVar = (yow) ahoiVar26.ec.b();
                afzc afzcVar3 = (afzc) this.d.l.b();
                ahkn ahknVar28 = this.a;
                eyik eyikVar15 = ahoiVar26.ed;
                eyik eyikVar16 = ahoiVar26.ee;
                ahng ahngVar5 = ahknVar28.b;
                aafq aafqVarR = ahngVar5.r();
                ahnh ahnhVar9 = ahknVar28.a;
                return new you(yowVar, afzcVar3, eyikVar15, eyikVar16, aafqVarR, ahnhVar9.pQ, ahnhVar9.HK, ahknVar28.cD, ahngVar5.x, (fdjx) ahnhVar9.oQ.b(), (cult) ahoiVar26.dd.b(), (Conversation) ahoiVar26.l.b(), ahngVar5.ak(), (aqzm) ahnhVar9.Rs.b());
            case 258:
                return new yow((Context) this.a.t.b(), this.c.ae());
            case 259:
                return Optional.of(this.c.b());
            case 260:
                return Optional.of(this.c.a());
            case 261:
                ahkn ahknVar29 = this.a;
                Context context18 = (Context) ahknVar29.t.b();
                ahoi ahoiVar27 = this.c;
                fdjx fdjxVar12 = (fdjx) ahoiVar27.e.b();
                fcyh fcyhVar10 = (fcyh) ahknVar29.bM.b();
                Conversation conversation = (Conversation) ahoiVar27.l.b();
                ajmh ajmhVar2 = (ajmh) ahoiVar27.Q.b();
                eyik eyikVar17 = this.d.l;
                eyik eyikVar18 = ahoiVar27.dM;
                afzc afzcVar4 = (afzc) eyikVar17.b();
                whw whwVar = (whw) ahoiVar27.bK.b();
                agdt agdtVarAJ = ahoiVar27.aJ();
                ahng ahngVar6 = ahknVar29.b;
                arma armaVar = (arma) ahngVar6.jm.b();
                zgh zghVarAo = ahoiVar27.ao();
                xuz xuzVar = (xuz) ahoiVar27.ek.b();
                eyik eyikVar19 = ahoiVar27.es;
                eyik eyikVar20 = ahngVar6.mf;
                eyik eyikVar21 = ahoiVar27.aZ;
                xvb xvbVarV = ahoiVar27.V();
                vmg vmgVar = (vmg) eyikVar21.b();
                aqzm aqzmVar = (aqzm) ahknVar29.a.Rs.b();
                xva xvaVar = (xva) ahoiVar27.et.b();
                ahax ahaxVar = (ahax) ahoiVar27.n.b();
                Optional optionalOf = Optional.of((aaef) ahoiVar27.aS.b());
                aqkf aqkfVarAn = ahngVar6.an();
                apql apqlVar = (apql) ahngVar6.jz.b();
                vuc vucVar = (vuc) ahngVar6.kX.b();
                aqkb aqkbVarAk = ahngVar6.ak();
                cqmb cqmbVar = (cqmb) ahknVar29.cU.b();
                eyik eyikVar22 = ahoiVar27.bt;
                return new yvq(context18, fdjxVar12, fcyhVar10, conversation, ajmhVar2, eyikVar18, afzcVar4, whwVar, agdtVarAJ, armaVar, ahoiVar27.bX, zghVarAo, xuzVar, eyikVar19, eyikVar20, xvbVarV, vmgVar, aqzmVar, xvaVar, ahaxVar, optionalOf, aqkfVarAn, apqlVar, vucVar, aqkbVarAk, cqmbVar, ahoiVar27.ah(), (vvj) eyikVar22.b(), ahngVar6.aG(), ahngVar6.ag());
            case 262:
                ahkn ahknVar30 = this.a;
                ahoi ahoiVar28 = this.c;
                eyik eyikVar23 = ahknVar30.t;
                eyik eyikVar24 = ahoiVar28.eh;
                eyik eyikVar25 = ahknVar30.b.hU;
                ahnh ahnhVar10 = ahknVar30.a;
                return new ctgb(eyikVar23, eyikVar24, eyikVar25, ahnhVar10.GA, ahnhVar10.BD, ahoiVar28.ei, ahnhVar10.BC, ahoiVar28.n, (efwo) this.b.b.b(), ahnhVar10.pQ, (fdjx) ahoiVar28.e.b(), (fcyh) ahknVar30.bM.b());
            case 263:
                ahoi ahoiVar29 = this.c;
                ahjr ahjrVar4 = this.b;
                ahkn ahknVar31 = this.a;
                return new csdg(ahoiVar29.eg, ahjrVar4.cN, ahjrVar4.cM, ahjrVar4.cH, ahjrVar4.cQ, ahjrVar4.cz, (fdjx) ahknVar31.a.oS.b());
            case 264:
                return ekhx.o(this.b.hy());
            case 265:
                return new ctfp(this.a.a.BC);
            case 266:
                return new xuz();
            case 267:
                return new ahnv(this);
            case 268:
                ahoi ahoiVar30 = this.c;
                eyik eyikVar26 = ahoiVar30.ep;
                dprx dprxVar = new dprx();
                ahkn ahknVar32 = this.a;
                dptk dptkVarBe = ahoiVar30.be();
                xvw xvwVarW = ahoiVar30.W();
                vtx vtxVarM = ahoiVar30.m();
                vts vtsVarL = ahoiVar30.l();
                eyik eyikVar27 = ahoiVar30.eq;
                ahng ahngVar7 = ahknVar32.b;
                return new xye(eyikVar26, dprxVar, dptkVarBe, xvwVarW, vtxVarM, vtsVarL, eyikVar27, ahngVar7.aQ(), ahngVar7.aR(), ahngVar7.aF());
            case 269:
                ahoi ahoiVar31 = this.c;
                ajmh ajmhVar3 = (ajmh) ahoiVar31.Q.b();
                ahkn ahknVar33 = this.a;
                Context context19 = (Context) ahknVar33.t.b();
                xyy xyyVarX = ahoiVar31.X();
                ybd ybdVarY = ahoiVar31.Y();
                yql yqlVarAf = ahoiVar31.af();
                ahnw ahnwVar = (ahnw) ahoiVar31.el.b();
                ahng ahngVar8 = ahknVar33.b;
                return new xwm(ajmhVar3, context19, xyyVarX, ybdVarY, yqlVarAf, ahnwVar, ahngVar8.mc, ahngVar8.md, (wfo) ahoiVar31.eo.b());
            case 270:
                return new ahnw(this);
            case 271:
                ahkn ahknVar34 = this.a;
                Context context20 = (Context) ahknVar34.t.b();
                ahoi ahoiVar32 = this.c;
                fdjx fdjxVar13 = (fdjx) ahoiVar32.e.b();
                ahax ahaxVar2 = (ahax) ahoiVar32.n.b();
                ahhh ahhhVar2 = this.d;
                return new wgk(context20, fdjxVar13, ahaxVar2, ahhhVar2.l, (fdpl) ahoiVar32.y.b(), (fduj) ahoiVar32.aA.b(), (fdpl) ahoiVar32.m.b(), (xmg) ahoiVar32.em.b(), (aqbh) ahknVar34.a.qa.b(), ahoiVar32.en);
            case 272:
                ahkn ahknVar35 = this.a;
                Context context21 = (Context) ahknVar35.t.b();
                ahnh ahnhVar11 = ahknVar35.a;
                fdjx fdjxVar14 = (fdjx) ahnhVar11.m.b();
                ahoi ahoiVar33 = this.c;
                return new xmm(context21, fdjxVar14, ahoiVar33.bn(), (fdpl) ahoiVar33.y.b(), (aofc) this.b.I.b(), ahnhVar11.qi, (cuur) ahnhVar11.wI.b(), (ahax) ahoiVar33.n.b());
            case 273:
                ahkn ahknVar36 = this.a;
                ahnh ahnhVar12 = ahknVar36.a;
                return new cida(ahnhVar12.rc, ahknVar36.b.me, (fdjx) ahnhVar12.oQ.b(), ahnhVar12.uM);
            case 274:
                return xbb.a((xay) this.c.bG.b());
            case 275:
                return new xva((dzuc) this.a.cE.b());
            case 276:
                ahoi ahoiVar34 = this.c;
                fdjx fdjxVar15 = (fdjx) ahoiVar34.e.b();
                ahkn ahknVar37 = this.a;
                Context context22 = (Context) ahknVar37.t.b();
                fcyh fcyhVar11 = (fcyh) ahknVar37.bM.b();
                Conversation conversation2 = (Conversation) ahoiVar34.l.b();
                eyik eyikVar28 = this.d.l;
                eyik eyikVar29 = ahoiVar34.dM;
                afzc afzcVar5 = (afzc) eyikVar28.b();
                whw whwVar2 = (whw) ahoiVar34.bK.b();
                agdt agdtVarAJ2 = ahoiVar34.aJ();
                ahng ahngVar9 = ahknVar37.b;
                arma armaVar2 = (arma) ahngVar9.jm.b();
                eyik eyikVar30 = ahoiVar34.es;
                xvb xvbVarV2 = ahoiVar34.V();
                ahnh ahnhVar13 = ahknVar37.a;
                return new zih(fdjxVar15, context22, fcyhVar11, conversation2, eyikVar29, afzcVar5, whwVar2, agdtVarAJ2, ahoiVar34.bX, armaVar2, eyikVar30, xvbVarV2, ahnhVar13.bn(), (aqzm) ahnhVar13.Rs.b(), (vuc) ahngVar9.kX.b(), ahngVar9.ak(), (vvj) ahoiVar34.bt.b(), ahngVar9.aG(), ahngVar9.ag(), Optional.of((aaef) ahoiVar34.aS.b()), (ahax) ahoiVar34.n.b());
            case 277:
                ahkn ahknVar38 = this.a;
                ahnh ahnhVar14 = ahknVar38.a;
                fdjx fdjxVar16 = (fdjx) ahnhVar14.m.b();
                ahoi ahoiVar35 = this.c;
                fdjx fdjxVar17 = (fdjx) ahoiVar35.e.b();
                Context context23 = (Context) ahknVar38.t.b();
                Conversation conversation3 = (Conversation) ahoiVar35.l.b();
                ajlu ajluVar = (ajlu) ahoiVar35.G.b();
                ajlw ajlwVar = (ajlw) ahoiVar35.bw.b();
                fdpl fdplVar7 = (fdpl) ahoiVar35.r.b();
                eyik eyikVar31 = ahnhVar14.Bq;
                eyik eyikVar32 = ahnhVar14.BB;
                ahng ahngVar10 = ahknVar38.b;
                eyik eyikVar33 = ahngVar10.iB;
                eyik eyikVar34 = ahnhVar14.Hf;
                ahhh ahhhVar3 = this.d;
                ahjr ahjrVar5 = this.b;
                eyik eyikVar35 = ahjrVar5.eg;
                eyik eyikVar36 = ahjrVar5.dC;
                Optional optionalOf2 = Optional.of(ahngVar10.iL);
                eyik eyikVar37 = ahnhVar14.BM;
                eyik eyikVar38 = ahknVar38.jW;
                eyik eyikVar39 = ahoiVar35.q;
                eyik eyikVar40 = ahnhVar14.IP;
                eyik eyikVar41 = ahoiVar35.dP;
                eyik eyikVar42 = ahoiVar35.dQ;
                eyik eyikVar43 = ahoiVar35.ew;
                eyik eyikVar44 = ahngVar10.hX;
                eyik eyikVar45 = ahnhVar14.qi;
                eyik eyikVar46 = ahjrVar5.ap;
                eyik eyikVar47 = ahjrVar5.au;
                ahax ahaxVar3 = (ahax) ahoiVar35.n.b();
                eyik eyikVar48 = ahnhVar14.vR;
                eyik eyikVar49 = ahoiVar35.ex;
                eyik eyikVar50 = ahknVar38.kL;
                zrb zrbVarAs = ahoiVar35.as();
                vuc vucVar2 = (vuc) ahngVar10.kX.b();
                eyik eyikVar51 = ahoiVar35.D;
                eyik eyikVar52 = ahoiVar35.Q;
                eyik eyikVar53 = ahoiVar35.E;
                eyik eyikVar54 = ahoiVar35.cG;
                eyik eyikVar55 = ahoiVar35.bA;
                eyik eyikVar56 = ahoiVar35.cK;
                return new ztv(fdjxVar16, fdjxVar17, context23, conversation3, ajluVar, ajlwVar, fdplVar7, eyikVar52, eyikVar31, eyikVar51, ahoiVar35.bV, eyikVar32, eyikVar33, eyikVar34, ahhhVar3.l, eyikVar35, eyikVar36, optionalOf2, eyikVar37, eyikVar38, eyikVar39, eyikVar53, eyikVar40, eyikVar41, eyikVar42, eyikVar56, eyikVar43, eyikVar44, eyikVar45, eyikVar46, eyikVar47, ahaxVar3, eyikVar48, eyikVar49, eyikVar54, eyikVar55, eyikVar50, zrbVarAs, vucVar2);
            case 278:
                return xbc.a((xay) this.c.bG.b());
            case 279:
                ahkn ahknVar39 = this.a;
                Context context24 = (Context) ahknVar39.t.b();
                fdjx fdjxVar18 = (fdjx) this.c.e.b();
                ahhh ahhhVar4 = this.d;
                return new asph(context24, fdjxVar18, ahhhVar4.l, ahknVar39.a.qj);
            case 280:
                return new cwmv(this.a.a.pb);
            case 281:
                ahkn ahknVar40 = this.a;
                return new ynv((Context) ahknVar40.t.b(), ahknVar40.b.ak());
            case 282:
                return new yte();
            case 283:
                ahkn ahknVar41 = this.a;
                return new ynz((Context) ahknVar41.t.b(), (ahax) this.c.n.b(), ahknVar41.b.ak());
            case 284:
                return Optional.of(this.c.aj());
            case 285:
                return Optional.of(this.c.an());
            case 286:
                return new zql();
            case 287:
                return Optional.of((xrp) this.c.an.b());
            case 288:
                return new cwuj((Context) this.a.t.b());
            case 289:
                ahkn ahknVar42 = this.a;
                Context context25 = (Context) ahknVar42.t.b();
                ahng ahngVar11 = ahknVar42.b;
                String strCO = ahngVar11.cO();
                String strCP = ahngVar11.cP();
                ahoi ahoiVar36 = this.c;
                eyik eyikVar57 = this.d.l;
                zwj zwjVarAw = ahoiVar36.aw();
                afzc afzcVar6 = (afzc) eyikVar57.b();
                ahnh ahnhVar15 = ahknVar42.a;
                return new zit(context25, strCO, strCP, zwjVarAw, afzcVar6, (alrj) ahnhVar15.qi.b(), (zjj) ahoiVar36.eI.b(), (aqun) ahnhVar15.zc.b());
            case 290:
                ahkn ahknVar43 = this.a;
                Context context26 = (Context) ahknVar43.t.b();
                ahoi ahoiVar37 = this.c;
                fdjx fdjxVar19 = (fdjx) ahoiVar37.e.b();
                ahnh ahnhVar16 = ahknVar43.a;
                return new zjj(context26, fdjxVar19, (fdjx) ahnhVar16.m.b(), (ajlu) ahoiVar37.G.b(), (ajlw) ahoiVar37.bw.b(), (vwg) ahoiVar37.bV.b(), ahknVar43.b.bf(), (ynm) ahoiVar37.bA.b(), (aquq) ahnhVar16.ze.b());
            case 291:
                ahoi ahoiVar38 = this.c;
                return vqt.a((ajlu) ahoiVar38.G.b(), (fdjx) ahoiVar38.e.b());
            case 292:
                ahoi ahoiVar39 = this.c;
                return vrm.a((ajlu) ahoiVar39.G.b(), (fdjx) ahoiVar39.e.b());
            case 293:
                ahkn ahknVar44 = this.a;
                Context context27 = (Context) ahknVar44.t.b();
                ahoi ahoiVar40 = this.c;
                return new zou(context27, (fdjx) ahoiVar40.e.b(), (ajmh) ahoiVar40.Q.b(), (fdpl) ahoiVar40.m.b(), ahoiVar40.Z(), (ahnx) ahoiVar40.eN.b(), (zon) ahoiVar40.bD.b(), (cpfu) ahknVar44.a.yM.b(), ahoiVar40.eO);
            case 294:
                return new ahnx(this);
            case 295:
                ahoi ahoiVar41 = this.c;
                ahkn ahknVar45 = this.a;
                eyik eyikVar58 = ahoiVar41.m;
                ahnh ahnhVar17 = ahknVar45.a;
                aptj aptjVarBn = ahnhVar17.bn();
                ahng ahngVar12 = ahknVar45.b;
                return new ygs(eyikVar58, aptjVarBn, ahngVar12.W(), ahngVar12.ak(), ahnhVar17.yM, ahoiVar41.h);
            case 296:
                ahnh ahnhVar18 = this.a.a;
                return new zog((ains) ahnhVar18.pQ.b(), (fdjx) ahnhVar18.m.b());
            case 297:
                return new zoa(this.a.b.mm);
            case 298:
                ahoi ahoiVar42 = this.c;
                return new zoj((ahnx) ahoiVar42.eN.b(), ahoiVar42.bm(), this.a.b.aH());
            case 299:
                Context context28 = (Context) this.a.t.b();
                ahoi ahoiVar43 = this.c;
                return new zok(context28, (ConversationId) ahoiVar43.j.b(), (ahnx) ahoiVar43.eN.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        Object vsxVar;
        int i = this.e;
        switch (i) {
            case 300:
                return new zqu();
            case 301:
                ahoi ahoiVar = this.c;
                return vqn.a((ajmh) ahoiVar.Q.b(), (fdjx) ahoiVar.e.b());
            case 302:
                ahoi ahoiVar2 = this.c;
                return new zol((ConversationId) ahoiVar2.j.b(), (fdjx) ahoiVar2.e.b(), ahoiVar2.bx);
            case 303:
                ahoi ahoiVar3 = this.c;
                fdjx fdjxVar = (fdjx) ahoiVar3.e.b();
                ahkn ahknVar = this.a;
                return new zpw(fdjxVar, (fcyh) ahknVar.cz.b(), ahoiVar3.eX, (fdpl) ahoiVar3.eY.b(), (fdpl) ahoiVar3.eZ.b(), (xux) ahoiVar3.dm.b(), (Conversation) ahoiVar3.l.b(), this.b.dC, ahoiVar3.fa, ahknVar.jY, ahoiVar3.fb, (cogw) ahknVar.cD.b(), (cult) ahoiVar3.dd.b());
            case 304:
                ahkn ahknVar2 = this.a;
                ahnh ahnhVar = ahknVar2.a;
                eyik eyikVar = ahnhVar.Bz;
                fdjx fdjxVar2 = (fdjx) ahnhVar.m.b();
                ahng ahngVar = ahknVar2.b;
                return new zpy(eyikVar, fdjxVar2, ahngVar.mp, ahngVar.aK());
            case 305:
                ahoi ahoiVar4 = this.c;
                return vrj.a((ajlu) ahoiVar4.G.b(), (fdjx) ahoiVar4.e.b());
            case 306:
                ahoi ahoiVar5 = this.c;
                return vrk.a((ajlu) ahoiVar5.G.b(), (fdjx) ahoiVar5.e.b());
            case 307:
                return new zqb(this.a.a.pQ);
            case 308:
                return new zqc((aimb) this.a.a.rc.b());
            case 309:
                return new ych();
            case 310:
                return new ysu(this.a.b.lU);
            case 311:
                ahoi ahoiVar6 = this.c;
                return yiq.a((Conversation) ahoiVar6.l.b(), (fdjx) ahoiVar6.e.b());
            case 312:
                ahoi ahoiVar7 = this.c;
                fdjx fdjxVar3 = (fdjx) ahoiVar7.e.b();
                wgu wguVar = (wgu) ahoiVar7.fq.b();
                xmx xmxVar = (xmx) ahoiVar7.fr.b();
                xeg xegVar = (xeg) ahoiVar7.bV.b();
                wfo wfoVar = (wfo) ahoiVar7.eo.b();
                fduj fdujVar = (fduj) ahoiVar7.aA.b();
                xux xuxVar = (xux) ahoiVar7.dm.b();
                ahkn ahknVar3 = this.a;
                ahnh ahnhVar2 = ahknVar3.a;
                ccyf ccyfVarHp = ahnhVar2.hp();
                Optional optionalOf = Optional.of((dnuy) ahnhVar2.aiT.b());
                ahng ahngVar2 = ahknVar3.b;
                vsxVar = new vsx(fdjxVar3, wguVar, xmxVar, xegVar, wfoVar, fdujVar, xuxVar, ccyfVarHp, optionalOf, (asgk) ahngVar2.hj.b(), ahngVar2.lz, ahngVar2.jl, (zuh) this.d.o.b(), ahngVar2.aj(), (diii) ahoiVar7.di.b());
                break;
            case 313:
                ahoi ahoiVar8 = this.c;
                return new wgz((fdjx) ahoiVar8.e.b(), (wqu) ahoiVar8.fk.b(), (xck) ahoiVar8.bR.b(), (wjd) ahoiVar8.fm.b(), (wzf) ahoiVar8.fn.b(), (wum) ahoiVar8.fo.b(), this.a.b.aQ(), ahoiVar8.bi(), (wgt) ahoiVar8.cj.b());
            case 314:
                fcyh fcyhVar = (fcyh) this.a.bM.b();
                ahoi ahoiVar9 = this.c;
                fdjx fdjxVar4 = (fdjx) ahoiVar9.e.b();
                eyik eyikVar2 = ahoiVar9.bY;
                return new wqu(fcyhVar, fdjxVar4, ahoiVar9.y(), (wsf) eyikVar2.b(), ahoiVar9.fh, ahoiVar9.fi, this.d.o, (wre) ahoiVar9.z.b(), ahoiVar9.fj, ahoiVar9.bV);
            case 315:
                ahoi ahoiVar10 = this.c;
                lwn lwnVar = (lwn) ahoiVar10.h.b();
                ahkn ahknVar4 = this.a;
                whe wheVarQ = ahoiVar10.q();
                ahng ahngVar3 = ahknVar4.b;
                return new wqd(lwnVar, wheVarQ, (vuc) ahngVar3.kX.b(), (fcyh) ahknVar4.cA.b(), ahngVar3.mr, ahknVar4.a.pb, ahknVar4.cD, ahoiVar10.fg, (vth) ahoiVar10.bt.b(), ahngVar3.ag());
            case 316:
                ahkn ahknVar5 = this.a;
                return wqy.a(ahknVar5.b.mr, ahknVar5.a.qK);
            case 317:
                return new wqo();
            case 318:
                ahoi ahoiVar11 = this.c;
                return new wul((fdjx) ahoiVar11.e.b(), (wre) ahoiVar11.z.b(), (fduj) ahoiVar11.aA.b());
            case 319:
                ahoi ahoiVar12 = this.c;
                fdjx fdjxVar5 = (fdjx) ahoiVar12.e.b();
                eyik eyikVar3 = ahoiVar12.bu;
                return new wjy(fdjxVar5, ahoiVar12.u(), ahoiVar12.t(), (wjc) eyikVar3.b(), ahoiVar12.aJ(), (wiq) ahoiVar12.bJ.b(), (wkt) ahoiVar12.bI.b(), ahoiVar12.bt, this.a.b.ag());
            case 320:
                ahoi ahoiVar13 = this.c;
                return new wlg((fdjx) ahoiVar13.e.b(), this.a.b.lb, (yow) ahoiVar13.ec.b());
            case 321:
                ahoi ahoiVar14 = this.c;
                return xae.a((xad) ahoiVar14.cf.b(), ahoiVar14.bH);
            case 322:
                Context context = (Context) this.a.t.b();
                ahoi ahoiVar15 = this.c;
                return new wuy(context, (fdjx) ahoiVar15.e.b(), wah.a(), new wpn(), (wjc) ahoiVar15.bu.b(), (fduj) ahoiVar15.aA.b());
            case 323:
                ahoi ahoiVar16 = this.c;
                return new wvu((fdjx) ahoiVar16.e.b(), (wvj) ahoiVar16.bQ.b(), (dnih) ahoiVar16.bL.b(), (cphz) this.d.x.b(), (fdpl) ahoiVar16.r.b(), (ains) this.a.a.pQ.b());
            case 324:
                ahkn ahknVar6 = this.a;
                Context context2 = (Context) ahknVar6.t.b();
                ahoi ahoiVar17 = this.c;
                return new xnn(context2, (ConversationId) ahoiVar17.j.b(), (fdjx) ahoiVar17.e.b(), (fcyh) ahknVar6.bM.b(), (fcyh) ahknVar6.cA.b(), (ajln) this.b.au.b(), ahoiVar17.T(), ahoiVar17.bn(), (fdpl) ahoiVar17.y.b(), (fduj) ahoiVar17.aA.b(), (wre) ahoiVar17.z.b(), (aqhc) ahknVar6.a.QL.b());
            case 325:
                return Optional.of(this.c.U());
            case 326:
                ahoi ahoiVar18 = this.c;
                return new cmdx(ahoiVar18.fu, ahoiVar18.n, this.b.ac, (fdjx) ahoiVar18.e.b());
            case 327:
                ahkn ahknVar7 = this.a;
                ahnh ahnhVar3 = ahknVar7.a;
                return new cmdi(ahnhVar3.aei, ahknVar7.t, ahknVar7.dR, this.b.dN, (fdjx) ahnhVar3.oS.b());
            case 328:
                return new xut((fdpl) this.c.m.b());
            case 329:
                return new zyh((zuh) this.d.o.b());
            case 330:
                ahoi ahoiVar19 = this.c;
                return new aagf((fdjx) ahoiVar19.e.b(), (fdpl) ahoiVar19.H.b(), (fdpl) ahoiVar19.m.b(), (zuh) this.d.o.b());
            case 331:
                ahoi ahoiVar20 = this.c;
                return ekhx.v((aalp) ahoiVar20.fz.b(), (aalp) ahoiVar20.ef.b(), (aalp) ahoiVar20.ec.b(), (aalp) ahoiVar20.ek.b(), (aalp) ahoiVar20.cb.b(), (aalp) ahoiVar20.bR.b(), (aalp) ahoiVar20.et.b(), (aalp) ahoiVar20.eu.b(), (aalp) ahoiVar20.eS.b(), (aalp) ahoiVar20.aN.b(), (aalp) ahoiVar20.dZ.b(), (aalp) ahoiVar20.fA.b(), (aalp) ahoiVar20.fB.b(), (aalp) ahoiVar20.cQ.b());
            case 332:
                return vqo.a((Conversation) this.c.l.b());
            case 333:
                return new zpz(this.a.jY);
            case 334:
                return new zuk(this.d.o);
            case 335:
                return Optional.of((agxz) this.c.bx.b());
            case 336:
                return new ekph((zwh) this.c.fE.b());
            case 337:
                ahkn ahknVar8 = this.a;
                return new zwh((Context) ahknVar8.t.b(), (fdjx) ahknVar8.a.m.b(), (fdpl) this.c.r.b());
            case 338:
                return vrp.a(eyie.a(this.c.fG), (aqki) this.a.b.mv.b());
            case 339:
                ahoi ahoiVar21 = this.c;
                return new vro((ConversationId) ahoiVar21.j.b(), (fdpl) ahoiVar21.m.b(), (fdjx) ahoiVar21.e.b());
            case 340:
                return new aalm();
            case 341:
                ahoi ahoiVar22 = this.c;
                fdjx fdjxVar6 = (fdjx) ahoiVar22.e.b();
                ConversationId conversationId = (ConversationId) ahoiVar22.j.b();
                Optional optionalOf2 = Optional.of((agrx) ahoiVar22.fM.b());
                yir yirVar = (yir) ahoiVar22.cd.b();
                ahjr ahjrVar = this.b;
                addt addtVar = (addt) ahjrVar.lV.b();
                afzc afzcVar = (afzc) this.d.l.b();
                Optional optional = (Optional) ahjrVar.jv.b();
                eyik eyikVar4 = ahjrVar.b;
                ahax ahaxVar = (ahax) ahoiVar22.n.b();
                ahkn ahknVar9 = this.a;
                return new agua(fdjxVar6, conversationId, optionalOf2, yirVar, addtVar, afzcVar, optional, eyikVar4, ahjrVar.oK, ahaxVar, (Optional) ahknVar9.cK.b(), ahknVar9.b.mw);
            case 342:
                ahkn ahknVar10 = this.a;
                Context context3 = (Context) ahknVar10.t.b();
                ahhh ahhhVar = this.d;
                ahoi ahoiVar23 = this.c;
                ahjr ahjrVar2 = this.b;
                eyik eyikVar5 = ahjrVar2.bu;
                eyik eyikVar6 = ahoiVar23.fK;
                cgte cgteVar = (cgte) eyikVar5.b();
                agwv agwvVarAM = ahoiVar23.aM();
                eyik eyikVar7 = ahjrVar2.b;
                ahnh ahnhVar4 = ahknVar10.a;
                eyik eyikVar8 = ahnhVar4.pI;
                ahax ahaxVar2 = (ahax) ahoiVar23.n.b();
                ahng ahngVar4 = ahknVar10.b;
                return new agtd(context3, ahhhVar.l, eyikVar6, cgteVar, agwvVarAM, eyikVar7, eyikVar8, ahaxVar2, (agtg) ahngVar4.mw.b(), ahnhVar4.pG, (cgsa) ahknVar10.cJ.b(), ahngVar4.kH, ahjrVar2.E(), (agtf) ahoiVar23.fL.b(), (fdjx) ahnhVar4.oS.b());
            case 343:
                ahkn ahknVar11 = this.a;
                return new aguc((Context) ahknVar11.t.b(), (cgsa) ahknVar11.cJ.b(), this.c.fJ);
            case 344:
                return new aolt(this.a.a.rF);
            case 345:
                return new agtf((Context) this.a.t.b());
            case 346:
                ahkn ahknVar12 = this.a;
                Context context4 = (Context) ahknVar12.t.b();
                ahoi ahoiVar24 = this.c;
                fdjx fdjxVar7 = (fdjx) ahoiVar24.e.b();
                fcyh fcyhVar2 = (fcyh) ahknVar12.cA.b();
                ConversationId conversationId2 = (ConversationId) ahoiVar24.j.b();
                ahnh ahnhVar5 = ahknVar12.a;
                ains ainsVar = (ains) ahnhVar5.pQ.b();
                yir yirVar2 = (yir) ahoiVar24.cd.b();
                ahjr ahjrVar3 = this.b;
                return new agvz(context4, fdjxVar7, fcyhVar2, conversationId2, ainsVar, yirVar2, (addt) ahjrVar3.lV.b(), (afzc) this.d.l.b(), (Optional) ahjrVar3.jv.b(), ahjrVar3.b, (eigp) ahjrVar3.ac.b(), (ahax) ahoiVar24.n.b(), ahknVar12.ej, ahnhVar5.pI);
            case 347:
                ahoi ahoiVar25 = this.c;
                return new admb((fdjx) ahoiVar25.e.b(), (fdpl) ahoiVar25.m.b(), this.a.a.pb, (afzc) this.d.l.b());
            case 348:
                ahoi ahoiVar26 = this.c;
                fdjx fdjxVar8 = (fdjx) ahoiVar26.e.b();
                Conversation conversation = (Conversation) ahoiVar26.l.b();
                fdpl fdplVar = (fdpl) ahoiVar26.H.b();
                ahnh ahnhVar6 = this.a.a;
                return new aall(fdjxVar8, conversation, fdplVar, ahnhVar6.yw, ahnhVar6.Ar, ahnhVar6.HO);
            case 349:
                ahkn ahknVar13 = this.a;
                ahnh ahnhVar7 = ahknVar13.a;
                eyik eyikVar9 = ahnhVar7.tb;
                ahoi ahoiVar27 = this.c;
                fdjx fdjxVar9 = (fdjx) ahoiVar27.e.b();
                fdjx fdjxVar10 = (fdjx) ahnhVar7.oS.b();
                ahjr ahjrVar4 = this.b;
                return new zwo(eyikVar9, fdjxVar9, fdjxVar10, ahjrVar4.eo, ahjrVar4.ar, (ConversationId) ahoiVar27.j.b(), (dqsn) ahnhVar7.qq.b(), (Conversation) ahoiVar27.l.b(), ahknVar13.b.mx);
            case 350:
                eyik eyikVar10 = this.c.fT;
                Optional.empty();
                return new JoinViaLinkViewModel(eyikVar10);
            case 351:
                Context context5 = (Context) this.a.t.b();
                ahoi ahoiVar28 = this.c;
                return new adlf(context5, (fdjx) ahoiVar28.e.b(), (fdpl) ahoiVar28.m.b(), (fdpl) ahoiVar28.r.b(), this.d.l, this.b.au);
            case 352:
                ahoi ahoiVar29 = this.c;
                eyik eyikVar11 = ahoiVar29.fV;
                Optional.empty();
                fdpl fdplVar2 = (fdpl) ahoiVar29.fX.b();
                Optional.of((zyh) ahoiVar29.fx.b());
                ahoiVar29.ap();
                return new MessageDetailsViewModel(eyikVar11, fdplVar2, (fdpl) ahoiVar29.H.b());
            case 353:
                efwo efwoVar = (efwo) this.b.b.b();
                ahoi ahoiVar30 = this.c;
                aflt afltVarAG = ahoiVar30.aG();
                ylw ylwVarAb = ahoiVar30.ab();
                ahnx ahnxVar = (ahnx) ahoiVar30.eN.b();
                ahhh ahhhVar2 = this.d;
                ahkn ahknVar14 = this.a;
                Context context6 = (Context) ahknVar14.t.b();
                fdjx fdjxVar11 = (fdjx) ahoiVar30.e.b();
                fdpl fdplVar3 = (fdpl) ahoiVar30.m.b();
                fdpl fdplVar4 = (fdpl) ahoiVar30.r.b();
                fcyh fcyhVar3 = (fcyh) ahknVar14.bM.b();
                cqjk cqjkVar = (cqjk) ahknVar14.no.b();
                afli afliVarAF = ahoiVar30.aF();
                Optional.of((cwdc) ahoiVar30.w.b());
                return new afln(efwoVar, afltVarAG, ylwVarAb, ahnxVar, context6, fdjxVar11, fdplVar3, fdplVar4, fcyhVar3, cqjkVar, afliVarAF, ahoiVar30.aA());
            case 354:
                ahoi ahoiVar31 = this.c;
                return afle.a((Conversation) ahoiVar31.l.b(), (MessageId) ahoiVar31.fW.b());
            case 355:
                return aflf.a((lwn) this.c.h.b());
            case 356:
                ahoi ahoiVar32 = this.c;
                Optional optionalOf3 = Optional.of(ahoiVar32.aW());
                Optional optionalOf4 = Optional.of((cwdc) ahoiVar32.w.b());
                Optional.empty();
                return new MiniConversationDetailsPageViewModel(optionalOf3, optionalOf4);
            case 357:
                ahoi ahoiVar33 = this.c;
                return new MultiShareViewModel(ahoiVar33.gB, this.a.a.Yn, ahoiVar33.gD);
            case 358:
                ahoi ahoiVar34 = this.c;
                return new afuf((afxz) ahoiVar34.gi.b(), (afrj) ahoiVar34.gp.b(), (aftv) ahoiVar34.gA.b(), (afng) ahoiVar34.gj.b(), (afnm) ahoiVar34.gz.b(), this.a.b.aN());
            case 359:
                ahkn ahknVar15 = this.a;
                Context context7 = (Context) ahknVar15.t.b();
                ahoi ahoiVar35 = this.c;
                fdjx fdjxVar12 = (fdjx) ahoiVar35.e.b();
                afzc afzcVar2 = (afzc) this.d.l.b();
                afuc afucVar = (afuc) ahoiVar35.ga.b();
                eyik eyikVar12 = ahoiVar35.gb;
                afus afusVar = (afus) ahoiVar35.gd.b();
                afvu afvuVar = (afvu) ahoiVar35.gh.b();
                ahng ahngVar5 = ahknVar15.b;
                return new afyf(context7, fdjxVar12, afzcVar2, afucVar, eyikVar12, afusVar, afvuVar, ahngVar5.aN(), ahngVar5.mz);
            case 360:
                return new afue();
            case 361:
                ahkn ahknVar16 = this.a;
                return new afxx(ahknVar16.a.zs, new afxr(), (Executor) ahknVar16.p.b(), ahknVar16.cE);
            case 362:
                Context context8 = (Context) this.a.t.b();
                ahoi ahoiVar36 = this.c;
                return new afus(context8, (fdjx) ahoiVar36.e.b(), (afmz) ahoiVar36.gc.b(), ahoiVar36.gb);
            case 363:
                ahkn ahknVar17 = this.a;
                return new afnb((Context) ahknVar17.t.b(), ahknVar17.b.my, (cujd) this.d.m.b(), (lwn) this.c.h.b());
            case 364:
                ahoi ahoiVar37 = this.c;
                fdjx fdjxVar13 = (fdjx) ahoiVar37.e.b();
                ahkn ahknVar18 = this.a;
                Context context9 = (Context) ahknVar18.t.b();
                ahnh ahnhVar8 = ahknVar18.a;
                eyik eyikVar13 = ahnhVar8.qi;
                eyik eyikVar14 = ahnhVar8.pE;
                afuc afucVar2 = (afuc) ahoiVar37.ga.b();
                ajoy ajoyVar = (ajoy) ahnhVar8.Yn.b();
                afmz afmzVar = (afmz) ahoiVar37.gc.b();
                eyik eyikVar15 = ahknVar18.cE;
                eyik eyikVar16 = ahoiVar37.gb;
                eyik eyikVar17 = ahoiVar37.ge;
                eyik eyikVar18 = ahoiVar37.gg;
                envd envdVar = (envd) ahoiVar37.gf.b();
                ahng ahngVar6 = ahknVar18.b;
                return new afwu(fdjxVar13, context9, eyikVar13, eyikVar14, afucVar2, ajoyVar, afmzVar, eyikVar15, eyikVar16, eyikVar17, eyikVar18, envdVar, ahngVar6.aN(), ahngVar6.mz);
            case 365:
                ahkn ahknVar19 = this.a;
                Context context10 = (Context) ahknVar19.t.b();
                ahnh ahnhVar9 = ahknVar19.a;
                return new uds(context10, ahnhVar9.qk, ahnhVar9.qo);
            case 366:
                ahoi ahoiVar38 = this.c;
                fdjx fdjxVar14 = (fdjx) ahoiVar38.e.b();
                ahkn ahknVar20 = this.a;
                fcyh fcyhVar4 = (fcyh) ahknVar20.bM.b();
                ahjr ahjrVar5 = this.b;
                anty antyVar = (anty) ahjrVar5.ap.b();
                ajln ajlnVar = (ajln) ahjrVar5.au.b();
                afuc afucVar3 = (afuc) ahoiVar38.ga.b();
                afmz afmzVar2 = (afmz) ahoiVar38.gc.b();
                ahnh ahnhVar10 = ahknVar20.a;
                return new afvn(fdjxVar14, fcyhVar4, antyVar, ajlnVar, afucVar3, afmzVar2, ahnhVar10.SL, ahnhVar10.Yn, ahnhVar10.qo, ahoiVar38.gb, ahknVar20.cE, (envd) ahoiVar38.gf.b(), ahknVar20.b.aN(), this.d.x);
            case 367:
                return afmm.a((lwn) this.c.h.b());
            case 368:
                ahoi ahoiVar39 = this.c;
                fdjx fdjxVar15 = (fdjx) ahoiVar39.e.b();
                ahng ahngVar7 = this.a.b;
                return new afrq(fdjxVar15, ahngVar7.mA, ahngVar7.mB, ahngVar7.mC, (envd) ahoiVar39.gf.b(), ahoiVar39.gb, ahngVar7.bG(), (afsq) ahoiVar39.gl.b(), (aftd) ahoiVar39.gm.b(), (aftr) ahoiVar39.gn.b(), (afva) this.d.s.b(), (aftt) ahoiVar39.go.b(), ahngVar7.aN(), (afmz) ahoiVar39.gc.b());
            case 369:
                ahoi ahoiVar40 = this.c;
                return new afsr(ahoiVar40.c(), (afnf) ahoiVar40.gk.b(), ahoiVar40.ge, this.a.b.aN());
            case 370:
                ahoi ahoiVar41 = this.c;
                return new afnf((afmz) ahoiVar41.gc.b(), (eigp) this.b.ac.b(), (afng) ahoiVar41.gj.b(), ahoiVar41.gb);
            case 371:
                ahkn ahknVar21 = this.a;
                Context context11 = (Context) ahknVar21.t.b();
                ahoi ahoiVar42 = this.c;
                return new afnl(context11, (fdjx) ahoiVar42.e.b(), (afmz) ahoiVar42.gc.b(), ahknVar21.b.mz);
            case 372:
                ahkn ahknVar22 = this.a;
                Context context12 = (Context) ahknVar22.t.b();
                ahoi ahoiVar43 = this.c;
                fdjx fdjxVar16 = (fdjx) ahoiVar43.e.b();
                ahng ahngVar8 = ahknVar22.b;
                eyik eyikVar19 = ahngVar8.mD;
                eyik eyikVar20 = ahngVar8.mE;
                afmz afmzVar3 = (afmz) ahoiVar43.gc.b();
                ahjr ahjrVar6 = this.b;
                ajln ajlnVar2 = (ajln) ahjrVar6.au.b();
                ahnh ahnhVar11 = ahknVar22.a;
                eyik eyikVar21 = ahnhVar11.qo;
                eyik eyikVar22 = ahnhVar11.qi;
                cssf cssfVar = (cssf) ahnhVar11.uo.b();
                eyik eyikVar23 = ahoiVar43.gb;
                dzuc dzucVar = (dzuc) ahknVar22.cE.b();
                asgv asgvVarAN = ahngVar8.aN();
                ardc ardcVar = (ardc) ahngVar8.jr.b();
                ahhh ahhhVar3 = this.d;
                return new afto(context12, fdjxVar16, eyikVar19, eyikVar20, afmzVar3, ajlnVar2, eyikVar21, eyikVar22, cssfVar, ahjrVar6.pW, eyikVar23, dzucVar, asgvVarAN, ardcVar, ahhhVar3.x, (lwn) ahoiVar43.h.b());
            case 373:
                return new aftr((fdjx) this.c.e.b(), (ajoy) this.a.a.Yn.b());
            case 374:
                return new aftu(this.a.gD);
            case 375:
                ahoi ahoiVar44 = this.c;
                fdjx fdjxVar17 = (fdjx) ahoiVar44.e.b();
                ahkn ahknVar23 = this.a;
                fcyh fcyhVar5 = (fcyh) ahknVar23.bM.b();
                Context context13 = (Context) ahknVar23.t.b();
                ahjr ahjrVar7 = this.b;
                return new aftz(fdjxVar17, fcyhVar5, context13, (eigp) ahjrVar7.ac.b(), (anty) ahjrVar7.ap.b(), (afmz) ahoiVar44.gc.b(), (ajln) ahjrVar7.au.b(), (afnm) ahoiVar44.gz.b(), (lwn) ahoiVar44.h.b(), (afzc) this.d.l.b(), ahoiVar44.gb, (afus) ahoiVar44.gd.b());
            case 376:
                ahkn ahknVar24 = this.a;
                Context context14 = (Context) ahknVar24.t.b();
                ahoi ahoiVar45 = this.c;
                return new afnp(context14, (fdjx) ahoiVar45.e.b(), (afus) ahoiVar45.gd.b(), (afob) ahoiVar45.gy.b(), ahoiVar45.gb, ahknVar24.b.aN());
            case 377:
                return new afob((afog) this.c.gx.b());
            case 378:
                ahoi ahoiVar46 = this.c;
                fdjx fdjxVar18 = (fdjx) ahoiVar46.e.b();
                afqn afqnVar = (afqn) ahoiVar46.gs.b();
                afoo afooVar = (afoo) ahoiVar46.gt.b();
                afpv afpvVar = (afpv) ahoiVar46.gw.b();
                ahng ahngVar9 = this.a.b;
                return new afon(fdjxVar18, afqnVar, afooVar, afpvVar, ahngVar9.ad(), ahngVar9.ae(), ahngVar9.aQ(), ahngVar9.af(), ahngVar9.aN());
            case 379:
                ahkn ahknVar25 = this.a;
                Context context15 = (Context) ahknVar25.t.b();
                ahoi ahoiVar47 = this.c;
                fdjx fdjxVar19 = (fdjx) ahoiVar47.e.b();
                wre wreVar = (wre) ahoiVar47.z.b();
                eyik eyikVar24 = ahoiVar47.gb;
                afre afreVar = (afre) ahoiVar47.gq.b();
                afph afphVar = (afph) ahoiVar47.gr.b();
                ahng ahngVar10 = ahknVar25.b;
                return new afrd(context15, fdjxVar19, wreVar, eyikVar24, afreVar, afphVar, ahngVar10.ad(), ahngVar10.ae());
            case 380:
                return new afre();
            case 381:
                fcyh fcyhVar6 = (fcyh) this.a.bM.b();
                ahoi ahoiVar48 = this.c;
                return new afph(fcyhVar6, (fdjx) ahoiVar48.e.b(), ahoiVar48.fh, (wre) ahoiVar48.z.b());
            case 382:
                ahoi ahoiVar49 = this.c;
                return new afpe((fdjx) ahoiVar49.e.b(), (wre) ahoiVar49.z.b(), ahoiVar49.t(), (wjc) ahoiVar49.bu.b());
            case 383:
                ahoi ahoiVar50 = this.c;
                fdjx fdjxVar20 = (fdjx) ahoiVar50.e.b();
                ahkn ahknVar26 = this.a;
                ahnh ahnhVar12 = ahknVar26.a;
                fdjx fdjxVar21 = (fdjx) ahnhVar12.m.b();
                envd envdVar2 = (envd) ahoiVar50.gf.b();
                Context context16 = (Context) ahknVar26.t.b();
                ahjr ahjrVar8 = this.b;
                eigp eigpVar = (eigp) ahjrVar8.ac.b();
                ynm ynmVar = (ynm) ahoiVar50.bA.b();
                afps afpsVar = (afps) ahoiVar50.gu.b();
                afmz afmzVar4 = (afmz) ahoiVar50.gc.b();
                ajln ajlnVar3 = (ajln) ahjrVar8.au.b();
                anty antyVar2 = (anty) ahjrVar8.ap.b();
                cqdr cqdrVar = (cqdr) ahknVar26.lk.b();
                ahhh ahhhVar4 = this.d;
                ahng ahngVar11 = ahknVar26.b;
                vsxVar = new afqm(fdjxVar20, fdjxVar21, envdVar2, context16, eigpVar, ynmVar, afpsVar, afmzVar4, ajlnVar3, antyVar2, cqdrVar, ahhhVar4.l, ahngVar11.l(), ahoiVar50.aH(), ahoiVar50.gb, ahnhVar12.Id, ahngVar11.lj, (cujd) ahhhVar4.m.b(), ahoiVar50.gv, (dzuc) ahknVar26.cE.b(), ahngVar11.af(), ahoiVar50.bq, ahoiVar50.fh);
                break;
            case 384:
                Context context17 = (Context) this.a.t.b();
                ahoi ahoiVar51 = this.c;
                return new afpu(context17, (fdjx) ahoiVar51.e.b(), (afre) ahoiVar51.gq.b(), (wre) ahoiVar51.z.b());
            case 385:
                ahkn ahknVar27 = this.a;
                fcyh fcyhVar7 = (fcyh) ahknVar27.bM.b();
                ajln ajlnVar4 = (ajln) this.b.au.b();
                ahng ahngVar12 = ahknVar27.b;
                return new afpm(fcyhVar7, ajlnVar4, ahngVar12.l(), ahngVar12.cd());
            case 386:
                ahoi ahoiVar52 = this.c;
                return ekhx.r((afnd) ahoiVar52.gC.b(), ahoiVar52.aI());
            case 387:
                ahoi ahoiVar53 = this.c;
                fdjx fdjxVar22 = (fdjx) ahoiVar53.e.b();
                ahkn ahknVar28 = this.a;
                return new afmq(fdjxVar22, (Context) ahknVar28.t.b(), (fcyh) ahknVar28.bM.b(), (afmz) ahoiVar53.gc.b(), (cujd) this.d.m.b());
            case 388:
                return new SignOutAccountViewModel(this.c.aE());
            case 389:
                return accy.a((lwn) this.c.h.b());
            case 390:
                ahoi ahoiVar54 = this.c;
                ahkn ahknVar29 = this.a;
                eyik eyikVar25 = ahoiVar54.gJ;
                eyik eyikVar26 = ahknVar29.a.Yn;
                eyik eyikVar27 = ahoiVar54.gN;
                eyik eyikVar28 = ahoiVar54.gO;
                Optional.empty();
                return new StartChatViewModel(ahoiVar54.hp, eyikVar25, eyikVar26, eyikVar27, eyikVar28, (fdjx) ahoiVar54.e.b(), ahoiVar54.hs);
            case 391:
                ahoi ahoiVar55 = this.c;
                ctro ctroVar = (ctro) ahoiVar55.gH.b();
                cucy cucyVar = (cucy) ahoiVar55.hg.b();
                ctjx ctjxVar = (ctjx) ahoiVar55.hn.b();
                ctuw ctuwVar = (ctuw) ahoiVar55.ho.b();
                ctpa ctpaVar = (ctpa) ahoiVar55.hb.b();
                ahay ahayVar = (ahay) ahoiVar55.n.b();
                ctrq ctrqVar = (ctrq) ahoiVar55.hf.b();
                cubp cubpVar = (cubp) ahoiVar55.hc.b();
                aaft aaftVar = (aaft) ahoiVar55.q.b();
                ahng ahngVar13 = this.a.b;
                return new ctwo(ctroVar, cucyVar, ctjxVar, ctuwVar, ctpaVar, ahayVar, ctrqVar, cubpVar, aaftVar, ahngVar13.mQ, ahngVar13.aO(), ahngVar13.aM());
            case 392:
                return ctrp.a((lwn) this.c.h.b());
            case 393:
                ahkn ahknVar30 = this.a;
                Context context18 = (Context) ahknVar30.t.b();
                ahoi ahoiVar56 = this.c;
                fdjx fdjxVar23 = (fdjx) ahoiVar56.e.b();
                ConversationId conversationId3 = (ConversationId) ahoiVar56.gI.b();
                cudy cudyVar = (cudy) ahoiVar56.gJ.b();
                ctvb ctvbVar = (ctvb) ahoiVar56.gL.b();
                ctuu ctuuVar = (ctuu) ahoiVar56.gM.b();
                ahng ahngVar14 = ahknVar30.b;
                cuei cueiVar = (cuei) ahoiVar56.gN.b();
                cucl cuclVar = (cucl) ahoiVar56.gP.b();
                afzc afzcVar3 = (afzc) this.d.l.b();
                cubt cubtVar = (cubt) ahoiVar56.ha.b();
                eyik eyikVar29 = ahoiVar56.gO;
                eyik eyikVar30 = ahngVar14.je;
                eyik eyikVar31 = ahngVar14.mS;
                asgz asgzVarAO = ahngVar14.aO();
                eyik eyikVar32 = ahoiVar56.hf;
                eyik eyikVar33 = ahngVar14.mT;
                aqiu aqiuVar = (aqiu) ahngVar14.mz.b();
                asdu asduVar = (asdu) ahngVar14.mQ.b();
                ahnh ahnhVar13 = ahknVar30.a;
                return new cude(context18, fdjxVar23, conversationId3, cudyVar, ctvbVar, ctuuVar, cueiVar, cuclVar, afzcVar3, cubtVar, eyikVar29, eyikVar30, eyikVar31, asgzVarAO, eyikVar32, eyikVar33, aqiuVar, asduVar, (aquo) ahnhVar13.pl.b(), ahngVar14.mR, (ardr) ahnhVar13.SK.b());
            case 394:
                return ctjn.a((lwn) this.c.h.b());
            case 395:
                return new cueb((lwn) this.c.h.b());
            case 396:
                ahkn ahknVar31 = this.a;
                ahnh ahnhVar14 = ahknVar31.a;
                fdjx fdjxVar24 = (fdjx) ahnhVar14.m.b();
                fdjx fdjxVar25 = (fdjx) ahnhVar14.oQ.b();
                ahjr ahjrVar9 = this.b;
                return new ctvo(fdjxVar24, fdjxVar25, (bwuv) ahjrVar9.jI.b(), (ctxu) this.c.gK.b(), (dggw) ahnhVar14.sh.b(), ahjrVar9.J, ahnhVar14.Yz, (apwn) ahnhVar14.Bg.b(), ahknVar31.b.ax());
            case 397:
                ahoi ahoiVar57 = this.c;
                return new ctxu((fdjx) ahoiVar57.e.b(), (fcyh) this.a.bM.b(), (cudy) ahoiVar57.gJ.b(), (anty) this.b.ap.b());
            case 398:
                ahkn ahknVar32 = this.a;
                ufx ufxVar = (ufx) ahknVar32.b.aa.b();
                ahnh ahnhVar15 = ahknVar32.a;
                return new ctuu(ufxVar, (aisp) ahnhVar15.zF.b(), (lwn) this.c.h.b(), ahknVar32.cE, ahnhVar15.pV, (fdjx) ahnhVar15.oQ.b());
            case 399:
                return new cuei();
            default:
                throw new AssertionError(i);
        }
        return vsxVar;
    }

    @Override // defpackage.fcsu
    public final Object b() {
        int i = this.e;
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
        if (i2 == 3) {
            return e();
        }
        switch (i) {
            case 400:
                ahkn ahknVar = this.a;
                Context context = (Context) ahknVar.t.b();
                ahoi ahoiVar = this.c;
                fdjx fdjxVar = (fdjx) ahoiVar.e.b();
                cuec cuecVar = (cuec) ahoiVar.gO.b();
                aofc aofcVar = (aofc) this.b.I.b();
                crny crnyVar = (crny) ahknVar.a.pf.b();
                ahax ahaxVar = (ahax) ahoiVar.n.b();
                cudy cudyVar = (cudy) ahoiVar.gJ.b();
                ahng ahngVar = ahknVar.b;
                return new cucv(context, fdjxVar, cuecVar, aofcVar, crnyVar, ahaxVar, cudyVar, ahngVar.aO(), ahngVar.mz);
            case 401:
                return new cuef((fdjx) this.c.e.b(), this.b.I);
            case 402:
                ahkn ahknVar2 = this.a;
                Context context2 = (Context) ahknVar2.t.b();
                ahoi ahoiVar2 = this.c;
                cucf cucfVar = (cucf) ahoiVar2.gQ.b();
                cudy cudyVar2 = (cudy) ahoiVar2.gJ.b();
                ctyf ctyfVar = (ctyf) ahoiVar2.gY.b();
                ctuu ctuuVar = (ctuu) ahoiVar2.gM.b();
                eyik eyikVar = ahoiVar2.gZ;
                eyik eyikVar2 = ahoiVar2.ge;
                ahng ahngVar2 = ahknVar2.b;
                return new cucd(context2, cucfVar, cudyVar2, ctyfVar, ctuuVar, eyikVar, eyikVar2, ahngVar2.aO(), ahngVar2.mz, (ardr) ahknVar2.a.SK.b(), (ctvb) ahoiVar2.gL.b(), (fdjx) ahoiVar2.e.b(), ahngVar2.mR);
            case 403:
                return new cuch();
            case 404:
                ahoi ahoiVar3 = this.c;
                fdjx fdjxVar2 = (fdjx) ahoiVar3.e.b();
                ahkn ahknVar3 = this.a;
                Context context3 = (Context) ahknVar3.t.b();
                cucf cucfVar2 = (cucf) ahoiVar3.gQ.b();
                ahnh ahnhVar = ahknVar3.a;
                ajoy ajoyVar = (ajoy) ahnhVar.Yn.b();
                cudy cudyVar3 = (cudy) ahoiVar3.gJ.b();
                eyik eyikVar3 = ahknVar3.cE;
                ctuu ctuuVar2 = (ctuu) ahoiVar3.gM.b();
                eyik eyikVar4 = ahoiVar3.gV;
                eyik eyikVar5 = ahoiVar3.gW;
                eyik eyikVar6 = ahoiVar3.gT;
                eyik eyikVar7 = ahoiVar3.ge;
                ahng ahngVar3 = ahknVar3.b;
                return new ctzg(fdjxVar2, context3, cucfVar2, ajoyVar, cudyVar3, eyikVar3, ctuuVar2, eyikVar4, eyikVar5, eyikVar6, eyikVar7, ahngVar3.mQ, ahngVar3.aO(), (ctpr) ahoiVar3.gX.b(), (aquo) ahnhVar.pl.b(), (ardr) ahnhVar.SK.b(), (ctma) ahoiVar3.gU.b());
            case 405:
                ahoi ahoiVar4 = this.c;
                fdjx fdjxVar3 = (fdjx) ahoiVar4.e.b();
                ahkn ahknVar4 = this.a;
                Context context4 = (Context) ahknVar4.t.b();
                cucf cucfVar3 = (cucf) ahoiVar4.gQ.b();
                ahnh ahnhVar2 = ahknVar4.a;
                eyik eyikVar8 = ahnhVar2.qi;
                cudy cudyVar4 = (cudy) ahoiVar4.gJ.b();
                eyik eyikVar9 = ahoiVar4.gT;
                eyik eyikVar10 = ahnhVar2.zA;
                cmvy cmvyVar = (cmvy) ahnhVar2.pE.b();
                eilt eiltVar = (eilt) this.b.ae.b();
                eyik eyikVar11 = ahnhVar2.se;
                eyik eyikVar12 = ahnhVar2.pl;
                ahng ahngVar4 = ahknVar4.b;
                return new cubl(fdjxVar3, context4, cucfVar3, eyikVar8, cudyVar4, eyikVar9, eyikVar10, cmvyVar, eiltVar, eyikVar11, eyikVar12, new aqno(ahngVar4.a.a.oO), ahnhVar2.pB, ahngVar4.aO(), ahngVar4.mz, (ctma) ahoiVar4.gU.b(), (ardr) ahnhVar2.SK.b());
            case 406:
                ahoi ahoiVar5 = this.c;
                return new cuay((fdjx) ahoiVar5.e.b(), (cucf) ahoiVar5.gQ.b(), (cudy) ahoiVar5.gJ.b(), (cuec) ahoiVar5.gO.b(), (ctxf) ahoiVar5.gR.b(), (ctuu) ahoiVar5.gM.b(), ahoiVar5.gS);
            case 407:
                ahkn ahknVar5 = this.a;
                fcyh fcyhVar = (fcyh) ahknVar5.bM.b();
                ahoi ahoiVar6 = this.c;
                ctxu ctxuVar = (ctxu) ahoiVar6.gK.b();
                ahhh ahhhVar = this.d;
                ahjr ahjrVar = this.b;
                eyik eyikVar13 = ahjrVar.au;
                eyik eyikVar14 = ahknVar5.cE;
                ahnh ahnhVar3 = ahknVar5.a;
                eyik eyikVar15 = ahnhVar3.qi;
                eyik eyikVar16 = ahjrVar.ap;
                eyik eyikVar17 = ahjrVar.I;
                ahng ahngVar5 = ahknVar5.b;
                eyik eyikVar18 = ahngVar5.mH;
                ahkn ahknVar6 = ahoiVar6.a;
                ahnh ahnhVar4 = ahknVar6.a;
                eyik eyikVar19 = ahnhVar4.qi;
                ahjr ahjrVar2 = ahoiVar6.b;
                eyik eyikVar20 = ahjrVar2.ap;
                eyik eyikVar21 = ahnhVar4.vR;
                ahng ahngVar6 = ahknVar6.b;
                return new ctxr(fcyhVar, ctxuVar, ahhhVar.l, eyikVar13, eyikVar14, eyikVar15, eyikVar16, eyikVar17, eyikVar18, new ctxw(ahjrVar2.qf, eyikVar19, eyikVar20, eyikVar21, ahngVar6.mL, ahngVar6.mI, ahngVar6.mJ, ahngVar6.mK, ahngVar6.mM, ahngVar6.mN), ahngVar5.aL(), (ardj) ahnhVar3.Sn.b(), ahngVar5.aw(), (ctuu) ahoiVar6.gM.b(), ahngVar5.Y(), (cogw) ahknVar5.cD.b());
            case 408:
                return new ctjp((fdjx) this.c.e.b());
            case 409:
                anty antyVar = (anty) this.b.ap.b();
                fdjx fdjxVar4 = (fdjx) this.c.e.b();
                ahkn ahknVar7 = this.a;
                fcyh fcyhVar2 = (fcyh) ahknVar7.cz.b();
                fcyh fcyhVar3 = (fcyh) ahknVar7.bM.b();
                ahng ahngVar7 = ahknVar7.b;
                return new ctmn(antyVar, fdjxVar4, fcyhVar2, fcyhVar3, ahngVar7.mO, ahngVar7.mP);
            case 410:
                ahoi ahoiVar7 = this.c;
                fdjx fdjxVar5 = (fdjx) ahoiVar7.e.b();
                ahkn ahknVar8 = this.a;
                fcyh fcyhVar4 = (fcyh) ahknVar8.bM.b();
                Context context5 = (Context) ahknVar8.t.b();
                cucf cucfVar4 = (cucf) ahoiVar7.gQ.b();
                ahjr ahjrVar3 = this.b;
                ajln ajlnVar = (ajln) ahjrVar3.au.b();
                anty antyVar2 = (anty) ahjrVar3.ap.b();
                cudy cudyVar5 = (cudy) ahoiVar7.gJ.b();
                ahnh ahnhVar5 = ahknVar8.a;
                eyik eyikVar22 = ahnhVar5.qo;
                eyik eyikVar23 = ahnhVar5.Yn;
                eyik eyikVar24 = ahnhVar5.SL;
                eyik eyikVar25 = ahoiVar7.gT;
                eyik eyikVar26 = ahknVar8.cE;
                eyik eyikVar27 = ahoiVar7.gM;
                asgz asgzVarAO = ahknVar8.b.aO();
                ahhh ahhhVar2 = this.d;
                return new cuap(fdjxVar5, fcyhVar4, context5, cucfVar4, ajlnVar, antyVar2, cudyVar5, eyikVar22, eyikVar23, eyikVar24, eyikVar25, eyikVar26, eyikVar27, asgzVarAO, ahhhVar2.x, (ardr) ahnhVar5.SK.b());
            case 411:
                ahkn ahknVar9 = this.a;
                ahnh ahnhVar6 = ahknVar9.a;
                eyik eyikVar28 = ahnhVar6.qi;
                ahoi ahoiVar8 = this.c;
                return new ctqd(eyikVar28, (cucf) ahoiVar8.gQ.b(), (cudy) ahoiVar8.gJ.b(), (fdjx) ahoiVar8.e.b(), (Context) ahknVar9.t.b(), (ctxf) ahoiVar8.gR.b(), (cuec) ahoiVar8.gO.b(), ahnhVar6.pl, ahknVar9.b.aO());
            case 412:
                ahnh ahnhVar7 = this.a.a;
                return new cxum((cqjy) ahnhVar7.Ci.b(), (dakl) ahnhVar7.BK.b());
            case 413:
                ahoi ahoiVar9 = this.c;
                fdjx fdjxVar6 = (fdjx) ahoiVar9.e.b();
                ahkn ahknVar10 = this.a;
                Context context6 = (Context) ahknVar10.t.b();
                fcyh fcyhVar5 = (fcyh) ahknVar10.bM.b();
                ctro ctroVar = (ctro) ahoiVar9.gH.b();
                ConversationId conversationId = (ConversationId) ahoiVar9.gI.b();
                ahjr ahjrVar4 = this.b;
                ahhh ahhhVar3 = this.d;
                eyik eyikVar29 = ahoiVar9.q;
                eyik eyikVar30 = ahjrVar4.au;
                cudy cudyVar6 = (cudy) ahoiVar9.gJ.b();
                eyik eyikVar31 = ahoiVar9.gK;
                eyik eyikVar32 = ahoiVar9.he;
                ctuu ctuuVar3 = (ctuu) ahoiVar9.gM.b();
                eyik eyikVar33 = ahjrVar4.aq;
                eyik eyikVar34 = ahoiVar9.ge;
                eyik eyikVar35 = ahoiVar9.gO;
                ahng ahngVar8 = ahknVar10.b;
                return new ctsy(fdjxVar6, context6, fcyhVar5, ctroVar, conversationId, eyikVar29, eyikVar30, ahhhVar3.l, cudyVar6, eyikVar31, eyikVar32, ctuuVar3, eyikVar33, eyikVar34, eyikVar35, ahngVar8.aL(), ahngVar8.aO(), new asdm(ahngVar8.a.a.oO), new ageo(), (ardj) ahknVar10.a.Sn.b(), (lwn) ((eyig) ahoiVar9.h).a, ahngVar8.aw(), (aofc) ahjrVar4.I.b());
            case 414:
                ahoi ahoiVar10 = this.c;
                fdjx fdjxVar7 = (fdjx) ahoiVar10.e.b();
                ConversationId conversationId2 = (ConversationId) ahoiVar10.gI.b();
                ctxf ctxfVar = (ctxf) ahoiVar10.gR.b();
                cudy cudyVar7 = (cudy) ahoiVar10.gJ.b();
                ctpa ctpaVar = (ctpa) ahoiVar10.hb.b();
                eigp eigpVar = (eigp) this.b.ac.b();
                ctwi ctwiVar = (ctwi) ahoiVar10.hd.b();
                ctuu ctuuVar4 = (ctuu) ahoiVar10.gM.b();
                ahkn ahknVar11 = this.a;
                eyik eyikVar36 = ahoiVar10.gO;
                eyik eyikVar37 = ahoiVar10.gS;
                final eyik eyikVar38 = ahknVar11.b.a.a.oO;
                return new ctjm(fdjxVar7, conversationId2, ctxfVar, cudyVar7, ctpaVar, eigpVar, ctwiVar, ctuuVar4, eyikVar36, eyikVar37, new apvw() { // from class: apdh
                    @Override // defpackage.apvw
                    public final boolean a() {
                        return ((eoth) eyikVar38.b()).a("bugle.log_click_on_next_after_contact_selection_in_group_creation_or_add_people");
                    }
                }, (ardr) ahknVar11.a.SK.b());
            case 415:
                ahoi ahoiVar11 = this.c;
                return new ctph((fdjx) ahoiVar11.e.b(), (ctxf) ahoiVar11.gR.b(), (cudy) ahoiVar11.gJ.b(), (cuec) ahoiVar11.gO.b());
            case 416:
                ahkn ahknVar12 = this.a;
                Context context7 = (Context) ahknVar12.t.b();
                fcyh fcyhVar6 = (fcyh) ahknVar12.bM.b();
                ahoi ahoiVar12 = this.c;
                cubp cubpVar = (cubp) ahoiVar12.hc.b();
                ctvb ctvbVar = (ctvb) ahoiVar12.gL.b();
                afzc afzcVar = (afzc) this.d.l.b();
                cisv cisvVarEB = this.b.eB();
                ahnh ahnhVar8 = ahknVar12.a;
                return new ctwn(context7, fcyhVar6, cubpVar, ctvbVar, afzcVar, cisvVarEB, ahnhVar8.Pb, ahnhVar8.XU);
            case 417:
                return new cubp();
            case 418:
                ahoi ahoiVar13 = this.c;
                fdjx fdjxVar8 = (fdjx) ahoiVar13.e.b();
                ctrc ctrcVar = (ctrc) ahoiVar13.hh.b();
                ahkn ahknVar13 = this.a;
                ahng ahngVar9 = ahknVar13.b;
                ctnu ctnuVarBG = ahngVar9.bG();
                ctmq ctmqVar = (ctmq) ahoiVar13.hi.b();
                Optional optionalOf = Optional.of((ctnw) ahoiVar13.hj.b());
                ctnn ctnnVar = (ctnn) ahoiVar13.hl.b();
                ctxx ctxxVar = (ctxx) this.d.t.b();
                cudy cudyVar8 = (cudy) ahoiVar13.gJ.b();
                ctoy ctoyVar = (ctoy) ahoiVar13.hm.b();
                cton ctonVar = (cton) ahoiVar13.hk.b();
                ctuu ctuuVar5 = (ctuu) ahoiVar13.gM.b();
                eyik eyikVar39 = ahoiVar13.gW;
                eyik eyikVar40 = ahngVar9.mQ;
                eyik eyikVar41 = ahoiVar13.gX;
                ahnh ahnhVar9 = ahknVar13.a;
                return new ctku(fdjxVar8, ctrcVar, ctnuVarBG, ctmqVar, optionalOf, ctnnVar, ctxxVar, cudyVar8, ctoyVar, ctonVar, ctuuVar5, eyikVar39, eyikVar40, eyikVar41, ahnhVar9.pl, ahngVar9.aO(), (ctma) ahoiVar13.gU.b(), (ardr) ahnhVar9.SK.b());
            case 419:
                ahkn ahknVar14 = this.a;
                Context context8 = (Context) ahknVar14.t.b();
                ahoi ahoiVar14 = this.c;
                return new ctrg(context8, (fdjx) ahoiVar14.e.b(), (ctjm) ahoiVar14.he.b(), (cudy) ahoiVar14.gJ.b(), (ajoy) ahknVar14.a.Yn.b(), (dzuc) ahknVar14.cE.b(), ahoiVar14.ge);
            case 420:
                ahkn ahknVar15 = this.a;
                Context context9 = (Context) ahknVar15.t.b();
                ahoi ahoiVar15 = this.c;
                return new ctmv(context9, (ctjm) ahoiVar15.he.b(), ahoiVar15.c(), ahoiVar15.ge, ahknVar15.b.aO(), (ardr) ahknVar15.a.SK.b());
            case 421:
                ahkn ahknVar16 = this.a;
                Context context10 = (Context) ahknVar16.t.b();
                fcyh fcyhVar7 = (fcyh) ahknVar16.cA.b();
                ahoi ahoiVar16 = this.c;
                fdjx fdjxVar9 = (fdjx) ahoiVar16.e.b();
                eyik eyikVar42 = ahknVar16.a.qi;
                eyik eyikVar43 = ahknVar16.cJ;
                cudy cudyVar9 = (cudy) ahoiVar16.gJ.b();
                ctxf ctxfVar2 = (ctxf) ahoiVar16.gR.b();
                ahjr ahjrVar5 = this.b;
                eigp eigpVar2 = (eigp) ahjrVar5.ac.b();
                ahng ahngVar10 = ahknVar16.b;
                return new ctoc(context10, fcyhVar7, fdjxVar9, eyikVar42, eyikVar43, cudyVar9, ctxfVar2, eigpVar2, ahjrVar5.oK, ahngVar10.jQ, ahjrVar5.I, ahngVar10.aM());
            case 422:
                ahoi ahoiVar17 = this.c;
                return new ctnn((fdjx) ahoiVar17.e.b(), (ajoy) this.a.a.Yn.b(), (ctrc) ahoiVar17.hh.b(), (cton) ahoiVar17.hk.b(), Optional.of((ctnw) ahoiVar17.hj.b()), (cudy) ahoiVar17.gJ.b(), ahoiVar17.gW, (ctpr) ahoiVar17.gX.b());
            case 423:
                ahoi ahoiVar18 = this.c;
                fdjx fdjxVar10 = (fdjx) ahoiVar18.e.b();
                cudy cudyVar10 = (cudy) ahoiVar18.gJ.b();
                ahkn ahknVar17 = ahoiVar18.a;
                fcyh fcyhVar8 = (fcyh) ahknVar17.bM.b();
                ahnh ahnhVar10 = ahknVar17.a;
                return new ctor(fdjxVar10, cudyVar10, new ctom(fcyhVar8, (aspu) ahnhVar10.vS.b(), (aspp) ahnhVar10.qX.b()), this.d.l);
            case 424:
                return new ctoy(this.a.gD);
            case 425:
                ahoi ahoiVar19 = this.c;
                return new ctuw((fdjx) ahoiVar19.e.b(), (Context) this.a.t.b(), (ctrq) ahoiVar19.hf.b(), (cudy) ahoiVar19.gJ.b(), (ctjm) ahoiVar19.he.b());
            case 426:
                ahoi ahoiVar20 = this.c;
                return ekhx.s((ctjd) ahoiVar20.hq.b(), (ctjd) ahoiVar20.hr.b(), new ctus((fdjx) ahoiVar20.e.b(), ahoiVar20.b.ap, ahoiVar20.gJ, ahoiVar20.c.l));
            case 427:
                ahoi ahoiVar21 = this.c;
                fdjx fdjxVar11 = (fdjx) ahoiVar21.e.b();
                ahkn ahknVar18 = this.a;
                return new ctiz(fdjxVar11, (Context) ahknVar18.t.b(), (fcyh) ahknVar18.bM.b(), (cudy) ahoiVar21.gJ.b(), (cubp) ahoiVar21.hc.b());
            case 428:
                ahoi ahoiVar22 = this.c;
                fdjx fdjxVar12 = (fdjx) ahoiVar22.e.b();
                ahkn ahknVar19 = this.a;
                Context context11 = (Context) ahknVar19.t.b();
                fcyh fcyhVar9 = (fcyh) ahknVar19.bM.b();
                cudy cudyVar11 = (cudy) ahoiVar22.gJ.b();
                ctvb ctvbVar2 = (ctvb) ahoiVar22.gL.b();
                ahax ahaxVar2 = (ahax) ahoiVar22.n.b();
                ahnh ahnhVar11 = ahknVar19.a;
                return new ctwh(fdjxVar12, context11, fcyhVar9, cudyVar11, ctvbVar2, ahaxVar2, (cmum) ahnhVar11.wF.b(), ahoiVar22.gO, (ains) ahnhVar11.pQ.b(), (ctro) ahoiVar22.gH.b(), new aplk(ahknVar19.b.a.a.oO), (apwn) ahnhVar11.Bg.b());
            default:
                throw new AssertionError(i);
        }
    }
}
