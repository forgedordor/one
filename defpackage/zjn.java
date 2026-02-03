package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zjn {
    public final MessageId a;

    public zjn(MessageId messageId) {
        this.a = messageId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zjn) && fdbq.f(this.a, ((zjn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HiddenMessageArgs(messageId=" + this.a + ")";
    }
}
