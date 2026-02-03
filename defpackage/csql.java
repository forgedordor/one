package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csql {
    public final eyjy a;
    public final ezpp b;
    public final ezol c;
    public final ezpx d;

    public csql(eyjy eyjyVar, ezpp ezppVar, ezol ezolVar, ezpx ezpxVar) {
        eyjyVar.getClass();
        ezppVar.getClass();
        ezolVar.getClass();
        ezpxVar.getClass();
        this.a = eyjyVar;
        this.b = ezppVar;
        this.c = ezolVar;
        this.d = ezpxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csql)) {
            return false;
        }
        csql csqlVar = (csql) obj;
        return fdbq.f(this.a, csqlVar.a) && fdbq.f(this.b, csqlVar.b) && fdbq.f(this.c, csqlVar.c) && fdbq.f(this.d, csqlVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "RequestObjects(stub=" + this.a + ", requestHeader=" + this.b + ", reporterId=" + this.c + ", spamContextInfo=" + this.d + ")";
    }
}
