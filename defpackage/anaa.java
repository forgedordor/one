package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anaa {
    public final MessageId a;
    public final anhj b;
    public final anhk c;

    public anaa(MessageId messageId, anhj anhjVar, anhk anhkVar) {
        anhkVar.getClass();
        this.a = messageId;
        this.b = anhjVar;
        this.c = anhkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anaa)) {
            return false;
        }
        anaa anaaVar = (anaa) obj;
        return fdbq.f(this.a, anaaVar.a) && fdbq.f(this.b, anaaVar.b) && this.c == anaaVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ReactionEnvelopeInfo(reactedMessageId=" + this.a + ", reaction=" + this.b + ", reactionAction=" + this.c + ")";
    }
}
