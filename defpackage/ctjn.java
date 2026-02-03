package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctjn {
    public static final ConversationId a(lwn lwnVar) {
        ConversationId conversationId = (ConversationId) lwnVar.b("conversation_mapi_id");
        if (conversationId != null) {
            return conversationId;
        }
        String str = (String) lwnVar.b("conversation_id");
        if (str == null) {
            return null;
        }
        return new BugleConversationId(barn.b(str));
    }
}
