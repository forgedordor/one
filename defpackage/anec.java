package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anec {
    public final MessageId a;

    public anec(MessageId messageId) {
        this.a = messageId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof anec) && fdbq.f(this.a, ((anec) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DeferredLinkPreviewData(messageId=" + this.a + ")";
    }
}
