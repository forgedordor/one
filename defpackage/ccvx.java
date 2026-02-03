package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccvx {
    public final evqs a;
    public final evqs b;
    public final long c;

    public ccvx(evqs evqsVar, evqs evqsVar2, long j) {
        this.a = evqsVar;
        this.b = evqsVar2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccvx)) {
            return false;
        }
        ccvx ccvxVar = (ccvx) obj;
        return fdbq.f(this.a, ccvxVar.a) && fdbq.f(this.b, ccvxVar.b) && this.c == ccvxVar.c;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        long j = this.c;
        return (iHashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "E2eeProvisioningData(publicKey=" + this.a + ", signature=" + this.b + ", serverHint=" + this.c + ")";
    }
}
