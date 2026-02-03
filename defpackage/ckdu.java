package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckdu {
    public final MessageId a;

    public ckdu(MessageId messageId) {
        this.a = messageId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ckdu) && fdbq.f(this.a, ((ckdu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EditQueuedInfo(editedMessageId=" + this.a + ")";
    }
}
