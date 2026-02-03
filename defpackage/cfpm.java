package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfpm {
    public final MessageId a;

    public cfpm() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cfpm) && fdbq.f(this.a, ((cfpm) obj).a);
    }

    public final int hashCode() {
        MessageId messageId = this.a;
        if (messageId == null) {
            return 0;
        }
        return messageId.hashCode();
    }

    public final String toString() {
        return "AdditionalReflectedMessageParams(repliedToMessageId=" + this.a + ")";
    }

    public cfpm(MessageId messageId) {
        this.a = messageId;
    }

    public /* synthetic */ cfpm(byte[] bArr) {
        this((MessageId) null);
    }
}
