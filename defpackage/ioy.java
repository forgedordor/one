package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ioy extends iph {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public ioy(float f, float f2, float f3, float f4, float f5, float f6) {
        super(true, false, 2);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ioy)) {
            return false;
        }
        ioy ioyVar = (ioy) obj;
        return Float.compare(this.a, ioyVar.a) == 0 && Float.compare(this.b, ioyVar.b) == 0 && Float.compare(this.c, ioyVar.c) == 0 && Float.compare(this.d, ioyVar.d) == 0 && Float.compare(this.e, ioyVar.e) == 0 && Float.compare(this.f, ioyVar.f) == 0;
    }

    public final int hashCode() {
        return (((((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f);
    }

    public final String toString() {
        return "RelativeCurveTo(dx1=" + this.a + ", dy1=" + this.b + ", dx2=" + this.c + ", dy2=" + this.d + ", dx3=" + this.e + ", dy3=" + this.f + ')';
    }
}
