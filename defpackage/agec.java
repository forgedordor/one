package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agec implements afzx {
    public final ConversationId a;
    public final List b;

    /* JADX WARN: Multi-variable type inference failed */
    public agec() {
        this(null, 0 == true ? 1 : 0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agec)) {
            return false;
        }
        agec agecVar = (agec) obj;
        return fdbq.f(this.a, agecVar.a) && fdbq.f(this.b, agecVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ParentalApprovalDialog(conversationId=" + this.a + ", messagingIdentities=" + this.b + ")";
    }

    public /* synthetic */ agec(ConversationId conversationId, List list, int i) {
        conversationId = (i & 1) != 0 ? InvalidConversationId.a : conversationId;
        list = (i & 2) != 0 ? fcvo.a : list;
        conversationId.getClass();
        list.getClass();
        this.a = conversationId;
        this.b = list;
    }
}
