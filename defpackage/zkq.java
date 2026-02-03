package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zkq {
    public final MessageId a;
    public final amwh b;
    public final ymx c;

    public zkq(MessageId messageId, amwh amwhVar, ymx ymxVar) {
        this.a = messageId;
        this.b = amwhVar;
        this.c = ymxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkq)) {
            return false;
        }
        zkq zkqVar = (zkq) obj;
        return fdbq.f(this.a, zkqVar.a) && fdbq.f(this.b, zkqVar.b) && fdbq.f(this.c, zkqVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "TombstoneArgs(messageId=" + this.a + ", content=" + this.b + ", messageWithMetadata=" + this.c + ")";
    }
}
