package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekyb implements Serializable {
    public final double a;
    public final double b;

    public ekyb(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public static ekyb c(double d, double d2) {
        return new ekyb(ekxi.a(d), ekxi.a(d2));
    }

    public static ekyb d(int i, int i2) {
        return new ekyb(ekxi.b(i), ekxi.b(i2));
    }

    public final ekxi a() {
        return new ekxi(this.a);
    }

    public final ekxi b() {
        return new ekxi(this.b);
    }

    public final ekyj e() {
        double d = this.a;
        double dCos = Math.cos(d);
        double d2 = this.b;
        return new ekyj(Math.cos(d2) * dCos, Math.sin(d2) * dCos, Math.sin(d));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ekyb) {
            ekyb ekybVar = (ekyb) obj;
            if (this.a == ekybVar.a && this.b == ekybVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.a) + 646;
        long jDoubleToLongBits2 = jDoubleToLongBits + (37 * jDoubleToLongBits) + Double.doubleToLongBits(this.b);
        return (int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32));
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ")";
    }

    public ekyb() {
        this(0.0d, 0.0d);
    }

    public ekyb(ekxi ekxiVar, ekxi ekxiVar2) {
        this(ekxiVar.c, ekxiVar2.c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ekyb(ekyj ekyjVar) {
        double d = ekyjVar.g + 0.0d;
        double d2 = ekyjVar.e;
        double d3 = ekyjVar.f;
        this(Math.atan2(d, Math.sqrt((d2 * d2) + (d3 * d3))), Math.atan2(ekyjVar.f + 0.0d, ekyjVar.e + 0.0d));
    }
}
