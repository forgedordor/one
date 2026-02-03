package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chhu {
    public final ConversationIdType a;
    public final cnqj b;
    public final boolean c;

    public chhu(ConversationIdType conversationIdType, cnqj cnqjVar, boolean z) {
        this.a = conversationIdType;
        this.b = cnqjVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chhu)) {
            return false;
        }
        chhu chhuVar = (chhu) obj;
        return fdbq.f(this.a, chhuVar.a) && fdbq.f(this.b, chhuVar.b) && this.c == chhuVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "ConversationData(conversationId=" + this.a + ", threadId=" + this.b + ", isNewConversation=" + this.c + ")";
    }
}
