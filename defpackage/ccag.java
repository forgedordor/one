package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccag extends ccan {
    public final ccam a;
    private final cbwd b;

    public ccag(cbwd cbwdVar, ccam ccamVar) {
        cbwdVar.getClass();
        ccamVar.getClass();
        this.b = cbwdVar;
        this.a = ccamVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccag)) {
            return false;
        }
        ccag ccagVar = (ccag) obj;
        return fdbq.f(this.b, ccagVar.b) && this.a == ccagVar.a;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "Completed(mlsContext=" + this.b + ", resultStatus=" + this.a + ")";
    }
}
