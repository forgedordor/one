package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class joi {
    public static final boolean a(ijz ijzVar, float f, float f2) {
        if (ijzVar instanceof ijx) {
            ihu ihuVar = ((ijx) ijzVar).a;
            return ihuVar.b <= f && f < ihuVar.d && ihuVar.c <= f2 && f2 < ihuVar.e;
        }
        if (!(ijzVar instanceof ijy)) {
            if (ijzVar instanceof ijw) {
                return c(((ijw) ijzVar).a, f, f2);
            }
            throw new fctg();
        }
        ihw ihwVar = ((ijy) ijzVar).a;
        float f3 = ihwVar.a;
        if (f >= f3) {
            float f4 = ihwVar.c;
            if (f < f4) {
                float f5 = ihwVar.b;
                if (f2 >= f5) {
                    float f6 = ihwVar.d;
                    if (f2 >= f6) {
                        return false;
                    }
                    long j = ihwVar.e;
                    long j2 = ihwVar.f;
                    int i = (int) (j2 >> 32);
                    int i2 = (int) (j >> 32);
                    if (Float.intBitsToFloat(i2) + Float.intBitsToFloat(i) <= ihwVar.b()) {
                        long j3 = ihwVar.h;
                        long j4 = ihwVar.g;
                        int i3 = (int) (j4 >> 32);
                        int i4 = (int) (j3 >> 32);
                        if (Float.intBitsToFloat(i4) + Float.intBitsToFloat(i3) <= ihwVar.b()) {
                            int i5 = (int) (j3 & 4294967295L);
                            int i6 = (int) (j & 4294967295L);
                            if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= ihwVar.a()) {
                                int i7 = (int) (j4 & 4294967295L);
                                int i8 = (int) (j2 & 4294967295L);
                                if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= ihwVar.a()) {
                                    float fIntBitsToFloat = f3 + Float.intBitsToFloat(i2);
                                    float fIntBitsToFloat2 = f5 + Float.intBitsToFloat(i6);
                                    float fIntBitsToFloat3 = f4 - Float.intBitsToFloat(i);
                                    float fIntBitsToFloat4 = f5 + Float.intBitsToFloat(i8);
                                    float fIntBitsToFloat5 = f4 - Float.intBitsToFloat(i3);
                                    float fIntBitsToFloat6 = f6 - Float.intBitsToFloat(i7);
                                    float fIntBitsToFloat7 = f6 - Float.intBitsToFloat(i5);
                                    float fIntBitsToFloat8 = f3 + Float.intBitsToFloat(i4);
                                    if (f < fIntBitsToFloat && f2 < fIntBitsToFloat2) {
                                        return b(f, f2, j, fIntBitsToFloat, fIntBitsToFloat2);
                                    }
                                    if (f < fIntBitsToFloat8 && f2 > fIntBitsToFloat7) {
                                        return b(f, f2, j3, fIntBitsToFloat8, fIntBitsToFloat7);
                                    }
                                    if (f > fIntBitsToFloat3 && f2 < fIntBitsToFloat4) {
                                        return b(f, f2, j2, fIntBitsToFloat3, fIntBitsToFloat4);
                                    }
                                    if (f <= fIntBitsToFloat5 || f2 <= fIntBitsToFloat6) {
                                        return true;
                                    }
                                    return b(f, f2, j4, fIntBitsToFloat5, fIntBitsToFloat6);
                                }
                            }
                        }
                    }
                    iik iikVar = new iik((byte[]) null);
                    iikVar.t(ihwVar);
                    return c(iikVar, f, f2);
                }
            }
        }
        return false;
    }

    private static final boolean b(float f, float f2, long j, float f3, float f4) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f5 = f2 - f4;
        float f6 = f - f3;
        return ((f6 * f6) / (fIntBitsToFloat * fIntBitsToFloat)) + ((f5 * f5) / (fIntBitsToFloat2 * fIntBitsToFloat2)) <= 1.0f;
    }

    private static final boolean c(ikd ikdVar, float f, float f2) {
        ihu ihuVar = new ihu(f - 0.005f, (-0.005f) + f2, f + 0.005f, f2 + 0.005f);
        iik iikVar = new iik((byte[]) null);
        iikVar.s(ihuVar);
        iik iikVar2 = new iik((byte[]) null);
        iikVar2.q(ikdVar, iikVar, 1);
        boolean zIsEmpty = iikVar2.a.isEmpty();
        iikVar2.k();
        iikVar.k();
        return !zIsEmpty;
    }
}
