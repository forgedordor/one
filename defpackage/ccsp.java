package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccsp {
    public final evqs a;
    public final int b;

    public ccsp(evqs evqsVar, int i) {
        this.a = evqsVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccsp)) {
            return false;
        }
        ccsp ccspVar = (ccsp) obj;
        return fdbq.f(this.a, ccspVar.a) && this.b == ccspVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "ReceiptInfo(signature=" + this.a + ", eraId=" + this.b + ")";
    }
}
