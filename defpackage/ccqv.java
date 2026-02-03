package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccqv {
    public final evqs a;
    public final evqs b;
    public final evqs c;
    public final long d;
    public final long e;

    public ccqv(evqs evqsVar, evqs evqsVar2, evqs evqsVar3, long j, long j2) {
        this.a = evqsVar;
        this.b = evqsVar2;
        this.c = evqsVar3;
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccqv)) {
            return false;
        }
        ccqv ccqvVar = (ccqv) obj;
        return fdbq.f(this.a, ccqvVar.a) && fdbq.f(this.b, ccqvVar.b) && fdbq.f(this.c, ccqvVar.c) && this.d == ccqvVar.d && this.e == ccqvVar.e;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + ccqu.a(this.d)) * 31) + ccqu.a(this.e);
    }

    public final String toString() {
        return "CreateCertificateParameters(subjectPublicKey=" + this.a + ", participantSignature=" + this.b + ", participantPublicKey=" + this.c + ", validityStartEpochSeconds=" + this.d + ", validityEndEpochSeconds=" + this.e + ")";
    }
}
