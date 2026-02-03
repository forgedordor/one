package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kht {
    public static final kht a = new kht(1.0f, 0.0f);
    public final float b;
    public final float c;

    public kht(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kht)) {
            return false;
        }
        kht khtVar = (kht) obj;
        return this.b == khtVar.b && this.c == khtVar.c;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.b) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "TextGeometricTransform(scaleX=" + this.b + ", skewX=" + this.c + ')';
    }

    public kht() {
        this(1.0f, 0.0f);
    }
}
