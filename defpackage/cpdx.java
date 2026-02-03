package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpdx extends cpeb {
    public final ConversationIdType a;
    private final eygg b;

    public cpdx(ConversationIdType conversationIdType, eygg eyggVar) {
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.a = conversationIdType;
        this.b = eyggVar;
    }

    @Override // defpackage.cpeb
    public final ConversationIdType a() {
        return this.a;
    }

    @Override // defpackage.cpeb
    public final eygg b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cpeb) {
            cpeb cpebVar = (cpeb) obj;
            if (this.a.equals(cpebVar.a()) && this.b.equals(cpebVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        eygg eyggVar = this.b;
        return "ConversationIdAndThreadId{conversationId=" + this.a.toString() + ", threadIdLazy=" + eyggVar.toString() + "}";
    }
}
