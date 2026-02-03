package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csog implements csnx {
    public final ConversationIdType a;

    public csog(ConversationIdType conversationIdType) {
        this.a = conversationIdType;
        if (conversationIdType.b()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof csog) && fdbq.f(this.a, ((csog) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BugleConversationIdWrapper(conversationId=" + this.a + ")";
    }
}
