package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvzx extends dwau {
    public final dwpx a;
    public final long b;

    public dvzx(dwpx dwpxVar, long j) {
        this.a = dwpxVar;
        this.b = j;
    }

    @Override // defpackage.dwau
    public final long a() {
        return this.b;
    }

    @Override // defpackage.dwau
    public final dwpx b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwau) {
            dwau dwauVar = (dwau) obj;
            if (this.a.equals(dwauVar.b()) && this.b == dwauVar.a()) {
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
        return "DeleteConversation{conversationId=" + this.a.toString() + ", deleteTimestampMicroSec=" + this.b + "}";
    }
}
