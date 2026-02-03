package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tab {
    public final Object a;
    public final Exception b;

    public tab(Object obj, Exception exc) {
        this.a = obj;
        this.b = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tab)) {
            return false;
        }
        tab tabVar = (tab) obj;
        return fdbq.f(this.a, tabVar.a) && fdbq.f(this.b, tabVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Exception exc = this.b;
        return (iHashCode * 31) + (exc != null ? exc.hashCode() : 0);
    }

    public final String toString() {
        return "D2DSourceApiResult(response=" + this.a + ", exception=" + this.b + ")";
    }

    public /* synthetic */ tab(Object obj) {
        this(obj, null);
    }
}
