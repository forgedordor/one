package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekxb {
    public final double[] a;
    public final int b;
    private final int c;

    public ekxb(int i) {
        ejwl.b(true, "Negative rows not allowed.");
        ejwl.b(true, "Negative cols not allowed.");
        this.c = 3;
        this.b = i;
        this.a = new double[i * 3];
    }

    public static ekxb b(ekyj... ekyjVarArr) {
        ekxb ekxbVar = new ekxb(ekyjVarArr.length);
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < ekxbVar.b; i2++) {
                ekxbVar.c(i, i2, ekyjVarArr[i2].b(i));
            }
        }
        return ekxbVar;
    }

    public final double a(int i, int i2) {
        return this.a[(i * this.b) + i2];
    }

    public final void c(int i, int i2, double d) {
        this.a[(i * this.b) + i2] = d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ekxb)) {
            return false;
        }
        ekxb ekxbVar = (ekxb) obj;
        int i = ekxbVar.c;
        if (this.b != ekxbVar.b) {
            return false;
        }
        int i2 = 0;
        while (true) {
            double[] dArr = this.a;
            if (i2 >= dArr.length) {
                return true;
            }
            if (dArr[i2] != ekxbVar.a[i2]) {
                return false;
            }
            i2++;
        }
    }

    public final int hashCode() {
        long jDoubleToLongBits = this.b * 37;
        int i = 0;
        while (true) {
            double[] dArr = this.a;
            if (i >= dArr.length) {
                return (int) jDoubleToLongBits;
            }
            jDoubleToLongBits = (jDoubleToLongBits * 37) + Double.doubleToLongBits(dArr[i]);
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Matrix(3x");
        int i = this.b;
        sb.append(i);
        sb.append("): ");
        for (int i2 = 0; i2 < 3; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(a(i2, i3));
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
