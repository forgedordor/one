package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anip implements ajmf {
    private final MessageId a;
    private final ConversationId b;
    private final Instant c;

    public anip(MessageId messageId, ConversationId conversationId, Instant instant) {
        this.a = messageId;
        this.b = conversationId;
        this.c = instant;
    }

    @Override // defpackage.ajmf
    public final ajle a() {
        return ajle.UPDATE;
    }

    @Override // defpackage.ajmf
    public final MessageId b() {
        return this.a;
    }

    @Override // defpackage.ajmf
    public final ConversationId c() {
        return this.b;
    }

    @Override // defpackage.ajmf
    public final Instant d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anip)) {
            return false;
        }
        anip anipVar = (anip) obj;
        return fdbq.f(this.a, anipVar.a) && fdbq.f(this.b, anipVar.b) && fdbq.f(this.c, anipVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ImpactedMessage(messageId=" + this.a + ", conversationId=" + this.b + ", timestamp=" + this.c + ")";
    }
}
