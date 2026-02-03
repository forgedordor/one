package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awmq {
    public final awmp a;

    public awmq(awmp awmpVar) {
        awmpVar.getClass();
        this.a = awmpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof awmq) && fdbq.f(this.a, ((awmq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GroupCacheEntry(group=" + this.a + ")";
    }
}
