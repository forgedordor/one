package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hef {
    public final float a;
    public final float b;
    public final float c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final float g;

    public hef(float f, float f2, float f3, boolean z, boolean z2, boolean z3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hef)) {
            return false;
        }
        hef hefVar = (hef) obj;
        return Float.compare(this.a, hefVar.a) == 0 && Float.compare(this.b, hefVar.b) == 0 && Float.compare(this.c, hefVar.c) == 0 && this.d == hefVar.d && this.e == hefVar.e && this.f == hefVar.f && Float.compare(this.g, hefVar.g) == 0;
    }

    public final int hashCode() {
        int iFloatToIntBits = (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
        float f = this.g;
        boolean z = this.f;
        return (((((((iFloatToIntBits * 31) + hee.a(this.d)) * 31) + hee.a(this.e)) * 31) + hee.a(z)) * 31) + Float.floatToIntBits(f);
    }

    public final String toString() {
        return "Keyline(size=" + this.a + ", offset=" + this.b + ", unadjustedOffset=" + this.c + ", isFocal=" + this.d + ", isAnchor=" + this.e + ", isPivot=" + this.f + ", cutoff=" + this.g + ')';
    }
}
