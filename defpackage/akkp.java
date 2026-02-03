package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akkp implements akkg {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/conversation/mute/bugle/MuteConversationDatabaseOperationsImpl");
    public static final eizx b = new eizx();
    public final fdjx c;
    public final cogw d;

    public akkp(fdjx fdjxVar, fcyh fcyhVar, cogw cogwVar) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        cogwVar.getClass();
        this.c = fdjxVar;
        this.d = cogwVar;
    }

    @Override // defpackage.akkg
    public final eiju a(ConversationId conversationId, cgrc cgrcVar, cgra cgraVar) {
        conversationId.getClass();
        cgrcVar.getClass();
        cgraVar.getClass();
        return auvw.c(this.c, fcyi.a, fdjz.a, new akko(this, conversationId, cgrcVar, cgraVar, null));
    }
}
