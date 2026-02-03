package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anap extends anat {
    private final ajle a;
    private final MessageId b;
    private final ConversationId c;
    private final Instant d;
    private final int e;

    public anap(ajle ajleVar, MessageId messageId, ConversationId conversationId, Instant instant, int i) {
        if (ajleVar == null) {
            throw new NullPointerException("Null operation");
        }
        this.a = ajleVar;
        this.b = messageId;
        this.c = conversationId;
        if (instant == null) {
            throw new NullPointerException("Null timestamp");
        }
        this.d = instant;
        this.e = i;
    }

    @Override // defpackage.ajmf
    public final ajle a() {
        return this.a;
    }

    @Override // defpackage.ajmf
    public final MessageId b() {
        return this.b;
    }

    @Override // defpackage.ajmf
    public final ConversationId c() {
        return this.c;
    }

    @Override // defpackage.ajmf
    public final Instant d() {
        return this.d;
    }

    @Override // defpackage.anat
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anat) {
            anat anatVar = (anat) obj;
            if (this.a.equals(anatVar.a()) && this.b.equals(anatVar.b()) && this.c.equals(anatVar.c()) && this.d.equals(anatVar.d()) && this.e == anatVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e;
    }

    public final String toString() {
        Instant instant = this.d;
        ConversationId conversationId = this.c;
        MessageId messageId = this.b;
        return "BugleMessageChanged{operation=" + this.a.toString() + ", id=" + messageId.toString() + ", conversationId=" + conversationId.toString() + ", timestamp=" + instant.toString() + ", status=" + this.e + "}";
    }
}
