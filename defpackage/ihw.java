package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihw {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        ihx.b(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public ihw(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihw)) {
            return false;
        }
        ihw ihwVar = (ihw) obj;
        return Float.compare(this.a, ihwVar.a) == 0 && Float.compare(this.b, ihwVar.b) == 0 && Float.compare(this.c, ihwVar.c) == 0 && Float.compare(this.d, ihwVar.d) == 0 && ihn.b(this.e, ihwVar.e) && ihn.b(this.f, ihwVar.f) && ihn.b(this.g, ihwVar.g) && ihn.b(this.h, ihwVar.h);
    }

    public final int hashCode() {
        int iFloatToIntBits = (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
        long j = this.h;
        long j2 = this.g;
        return (((((((iFloatToIntBits * 31) + ihm.a(this.e)) * 31) + ihm.a(this.f)) * 31) + ihm.a(j2)) * 31) + ihm.a(j);
    }

    public final String toString() {
        String str = iho.a(this.a) + ", " + iho.a(this.b) + ", " + iho.a(this.c) + ", " + iho.a(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean zB = ihn.b(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!zB || !ihn.b(j2, j3) || !ihn.b(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) ihn.a(j)) + ", topRight=" + ((Object) ihn.a(j2)) + ", bottomRight=" + ((Object) ihn.a(j3)) + ", bottomLeft=" + ((Object) ihn.a(j4)) + ')';
        }
        long j5 = j >> 32;
        int i = (int) (j & 4294967295L);
        int i2 = (int) j5;
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i)) {
            return "RoundRect(rect=" + str + ", radius=" + iho.a(Float.intBitsToFloat(i2)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + iho.a(Float.intBitsToFloat(i2)) + ", y=" + iho.a(Float.intBitsToFloat(i)) + ')';
    }
}
