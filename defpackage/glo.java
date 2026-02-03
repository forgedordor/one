package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glo {
    public static final List a;
    public static final float b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v3 */
    static {
        boolean z;
        float f;
        long j;
        char c;
        lty[] ltyVarArr = new lty[7];
        lsz lszVar = gly.a;
        ltyVarArr[0] = glx.b();
        lty ltyVarC = gly.k;
        if (ltyVarC == null) {
            ltyVarC = hjv.a(lua.b(9, 0.8f, gly.b, null, 242), gly.d).c();
            gly.k = ltyVarC;
        }
        ltyVarArr[1] = ltyVarC;
        lty ltyVarC2 = gly.h;
        if (ltyVarC2 == null) {
            j = 4294967295L;
            z = 0;
            f = 0.5f;
            ltyVarC2 = glx.a(fcva.g(new glw((Float.floatToRawIntBits(-0.009f) & 4294967295L) | (Float.floatToRawIntBits(0.5f) << 32), new lsz(0.172f, 2)), new glw((Float.floatToRawIntBits(1.03f) << 32) | (Float.floatToRawIntBits(0.365f) & 4294967295L), new lsz(0.164f, 2)), new glw((Float.floatToRawIntBits(0.828f) << 32) | (Float.floatToRawIntBits(0.97f) & 4294967295L), new lsz(0.169f, 2))), 1, true, 4).c();
            gly.h = ltyVarC2;
        } else {
            z = 0;
            f = 0.5f;
            j = 4294967295L;
        }
        ltyVarArr[2] = ltyVarC2;
        lty ltyVarC3 = gly.g;
        if (ltyVarC3 == null) {
            glw[] glwVarArr = new glw[3];
            c = 3;
            glwVarArr[z] = new glw((Float.floatToRawIntBits(0.961f) << 32) | (Float.floatToRawIntBits(0.039f) & j), new lsz(0.426f, 2));
            glwVarArr[1] = new glw((Float.floatToRawIntBits(1.001f) << 32) | (Float.floatToRawIntBits(0.428f) & j), lsz.a);
            glwVarArr[2] = new glw((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(0.609f) & j), new lsz(1.0f, 2));
            ltyVarC3 = glx.a(fcva.g(glwVarArr), 2, true, 4).c();
            gly.g = ltyVarC3;
        } else {
            c = 3;
        }
        ltyVarArr[c] = ltyVarC3;
        lty ltyVarC4 = gly.i;
        if (ltyVarC4 == null) {
            ltyVarC4 = lua.b(8, 0.8f, gly.a, null, 242).c();
            gly.i = ltyVarC4;
        }
        ltyVarArr[4] = ltyVarC4;
        lty ltyVarC5 = gly.j;
        if (ltyVarC5 == null) {
            glw[] glwVarArr2 = new glw[2];
            glwVarArr2[z] = new glw((Float.floatToRawIntBits(1.237f) << 32) | (Float.floatToRawIntBits(1.236f) & j), new lsz(0.258f, 2));
            glwVarArr2[1] = new glw((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(0.918f) & j), new lsz(0.233f, 2));
            ltyVarC5 = glx.a(fcva.g(glwVarArr2), 4, z, 12).c();
            gly.j = ltyVarC5;
        }
        ltyVarArr[5] = ltyVarC5;
        lty ltyVarC6 = gly.f;
        if (ltyVarC6 == null) {
            float[] fArrF = iju.f();
            iju.g(fArrF, 1.0f, 0.64f);
            ltyVarC6 = hjv.a(hjv.a(lua.a(0, 15), fArrF), gly.c).c();
            gly.f = ltyVarC6;
        }
        ltyVarArr[6] = ltyVarC6;
        a = fcva.g(ltyVarArr);
        lty[] ltyVarArr2 = new lty[2];
        lty ltyVarC7 = gly.e;
        if (ltyVarC7 == null) {
            ltyVarC7 = lua.a(10, 14).c();
            gly.e = ltyVarC7;
        }
        float[] fArrF2 = iju.f();
        iju.d(fArrF2, 18.0f);
        ltyVarArr2[0] = hjv.a(ltyVarC7, fArrF2);
        ltyVarArr2[1] = glx.b();
        fcva.g(ltyVarArr2);
        b = 38.0f / Math.min(48.0f, 48.0f);
    }
}
