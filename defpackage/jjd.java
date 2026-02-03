package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjd {
    public static final void a(float[] fArr, float[] fArr2) {
        float fC = c(fArr2, 0, fArr, 0);
        float fC2 = c(fArr2, 0, fArr, 1);
        float fC3 = c(fArr2, 0, fArr, 2);
        float fC4 = c(fArr2, 0, fArr, 3);
        float fC5 = c(fArr2, 1, fArr, 0);
        float fC6 = c(fArr2, 1, fArr, 1);
        float fC7 = c(fArr2, 1, fArr, 2);
        float fC8 = c(fArr2, 1, fArr, 3);
        float fC9 = c(fArr2, 2, fArr, 0);
        float fC10 = c(fArr2, 2, fArr, 1);
        float fC11 = c(fArr2, 2, fArr, 2);
        float fC12 = c(fArr2, 2, fArr, 3);
        float fC13 = c(fArr2, 3, fArr, 0);
        float fC14 = c(fArr2, 3, fArr, 1);
        float fC15 = c(fArr2, 3, fArr, 2);
        float fC16 = c(fArr2, 3, fArr, 3);
        fArr[0] = fC;
        fArr[1] = fC2;
        fArr[2] = fC3;
        fArr[3] = fC4;
        fArr[4] = fC5;
        fArr[5] = fC6;
        fArr[6] = fC7;
        fArr[7] = fC8;
        fArr[8] = fC9;
        fArr[9] = fC10;
        fArr[10] = fC11;
        fArr[11] = fC12;
        fArr[12] = fC13;
        fArr[13] = fC14;
        fArr[14] = fC15;
        fArr[15] = fC16;
    }

    public static final void b(float[] fArr, float f, float f2, float[] fArr2) {
        iju.c(fArr2);
        iju.h(fArr2, f, f2);
        a(fArr, fArr2);
    }

    private static final float c(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        float f = fArr[i3] * fArr2[i2];
        float f2 = fArr[i3 + 1] * fArr2[i2 + 4];
        return f + f2 + (fArr[i3 + 2] * fArr2[i2 + 8]) + (fArr[i3 + 3] * fArr2[i2 + 12]);
    }
}
