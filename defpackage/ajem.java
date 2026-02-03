package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajem extends ajfh {
    public final MessageCoreData a;
    public final embo b;

    public ajem(MessageCoreData messageCoreData, embo emboVar) {
        this.a = messageCoreData;
        this.b = emboVar;
    }

    @Override // defpackage.ajfh
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.ajfh
    public final embo b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajfh) {
            ajfh ajfhVar = (ajfh) obj;
            if (this.a.equals(ajfhVar.a()) && this.b.equals(ajfhVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        embo emboVar = this.b;
        return "MessageNotDeliveredParameters{messageSnapshot=" + this.a.toString() + ", outgoingMessageFailureReason=" + emboVar.toString() + "}";
    }
}
