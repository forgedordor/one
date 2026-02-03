package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cspi implements csnz {
    public final MessageIdType a;

    public cspi(MessageIdType messageIdType) {
        messageIdType.getClass();
        this.a = messageIdType;
        if (messageIdType.c()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cspi) && fdbq.f(this.a, ((cspi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BugleMessageIdWrapper(messageId=" + this.a + ")";
    }
}
