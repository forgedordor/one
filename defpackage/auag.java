package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auag extends auas {
    public final aubq a;
    public final ConversationIdType b;
    public final Instant c;
    public final efjm d;

    public auag(aubq aubqVar, ConversationIdType conversationIdType, Instant instant, efjm efjmVar) {
        this.a = aubqVar;
        this.b = conversationIdType;
        this.c = instant;
        this.d = efjmVar;
    }

    @Override // defpackage.auas
    public final aubq a() {
        return this.a;
    }

    @Override // defpackage.auas
    public final ConversationIdType b() {
        return this.b;
    }

    @Override // defpackage.auas
    public final efjm c() {
        return this.d;
    }

    @Override // defpackage.auas
    public final Instant d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof auas) {
            auas auasVar = (auas) obj;
            if (this.a.equals(auasVar.a()) && this.b.equals(auasVar.b()) && this.c.equals(auasVar.d()) && this.d.equals(auasVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        efjm efjmVar = this.d;
        Instant instant = this.c;
        ConversationIdType conversationIdType = this.b;
        return "IsComposingInformation{sender=" + this.a.toString() + ", conversationId=" + conversationIdType.toString() + ", expiry=" + instant.toString() + ", status=" + efjmVar.toString() + "}";
    }
}
