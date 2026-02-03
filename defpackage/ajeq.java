package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajeq extends ajgt {
    private final MessageCoreData a;

    public ajeq(MessageCoreData messageCoreData) {
        if (messageCoreData == null) {
            throw new NullPointerException("Null message");
        }
        this.a = messageCoreData;
    }

    @Override // defpackage.ajgt
    public final MessageCoreData a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajgt) {
            return this.a.equals(((ajgt) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "MessageReceivedEvent{message=" + this.a.toString() + "}";
    }
}
