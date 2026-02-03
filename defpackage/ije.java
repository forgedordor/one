package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class ije {
    public static final long a = ijg.d(4278190080L);
    public static final long b = ijg.d(4282664004L);
    public static final long c = ijg.d(4287137928L);
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public final long i;

    static {
        ijg.d(4291611852L);
        d = ijg.d(4294967295L);
        e = ijg.d(4294901760L);
        ijg.d(4278255360L);
        f = ijg.d(4278190335L);
        ijg.d(4294967040L);
        ijg.d(4278255615L);
        ijg.d(4294902015L);
        g = ijg.c(0);
        float[] fArr = ilo.a;
        h = ijg.f(0.0f, 0.0f, 0.0f, 0.0f, ilo.u);
    }

    public /* synthetic */ ije(long j) {
        this.i = j;
    }

    public static final float a(long j) {
        float fA;
        float f2;
        if ((63 & j) == 0) {
            fA = (float) fctz.a(j >>> 56);
            f2 = 255.0f;
        } else {
            fA = (float) fctz.a((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fA / f2;
    }

    public static final float b(long j) {
        int i;
        int i2;
        if ((63 & j) == 0) {
            return ((float) fctz.a((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        char c2 = (char) s;
        int i3 = c2 & 1023;
        int i4 = (s >>> 10) & 31;
        int i5 = c2 & 32768;
        if (i4 != 0) {
            i = i3 << 13;
            if (i4 == 31) {
                i2 = 255;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = i4 + 112;
            }
        } else {
            if (i3 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i3 + 1056964608) - ijm.a;
                return i5 != 0 ? -fIntBitsToFloat : fIntBitsToFloat;
            }
            i2 = 0;
            i = 0;
        }
        return Float.intBitsToFloat((i2 << 23) | (i5 << 16) | i);
    }

    public static final float c(long j) {
        int i;
        int i2;
        if ((63 & j) == 0) {
            return ((float) fctz.a((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        char c2 = (char) s;
        int i3 = c2 & 1023;
        int i4 = (s >>> 10) & 31;
        int i5 = c2 & 32768;
        if (i4 != 0) {
            i = i3 << 13;
            if (i4 == 31) {
                i2 = 255;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = i4 + 112;
            }
        } else {
            if (i3 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i3 + 1056964608) - ijm.a;
                return i5 != 0 ? -fIntBitsToFloat : fIntBitsToFloat;
            }
            i2 = 0;
            i = 0;
        }
        return Float.intBitsToFloat((i2 << 23) | (i5 << 16) | i);
    }

    public static final float d(long j) {
        int i;
        int i2;
        long j2 = 63 & j;
        long j3 = j >>> 48;
        if (j2 == 0) {
            return ((float) fctz.a(j3 & 255)) / 255.0f;
        }
        short s = (short) j3;
        char c2 = (char) s;
        int i3 = c2 & 1023;
        int i4 = (s >>> 10) & 31;
        int i5 = c2 & 32768;
        if (i4 != 0) {
            i = i3 << 13;
            if (i4 == 31) {
                i2 = 255;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = i4 + 112;
            }
        } else {
            if (i3 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i3 + 1056964608) - ijm.a;
                return i5 != 0 ? -fIntBitsToFloat : fIntBitsToFloat;
            }
            i2 = 0;
            i = 0;
        }
        return Float.intBitsToFloat((i2 << 23) | (i5 << 16) | i);
    }

    public static final long e(long j, ilg ilgVar) {
        ilr ilrVarI;
        ilg ilgVarF = f(j);
        int i = ilgVarF.c;
        int i2 = ilgVar.c;
        if ((i | i2) < 0) {
            ilrVarI = ilh.i(ilgVarF, ilgVar);
        } else {
            int i3 = i | (i2 << 6);
            cuh cuhVar = ils.a;
            Object objA = cuhVar.a(i3);
            if (objA == null) {
                objA = ilh.i(ilgVarF, ilgVar);
                cuhVar.f(i3, objA);
            }
            ilrVarI = (ilr) objA;
        }
        return ilrVarI.a(j);
    }

    public static final ilg f(long j) {
        float[] fArr = ilo.a;
        return ilo.y[(int) (j & 63)];
    }

    public static String g(long j) {
        return "Color(" + d(j) + ", " + c(j) + ", " + b(j) + ", " + a(j) + ", " + f(j).a + ')';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ije) && this.i == ((ije) obj).i;
    }

    public final int hashCode() {
        return fctr.a(this.i);
    }

    public final String toString() {
        return g(this.i);
    }
}
