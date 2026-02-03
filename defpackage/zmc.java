package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zmc {
    public final MessageId a;
    public final amwj b;

    public zmc(MessageId messageId, amwj amwjVar) {
        this.a = messageId;
        this.b = amwjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmc)) {
            return false;
        }
        zmc zmcVar = (zmc) obj;
        return fdbq.f(this.a, zmcVar.a) && fdbq.f(this.b, zmcVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ToolstoneArgs(messageId=" + this.a + ", content=" + this.b + ")";
    }
}
