package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acvu extends acxk {
    private final ConversationIdType a;
    private final adar b;
    private final long c;

    public acvu(ConversationIdType conversationIdType, adar adarVar, long j) {
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.a = conversationIdType;
        if (adarVar == null) {
            throw new NullPointerException("Null partId");
        }
        this.b = adarVar;
        this.c = j;
    }

    @Override // defpackage.acxk
    public final long a() {
        return this.c;
    }

    @Override // defpackage.acxk
    public final adar b() {
        return this.b;
    }

    @Override // defpackage.acxk
    public final ConversationIdType c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acxk) {
            acxk acxkVar = (acxk) obj;
            if (this.a.equals(acxkVar.c()) && this.b.equals(acxkVar.b()) && this.c == acxkVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.c;
        return (iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        adar adarVar = this.b;
        return "ConversationListRefreshPart{conversationId=" + this.a.toString() + ", partId=" + adarVar.toString() + ", refreshTimestamp=" + this.c + "}";
    }
}
