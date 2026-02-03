package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zin {
    public final MessageId a;
    public final amvb b;

    public zin(MessageId messageId, amvb amvbVar) {
        this.a = messageId;
        this.b = amvbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zin)) {
            return false;
        }
        zin zinVar = (zin) obj;
        return fdbq.f(this.a, zinVar.a) && fdbq.f(this.b, zinVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CardstoneArgs(messageId=" + this.a + ", content=" + this.b + ")";
    }
}
