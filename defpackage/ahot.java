package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import com.google.android.apps.messaging.audio.attachment.AudioAttachmentView;
import com.google.android.apps.messaging.conversation.badges.BadgesRecyclerView;
import com.google.android.apps.messaging.conversation.reactions.ui.selection.ReactionSelectionDialogRecyclerView;
import com.google.android.apps.messaging.dittosatellite.gaia.gaiapairingsignin.GpWebTabletExpressSignInTopView;
import com.google.android.apps.messaging.home.banner.HomeBannerView;
import com.google.android.apps.messaging.penpal.gaia.PenpalExpressSignInTopView;
import com.google.android.apps.messaging.ui.appsettings.RcsSimStatusView;
import com.google.android.apps.messaging.ui.attachment.video.VideoAttachmentView;
import com.google.android.apps.messaging.ui.rcs.setup.RcsWelcomeMessageView;
import com.google.android.apps.messaging.ui.search.homeview.ZeroStateContentGridLayout;
import com.google.android.apps.messaging.ui.search.resultsview.StarredMessagesResultItemView;
import com.google.android.apps.messaging.ui.search.resultsview.ZeroStateSearchMultipleResultsView;
import com.google.android.apps.messaging.ui.search.resultsview.ZeroStateSearchResultsView;
import com.google.android.apps.messaging.ui.search.resultsview.conversation.SearchConversationResultItemView;
import com.google.android.libraries.user.profile.photopicker.art.home.view.CategoriesSectionView;
import com.google.android.libraries.user.profile.photopicker.art.home.view.RandomArtImagesSectionView;
import com.google.android.libraries.user.profile.photopicker.art.home.view.SuggestedCollectionsSectionView;
import com.google.android.libraries.user.profile.photopicker.art.view.ArtImageGridView;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahot extends ahgz {
    final eyik A;
    final eyik B;
    final eyik C;
    private final ahkn D;
    private final ahho E;
    private final ahhk F;
    private final ahib G;
    private final ahot H = this;
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

    public ahot(ahkn ahknVar, ahho ahhoVar, ahhk ahhkVar, ahib ahibVar, View view) {
        this.D = ahknVar;
        this.E = ahhoVar;
        this.F = ahhkVar;
        this.G = ahibVar;
        this.a = view;
        this.b = new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 0);
        this.c = new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 1);
        this.d = new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 2);
        this.e = new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 3);
        this.f = new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 6);
        this.g = new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 7);
        this.h = new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 9);
        this.i = new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 10);
        this.j = new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 12);
        this.k = new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 13);
        this.l = new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 11);
        this.m = new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 15);
        this.n = new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 14);
        this.o = new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 16);
        this.p = new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 17);
        this.q = new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 18);
        this.r = new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 19);
        this.s = new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 20);
        this.t = new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 21);
        this.u = new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 22);
        this.v = new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 23);
        this.w = new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 8);
        this.x = new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 24);
        this.y = new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 25);
        this.z = new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 26);
        this.A = new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 27);
        this.B = eyin.a(new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 28));
        this.C = eyin.a(new ahos(ahknVar, ahhoVar, ahhkVar, ahibVar, this, 29));
    }

    @Override // defpackage.acub
    public final acua B() {
        ahkn ahknVar = this.D;
        eigp eigpVar = (eigp) ahknVar.aI.b();
        egpr egprVar = (egpr) this.G.l.b();
        HomeBannerView homeBannerViewA = acud.a(this.a);
        return new acua(eigpVar, egprVar, homeBannerViewA);
    }

    @Override // defpackage.acxc
    public final acxb D() {
        return new acxb(acxe.a(this.a), this.F.aG(), this.D.b.jy);
    }

    @Override // defpackage.agwr
    public final agwq F() {
        PenpalExpressSignInTopView penpalExpressSignInTopViewA = agwt.a(this.a);
        ahkn ahknVar = this.D;
        ahng ahngVar = ahknVar.b;
        return new agwq(penpalExpressSignInTopViewA, ahknVar.cJ, this.f, ahngVar.kH, ahngVar.kR);
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
        return new cuvg(this.g);
    }

    @Override // defpackage.cuxb
    public final cuxa L() {
        ahhk ahhkVar = this.F;
        RcsSimStatusView rcsSimStatusViewA = cuxd.a(this.a);
        eyik eyikVar = ahhkVar.d;
        ahkn ahknVar = this.D;
        ahnh ahnhVar = ahknVar.a;
        eyik eyikVar2 = ahknVar.cD;
        eyik eyikVar3 = ahnhVar.Uk;
        eyik eyikVar4 = ahknVar.aT;
        eyik eyikVar5 = ahnhVar.uu;
        eyik eyikVar6 = ahnhVar.ri;
        ahng ahngVar = ahknVar.b;
        return new cuxa(rcsSimStatusViewA, eyikVar, eyikVar2, eyikVar3, eyikVar4, eyikVar5, eyikVar6, this.E.bA, ahngVar.kJ, ahnhVar.ym, ahnhVar.agY, ahnhVar.Ux, ahngVar.kK, ahnhVar.yq);
    }

    @Override // defpackage.cvht
    public final cvhs M() {
        return new cvhs(cvhv.a(this.a), this.D.a.qj, this.G.G);
    }

    @Override // defpackage.cvis
    public final cvir N() {
        VideoAttachmentView videoAttachmentViewA = cviu.a(this.a);
        TypedArray typedArrayH = H();
        ahhk ahhkVar = this.F;
        return new cvir(videoAttachmentViewA, typedArrayH, ahhkVar.F, ahhkVar.bk);
    }

    @Override // defpackage.cviw
    public final cviv O() {
        cviy.a(this.a);
        return new cviv();
    }

    @Override // defpackage.cvmo
    public final cvlk P() {
        return new cvlk(this.D.a.vh, this.w);
    }

    @Override // defpackage.cwkg
    public final cwke Q() {
        cwki.a(this.a);
        return new cwke();
    }

    @Override // defpackage.cwnk
    public final cwnj R() {
        return new cwnj(cwnm.a(this.a), this.D.b.nT);
    }

    @Override // defpackage.cxbt
    public final cxbs S() {
        return new cxbs(cxbv.a(this.a));
    }

    @Override // defpackage.cysr
    public final cysq T() {
        ahkn ahknVar = this.D;
        return new cysq(cyst.a(this.a), ahknVar.a.Uk, (eigp) ahknVar.aI.b());
    }

    @Override // defpackage.czry
    public final czrx U() {
        RcsWelcomeMessageView rcsWelcomeMessageViewA = czsa.a(this.a);
        ahkn ahknVar = this.D;
        return new czrx(rcsWelcomeMessageViewA, ahknVar.a.Uk, ahknVar.b.jn);
    }

    @Override // defpackage.daag
    public final daaf V() {
        return new daaf(daai.a(this.a));
    }

    @Override // defpackage.daaq
    public final daap W() {
        ZeroStateContentGridLayout zeroStateContentGridLayoutA = daas.a(this.a);
        ahng ahngVar = this.D.b;
        return new daap(zeroStateContentGridLayoutA, ahngVar.E, ahngVar.kz);
    }

    @Override // defpackage.dafg
    public final daff X() {
        ahkn ahknVar = this.D;
        ahng ahngVar = ahknVar.b;
        return new daff(this.x, ahngVar.ff, ahknVar.aI, ahngVar.E);
    }

    @Override // defpackage.dagl
    public final dagk Y() {
        StarredMessagesResultItemView starredMessagesResultItemViewA = dagn.a(this.a);
        Map mapAe = ae();
        ahng ahngVar = this.D.b;
        return new dagk(starredMessagesResultItemViewA, mapAe, ahngVar.jy, ahngVar.kz);
    }

    @Override // defpackage.dahg
    public final dahe Z() {
        ZeroStateSearchMultipleResultsView zeroStateSearchMultipleResultsViewA = dahi.a(this.a);
        ahng ahngVar = this.D.b;
        eyik eyikVar = ahngVar.ff;
        ahhk ahhkVar = this.F;
        return new dahe(zeroStateSearchMultipleResultsViewA, eyikVar, this.G.bF, ahhkVar.bn, ahhkVar.dc, this.y, this.z, this.A, this.B, ahngVar.E, this.C, ahngVar.kz);
    }

    @Override // defpackage.sst
    public final void a(AudioAttachmentView audioAttachmentView) {
        ahkn ahknVar = this.D;
        ahnh ahnhVar = ahknVar.a;
        ahng ahngVar = ahknVar.b;
        audioAttachmentView.e = ahknVar.aI;
        audioAttachmentView.f = ahngVar.nT;
        audioAttachmentView.g = ahnhVar.BK;
    }

    @Override // defpackage.cpbf
    public final void aA() {
        ahib ahibVar = this.G;
        Optional.of(eyie.a(ahibVar.co));
        Optional.of(ahibVar.c());
    }

    @Override // defpackage.edcz
    public final void aB(ArtImageGridView artImageGridView) {
        ahhk ahhkVar = this.F;
        artImageGridView.a = (edmz) ahhkVar.cj.b();
        artImageGridView.g = ahhkVar.ab();
        artImageGridView.b = (eddy) ahhkVar.bR.b();
        ahng ahngVar = this.D.b;
        artImageGridView.c = (dswb) ahngVar.iZ.b();
        artImageGridView.d = (dsvx) ahngVar.ja.b();
        artImageGridView.e = (dsvh) ahngVar.jc.b();
    }

    @Override // defpackage.edbd
    public final void aC(CategoriesSectionView categoriesSectionView) {
        ahhk ahhkVar = this.F;
        categoriesSectionView.e = ahhkVar.ab();
        categoriesSectionView.a = (eddy) ahhkVar.bR.b();
        ahng ahngVar = this.D.b;
        categoriesSectionView.b = (dswb) ahngVar.iZ.b();
        categoriesSectionView.c = (dsvx) ahngVar.ja.b();
        categoriesSectionView.d = (dsvh) ahngVar.jc.b();
    }

    @Override // defpackage.edpw
    public final void aD(edpv edpvVar) {
        ahhk ahhkVar = this.F;
        edpvVar.a = (eduu) ahhkVar.cT.b();
        edpvVar.b = (eddy) ahhkVar.bR.b();
        ahng ahngVar = this.D.b;
        edpvVar.c = (dswb) ahngVar.iZ.b();
        edpvVar.d = (dsvh) ahngVar.jc.b();
        edpvVar.e = (edmz) ahhkVar.cj.b();
    }

    @Override // defpackage.edqc
    public final void aE(edqb edqbVar) {
        ahhk ahhkVar = this.F;
        edqbVar.b = (eduu) ahhkVar.cT.b();
        ahng ahngVar = this.D.b;
        edqbVar.c = (dswb) ahngVar.iZ.b();
        edqbVar.d = (edmz) ahhkVar.cj.b();
        edqbVar.e = new edex(ahhkVar.bR, ahngVar.iZ, ahngVar.ja, ahngVar.jc);
        edqbVar.f = (dsvx) ahngVar.ja.b();
    }

    @Override // defpackage.edbi
    public final void aF(RandomArtImagesSectionView randomArtImagesSectionView) {
        ahng ahngVar = this.D.b;
        ahhk ahhkVar = this.F;
        randomArtImagesSectionView.b = new eddi(ahhkVar.bR, ahngVar.iZ, ahngVar.ja, ahngVar.jc, ahhkVar.cj);
        randomArtImagesSectionView.f = ahhkVar.ab();
        randomArtImagesSectionView.c = (dswb) ahngVar.iZ.b();
        randomArtImagesSectionView.d = (dsvx) ahngVar.ja.b();
    }

    @Override // defpackage.edbk
    public final void aG(SuggestedCollectionsSectionView suggestedCollectionsSectionView) {
        ahhk ahhkVar = this.F;
        suggestedCollectionsSectionView.g = ahhkVar.ab();
        suggestedCollectionsSectionView.b = (eddy) ahhkVar.bR.b();
        ahng ahngVar = this.D.b;
        suggestedCollectionsSectionView.c = (dswb) ahngVar.iZ.b();
        suggestedCollectionsSectionView.d = (dsvx) ahngVar.ja.b();
        suggestedCollectionsSectionView.e = (dsvh) ahngVar.jc.b();
    }

    @Override // defpackage.daho
    public final dahm aa() {
        ZeroStateSearchResultsView zeroStateSearchResultsViewA = dahq.a(this.a);
        ahng ahngVar = this.D.b;
        ahhk ahhkVar = this.F;
        return new dahm(zeroStateSearchResultsViewA, this.G.bF, ahhkVar.bn, ahhkVar.dc, this.z, this.y, this.A, this.B, ahngVar.E, this.C, ahngVar.kz, ahngVar.kT);
    }

    @Override // defpackage.dahs
    public final dahr ab() {
        SearchConversationResultItemView searchConversationResultItemViewA = dahu.a(this.a);
        Map mapAe = ae();
        ahng ahngVar = this.D.b;
        return new dahr(searchConversationResultItemViewA, mapAe, ahngVar.jy, ahngVar.kz);
    }

    @Override // defpackage.daxb
    public final daxa ac() {
        return new daxa(daxd.a(this.a), (Activity) this.F.d.b(), this.D.b.kR);
    }

    @Override // einc.c
    public final einm ad() {
        return (einm) this.D.b.nT.b();
    }

    final Map ae() {
        ekgi ekgiVarH = ekgp.h(10);
        adar adarVar = adar.AVATAR;
        ahhk ahhkVar = this.F;
        ekgiVarH.i(adarVar, ahhkVar.z());
        adar adarVar2 = adar.NAME;
        Context context = (Context) ahhkVar.d.b();
        acxz acxzVarD = ahhkVar.D();
        ahkn ahknVar = ahhkVar.b;
        ahng ahngVar = ahknVar.b;
        ekgiVarH.i(adarVar2, new dahx(context, acxzVarD, ahngVar.kF, ahknVar.a.uo));
        ekgiVarH.i(adar.SNIPPET, new dahz(ahhkVar.E(), ahngVar.kF));
        ekgiVarH.i(adar.SUBJECT, new daib(ahhkVar.H(), ahngVar.kF));
        ekgiVarH.i(adar.TIMESTAMP, ahhkVar.I());
        ekgiVarH.i(adar.NOTIFICATION_SNOOZE_ICON, ahhkVar.F());
        ekgiVarH.i(adar.WORK_PROFILE_ICON, new acyq());
        ekgiVarH.i(adar.CONTENT_DESCRIPTION, ahhkVar.B());
        ekgiVarH.i(adar.UNREAD_BADGE, ahhkVar.J());
        ekgiVarH.i(adar.STATUS, ahhkVar.G());
        return ekgiVarH.c();
    }

    @Override // defpackage.txz
    public final txy b() {
        return new txy(tyb.a(this.a));
    }

    @Override // defpackage.tye
    public final tyd d() {
        return new tyd(tyg.a(this.a), (cvjl) this.D.a.up.b());
    }

    @Override // defpackage.ufb
    public final ufa f() {
        BadgesRecyclerView badgesRecyclerViewA = ufd.a(this.a);
        ekgi ekgiVarH = ekgp.h(6);
        uer uerVar = uer.CALENDAR_BADGE;
        ahhk ahhkVar = this.F;
        ekgiVarH.i(uerVar, new cwst((Context) ahhkVar.d.b()));
        ekgiVarH.i(uer.REACTION_BADGE, new und((Context) ahhkVar.d.b(), new une(ahhkVar.b.b.kG)));
        ekgiVarH.i(uer.CUSTOM_REACTION_BADGE, new unh());
        ekgiVarH.i(uer.STAR_BADGE, new uur((Context) ahhkVar.d.b()));
        ekgiVarH.i(uer.REMINDER_BADGE, new czww((Context) ahhkVar.d.b()));
        ekgiVarH.i(uer.SCHEDULED_SEND_BADGE, new aifa((Context) ahhkVar.d.b()));
        ekgp ekgpVarC = ekgiVarH.c();
        ahkn ahknVar = this.D;
        eigp eigpVar = (eigp) ahknVar.aI.b();
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
        ahkn ahknVar = this.D;
        ahng ahngVar = ahknVar.b;
        ahng ahngVar2 = this.G.a.b;
        cklj.a((aipw) ahngVar2.hs.b(), ahngVar2.hQ.b());
        return new unn(reactionSelectionDialogRecyclerViewA);
    }

    @Override // defpackage.upi
    public final uph l() {
        return new uph(this.d, (dair) this.D.b.nU.b());
    }

    @Override // defpackage.uty
    public final utx n() {
        ahkn ahknVar = this.D;
        ahnh ahnhVar = ahknVar.a;
        return new utx((cpga) ahnhVar.Wj.b(), (einm) ahknVar.b.nT.b(), uua.a(this.a), (alrj) ahnhVar.qi.b());
    }

    @Override // defpackage.uud
    public final uuc p() {
        return new uuc((Optional) this.e.b(), new utw((eidm) this.F.T.b()), uuf.a(this.a));
    }

    @Override // defpackage.aavh
    public final aavg r() {
        return new aavg();
    }

    @Override // defpackage.abik
    public final abij t() {
        ahkn ahknVar = this.D;
        eyik eyikVar = ahknVar.aI;
        GpWebTabletExpressSignInTopView gpWebTabletExpressSignInTopViewA = abim.a(this.a);
        ahnh ahnhVar = ahknVar.a;
        return new abij(gpWebTabletExpressSignInTopViewA, this.F.d, ahnhVar.Uk, (eigp) eyikVar.b(), ahnhVar.LC, (fdjx) ahnhVar.m.b());
    }

    @Override // defpackage.acbv
    public final acbu v() {
        eyik eyikVar = this.D.aI;
        return new acbu(acbx.a(this.a), this.E.bA, this.F.d, (eigp) eyikVar.b());
    }

    @Override // defpackage.acnb
    public final acna x() {
        return new acna(acnd.a(this.a));
    }

    @Override // defpackage.acni
    public final acnh z() {
        return new acnh(acnk.a(this.a), this.D.no);
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
