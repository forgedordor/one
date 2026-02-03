package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccae extends ccan {
    public final epun a;
    private final cbwd b;

    public ccae(cbwd cbwdVar, epun epunVar) {
        cbwdVar.getClass();
        epunVar.getClass();
        this.b = cbwdVar;
        this.a = epunVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccae)) {
            return false;
        }
        ccae ccaeVar = (ccae) obj;
        return fdbq.f(this.b, ccaeVar.b) && fdbq.f(this.a, ccaeVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "ApplicationMessageToSend(mlsContext=" + this.b + ", resultWithMessageToSend=" + this.a + ")";
    }
}
