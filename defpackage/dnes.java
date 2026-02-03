package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnes {
    public final Object a;
    public double b;

    public dnes(Object obj, double d) {
        this.a = obj;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnes)) {
            return false;
        }
        dnes dnesVar = (dnes) obj;
        return fdbq.f(this.a, dnesVar.a) && Double.compare(this.b, dnesVar.b) == 0;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        long jDoubleToLongBits = Double.doubleToLongBits(this.b);
        return (iHashCode * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "Frecency(entity=" + this.a + ", score=" + this.b + ")";
    }
}
