package com.google.android.rcs.client.messaging;

import defpackage.efeu;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_MessageNotification extends MessageNotification {
    private final Conversation a;
    private final efeu b;

    public AutoValue_MessageNotification(Conversation conversation, efeu efeuVar) {
        this.a = conversation;
        this.b = efeuVar;
    }

    @Override // com.google.android.rcs.client.messaging.MessageNotification
    public final Conversation a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.MessageNotification
    public final efeu b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessageNotification) {
            MessageNotification messageNotification = (MessageNotification) obj;
            if (this.a.equals(messageNotification.a()) && this.b.equals(messageNotification.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        efeu efeuVar = this.b;
        return "MessageNotification{conversation=" + this.a.toString() + ", message=" + efeuVar.toString() + "}";
    }
}
