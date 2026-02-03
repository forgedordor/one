package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anpn extends anpq {
    private final MessageIdType a;
    private final int b;

    public anpn(MessageIdType messageIdType, int i) {
        if (messageIdType == null) {
            throw new NullPointerException("Null messageId");
        }
        this.a = messageIdType;
        this.b = i;
    }

    @Override // defpackage.anpq
    public final MessageIdType a() {
        return this.a;
    }

    @Override // defpackage.anpq
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anpq) {
            anpq anpqVar = (anpq) obj;
            if (this.a.equals(anpqVar.a()) && this.b == anpqVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        int i = this.b;
        return "InitiationResult{messageId=" + this.a.toString() + ", fallbackResult=" + Integer.toString(i - 1) + "}";
    }
}
