package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivz {
    public static final long a(ivy ivyVar) {
        return ivyVar.j(0L);
    }

    public static final long b(ivy ivyVar) {
        return ivyVar.l(0L);
    }

    public static final long c(ivy ivyVar) {
        return ivyVar.k(0L);
    }

    public static final ihu d(ivy ivyVar) {
        ivy ivyVarR = ivyVar.r();
        if (ivyVarR != null) {
            return ivyVarR.o(ivyVar, true);
        }
        return new ihu(0.0f, 0.0f, (int) (ivyVar.g() >> 32), (int) (ivyVar.g() & 4294967295L));
    }

    public static final ihu e(ivy ivyVar) {
        return g(ivyVar).o(ivyVar, true);
    }

    public static final ihu f(ivy ivyVar) {
        ivy ivyVarG = g(ivyVar);
        long jG = ivyVarG.g() >> 32;
        long jG2 = ivyVarG.g() & 4294967295L;
        ihu ihuVarO = ivyVarG.o(ivyVar, true);
        float f = ihuVarO.b;
        float f2 = ihuVarO.c;
        float f3 = ihuVarO.d;
        float f4 = ihuVarO.e;
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f5 = (int) jG;
        if (f > f5) {
            f = f5;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 <= f5) {
            f5 = f3;
        }
        if (f != f5) {
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            float f6 = (int) jG2;
            if (f2 > f6) {
                f2 = f6;
            }
            if (f4 > f6) {
                f4 = f6;
            }
            if (f2 != f4) {
                long jL = ivyVarG.l((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
                long jL2 = ivyVarG.l((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
                long jL3 = ivyVarG.l((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
                long jL4 = ivyVarG.l((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jL >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jL2 >> 32));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jL4 >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jL3 >> 32));
                float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
                float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jL & 4294967295L));
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jL2 & 4294967295L));
                float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jL4 & 4294967295L));
                float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jL3 & 4294967295L));
                return new ihu(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
            }
        }
        return ihu.a;
    }

    public static final ivy g(ivy ivyVar) {
        ivy ivyVar2;
        jer jerVar;
        ivy ivyVarR = ivyVar.r();
        while (true) {
            ivy ivyVar3 = ivyVarR;
            ivyVar2 = ivyVar;
            ivyVar = ivyVar3;
            if (ivyVar == null) {
                break;
            }
            ivyVarR = ivyVar.r();
        }
        jer jerVar2 = ivyVar2 instanceof jer ? (jer) ivyVar2 : null;
        if (jerVar2 == null) {
            return ivyVar2;
        }
        do {
            jerVar = jerVar2;
            jerVar2 = jerVar2.x;
        } while (jerVar2 != null);
        return jerVar;
    }
}
