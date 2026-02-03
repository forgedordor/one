package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khi {
    public static final khi a = new khi(khf.b, 17, 0);
    public final float b;
    public final int c;
    public final int d;

    public khi(float f, int i, int i2) {
        this.b = f;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khi)) {
            return false;
        }
        float f = this.b;
        khi khiVar = (khi) obj;
        float f2 = khiVar.b;
        float f3 = khf.a;
        return Float.compare(f, f2) == 0 && this.c == khiVar.c && khg.b(this.d, khiVar.d);
    }

    public final int hashCode() {
        float f = khf.a;
        return (((Float.floatToIntBits(this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "LineHeightStyle(alignment=" + ((Object) khf.a(this.b)) + ", trim=" + ((Object) khh.a(this.c)) + ",mode=" + ((Object) khg.a(this.d)) + ')';
    }

    public khi(float f, int i) {
        this(f, i, 0);
    }
}
