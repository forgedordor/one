package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfke {
    public final ConversationId a;
    public final int b;

    public cfke(int i, ConversationId conversationId) {
        this.b = i;
        this.a = conversationId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfke)) {
            return false;
        }
        cfke cfkeVar = (cfke) obj;
        return this.b == cfkeVar.b && fdbq.f(this.a, cfkeVar.a);
    }

    public final int hashCode() {
        ConversationId conversationId = this.a;
        return (this.b * 31) + (conversationId == null ? 0 : conversationId.hashCode());
    }

    public final String toString() {
        return "ConversationIdOrFailureStatus(status=" + ((Object) Integer.toString(this.b - 2)) + ", id=" + this.a + ")";
    }

    public /* synthetic */ cfke(int i) {
        this(i, null);
    }
}
