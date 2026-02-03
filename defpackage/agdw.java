package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agdw implements afzv {
    public final ConversationId a;
    public final String b;
    public final Recipient c;
    public final bvdk d;

    public agdw(ConversationId conversationId, String str, Recipient recipient, bvdk bvdkVar) {
        this.a = conversationId;
        this.b = str;
        this.c = recipient;
        this.d = bvdkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agdw)) {
            return false;
        }
        agdw agdwVar = (agdw) obj;
        return fdbq.f(this.a, agdwVar.a) && fdbq.f(this.b, agdwVar.b) && fdbq.f(this.c, agdwVar.c) && this.d == agdwVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Recipient recipient = this.c;
        return (((iHashCode * 31) + (recipient == null ? 0 : recipient.hashCode())) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return cqcv.b(super.toString()).toString();
    }
}
