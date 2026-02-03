package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvzp implements cvzi {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/conversation/details/header/HeaderUiAdapterImpl");
    public final fdjx b;
    public final Context c;
    public final ConversationId d;
    public final afzx e;
    public final fcsu f;
    public final lwn g;
    public final fcsu h;
    public final asgm i;
    public final ardk j;
    public final aree k;
    public final fcsu l;
    public final fcsu m;
    public final fduf n;
    private final fdpl o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;
    private final fcsu s;

    public cvzp(fdjx fdjxVar, Context context, fdpl fdplVar, ConversationId conversationId, afzx afzxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, lwn lwnVar, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, asgm asgmVar, ardk ardkVar, aree areeVar, fcsu fcsuVar7, fcsu fcsuVar8) {
        fdjxVar.getClass();
        context.getClass();
        fdplVar.getClass();
        conversationId.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        asgmVar.getClass();
        ardkVar.getClass();
        fcsuVar8.getClass();
        this.b = fdjxVar;
        this.c = context;
        this.o = fdplVar;
        this.d = conversationId;
        this.e = afzxVar;
        this.f = fcsuVar;
        this.p = fcsuVar2;
        this.q = fcsuVar3;
        this.g = lwnVar;
        this.r = fcsuVar4;
        this.h = fcsuVar5;
        this.s = fcsuVar6;
        this.i = asgmVar;
        this.j = ardkVar;
        this.k = areeVar;
        this.l = fcsuVar7;
        this.m = fcsuVar8;
        this.n = fdvf.a(false);
        if (ardkVar.a() && fdbq.f(lwnVar.b("has_pending_profile_photo_picker_result"), true)) {
            auvw.m(fdjxVar, null, new cvzj(this, null), 3);
        }
    }

    @Override // defpackage.cvzi
    public final fdpl a() {
        fcsu fcsuVar = this.q;
        fdpl fdplVarA = auyk.a(this.o, "ConversationProperties");
        fdpl fdplVarA2 = auyk.a(((cwbf) fcsuVar.b()).a(), "TitleUiData");
        fdpl fdplVarA3 = auyk.a(((cwac) this.r.b()).a(), "ActionsUiData");
        cway cwayVar = (cway) this.p.b();
        fdpl fdplVar = cwayVar.c;
        return avac.d(fdplVarA, fdplVarA2, fdplVarA3, auyk.a(avac.i(auyk.a(cwayVar.b, "ConversationProperties"), auyk.a(fdplVar, "Recipients"), cwayVar.a, new cwax(cwayVar, null)), "AvatarUiData"), auyk.a(((vjn) this.s.b()).b, "BackActionsUiData"), new auyh("AvatarUpdateInProgress", this.n), this.b, new cvzl(this, null));
    }

    public final void b(Uri uri) {
        if (uri == null) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleCdp");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/ui/conversation/details/header/HeaderUiAdapterImpl", "handleProfilePhotoPickerResult", 168, "HeaderUiAdapterImpl.kt")).q("No group icon was picked");
        } else {
            ekrw ekrwVarH2 = a.h();
            ekrwVarH2.X(eksq.a, "BugleCdp");
            ekrd ekrdVar = (ekrd) ekrwVarH2;
            ekrdVar.X(cqnc.ab, uri);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/ui/conversation/details/header/HeaderUiAdapterImpl", "handleProfilePhotoPickerResult", 165, "HeaderUiAdapterImpl.kt")).q("Group icon was picked");
            c(uri);
        }
    }

    public final void c(Uri uri) {
        auvw.m(this.b, null, new cvzo(this, uri, null), 3);
    }
}
