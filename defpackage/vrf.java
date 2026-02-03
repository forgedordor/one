package defpackage;

import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vrf implements eyif {
    public static OpenConversation2Arguments a(lwn lwnVar) {
        OpenConversation2Arguments openConversation2Arguments = (OpenConversation2Arguments) lwnVar.b("open_conversation2_arguments");
        if (openConversation2Arguments != null) {
            return openConversation2Arguments;
        }
        Object objB = lwnVar.b("mapi_conversation_id");
        objB.getClass();
        return new OpenConversation2Arguments((ConversationId) objB, null, null, null, false, false, null, 126, null);
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
