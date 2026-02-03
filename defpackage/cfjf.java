package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfjf extends cfmq {
    public final MessageIdType a;
    public final long b;

    public cfjf(MessageIdType messageIdType, long j) {
        this.a = messageIdType;
        this.b = j;
    }

    @Override // defpackage.cfmq
    public final long a() {
        return this.b;
    }

    @Override // defpackage.cfmq
    public final MessageIdType b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cfmq) {
            cfmq cfmqVar = (cfmq) obj;
            if (this.a.equals(cfmqVar.b()) && this.b == cfmqVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "MessageInfo{messageId=" + this.a.toString() + ", timestamp=" + this.b + "}";
    }
}
