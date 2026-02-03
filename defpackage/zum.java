package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zum {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/preload/ConversationCachedLoaderImpl");
    public final ajln b;
    public zul c = null;

    public zum(ajln ajlnVar) {
        this.b = ajlnVar;
    }

    public final Conversation a() {
        zul zulVar = this.c;
        zulVar.getClass();
        Conversation conversation = zulVar.a;
        this.c = null;
        return conversation;
    }

    public final Boolean b(ConversationId conversationId) {
        ecem.c();
        zul zulVar = this.c;
        boolean z = false;
        if (zulVar != null && conversationId.equals(zulVar.a.d())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
