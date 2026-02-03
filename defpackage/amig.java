package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amig {
    private final MessageId a;
    private final int b;

    public amig(MessageId messageId, int i) {
        this.a = messageId;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amig)) {
            return false;
        }
        amig amigVar = (amig) obj;
        return fdbq.f(this.a, amigVar.a) && this.b == amigVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "CompositeAnalyticsEventKey(messageId=" + this.a + ", eventType=" + ((Object) ajme.a(this.b)) + ")";
    }
}
