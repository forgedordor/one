package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccaj extends ccan {
    public final ccep a;
    private final cbwd b;

    public ccaj(cbwd cbwdVar, ccep ccepVar) {
        cbwdVar.getClass();
        this.b = cbwdVar;
        this.a = ccepVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccaj)) {
            return false;
        }
        ccaj ccajVar = (ccaj) obj;
        return fdbq.f(this.b, ccajVar.b) && fdbq.f(this.a, ccajVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "KeyRefreshRequired(mlsContext=" + this.b + ", mlsGroup=" + this.a + ")";
    }
}
