package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iox extends iph {
    public final float a;
    public final float b;
    public final float c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public final float g;

    public iox(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(false, false, 3);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = z;
        this.e = z2;
        this.f = f4;
        this.g = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iox)) {
            return false;
        }
        iox ioxVar = (iox) obj;
        return Float.compare(this.a, ioxVar.a) == 0 && Float.compare(this.b, ioxVar.b) == 0 && Float.compare(this.c, ioxVar.c) == 0 && this.d == ioxVar.d && this.e == ioxVar.e && Float.compare(this.f, ioxVar.f) == 0 && Float.compare(this.g, ioxVar.g) == 0;
    }

    public final int hashCode() {
        int iFloatToIntBits = (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
        float f = this.f;
        return (((((((iFloatToIntBits * 31) + iow.a(this.d)) * 31) + iow.a(this.e)) * 31) + Float.floatToIntBits(f)) * 31) + Float.floatToIntBits(this.g);
    }

    public final String toString() {
        return "RelativeArcTo(horizontalEllipseRadius=" + this.a + ", verticalEllipseRadius=" + this.b + ", theta=" + this.c + ", isMoreThanHalf=" + this.d + ", isPositiveArc=" + this.e + ", arcStartDx=" + this.f + ", arcStartDy=" + this.g + ')';
    }
}
