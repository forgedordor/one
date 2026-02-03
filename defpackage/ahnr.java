package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.messaging.conversation.messagelist.tombstone.ConversationTombstoneView;
import com.google.android.apps.messaging.conversation.settings.BusinessContactActionView;
import com.google.android.apps.messaging.conversation.settings.BusinessTopActionView;
import com.google.android.apps.messaging.conversation.settings.ConversationSettingsOptionItemView;
import com.google.android.apps.messaging.diagnostics.sensor.ui.TakeBugReportDialogView;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackDataView;
import com.google.android.apps.messaging.popup.federatedlearning.FederatedLearningPopupView;
import com.google.android.apps.messaging.popup.spam.SpamPopupView;
import com.google.android.apps.messaging.shared.audio.attachment.ui.AudioPlaybackSeekBar;
import com.google.android.apps.messaging.shared.audio.attachment.ui.PausableChronometer;
import com.google.android.apps.messaging.shared.ui.AsyncImageView;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import com.google.android.apps.messaging.ui.ImeDetectCoordinatorLayout;
import com.google.android.apps.messaging.ui.attachment.VCardAttachmentView;
import com.google.android.apps.messaging.ui.contact.ContactListItemView;
import com.google.android.apps.messaging.ui.conversation.AudioButtonView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageMetadataView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageTransferView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import com.google.android.apps.messaging.ui.conversation.message.MessageMetadataDetailsView;
import com.google.android.apps.messaging.ui.conversation.richcard.ConversationRichCardCarouselView;
import com.google.android.apps.messaging.ui.conversation.richcard.ConversationRichCardView;
import com.google.android.apps.messaging.ui.conversation.richcard.RichCardMediaAttachmentView;
import com.google.android.apps.messaging.ui.conversation.richcard.RichCardVideoOverlayView;
import com.google.android.apps.messaging.ui.conversation.suggestions.ConversationSuggestionsView;
import com.google.android.apps.messaging.ui.conversation.suggestions.tooltip.ConversationSuggestionsBugleTooltipView;
import com.google.android.apps.messaging.ui.conversation.toolstone.ConversationToolstoneView;
import com.google.android.apps.messaging.ui.ditto.QrScannerOverlayView;
import com.google.android.apps.messaging.ui.generic.spannedautocomplete.SpannedMultiAutoCompleteTextView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.CategoryToggleView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.emoji.EmojiContentItemView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker.ExpressiveStickerContentItemView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryContentItemView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifCategoryContentItemView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.LocationContentCategoryView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.selectable.SelectableContentItemView;
import com.google.android.apps.messaging.ui.mediapicker.camera.CameraTextureView;
import com.google.android.apps.messaging.ui.mediapicker.camera.MiniCameraViewImpl;
import com.google.android.apps.messaging.ui.search.ZeroStateSearchBox;
import com.google.android.apps.messaging.ui.video.VideoOverlayView;
import com.google.android.libraries.compose.emoji.ui.views.SingleEmojiView;
import com.google.android.libraries.compose.emoji.ui.views.SingleEmojiViewWithVariantIndicator;
import com.google.android.libraries.user.profile.photopicker.art.edit.EditableArtView;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;
import com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Function;
import javax.microedition.khronos.egl.EGLContext;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahnr extends ahgw {
    private final ahnr A = this;
    final eyik a;
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
    private final ahkn x;
    private final ahho y;
    private final ahhk z;

    public ahnr(ahkn ahknVar, ahho ahhoVar, ahhk ahhkVar) {
        this.x = ahknVar;
        this.y = ahhoVar;
        this.z = ahhkVar;
        this.a = new ahnq(ahknVar, ahhoVar, ahhkVar, this, 1);
        this.b = new ahnq(ahknVar, ahhoVar, ahhkVar, this, 2);
        this.c = new ahnq(ahknVar, ahhoVar, ahhkVar, this, 3);
        this.d = new ahnq(ahknVar, ahhoVar, ahhkVar, this, 4);
        this.e = new ahnq(ahknVar, ahhoVar, ahhkVar, this, 5);
        this.f = new ahnq(ahknVar, ahhoVar, ahhkVar, this, 6);
        this.g = new ahnq(ahknVar, ahhoVar, ahhkVar, this, 7);
        this.h = new ahnq(ahknVar, ahhoVar, ahhkVar, this, 8);
        this.i = new ahnq(ahknVar, ahhoVar, ahhkVar, this, 9);
        this.j = new ahnq(ahknVar, ahhoVar, ahhkVar, this, 10);
        this.k = new ahnq(ahknVar, ahhoVar, ahhkVar, this, 11);
        this.l = new ahnq(ahknVar, ahhoVar, ahhkVar, this, 12);
        this.m = new ahnq(ahknVar, ahhoVar, ahhkVar, this, 13);
        this.n = new ahnq(ahknVar, ahhoVar, ahhkVar, this, 14);
        this.o = new ahnq(ahknVar, ahhoVar, ahhkVar, this, 15);
        this.p = new ahnq(ahknVar, ahhoVar, ahhkVar, this, 17);
        this.q = new ahnq(ahknVar, ahhoVar, ahhkVar, this, 16);
        this.r = new ahnq(ahknVar, ahhoVar, ahhkVar, this, 18);
        this.s = new ahnq(ahknVar, ahhoVar, ahhkVar, this, 20);
        this.t = new ahnq(ahknVar, ahhoVar, ahhkVar, this, 23);
        this.u = new ahnq(ahknVar, ahhoVar, ahhkVar, this, 25);
        this.v = new ahnq(ahknVar, ahhoVar, ahhkVar, this, 26);
        this.w = new ahnq(ahknVar, ahhoVar, ahhkVar, this, 24);
    }

    @Override // defpackage.cwqs
    public final void A(ConversationSuggestionsView conversationSuggestionsView) {
        ahkn ahknVar = this.x;
        ahng ahngVar = ahknVar.b;
        ahnh ahnhVar = ahknVar.a;
        conversationSuggestionsView.a = (aijh) ahnhVar.Uk.b();
        ahho ahhoVar = this.y;
        conversationSuggestionsView.b = (achu) ahhoVar.bA.b();
        ahhk ahhkVar = this.z;
        conversationSuggestionsView.c = ahhkVar.aW;
        Context context = (Context) ahhkVar.d.b();
        cqmb cqmbVar = (cqmb) ahknVar.cU.b();
        acgu acguVar = (acgu) ahnhVar.ws.b();
        crba crbaVar = (crba) ahknVar.jt.b();
        eyik eyikVar = ahknVar.aT;
        eyik eyikVar2 = ahnhVar.Cd;
        crqv crqvVar = (crqv) eyikVar.b();
        ajhd ajhdVar = (ajhd) ahnhVar.yw.b();
        cogw cogwVar = (cogw) ahknVar.cD.b();
        eyik eyikVar3 = ahhoVar.cs;
        conversationSuggestionsView.d = new cwpx(context, cqmbVar, acguVar, crbaVar, eyikVar2, crqvVar, ajhdVar, cogwVar, ahnhVar.BQ, (aykm) eyikVar3.b(), m(), (daoe) ahngVar.hX.b(), eyie.a(ahhkVar.bb), (eigp) ahknVar.aI.b(), this.s, ahngVar.kR);
        conversationSuggestionsView.e = (Optional) ahnhVar.adD.b();
    }

    @Override // defpackage.cwuf
    public final void B(ConversationToolstoneView conversationToolstoneView) {
        conversationToolstoneView.a = this.x.a.Vr;
    }

    @Override // defpackage.edal
    public final void C(EditableArtView editableArtView) {
        editableArtView.s = this.z.ac();
        editableArtView.t = (dsvh) this.x.b.jc.b();
    }

    @Override // defpackage.edns
    public final void D(EditablePhotoView editablePhotoView) {
        editablePhotoView.q = ((edod) ((lxo) this.z.ci.b()).a(edod.class)).f;
        editablePhotoView.r = (dsvh) this.x.b.jc.b();
    }

    @Override // defpackage.cyxi
    public final void E(EmojiContentItemView emojiContentItemView) {
        emojiContentItemView.a = (cpch) this.x.a.qj.b();
    }

    @Override // defpackage.dpfr
    public final void F(dpfq dpfqVar) {
        dpfqVar.c = (dniv) this.w.b();
        dpfqVar.d = (dpir) this.z.bu.b();
    }

    @Override // defpackage.cyxo
    public final void G(ExpressiveStickerContentItemView expressiveStickerContentItemView) {
        ahkn ahknVar = this.x;
        expressiveStickerContentItemView.f = (cqei) ahknVar.b.kI.b();
        expressiveStickerContentItemView.a = (cvjo) this.z.bk.b();
        expressiveStickerContentItemView.b = (eigp) ahknVar.aI.b();
    }

    @Override // defpackage.edmw
    public final void H(FullscreenErrorView fullscreenErrorView) {
        ahng ahngVar = this.x.b;
        fullscreenErrorView.d = (dswb) ahngVar.iZ.b();
        fullscreenErrorView.e = (dsvh) ahngVar.jc.b();
    }

    @Override // defpackage.czak
    public final void I(GalleryContentItemView galleryContentItemView) {
        ahkn ahknVar = this.x;
        galleryContentItemView.f = (cqei) ahknVar.b.kI.b();
        galleryContentItemView.e = (eigp) ahknVar.aI.b();
    }

    @Override // defpackage.czcs
    public final void J(GifCategoryContentItemView gifCategoryContentItemView) {
        gifCategoryContentItemView.a = (cvjo) this.z.bk.b();
    }

    @Override // defpackage.cujo
    public final void K(ImeDetectCoordinatorLayout imeDetectCoordinatorLayout) {
        ahkn ahknVar = this.x;
        imeDetectCoordinatorLayout.j = new cujr(ahknVar.b.hX, ahknVar.a.BK);
        imeDetectCoordinatorLayout.k = (tlt) this.z.n.b();
    }

    @Override // defpackage.czdh
    public final void L(LocationContentCategoryView locationContentCategoryView) {
        locationContentCategoryView.a = (cvjo) this.z.bk.b();
    }

    @Override // defpackage.cwmm
    public final void M(MessageMetadataDetailsView messageMetadataDetailsView) {
        ahkn ahknVar = this.x;
        ahnh ahnhVar = ahknVar.a;
        messageMetadataDetailsView.a = (cssf) ahnhVar.uo.b();
        ahnhVar.lS();
        messageMetadataDetailsView.b = (dajd) this.j.b();
        messageMetadataDetailsView.c = ahnhVar.Uk;
    }

    @Override // defpackage.czju
    public final void N(MiniCameraViewImpl miniCameraViewImpl) {
        ahkn ahknVar = this.x;
        miniCameraViewImpl.c = (crma) ahknVar.da.b();
        ahnh ahnhVar = ahknVar.a;
        miniCameraViewImpl.d = new aiqd(ahnhVar.zs, new aiqn(), (Executor) ahknVar.p.b());
        miniCameraViewImpl.e = (czib) ahknVar.b.oN.b();
        miniCameraViewImpl.f = (eosc) ahknVar.pP.b();
        miniCameraViewImpl.g = (cvjo) this.z.bk.b();
        miniCameraViewImpl.h = (dakl) ahnhVar.BK.b();
        miniCameraViewImpl.i = (eigp) ahknVar.aI.b();
        miniCameraViewImpl.j = this.t;
    }

    @Override // defpackage.aonj
    public final void O(PausableChronometer pausableChronometer) {
        pausableChronometer.a = (cogw) this.x.cD.b();
    }

    @Override // defpackage.eeay
    public final void P(edzh edzhVar) {
        ahng ahngVar = this.x.b;
        edzhVar.h = ahngVar.dj();
        edzhVar.e = (dswt) ahngVar.jb.b();
        Activity activity = (Activity) this.z.d.b();
        activity.getClass();
        edzhVar.i = new edvs(activity);
        edzhVar.f = (dsvh) ahngVar.jc.b();
    }

    @Override // defpackage.cypv
    public final void Q(QrScannerOverlayView qrScannerOverlayView) {
        qrScannerOverlayView.a = (cssf) this.x.a.uo.b();
    }

    @Override // defpackage.cwpe
    public final void R(RichCardMediaAttachmentView richCardMediaAttachmentView) {
        richCardMediaAttachmentView.c = this.x.a.Mq;
    }

    @Override // defpackage.cwpk
    public final void S(RichCardVideoOverlayView richCardVideoOverlayView) {
        ahkn ahknVar = this.x;
        ahnh ahnhVar = ahknVar.a;
        ahknVar.b.bO();
        richCardVideoOverlayView.b = ahknVar.no;
    }

    @Override // defpackage.czew
    public final void T(SelectableContentItemView selectableContentItemView) {
        selectableContentItemView.f = (cqei) this.x.b.kI.b();
    }

    @Override // defpackage.dnuo
    public final void U(SingleEmojiView singleEmojiView) {
        singleEmojiView.e = (fdjx) this.x.a.m.b();
    }

    @Override // defpackage.dnun
    public final void V(SingleEmojiViewWithVariantIndicator singleEmojiViewWithVariantIndicator) {
        singleEmojiViewWithVariantIndicator.e = (fdjx) this.x.a.m.b();
    }

    @Override // defpackage.cyul
    public final void W(SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView) {
        ahkn ahknVar = this.x;
        spannedMultiAutoCompleteTextView.a = ahknVar.aI;
    }

    @Override // defpackage.cvim
    public final void X(VCardAttachmentView vCardAttachmentView) {
        ahkn ahknVar = this.x;
        ahng ahngVar = ahknVar.b;
        vCardAttachmentView.a = (avbr) ahngVar.hL.b();
        eyik eyikVar = ahknVar.t;
        ahnh ahnhVar = ahknVar.a;
        new baiz(eyikVar, this.e, ahnhVar.qo, ahknVar.ib, ahngVar.lZ);
        vCardAttachmentView.b = (cssf) ahnhVar.uo.b();
        vCardAttachmentView.c = ahnhVar.qi;
    }

    @Override // defpackage.dalc
    public final void Y(VideoOverlayView videoOverlayView) {
        ahkn ahknVar = this.x;
        ahknVar.b.bS();
        videoOverlayView.b = ahknVar.no;
    }

    @Override // defpackage.czyv
    public final void Z(ZeroStateSearchBox zeroStateSearchBox) {
        zeroStateSearchBox.i = this.z.db;
        ahkn ahknVar = this.x;
        ahng ahngVar = ahknVar.b;
        zeroStateSearchBox.j = (daoe) ahngVar.hX.b();
        zeroStateSearchBox.k = (dabl) ahngVar.E.b();
        zeroStateSearchBox.l = (eigp) ahknVar.aI.b();
        zeroStateSearchBox.m = ahngVar.kz;
    }

    @Override // defpackage.ulh
    public final void a() {
        ahnh ahnhVar = this.x.a;
    }

    @Override // defpackage.cwkn
    public final void ag() {
        ahnh ahnhVar = this.x.a;
        new daog(ahnhVar.BK);
    }

    @Override // defpackage.cwuz
    public final void ah() {
    }

    @Override // defpackage.cuky
    public final void ai() {
    }

    @Override // defpackage.cwmb
    public final void aj() {
    }

    @Override // defpackage.cvto
    public final void ak() {
    }

    @Override // defpackage.cwoy
    public final void al() {
        ahkn ahknVar = this.x;
    }

    @Override // defpackage.daat
    public final void am() {
        ahng ahngVar = this.x.b;
    }

    @Override // defpackage.cvhy
    public final void an() {
    }

    @Override // defpackage.cpbe
    public final void ao() {
        ahkn ahknVar = this.x;
        eyie.a(ahknVar.a.Vy);
    }

    final void ap() {
    }

    @Override // defpackage.uli
    public final void b() {
    }

    @Override // defpackage.umj
    public final void c(ConversationTombstoneView conversationTombstoneView) {
        ahkn ahknVar = this.x;
        ahnh ahnhVar = ahknVar.a;
        conversationTombstoneView.d = (baeb) ahnhVar.Vr.b();
        ahhk ahhkVar = this.z;
        conversationTombstoneView.e = eyie.a(ahhkVar.bb);
        conversationTombstoneView.f = this.a;
        conversationTombstoneView.g = eyie.a(this.b);
        conversationTombstoneView.h = ahnhVar.GB;
    }

    @Override // defpackage.uns
    public final void d() {
        ahkn ahknVar = this.x;
        ahng ahngVar = ahknVar.b;
        cklj.a((aipw) ahngVar.hs.b(), ahngVar.hQ.b());
    }

    @Override // defpackage.uoa
    public final void e() {
        new unz(new unw(this.x.a.uo, this.z.U));
    }

    @Override // defpackage.upr
    public final void f(BusinessContactActionView businessContactActionView) {
        ahnh ahnhVar = this.x.a;
        businessContactActionView.a = (ajhd) ahnhVar.yw.b();
        businessContactActionView.b = (dakl) ahnhVar.BK.b();
    }

    @Override // defpackage.ups
    public final void g(BusinessTopActionView businessTopActionView) {
        ahnh ahnhVar = this.x.a;
        businessTopActionView.b = (ajhd) ahnhVar.yw.b();
        businessTopActionView.c = (dakl) ahnhVar.BK.b();
    }

    @Override // defpackage.uqn
    public final void h(ConversationSettingsOptionItemView conversationSettingsOptionItemView) {
        conversationSettingsOptionItemView.e = (bagg) this.c.b();
        conversationSettingsOptionItemView.f = (einm) this.x.b.nT.b();
    }

    @Override // defpackage.abbz
    public final void i(TakeBugReportDialogView takeBugReportDialogView) {
        ahng ahngVar = this.x.b;
        takeBugReportDialogView.f = (aazt) ahngVar.pk.b();
        takeBugReportDialogView.e = (einm) ahngVar.nT.b();
    }

    @Override // defpackage.acli
    public final void j(AdvancedFeedbackDataView advancedFeedbackDataView) {
        advancedFeedbackDataView.k = (einm) this.x.b.nT.b();
    }

    @Override // defpackage.ahaj
    public final void k(FederatedLearningPopupView federatedLearningPopupView) {
        ahkn ahknVar = this.x;
        federatedLearningPopupView.a = (aijh) ahknVar.a.Uk.b();
        federatedLearningPopupView.b = (achu) this.y.bA.b();
        federatedLearningPopupView.c = (eigp) ahknVar.aI.b();
    }

    @Override // defpackage.ahas
    public final void l(SpamPopupView spamPopupView) {
        spamPopupView.c = this.x.a.Uk;
        spamPopupView.d = this.y.bA;
    }

    final cwtz m() {
        cwts cwtsVar = new cwts((Context) this.z.d.b());
        ahkn ahknVar = this.x;
        return new cwtz(cwtsVar, new cwtw((Context) ahknVar.t.b(), new cwub(ahknVar.jW)));
    }

    @Override // defpackage.cpaj
    public final void n(AsyncImageView asyncImageView) {
        ahkn ahknVar = this.x;
        asyncImageView.e = (cqei) ahknVar.b.kI.b();
        asyncImageView.f = (bxgr) ahknVar.ib.b();
        asyncImageView.g = (eidm) this.z.T.b();
    }

    @Override // defpackage.cvkc
    public final void o(AudioButtonView audioButtonView) {
        ahkn ahknVar = this.x;
        audioButtonView.f = (cogw) ahknVar.cD.b();
        audioButtonView.g = (cqvd) ahknVar.ol.b();
        audioButtonView.h = (cvnw) this.f.b();
        audioButtonView.i = (aomc) this.g.b();
        audioButtonView.j = ahknVar.Q();
        audioButtonView.k = (eosc) ahknVar.pP.b();
        audioButtonView.l = (eosc) ahknVar.y.b();
        audioButtonView.m = (eosd) ahknVar.p.b();
        audioButtonView.n = ahknVar.da;
        audioButtonView.o = this.z.h;
        audioButtonView.p = (airc) this.h.b();
        audioButtonView.q = (airh) this.i.b();
        ahnh ahnhVar = ahknVar.a;
        audioButtonView.r = (dakl) ahnhVar.BK.b();
        audioButtonView.s = (bahv) ahnhVar.un.b();
        audioButtonView.t = (aipw) ahknVar.b.hs.b();
        audioButtonView.u = ahknVar.ok;
        audioButtonView.v = ahknVar.aI;
    }

    @Override // defpackage.aong
    public final void p(AudioPlaybackSeekBar audioPlaybackSeekBar) {
        audioPlaybackSeekBar.a = (cogw) this.x.cD.b();
    }

    @Override // defpackage.czil
    public final void q(CameraTextureView cameraTextureView) {
        ahkn ahknVar = this.x;
        ahng ahngVar = ahknVar.b;
        cameraTextureView.c = (czib) ahngVar.oN.b();
        cameraTextureView.d = Optional.of((Executor) ahngVar.oL.b());
        cameraTextureView.e = Optional.of((EGLContext) ahngVar.oM.b());
        cameraTextureView.f = (crma) ahknVar.da.b();
    }

    @Override // defpackage.cywr
    public final void r(CategoryToggleView categoryToggleView) {
        categoryToggleView.c = (cvjo) this.z.bk.b();
    }

    @Override // defpackage.cpaq
    public final void s(ContactIconView contactIconView) {
        ahkn ahknVar = this.x;
        ahng ahngVar = ahknVar.b;
        contactIconView.e = (cqei) ahngVar.kI.b();
        contactIconView.f = (bxgr) ahknVar.ib.b();
        contactIconView.g = (eidm) this.z.T.b();
        contactIconView.r = Optional.of((avbr) ahngVar.hL.b());
        ahnh ahnhVar = ahknVar.a;
        contactIconView.s = (cpbn) ahnhVar.qo.b();
        contactIconView.t = new cpat(ahnhVar.yw, this.y.k, ahnhVar.Cy, ahnhVar.zP, this.d);
        contactIconView.u = ahnhVar.qi;
    }

    @Override // defpackage.cvjr
    public final void t(ContactListItemView contactListItemView) {
        ahkn ahknVar = this.x;
        ahnh ahnhVar = ahknVar.a;
        contactListItemView.i = (aipo) ahnhVar.us.b();
        contactListItemView.j = ahnhVar.ez();
        contactListItemView.k = (einm) ahknVar.b.nT.b();
        contactListItemView.l = ahnhVar.qi;
    }

    @Override // defpackage.cwks
    public final void u(ConversationMessageMetadataView conversationMessageMetadataView) {
        conversationMessageMetadataView.b = eyie.a(this.z.bb);
    }

    @Override // defpackage.cwle
    public final void v(ConversationMessageTransferView conversationMessageTransferView) {
        ahkn ahknVar = this.x;
        ahnh ahnhVar = ahknVar.a;
        conversationMessageTransferView.c = (baeb) ahnhVar.Vr.b();
        conversationMessageTransferView.d = ahnhVar.lS();
        conversationMessageTransferView.e = (cvjl) ahnhVar.up.b();
        conversationMessageTransferView.f = (eigp) ahknVar.aI.b();
        conversationMessageTransferView.g = ahknVar.dL;
        conversationMessageTransferView.h = ahknVar.id;
    }

    @Override // defpackage.cwlt
    public final void w(ConversationMessageView conversationMessageView) {
        ahkn ahknVar = this.x;
        ahnh ahnhVar = ahknVar.a;
        ahng ahngVar = ahknVar.b;
        conversationMessageView.n = (cqei) ahngVar.kI.b();
        conversationMessageView.o = (cssx) ahnhVar.qP.b();
        eyik eyikVar = ahknVar.t;
        eyik eyikVar2 = ahnhVar.Cn;
        eyik eyikVar3 = ahknVar.cU;
        eyik eyikVar4 = ahnhVar.Co;
        eyik eyikVar5 = ahnhVar.qP;
        ahhk ahhkVar = this.z;
        eyik eyikVar6 = ahhkVar.bb;
        eyik eyikVar7 = this.j;
        eyik eyikVar8 = ahngVar.kF;
        eyik eyikVar9 = ahknVar.p;
        eyik eyikVar10 = ahnhVar.up;
        eyik eyikVar11 = ahnhVar.yw;
        eyik eyikVar12 = ahnhVar.pE;
        eyik eyikVar13 = ahknVar.dL;
        eyik eyikVarA = eyil.a(eyikVar6);
        eyik eyikVar14 = this.a;
        eyik eyikVar15 = ahnhVar.GB;
        eyik eyikVar16 = ahhkVar.dh;
        eyik eyikVar17 = ahhkVar.dg;
        eyik eyikVar18 = this.k;
        eyik eyikVar19 = ahknVar.hD;
        eyik eyikVar20 = this.l;
        eyik eyikVar21 = ahknVar.cD;
        conversationMessageView.p = new cwlb(eyikVar, eyikVar2, eyikVar3, eyikVar4, eyikVar5, eyikVar7, eyikVar8, eyikVar9, eyikVar10, ahhkVar.F, eyikVar11, eyikVar12, eyikVar13, eyikVarA, eyikVar14, eyikVar15, eyikVar16, eyikVar17, eyikVar18, eyikVar19, eyikVar20, eyikVar21, this.m);
        conversationMessageView.q = (baeb) ahnhVar.Vr.b();
        conversationMessageView.r = (cogw) eyikVar21.b();
        conversationMessageView.s = Optional.of(ahngVar.bQ());
        conversationMessageView.t = eyie.a(eyikVar6);
        conversationMessageView.u = eyikVar14;
        conversationMessageView.v = this.n;
        conversationMessageView.w = new cwls(Optional.of(ahngVar.bQ()));
        conversationMessageView.x = new cwkk(this.o);
        uer uerVar = uer.CALENDAR_BADGE;
        cwsr cwsrVar = new cwsr();
        ahkn ahknVar2 = ahhkVar.b;
        uer uerVar2 = uer.REACTION_BADGE;
        Stream map = Collection.EL.stream(ekgp.p(uerVar, cwsrVar, uerVar2, new umz(), uer.STAR_BADGE, new uuo(), uer.REMINDER_BADGE, new czwu(), uer.SCHEDULED_SEND_BADGE, new aiey()).entrySet()).sorted(Comparator.CC.comparing(new Function() { // from class: uem
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((uer) ((Map.Entry) obj).getKey()).h;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })).map(new Function() { // from class: uen
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (uel) ((Map.Entry) obj).getValue();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
        ekgbVar.getClass();
        conversationMessageView.y = ekgbVar;
        ahnhVar.lS();
        conversationMessageView.z = eyie.a(ahnhVar.pE);
        conversationMessageView.A = eyie.a(this.q);
    }

    @Override // defpackage.cwop
    public final void x(ConversationRichCardCarouselView conversationRichCardCarouselView) {
        conversationRichCardCarouselView.ac = (baeb) this.x.a.Vr.b();
        ap();
    }

    @Override // defpackage.cwoq
    public final void y(ConversationRichCardView conversationRichCardView) {
        ahkn ahknVar = this.x;
        ahnh ahnhVar = ahknVar.a;
        conversationRichCardView.i = (baeb) ahnhVar.Vr.b();
        ap();
    }

    @Override // defpackage.cwto
    public final void z(ConversationSuggestionsBugleTooltipView conversationSuggestionsBugleTooltipView) {
        conversationSuggestionsBugleTooltipView.b = (cpch) this.x.a.qj.b();
    }

    @Override // defpackage.aies
    public final void aa() {
    }

    @Override // defpackage.cwsw
    public final void ab() {
    }

    @Override // defpackage.cwsy
    public final void ac() {
    }

    @Override // defpackage.cvhz
    public final void ad() {
    }

    @Override // defpackage.cvie
    public final void ae() {
    }

    @Override // defpackage.cwph
    public final void af() {
    }
}
