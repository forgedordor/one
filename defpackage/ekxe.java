package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekxe implements Serializable {
    public double a;
    public double b;

    public ekxe(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public static ekxe c(double d, double d2) {
        ekxe ekxeVar = new ekxe();
        ekxeVar.d(d, d2);
        return ekxeVar;
    }

    public final double a(double d) {
        return Math.max(this.a, Math.min(this.b, d));
    }

    public final ekxe b(double d) {
        return i() ? this : new ekxe(this.a - d, this.b + d);
    }

    final void d(double d, double d2) {
        this.a = d <= d2 ? d : d2;
        if (d <= d2) {
            d = d2;
        }
        this.b = d;
    }

    final void e(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ekxe) {
            ekxe ekxeVar = (ekxe) obj;
            if (this.a == ekxeVar.a && this.b == ekxeVar.b) {
                return true;
            }
            if (i() && ekxeVar.i()) {
                return true;
            }
        }
        return false;
    }

    final void f(ekxe ekxeVar) {
        if (i()) {
            this.a = ekxeVar.a;
            this.b = ekxeVar.b;
        } else {
            if (ekxeVar.i()) {
                return;
            }
            this.a = Math.min(this.a, ekxeVar.a);
            this.b = Math.max(this.b, ekxeVar.b);
        }
    }

    public final boolean g(double d) {
        return d >= this.a && d <= this.b;
    }

    public final boolean h(ekxe ekxeVar) {
        double d = this.a;
        double d2 = ekxeVar.a;
        if (d <= d2) {
            d = d2;
        }
        if (d > (d <= d2 ? this : ekxeVar).b) {
            return false;
        }
        if (d > d2) {
            ekxeVar = this;
        }
        return d <= ekxeVar.b;
    }

    public final int hashCode() {
        if (i()) {
            return 17;
        }
        long jDoubleToLongBits = ((Double.doubleToLongBits(this.a) + 629) * 37) + Double.doubleToLongBits(this.b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final boolean i() {
        return this.a > this.b;
    }

    public final String toString() {
        return "[" + this.a + ", " + this.b + "]";
    }

    public ekxe() {
        this(1.0d, 0.0d);
    }

    public ekxe(ekxe ekxeVar) {
        this(ekxeVar.a, ekxeVar.b);
    }
}
