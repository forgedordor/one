package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwbh implements cwbf {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/conversation/details/header/title/TitleUiAdapterImpl");
    public static final RuntimeException b = new RuntimeException("InvalidCdpAccess");
    public final ConversationId c;
    public final cssf d;
    public final fcsu e;
    public final aqlb f;
    private final fdjx g;
    private final fdpl h;
    private final fdpl i;

    public cwbh(fdjx fdjxVar, fdpl fdplVar, ConversationId conversationId, fdpl fdplVar2, cssf cssfVar, fcsu fcsuVar, aqlb aqlbVar) {
        fdjxVar.getClass();
        fdplVar.getClass();
        conversationId.getClass();
        fdplVar2.getClass();
        cssfVar.getClass();
        fcsuVar.getClass();
        this.g = fdjxVar;
        this.h = fdplVar;
        this.c = conversationId;
        this.i = fdplVar2;
        this.d = cssfVar;
        this.e = fcsuVar;
        this.f = aqlbVar;
    }

    @Override // defpackage.cwbf
    public final fdpl a() {
        fdpl fdplVar = this.i;
        return avac.i(auyk.a(this.h, "ConversationProperties"), auyk.a(fdplVar, "Recipients"), this.g, new cwbg(this, null));
    }
}
