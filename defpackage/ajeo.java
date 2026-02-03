package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajeo extends ajgp {
    private final MessageCoreData a;
    private final String b;

    public ajeo(MessageCoreData messageCoreData, String str) {
        this.a = messageCoreData;
        if (str == null) {
            throw new NullPointerException("Null receiptRawSenderId");
        }
        this.b = str;
    }

    @Override // defpackage.ajgp
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.ajgp
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajgp) {
            ajgp ajgpVar = (ajgp) obj;
            if (this.a.equals(ajgpVar.a()) && this.b.equals(ajgpVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "MessageDeliveredEvent{message=" + this.a.toString() + ", receiptRawSenderId=" + this.b + "}";
    }
}
