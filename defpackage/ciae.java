package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ciae extends ciby {
    private final ejxr a;
    private final long b;

    public ciae(ejxr ejxrVar, long j) {
        if (ejxrVar == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.a = ejxrVar;
        this.b = j;
    }

    @Override // defpackage.ciby
    public final long a() {
        return this.b;
    }

    @Override // defpackage.ciby
    public final ejxr b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ciby) {
            ciby cibyVar = (ciby) obj;
            if (this.a.equals(cibyVar.b()) && this.b == cibyVar.a()) {
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
        return "SupplierConversationIdAndThreadId{conversationId=" + this.a.toString() + ", threadId=" + this.b + "}";
    }
}
