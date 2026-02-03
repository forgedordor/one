package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nma {
    public final float[] a = new float[16];
    public final float[] b = new float[16];
    public final mfx c = new mfx();
    public boolean d;

    public static void a(float[] fArr, float[] fArr2) {
        mev.w(fArr);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        float f3 = fArr2[10];
        fArr[0] = f3 / fSqrt;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3 / fSqrt;
    }
}
