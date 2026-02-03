package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vqp implements eyif {
    public static Conversation a(ConversationId conversationId, ajlm ajlmVar, ajln ajlnVar, zum zumVar) {
        conversationId.getClass();
        ajlmVar.getClass();
        ajlnVar.getClass();
        zumVar.getClass();
        if (!zumVar.b(conversationId).booleanValue()) {
            return ajlnVar.a(conversationId, ajlmVar);
        }
        ecem.c();
        ejwl.l(zumVar.b(conversationId).booleanValue());
        ((ekrd) ((ekrd) zum.a.h()).h("com/google/android/apps/messaging/conversation2/preload/ConversationCachedLoaderImpl", "getPreloadedConversationAndClearCache", 75, "ConversationCachedLoaderImpl.java")).t("Returning conversation load future for conversation %s", conversationId.b());
        return zumVar.a();
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
