package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vlk {
    public final boolean a;
    public final fdpl b;
    private final ConversationId c;

    public vlk(ConversationId conversationId, zqm zqmVar) {
        conversationId.getClass();
        zqmVar.getClass();
        this.c = conversationId;
        this.a = conversationId instanceof PenpalBotConversationId;
        this.b = new vlj(zqmVar.a(), this);
    }
}
