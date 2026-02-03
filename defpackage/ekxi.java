package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekxi implements Comparable, Serializable {
    public static final ekxi a = new ekxi(Double.POSITIVE_INFINITY);
    public static final ekxi b = new ekxi(0.0d);
    public final double c;

    public ekxi(double d) {
        this.c = d;
    }

    public static ekxi a(double d) {
        return new ekxi(d * 0.017453292519943295d);
    }

    public static ekxi b(int i) {
        return a(i * 1.0E-7d);
    }

    public static ekxi c(ekxi ekxiVar, ekxi ekxiVar2) {
        return ekxiVar2.c > ekxiVar.c ? ekxiVar : ekxiVar2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        double d = ((ekxi) obj).c;
        double d2 = this.c;
        if (d2 < d) {
            return -1;
        }
        return d2 <= d ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ekxi) && this.c == ((ekxi) obj).c;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.c);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        return (this.c * 57.29577951308232d) + "d";
    }

    public ekxi() {
        this(0.0d);
    }
}
