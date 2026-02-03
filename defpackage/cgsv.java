package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgsv {
    private final axcm a;
    private final ConversationIdType b;

    public cgsv(axcm axcmVar, ConversationIdType conversationIdType) {
        this.a = axcmVar;
        this.b = conversationIdType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgsv)) {
            return false;
        }
        cgsv cgsvVar = (cgsv) obj;
        return fdbq.f(this.a, cgsvVar.a) && fdbq.f(this.b, cgsvVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MyIdentityTokenAndConversationIdType(token=" + this.a + ", conversationId=" + this.b + ")";
    }
}
