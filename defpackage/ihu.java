package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihu {
    public static final ihu a = new ihu(0.0f, 0.0f, 0.0f, 0.0f);
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public ihu(float f, float f2, float f3, float f4) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public static /* synthetic */ ihu j(ihu ihuVar, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = ihuVar.b;
        }
        float f4 = (i & 2) != 0 ? ihuVar.c : 0.0f;
        if ((i & 4) != 0) {
            f2 = ihuVar.d;
        }
        if ((i & 8) != 0) {
            f3 = ihuVar.e;
        }
        return new ihu(f, f4, f2, f3);
    }

    public final long a() {
        float f = this.d;
        float f2 = this.b;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2 + ((f - f2) / 2.0f));
        float f3 = this.e;
        float f4 = this.c;
        return (jFloatToRawIntBits << 32) | (Float.floatToRawIntBits(f4 + ((f3 - f4) / 2.0f)) & 4294967295L);
    }

    public final long b() {
        return (Float.floatToRawIntBits(this.d - this.b) << 32) | (Float.floatToRawIntBits(this.e - this.c) & 4294967295L);
    }

    public final long c() {
        return (Float.floatToRawIntBits(this.b) << 32) | (Float.floatToRawIntBits(this.c) & 4294967295L);
    }

    public final ihu d(ihu ihuVar) {
        return new ihu(Math.max(this.b, ihuVar.b), Math.max(this.c, ihuVar.c), Math.min(this.d, ihuVar.d), Math.min(this.e, ihuVar.e));
    }

    public final ihu e(float f, float f2) {
        float f3 = this.e;
        float f4 = this.d;
        return new ihu(this.b + f, this.c + f2, f4 + f, f3 + f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihu)) {
            return false;
        }
        ihu ihuVar = (ihu) obj;
        return Float.compare(this.b, ihuVar.b) == 0 && Float.compare(this.c, ihuVar.c) == 0 && Float.compare(this.d, ihuVar.d) == 0 && Float.compare(this.e, ihuVar.e) == 0;
    }

    public final ihu f(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new ihu(this.b + Float.intBitsToFloat(i), this.c + Float.intBitsToFloat(i2), this.d + Float.intBitsToFloat(i), this.e + Float.intBitsToFloat(i2));
    }

    public final boolean g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float f = this.b;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat < this.d) & (fIntBitsToFloat >= f) & (fIntBitsToFloat2 >= this.c) & (fIntBitsToFloat2 < this.e);
    }

    public final boolean h() {
        return (this.b >= this.d) | (this.c >= this.e);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.b) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e);
    }

    public final boolean i(ihu ihuVar) {
        return (this.b < ihuVar.d) & (ihuVar.b < this.d) & (this.c < ihuVar.e) & (ihuVar.c < this.e);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + iho.a(this.b) + ", " + iho.a(this.c) + ", " + iho.a(this.d) + ", " + iho.a(this.e) + ')';
    }
}
