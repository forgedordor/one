package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahsq implements einb {
    public final MessageIdType a;
    public final int b = 2;

    public ahsq(MessageIdType messageIdType) {
        this.a = messageIdType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahsq)) {
            return false;
        }
        ahsq ahsqVar = (ahsq) obj;
        if (!fdbq.f(this.a, ahsqVar.a)) {
            return false;
        }
        int i = ahsqVar.b;
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 2;
    }

    public final String toString() {
        return "ReplyInvokedEvent(messageId=" + this.a + ", source=MESSAGE_SWIPE)";
    }
}
