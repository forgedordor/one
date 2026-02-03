package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class usx extends usz {
    private final ConversationIdType a;
    private final alwl b;

    public usx(ConversationIdType conversationIdType, alwl alwlVar) {
        this.a = conversationIdType;
        if (alwlVar == null) {
            throw new NullPointerException("Null messagingIdentity");
        }
        this.b = alwlVar;
    }

    @Override // defpackage.usz
    public final alwl a() {
        return this.b;
    }

    @Override // defpackage.usz
    public final ConversationIdType b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof usz) {
            usz uszVar = (usz) obj;
            if (this.a.equals(uszVar.b()) && this.b.equals(uszVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        alwl alwlVar = this.b;
        return "RemoveUserConfirmedEvent{conversationId=" + this.a.toString() + ", messagingIdentity=" + alwlVar.toString() + "}";
    }
}
