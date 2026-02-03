package j$.util;

/* loaded from: classes9.dex */
public final class B {
    public static final B c = new B();
    public final boolean a;
    public final double b;

    public B() {
        this.a = false;
        this.b = Double.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b = (B) obj;
        boolean z = this.a;
        return (z && b.a) ? Double.compare(this.b, b.b) == 0 : z == b.a;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        if (!this.a) {
            return "OptionalDouble.empty";
        }
        return "OptionalDouble[" + this.b + "]";
    }

    public B(double d) {
        this.a = true;
        this.b = d;
    }
}
