package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tlk {
    public final ResolvedRecipient a;
    public final ConversationId b;
    public final int c;
    public final int d = 1;
    public final int e = 3;
    public final int f;

    public tlk(ResolvedRecipient resolvedRecipient, ConversationId conversationId, int i, int i2) {
        this.a = resolvedRecipient;
        this.b = conversationId;
        this.c = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlk)) {
            return false;
        }
        tlk tlkVar = (tlk) obj;
        if (!fdbq.f(this.a, tlkVar.a) || !fdbq.f(this.b, tlkVar.b) || this.c != tlkVar.c) {
            return false;
        }
        int i = tlkVar.d;
        int i2 = tlkVar.e;
        return this.f == tlkVar.f;
    }

    public final int hashCode() {
        ResolvedRecipient resolvedRecipient = this.a;
        return ((((((((((resolvedRecipient == null ? 0 : resolvedRecipient.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c) * 31) + 1) * 31) + 3) * 31) + this.f;
    }

    public final String toString() {
        return "Dialog2Request(recipient=" + this.a + ", conversationId=" + this.b + ", dialogType=" + ((Object) tls.a(this.c)) + ", dialogDoneBehavior=SHOW_UNDO_UX, scope=" + ((Object) eofq.c(3)) + ", entryPoint=" + ((Object) eofp.a(this.f)) + ")";
    }
}
