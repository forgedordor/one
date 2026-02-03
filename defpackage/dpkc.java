package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpkc extends dpke {
    public final eg a;
    public final dpje b;

    public dpkc(eg egVar, dpje dpjeVar) {
        this.a = egVar;
        this.b = dpjeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpkc)) {
            return false;
        }
        dpkc dpkcVar = (dpkc) obj;
        return fdbq.f(this.a, dpkcVar.a) && fdbq.f(this.b, dpkcVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Attached(activity=" + this.a + ", listener=" + this.b + ")";
    }
}
