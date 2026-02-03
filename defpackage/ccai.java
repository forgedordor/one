package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccai extends ccan {
    private final cbwd a;
    private final ccep b;

    public ccai(cbwd cbwdVar, ccep ccepVar) {
        cbwdVar.getClass();
        this.a = cbwdVar;
        this.b = ccepVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccai)) {
            return false;
        }
        ccai ccaiVar = (ccai) obj;
        return fdbq.f(this.a, ccaiVar.a) && fdbq.f(this.b, ccaiVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "JoinedGroup(mlsContext=" + this.a + ", mlsGroup=" + this.b + ")";
    }
}
