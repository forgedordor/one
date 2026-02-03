package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aibj {
    public final Object a;
    public final Exception b;

    public aibj(Object obj, Exception exc) {
        this.a = obj;
        this.b = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aibj)) {
            return false;
        }
        aibj aibjVar = (aibj) obj;
        return fdbq.f(this.a, aibjVar.a) && fdbq.f(this.b, aibjVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Exception exc = this.b;
        return (iHashCode * 31) + (exc != null ? exc.hashCode() : 0);
    }

    public final String toString() {
        return "D2DTargetApiResult(response=" + this.a + ", exception=" + this.b + ")";
    }

    public /* synthetic */ aibj(Object obj) {
        this(obj, null);
    }
}
