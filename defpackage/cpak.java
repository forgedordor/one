package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cpak extends cpan {
    private final ConversationIdType a;
    private final int b;
    private final boolean c;

    public cpak(ConversationIdType conversationIdType, int i, boolean z) {
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.a = conversationIdType;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.cpan
    public final int a() {
        return this.b;
    }

    @Override // defpackage.cpan
    public final ConversationIdType b() {
        return this.a;
    }

    @Override // defpackage.cpan
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cpan) {
            cpan cpanVar = (cpan) obj;
            if (this.a.equals(cpanVar.b()) && this.b == cpanVar.a() && this.c == cpanVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "ConversationSettingsInput{conversationId=" + this.a.toString() + ", joinState=" + this.b + ", hasRbmBotRecipient=" + this.c + "}";
    }
}
