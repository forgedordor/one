package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chbs {
    public final awjl a;
    public final awpx b;

    public chbs(awjl awjlVar, awpx awpxVar) {
        awjlVar.getClass();
        this.a = awjlVar;
        this.b = awpxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chbs)) {
            return false;
        }
        chbs chbsVar = (chbs) obj;
        return fdbq.f(this.a, chbsVar.a) && fdbq.f(this.b, chbsVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        awpx awpxVar = this.b;
        return iHashCode + (awpxVar == null ? 0 : awpxVar.hashCode());
    }

    public final String toString() {
        return "PrimitiveTokens(destination=" + this.a + ", groupContext=" + this.b + ")";
    }
}
