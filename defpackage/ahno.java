package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import com.google.android.apps.messaging.audio.attachment.AudioAttachmentView;
import com.google.android.apps.messaging.conversation.badges.BadgesRecyclerView;
import com.google.android.apps.messaging.conversation.reactions.ui.selection.ReactionSelectionDialogRecyclerView;
import com.google.android.apps.messaging.dittosatellite.gaia.gaiapairingsignin.GpWebTabletExpressSignInTopView;
import com.google.android.apps.messaging.gaia.expresssignin.HqmsExpressSignInTopView;
import com.google.android.apps.messaging.home.banner.HomeBannerView;
import com.google.android.apps.messaging.penpal.gaia.PenpalExpressSignInTopView;
import com.google.android.apps.messaging.ui.appsettings.RcsSimStatusView;
import com.google.android.apps.messaging.ui.search.homeview.ZeroStateContentGridLayout;
import com.google.android.apps.messaging.ui.search.resultsview.StarredMessagesResultItemView;
import com.google.android.apps.messaging.ui.search.resultsview.ZeroStateSearchMultipleResultsView;
import com.google.android.apps.messaging.ui.search.resultsview.ZeroStateSearchResultsView;
import com.google.android.apps.messaging.ui.search.resultsview.conversation.SearchConversationResultItemView;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahno extends ahgv {
    private final ahkn A;
    private final ahjr B;
    private final ahhe C;
    private final ahhw D;
    private final ahno E = this;
    public final View a;
    final eyik b;
    final eyik c;
    final eyik d;
    final eyik e;
    final eyik f;
    final eyik g;
    final eyik h;
    final eyik i;
    final eyik j;
    final eyik k;
    final eyik l;
    final eyik m;
    final eyik n;
    final eyik o;
    final eyik p;
    final eyik q;
    final eyik r;
    final eyik s;
    final eyik t;
    final eyik u;
    final eyik v;
    final eyik w;
    final eyik x;
    final eyik y;
    final eyik z;

    public ahno(ahkn ahknVar, ahjr ahjrVar, ahhe ahheVar, ahhw ahhwVar, View view) {
        this.A = ahknVar;
        this.B = ahjrVar;
        this.C = ahheVar;
        this.D = ahhwVar;
        this.a = view;
        this.b = new ahnn(ahknVar, ahjrVar, ahheVar, ahhwVar, this, 0);
        this.c = new ahnn(ahknVar, ahjrVar, ahheVar, ahhwVar, this, 1);
        this.d = new ahnn(ahknVar, ahjrVar, ahheVar, ahhwVar, this, 2);
        this.e = new ahnn(ahknVar, ahjrVar, ahheVar, ahhwVar, this, 5);
        this.f = new ahnn(ahknVar, ahjrVar, ahheVar, ahhwVar, this, 6);
        this.g = new ahnn(ahknVar, ahjrVar, ahheVar, ahhwVar, this, 8);
        this.h = new ahnn(ahknVar, ahjrVar, ahheVar, ahhwVar, this, 9);
        this.i = new ahnn(ahknVar, ahjrVar, ahheVar, ahhwVar, this, 11);
        this.j = new ahnn(ahknVar, ahjrVar, ahheVar, ahhwVar, this, 12);
        this.k = new ahnn(ahknVar, ahjrVar, ahheVar, ahhwVar, this, 10);
        this.l = new ahnn(ahknVar, ahjrVar, ahheVar, ahhwVar, this, 14);
        this.m = new ahnn(ahknVar, ahjrVar, ahheVar, ahhwVar, this, 13);
        this.n = new ahnn(ahknVar, ahjrVar, ahheVar, ahhwVar, this, 15);
        this.o = new ahnn(ahknVar, ahjrVar, ahheVar, ahhwVar, this, 16);
        this.p = new ahnn(ahknVar, ahjrVar, ahheVar, ahhwVar, this, 17);
        this.q = new ahnn(ahknVar, ahjrVar, ahheVar, ahhwVar, this, 18);
        this.r = new ahnn(ahknVar, ahjrVar, ahheVar, ahhwVar, this, 19);
        this.s = new ahnn(ahknVar, ahjrVar, ahheVar, ahhwVar, this, 7);
        this.t = new ahnn(ahknVar, ahjrVar, ahheVar, ahhwVar, this, 20);
        this.u = new ahnn(ahknVar, ahjrVar, ahheVar, ahhwVar, this, 21);
        this.v = new ahnn(ahknVar, ahjrVar, ahheVar, ahhwVar, this, 22);
        this.w = new ahnn(ahknVar, ahjrVar, ahheVar, ahhwVar, this, 23);
        this.x = new ahnn(ahknVar, ahjrVar, ahheVar, ahhwVar, this, 24);
        this.y = eyin.a(new ahnn(ahknVar, ahjrVar, ahheVar, ahhwVar, this, 25));
        this.z = eyin.a(new ahnn(ahknVar, ahjrVar, ahheVar, ahhwVar, this, 26));
    }

    @Override // defpackage.acub
    public final acua B() {
        eigp eigpVar = (eigp) this.B.ac.b();
        egpr egprVar = (egpr) this.D.f.b();
        HomeBannerView homeBannerViewA = acud.a(this.a);
        return new acua(eigpVar, egprVar, homeBannerViewA);
    }

    @Override // defpackage.acxc
    public final acxb D() {
        return new acxb(acxe.a(this.a), this.D.B(), this.A.b.jy);
    }

    @Override // defpackage.agwr
    public final agwq F() {
        PenpalExpressSignInTopView penpalExpressSignInTopViewA = agwt.a(this.a);
        ahkn ahknVar = this.A;
        return new agwq(penpalExpressSignInTopViewA, ahknVar.cJ, this.e, ahknVar.b.kH, this.D.av);
    }

    final TypedArray H() {
        return einq.a(this.a);
    }

    @Override // defpackage.aidw
    public final aidv I() {
        return new aidv(aidy.a(this.a), H());
    }

    @Override // defpackage.aiea
    public final aidz J() {
        return new aidz(aiec.a(this.a));
    }

    @Override // defpackage.cuvi
    public final cuvg K() {
        return new cuvg(this.f);
    }

    @Override // defpackage.cuxb
    public final cuxa L() {
        RcsSimStatusView rcsSimStatusViewA = cuxd.a(this.a);
        ahkn ahknVar = this.A;
        ahnh ahnhVar = ahknVar.a;
        eyik eyikVar = this.C.f;
        eyik eyikVar2 = ahknVar.cD;
        eyik eyikVar3 = ahnhVar.Uk;
        ahjr ahjrVar = this.B;
        eyik eyikVar4 = ahknVar.aT;
        eyik eyikVar5 = ahnhVar.uu;
        eyik eyikVar6 = ahnhVar.ri;
        eyik eyikVar7 = ahjrVar.oU;
        ahng ahngVar = ahknVar.b;
        return new cuxa(rcsSimStatusViewA, eyikVar, eyikVar2, eyikVar3, eyikVar4, eyikVar5, eyikVar6, eyikVar7, ahngVar.kJ, ahnhVar.ym, ahnhVar.agY, ahnhVar.Ux, ahngVar.kK, ahnhVar.yq);
    }

    @Override // defpackage.cvht
    public final cvhs M() {
        return new cvhs(cvhv.a(this.a), this.A.a.qj, this.D.eg);
    }

    @Override // defpackage.cvis
    public final cvir N() {
        ahhw ahhwVar = this.D;
        return new cvir(cviu.a(this.a), H(), this.C.q, ahhwVar.aI);
    }

    @Override // defpackage.cviw
    public final cviv O() {
        cviy.a(this.a);
        return new cviv();
    }

    @Override // defpackage.cvmo
    public final cvlk P() {
        return new cvlk(this.A.a.vh, this.s);
    }

    @Override // defpackage.cwkg
    public final cwke Q() {
        cwki.a(this.a);
        return new cwke();
    }

    @Override // defpackage.cwnk
    public final cwnj R() {
        return new cwnj(cwnm.a(this.a), this.C.e);
    }

    @Override // defpackage.cxbt
    public final cxbs S() {
        return new cxbs(cxbv.a(this.a));
    }

    @Override // defpackage.cysr
    public final cysq T() {
        return new cysq(cyst.a(this.a), this.A.a.Uk, (eigp) this.B.ac.b());
    }

    @Override // defpackage.czry
    public final czrx U() {
        return new czrx(czsa.a(this.a), this.A.a.Uk, this.D.aX);
    }

    @Override // defpackage.daag
    public final daaf V() {
        return new daaf(daai.a(this.a));
    }

    @Override // defpackage.daaq
    public final daap W() {
        ZeroStateContentGridLayout zeroStateContentGridLayoutA = daas.a(this.a);
        ahng ahngVar = this.A.b;
        return new daap(zeroStateContentGridLayoutA, ahngVar.E, ahngVar.kz);
    }

    @Override // defpackage.dafg
    public final daff X() {
        ahng ahngVar = this.A.b;
        return new daff(this.t, ahngVar.ff, this.B.ac, ahngVar.E);
    }

    @Override // defpackage.dagl
    public final dagk Y() {
        StarredMessagesResultItemView starredMessagesResultItemViewA = dagn.a(this.a);
        Map mapAe = ae();
        ahng ahngVar = this.A.b;
        return new dagk(starredMessagesResultItemViewA, mapAe, ahngVar.jy, ahngVar.kz);
    }

    @Override // defpackage.dahg
    public final dahe Z() {
        ZeroStateSearchMultipleResultsView zeroStateSearchMultipleResultsViewA = dahi.a(this.a);
        ahng ahngVar = this.A.b;
        return new dahe(zeroStateSearchMultipleResultsViewA, ahngVar.ff, this.D.bo, this.u, this.C.ag, this.v, this.w, this.x, this.y, ahngVar.E, this.z, ahngVar.kz);
    }

    @Override // defpackage.sst
    public final void a(AudioAttachmentView audioAttachmentView) {
        ahkn ahknVar = this.A;
        ahnh ahnhVar = ahknVar.a;
        audioAttachmentView.e = this.B.ac;
        audioAttachmentView.f = this.C.e;
        audioAttachmentView.g = ahnhVar.BK;
    }

    @Override // defpackage.cpbf
    public final void aA() {
        ahhw ahhwVar = this.D;
        Optional.of(eyie.a(ahhwVar.ec));
        Optional.of(ahhwVar.h());
    }

    @Override // defpackage.daho
    public final dahm aa() {
        ZeroStateSearchResultsView zeroStateSearchResultsViewA = dahq.a(this.a);
        ahng ahngVar = this.A.b;
        return new dahm(zeroStateSearchResultsViewA, this.D.bo, this.u, this.C.ag, this.w, this.v, this.x, this.y, ahngVar.E, this.z, ahngVar.kz, ahngVar.kT);
    }

    @Override // defpackage.dahs
    public final dahr ab() {
        SearchConversationResultItemView searchConversationResultItemViewA = dahu.a(this.a);
        Map mapAe = ae();
        ahng ahngVar = this.A.b;
        return new dahr(searchConversationResultItemViewA, mapAe, ahngVar.jy, ahngVar.kz);
    }

    @Override // defpackage.daxb
    public final daxa ac() {
        return new daxa(daxd.a(this.a), (Activity) this.C.f.b(), this.D.av);
    }

    @Override // einc.c
    public final einm ad() {
        return (einm) this.C.e.b();
    }

    final Map ae() {
        ekgi ekgiVarH = ekgp.h(10);
        adar adarVar = adar.AVATAR;
        ahhe ahheVar = this.C;
        ekgiVarH.i(adarVar, ahheVar.g());
        eyik eyikVar = ahheVar.f;
        adar adarVar2 = adar.NAME;
        Context context = (Context) eyikVar.b();
        acxz acxzVarI = ahheVar.i();
        ahkn ahknVar = ahheVar.b;
        ahng ahngVar = ahknVar.b;
        ekgiVarH.i(adarVar2, new dahx(context, acxzVarI, ahngVar.kF, ahknVar.a.uo));
        ekgiVarH.i(adar.SNIPPET, new dahz(ahheVar.j(), ahngVar.kF));
        ekgiVarH.i(adar.SUBJECT, new daib(ahheVar.m(), ahngVar.kF));
        ekgiVarH.i(adar.TIMESTAMP, ahheVar.n());
        ekgiVarH.i(adar.NOTIFICATION_SNOOZE_ICON, ahheVar.k());
        ekgiVarH.i(adar.WORK_PROFILE_ICON, new acyq());
        ekgiVarH.i(adar.CONTENT_DESCRIPTION, ahheVar.h());
        ekgiVarH.i(adar.UNREAD_BADGE, ahheVar.o());
        ekgiVarH.i(adar.STATUS, ahheVar.l());
        return ekgiVarH.c();
    }

    @Override // defpackage.txz
    public final txy b() {
        return new txy(tyb.a(this.a));
    }

    @Override // defpackage.tye
    public final tyd d() {
        return new tyd(tyg.a(this.a), (cvjl) this.A.a.up.b());
    }

    @Override // defpackage.ufb
    public final ufa f() {
        ahhe ahheVar = this.C;
        eyik eyikVar = ahheVar.f;
        BadgesRecyclerView badgesRecyclerViewA = ufd.a(this.a);
        ekgi ekgiVarH = ekgp.h(6);
        ekgiVarH.i(uer.CALENDAR_BADGE, new cwst((Context) eyikVar.b()));
        ekgiVarH.i(uer.REACTION_BADGE, new und((Context) eyikVar.b(), new une(ahheVar.b.b.kG)));
        ekgiVarH.i(uer.CUSTOM_REACTION_BADGE, new unh());
        ekgiVarH.i(uer.STAR_BADGE, new uur((Context) eyikVar.b()));
        ekgiVarH.i(uer.REMINDER_BADGE, new czww((Context) eyikVar.b()));
        ekgiVarH.i(uer.SCHEDULED_SEND_BADGE, new aifa((Context) eyikVar.b()));
        ekgp ekgpVarC = ekgiVarH.c();
        ahjr ahjrVar = this.B;
        eigp eigpVar = (eigp) ahjrVar.ac.b();
        ahkn ahknVar = this.A;
        Context context = (Context) ahknVar.t.b();
        ahnh ahnhVar = ahknVar.a;
        ues uesVar = new ues(context, (cssf) ahnhVar.uo.b());
        return new ufa(badgesRecyclerViewA, ekgpVarC, eigpVar, uesVar, (cssf) ahnhVar.uo.b());
    }

    @Override // defpackage.ulr
    public final ulp h() {
        return new ulp();
    }

    @Override // defpackage.uno
    public final unn j() {
        ReactionSelectionDialogRecyclerView reactionSelectionDialogRecyclerViewA = unq.a(this.a);
        ahng ahngVar = this.A.b;
        cklj.a((aipw) this.D.p.b(), ahngVar.hQ.b());
        return new unn(reactionSelectionDialogRecyclerViewA);
    }

    @Override // defpackage.upi
    public final uph l() {
        return new uph(this.d, (dair) this.B.pd.b());
    }

    @Override // defpackage.uty
    public final utx n() {
        ahnh ahnhVar = this.A.a;
        return new utx((cpga) ahnhVar.Wj.b(), (einm) this.C.e.b(), uua.a(this.a), (alrj) ahnhVar.qi.b());
    }

    @Override // defpackage.uud
    public final uuc p() {
        ahhw ahhwVar = this.D;
        return new uuc((Optional) ahhwVar.bi.b(), new utw((eidm) ahhwVar.aQ.b()), uuf.a(this.a));
    }

    @Override // defpackage.aavh
    public final aavg r() {
        return new aavg();
    }

    @Override // defpackage.abik
    public final abij t() {
        GpWebTabletExpressSignInTopView gpWebTabletExpressSignInTopViewA = abim.a(this.a);
        ahnh ahnhVar = this.A.a;
        return new abij(gpWebTabletExpressSignInTopViewA, this.C.f, ahnhVar.Uk, (eigp) this.B.ac.b(), ahnhVar.LC, (fdjx) ahnhVar.m.b());
    }

    @Override // defpackage.acbv
    public final acbu v() {
        HqmsExpressSignInTopView hqmsExpressSignInTopViewA = acbx.a(this.a);
        ahjr ahjrVar = this.B;
        return new acbu(hqmsExpressSignInTopViewA, ahjrVar.oU, this.C.f, (eigp) ahjrVar.ac.b());
    }

    @Override // defpackage.acnb
    public final acna x() {
        return new acna(acnd.a(this.a));
    }

    @Override // defpackage.acni
    public final acnh z() {
        return new acnh(acnk.a(this.a), this.A.no);
    }

    @Override // defpackage.acnj
    public final void A() {
    }

    @Override // defpackage.acuc
    public final void C() {
    }

    @Override // defpackage.acxd
    public final void E() {
    }

    @Override // defpackage.agws
    public final void G() {
    }

    @Override // defpackage.cvhu
    public final void af() {
    }

    @Override // defpackage.daah
    public final void ag() {
    }

    @Override // defpackage.cwkh
    public final void ah() {
    }

    @Override // defpackage.cvmp
    public final void ai() {
    }

    @Override // defpackage.cxbu
    public final void aj() {
    }

    @Override // defpackage.aidx
    public final void ak() {
    }

    @Override // defpackage.cyss
    public final void al() {
    }

    @Override // defpackage.cvix
    public final void am() {
    }

    @Override // defpackage.aieb
    public final void an() {
    }

    @Override // defpackage.cuvj
    public final void ao() {
    }

    @Override // defpackage.cuxc
    public final void ap() {
    }

    @Override // defpackage.czrz
    public final void aq() {
    }

    @Override // defpackage.dafh
    public final void ar() {
    }

    @Override // defpackage.daht
    public final void as() {
    }

    @Override // defpackage.dagm
    public final void at() {
    }

    @Override // defpackage.cwnl
    public final void au() {
    }

    @Override // defpackage.cvit
    public final void av() {
    }

    @Override // defpackage.daxc
    public final void aw() {
    }

    @Override // defpackage.daar
    public final void ax() {
    }

    @Override // defpackage.dahh
    public final void ay() {
    }

    @Override // defpackage.dahp
    public final void az() {
    }

    @Override // defpackage.tya
    public final void c() {
    }

    @Override // defpackage.tyf
    public final void e() {
    }

    @Override // defpackage.ufc
    public final void g() {
    }

    @Override // defpackage.uls
    public final void i() {
    }

    @Override // defpackage.unp
    public final void k() {
    }

    @Override // defpackage.upj
    public final void m() {
    }

    @Override // defpackage.utz
    public final void o() {
    }

    @Override // defpackage.uue
    public final void q() {
    }

    @Override // defpackage.aavi
    public final void s() {
    }

    @Override // defpackage.abil
    public final void u() {
    }

    @Override // defpackage.acbw
    public final void w() {
    }

    @Override // defpackage.acnc
    public final void y() {
    }
}
