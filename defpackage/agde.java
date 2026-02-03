package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agde implements afzv {
    public final ConversationId a;
    public final String b;

    public agde(ConversationId conversationId, String str) {
        str.getClass();
        this.a = conversationId;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agde)) {
            return false;
        }
        agde agdeVar = (agde) obj;
        return fdbq.f(this.a, agdeVar.a) && fdbq.f(this.b, agdeVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "InfoAndOptions(conversationId=" + this.a + ", rbmBotId=" + this.b + ")";
    }
}
