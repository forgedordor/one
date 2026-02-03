package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccaf extends ccan {
    private final cbwd a;
    private final epun b;

    public ccaf(cbwd cbwdVar, epun epunVar) {
        cbwdVar.getClass();
        epunVar.getClass();
        this.a = cbwdVar;
        this.b = epunVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccaf)) {
            return false;
        }
        ccaf ccafVar = (ccaf) obj;
        return fdbq.f(this.a, ccafVar.a) && fdbq.f(this.b, ccafVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CommitToSend(mlsContext=" + this.a + ", commitToSend=" + this.b + ")";
    }
}
