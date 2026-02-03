package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwvd extends cwvh {
    private final ConversationIdType a;
    private final boolean b;

    public cwvd(ConversationIdType conversationIdType, boolean z) {
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.a = conversationIdType;
        this.b = z;
    }

    @Override // defpackage.cwvh
    public final ConversationIdType a() {
        return this.a;
    }

    @Override // defpackage.cwvh
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwvh) {
            cwvh cwvhVar = (cwvh) obj;
            if (this.a.equals(cwvhVar.a()) && this.b == cwvhVar.b()) {
                cwvhVar.c();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 3;
    }

    public final String toString() {
        return "ConversationMarkAsReadOrUnreadEvent{conversationId=" + this.a.toString() + ", newReadStatus=" + this.b + ", origin=" + Integer.toString(2) + "}";
    }

    @Override // defpackage.cwvh
    public final void c() {
    }
}
