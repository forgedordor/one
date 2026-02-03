package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgcl {
    private final cvw a = new cvw();

    public final synchronized void a(ConversationIdType conversationIdType) {
        if (conversationIdType.b()) {
            this.a.clear();
        } else {
            this.a.remove(conversationIdType);
        }
    }
}
