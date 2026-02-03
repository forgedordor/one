package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihx {
    public static final ihw a(ihu ihuVar, long j, long j2, long j3, long j4) {
        return new ihw(ihuVar.b, ihuVar.c, ihuVar.d, ihuVar.e, j, j2, j3, j4);
    }

    public static final ihw b(float f, float f2, float f3, float f4, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat2));
        return new ihw(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final boolean c(ihw ihwVar) {
        long j = ihwVar.e;
        return (j >>> 32) == (4294967295L & j) && j == ihwVar.f && j == ihwVar.g && j == ihwVar.h;
    }
}
