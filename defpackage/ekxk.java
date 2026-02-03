package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekxk implements Cloneable, Serializable {
    public double a;
    public double b;

    public ekxk() {
        this(3.141592653589793d, -3.141592653589793d);
    }

    public static double b(double d, double d2) {
        double d3 = d2 - d;
        return d3 >= 0.0d ? d3 : (d2 + 3.141592653589793d) - (d - 3.141592653589793d);
    }

    public static ekxk c() {
        ekxk ekxkVar = new ekxk();
        ekxkVar.g();
        return ekxkVar;
    }

    public static ekxk d() {
        ekxk ekxkVar = new ekxk();
        ekxkVar.h();
        return ekxkVar;
    }

    public final double a() {
        double d = this.b - this.a;
        if (d >= 0.0d) {
            return d;
        }
        double d2 = d + 6.283185307179586d;
        if (d2 > 0.0d) {
            return d2;
        }
        return -1.0d;
    }

    final void e(double d, double d2) {
        if (d == -3.141592653589793d) {
            d = 3.141592653589793d;
        }
        if (d2 == -3.141592653589793d) {
            d2 = 3.141592653589793d;
        }
        double dB = b(d, d2);
        this.a = dB <= 3.141592653589793d ? d : d2;
        if (dB <= 3.141592653589793d) {
            d = d2;
        }
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ekxk) {
            ekxk ekxkVar = (ekxk) obj;
            if (this.a == ekxkVar.a && this.b == ekxkVar.b) {
                return true;
            }
        }
        return false;
    }

    final void f(double d, double d2, boolean z) {
        this.a = d;
        this.b = d2;
        if (z) {
            return;
        }
        if (d == -3.141592653589793d && d2 != 3.141592653589793d) {
            this.a = 3.141592653589793d;
        }
        if (d2 != -3.141592653589793d || d == 3.141592653589793d) {
            return;
        }
        this.b = 3.141592653589793d;
    }

    final void g() {
        this.a = 3.141592653589793d;
        this.b = -3.141592653589793d;
    }

    final void h() {
        this.a = -3.141592653589793d;
        this.b = 3.141592653589793d;
    }

    public final int hashCode() {
        long jDoubleToLongBits = ((Double.doubleToLongBits(this.a) + 629) * 37) + Double.doubleToLongBits(this.b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    final void i(ekxk ekxkVar) {
        if (ekxkVar.l()) {
            return;
        }
        double d = ekxkVar.a;
        if (k(d)) {
            double d2 = ekxkVar.b;
            if (!k(d2)) {
                this.b = d2;
                return;
            } else {
                if (j(ekxkVar)) {
                    return;
                }
                h();
                return;
            }
        }
        double d3 = ekxkVar.b;
        if (k(d3)) {
            this.a = d;
            return;
        }
        if (!l()) {
            double d4 = this.a;
            if (!ekxkVar.k(d4)) {
                if (b(d3, d4) < b(this.b, d)) {
                    this.a = d;
                    return;
                } else {
                    this.b = d3;
                    return;
                }
            }
        }
        this.a = d;
        this.b = d3;
    }

    public final boolean j(ekxk ekxkVar) {
        if (n()) {
            if (!ekxkVar.n()) {
                return (ekxkVar.a >= this.a || ekxkVar.b <= this.b) && !l();
            }
        } else if (ekxkVar.n()) {
            return m() || ekxkVar.l();
        }
        return ekxkVar.a >= this.a && ekxkVar.b <= this.b;
    }

    public final boolean k(double d) {
        boolean zN = n();
        double d2 = this.a;
        return zN ? (d >= d2 || d <= this.b) && !l() : d >= d2 && d <= this.b;
    }

    public final boolean l() {
        return this.a == 3.141592653589793d && this.b == -3.141592653589793d;
    }

    public final boolean m() {
        return this.a == -3.141592653589793d && this.b == 3.141592653589793d;
    }

    public final boolean n() {
        return this.a > this.b;
    }

    public final String toString() {
        return "[" + this.a + ", " + this.b + "]";
    }

    public ekxk(double d, double d2) {
        f(d, d2, false);
    }

    public ekxk(ekxk ekxkVar) {
        this(ekxkVar.a, ekxkVar.b);
    }
}
