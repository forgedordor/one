package defpackage;

import com.google.android.apps.messaging.ui.conversation.details.ConversationDetailsViewModel;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvvf implements fdat {
    final /* synthetic */ cvvn a;

    public cvvf(cvvn cvvnVar) {
        this.a = cvvnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            cwhh cwhhVar = ((ConversationDetailsViewModel) this.a.e.a()).c;
            ekrw ekrwVarH = cwhp.a.h();
            ekrwVarH.X(eksq.a, "BugleCdp");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/ui/conversation/details/screen/ConversationDetailsUiAdapterImpl", "createUiData", 90, "ConversationDetailsUiAdapterImpl.kt")).q("ConversationDetailsUiAdapter initialized");
            cwhp cwhpVar = (cwhp) cwhhVar;
            fdtm fdtmVar = new fdtm(auyk.a(new cwjn(((vjn) ((cwjo) cwhpVar.d.b()).a.b()).b), "TopbarUiData"), new cwhi(null));
            fdtm fdtmVar2 = new fdtm(auyk.a(((cvzi) cwhpVar.e.b()).a(), "HeaderUiData"), new cwhj(null));
            fdvc fdvcVarB = auyk.b(((cwin) cwhpVar.f.b()).a(), "SearchUiData");
            fdtm fdtmVar3 = new fdtm(auyk.b(((cvxc) cwhpVar.g.b()).a(), "EncryptionUiData"), new cwhk(null));
            cvvx cvvxVar = (cvvx) cwhpVar.h.b();
            fcsu fcsuVar = cvvxVar.e;
            fdpl fdplVarA = auyk.a(cvvxVar.b, "ConversationProperties");
            cvwh cvwhVar = (cvwh) fcsuVar.b();
            fdtm fdtmVar4 = new fdtm(auyk.a(avac.g(fdplVarA, auyk.a(avac.f(auyk.a(cvwhVar.c, "ComposeConstraints"), auyk.a(cvwhVar.b, "ConversationProperties"), auyk.a(((agib) cvwhVar.e.b()).a, "MuteSettingsActionPlugin"), auyk.a(((vky) cvwhVar.d.b()).c, "NotificationSettingsActionPlugin"), auyk.a(((vlc) cvwhVar.f.b()).d, "OnlySendSmsMmsActionPlugin"), auyk.a(((vfe) cvwhVar.g.b()).a, "BlockAndReportSpamActionPlugin"), auyk.a(((xrd) cvwhVar.h.b()).d, "CustomThemesActionPlugin"), cvwhVar.a, new cvwg(cvwhVar, null)), "SingleConversationActionsUiData"), auyk.a(((cvwc) cvvxVar.d.b()).a(), "GroupConversationActionsUiData"), cvvxVar.a, new cvvw(cvvxVar, null)), "ActionsUiData"), new cwhl(null));
            fdtm fdtmVar5 = new fdtm(auyk.b(((cvwi) cwhpVar.j.b()).a(), "ActiveSimUiData"), new cwhm(null));
            fdpl fdplVar = cwhpVar.o;
            fdpl fdplVar2 = cwhpVar.p;
            fdpl fdplVar3 = cwhpVar.q;
            fdpl fdplVarA2 = auyk.a(fdplVar, "PenpalDescriptionUiData");
            fdpl fdplVarA3 = auyk.a(fdplVar2, "PhotoSelectorUiData");
            fdtm fdtmVar6 = new fdtm(auyk.a(fdplVar3, "MiniConversationDetailsUiData"), new cwhn(null));
            fdjx fdjxVar = cwhpVar.b;
            cwho cwhoVar = new cwho(cwhpVar, null);
            long j = fdhi.a;
            long jF = fdhk.f(10, fdhl.d);
            fdpl[] fdplVarArr = {fdtmVar, fdtmVar2, fdvcVarB, fdtmVar3, fdtmVar4, fdtmVar5, fdplVarA2, fdplVarA3, fdtmVar6};
            boolean[] zArr = new boolean[9];
            for (int i = 0; i < 9; i++) {
                zArr[i] = false;
            }
            ArrayList arrayList = new ArrayList(9);
            int i2 = 0;
            int i3 = 0;
            while (i2 < 9) {
                arrayList.add(new fdtm(fdplVarArr[i2], new auyw(zArr, i3, null)));
                i2++;
                i3++;
            }
            cwil.b(fdtg.b(new fdqz(new auyv(fdjxVar, jF, fdplVarArr, zArr, null), new auyz((fdpl[]) fcva.ao(arrayList).toArray(new fdpl[0]), cwhoVar)), fdjxVar, fdur.a(0L, 3), null), hmlVar, 0);
        }
        return fctx.a;
    }
}
