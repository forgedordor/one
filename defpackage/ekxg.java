package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekxg implements Serializable {
    public double a;
    public double b;

    public ekxg(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public static double a(ekxg ekxgVar, ekxg ekxgVar2) {
        return (ekxgVar.a * ekxgVar2.a) + (ekxgVar.b * ekxgVar2.b);
    }

    public static ekxg b(ekxg ekxgVar, ekxg ekxgVar2) {
        return new ekxg(ekxgVar.a - ekxgVar2.a, ekxgVar.b - ekxgVar2.b);
    }

    final void c(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ekxg)) {
            return false;
        }
        ekxg ekxgVar = (ekxg) obj;
        return this.a == ekxgVar.a && this.b == ekxgVar.b;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(Math.abs(this.a)) + 646;
        long jDoubleToLongBits2 = jDoubleToLongBits + (37 * jDoubleToLongBits) + Double.doubleToLongBits(Math.abs(this.b));
        return (int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32));
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ")";
    }

    public ekxg() {
        this(0.0d, 0.0d);
    }
}
