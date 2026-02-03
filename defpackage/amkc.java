package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amkc {
    public final String a;
    public final ezah b;
    public final MessageId c;
    public final long d;
    public final boolean e;
    private final ConversationId f;

    public amkc(String str, ConversationId conversationId, ezah ezahVar, MessageId messageId, long j, boolean z) {
        this.a = str;
        this.f = conversationId;
        this.b = ezahVar;
        this.c = messageId;
        this.d = j;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amkc)) {
            return false;
        }
        amkc amkcVar = (amkc) obj;
        return fdbq.f(this.a, amkcVar.a) && fdbq.f(this.f, amkcVar.f) && this.b == amkcVar.b && fdbq.f(this.c, amkcVar.c) && this.d == amkcVar.d && this.e == amkcVar.e;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.f.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        int i = true != this.e ? 1237 : 1231;
        long j = this.d;
        return (((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + i;
    }

    public final String toString() {
        return "BugleClassification(classificationText=" + this.a + ", conversationId=" + this.f + ", classificationType=" + this.b + ", messageId=" + this.c + ", usageStatsLoggingId=" + this.d + ", isIncoming=" + this.e + ")";
    }
}
