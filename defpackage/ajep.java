package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajep extends ajgq {
    private final MessageCoreData a;
    private final String b;

    public ajep(MessageCoreData messageCoreData, String str) {
        this.a = messageCoreData;
        if (str == null) {
            throw new NullPointerException("Null receiptRawSenderId");
        }
        this.b = str;
    }

    @Override // defpackage.ajgq
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.ajgq
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajgq) {
            ajgq ajgqVar = (ajgq) obj;
            if (this.a.equals(ajgqVar.a()) && this.b.equals(ajgqVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "MessageDisplayedEvent{message=" + this.a.toString() + ", receiptRawSenderId=" + this.b + "}";
    }
}
