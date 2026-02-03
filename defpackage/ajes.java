package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajes extends ajgv {
    private final MessageCoreData a;

    public ajes(MessageCoreData messageCoreData) {
        if (messageCoreData == null) {
            throw new NullPointerException("Null message");
        }
        this.a = messageCoreData;
    }

    @Override // defpackage.ajgv
    public final MessageCoreData a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajgv) {
            return this.a.equals(((ajgv) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "MessageSentEvent{message=" + this.a.toString() + "}";
    }
}
