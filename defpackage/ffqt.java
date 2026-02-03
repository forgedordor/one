package defpackage;

import java.lang.reflect.Array;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffqt extends ffqr {
    public final byte[] c;
    public final short[][] d;
    public final short[][] e;
    public final short[][] f;
    public final short[][] g;
    public final short[][][] h;
    public final short[][][] i;
    public final short[][][] j;
    public final short[][][] k;
    public final short[][][] l;
    public final short[][][] m;
    public final short[][][] n;
    public final byte[] o;
    public byte[] p;

    public ffqt(ffqs ffqsVar, byte[] bArr) {
        super(true, ffqsVar);
        int i = 0;
        if (ffqsVar.m != 3) {
            int i2 = ffqsVar.g;
            int i3 = ffqsVar.h;
            int i4 = ffqsVar.i;
            short[][] sArr = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i3, i4);
            this.d = sArr;
            short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i2, i3);
            this.e = sArr2;
            short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i2, i4);
            this.g = sArr3;
            short[][] sArr4 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i3, i4);
            this.f = sArr4;
            short[][][] sArr5 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i3, i2, i2);
            this.h = sArr5;
            short[][][] sArr6 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i3, i2, i3);
            this.i = sArr6;
            short[][][] sArr7 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i4, i2, i2);
            this.j = sArr7;
            short[][][] sArr8 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i4, i2, i3);
            this.k = sArr8;
            short[][][] sArr9 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i4, i2, i4);
            this.l = sArr9;
            short[][][] sArr10 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i4, i3, i3);
            this.m = sArr10;
            short[][][] sArr11 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i4, i3, i4);
            this.n = sArr11;
            this.o = null;
            byte[] bArrG = ffwk.g(bArr, 0, 32);
            this.c = bArrG;
            int length = bArrG.length;
            int iA = length + ffqv.a(sArr, bArr, length);
            int iA2 = iA + ffqv.a(sArr2, bArr, iA);
            int iA3 = iA2 + ffqv.a(sArr3, bArr, iA2);
            int iA4 = iA3 + ffqv.a(sArr4, bArr, iA3);
            int iB = iA4 + ffqv.b(sArr5, bArr, iA4, true);
            int iB2 = iB + ffqv.b(sArr6, bArr, iB, false);
            int iB3 = iB2 + ffqv.b(sArr7, bArr, iB2, true);
            int iB4 = iB3 + ffqv.b(sArr8, bArr, iB3, false);
            int iB5 = iB4 + ffqv.b(sArr9, bArr, iB4, false);
            int iB6 = iB5 + ffqv.b(sArr10, bArr, iB5, true);
            this.p = ffwk.g(bArr, iB6 + ffqv.b(sArr11, bArr, iB6, false), bArr.length);
            return;
        }
        byte[] bArrG2 = ffwk.g(bArr, 0, 32);
        this.o = bArrG2;
        byte[] bArrG3 = ffwk.g(bArr, 32, 64);
        this.c = bArrG3;
        int i5 = ffqsVar.m;
        int i6 = ffqsVar.g;
        int i7 = ffqsVar.h;
        int i8 = ffqsVar.i;
        byte[] bArrC = ffwk.c(bArrG3);
        byte[] bArrC2 = ffwk.c(bArrG2);
        ffqq ffqqVar = new ffqq(bArrC, ffqsVar.l);
        ffqq ffqqVar2 = new ffqq(bArrC2, ffqsVar.l);
        short[][] sArrF = ffqv.f(ffqqVar, i7, i8);
        short[][] sArrF2 = ffqv.f(ffqqVar, i6, i7);
        short[][] sArrF3 = ffqv.f(ffqqVar, i6, i8);
        short[][] sArrF4 = ffqv.f(ffqqVar, i7, i8);
        short[][] sArrA = ffqo.a(ffqo.b(sArrF2, sArrF4), sArrF3);
        short[][][] sArrH = ffqv.h(ffqqVar2, i7, i6, i6, true);
        short[][][] sArrH2 = ffqv.h(ffqqVar2, i7, i6, i7, false);
        short[][][] sArrH3 = ffqv.h(ffqqVar2, i8, i6, i6, true);
        short[][][] sArrH4 = ffqv.h(ffqqVar2, i8, i6, i7, false);
        short[][][] sArrH5 = ffqv.h(ffqqVar2, i8, i6, i8, false);
        short[][][] sArrH6 = ffqv.h(ffqqVar2, i8, i7, i7, true);
        short[][][] sArrH7 = ffqv.h(ffqqVar2, i8, i7, i8, false);
        short[][][] sArrC = ffqo.c(sArrF, sArrH3, sArrH);
        short[][][] sArrC2 = ffqo.c(sArrF, sArrH4, sArrH2);
        short[][][] sArrG = ffqv.g(sArrC);
        short[][][] sArr12 = new short[i7][][];
        while (i < i7) {
            short[][][] sArr13 = sArrH4;
            short[][] sArrE = ffqo.e(sArrC[i]);
            sArr12[i] = sArrE;
            short[][] sArrB = ffqo.b(sArrE, sArrF2);
            sArr12[i] = sArrB;
            sArr12[i] = ffqo.a(sArrB, sArrC2[i]);
            i++;
            sArrH4 = sArr13;
        }
        short[][][] sArr14 = sArrH4;
        short[][][] sArr15 = new short[i8][][];
        short[][][] sArr16 = new short[i8][][];
        short[][][] sArr17 = new short[i8][][];
        short[][][] sArr18 = new short[i8][][];
        short[][][] sArrG2 = ffqv.g(sArrH3);
        int i9 = 0;
        while (i9 < i8) {
            short[][][] sArr19 = sArr15;
            short[][] sArrE2 = ffqo.e(sArrH3[i9]);
            short[][][] sArr20 = sArr16;
            short[][] sArrB2 = ffqo.b(sArrE2, sArrF2);
            sArr19[i9] = sArrB2;
            short[][][] sArr21 = sArr12;
            sArr19[i9] = ffqo.a(sArrB2, sArr14[i9]);
            sArr20[i9] = ffqo.b(sArrE2, sArrA);
            short[][] sArrA2 = ffqo.a(sArr20[i9], ffqo.b(sArr14[i9], sArrF4));
            sArr20[i9] = sArrA2;
            sArr20[i9] = ffqo.a(sArrA2, sArrH5[i9]);
            short[][] sArrA3 = ffqo.a(ffqo.b(sArrH3[i9], sArrF2), sArr14[i9]);
            short[][] sArrD = ffqo.d(sArrF2);
            short[][] sArrB3 = ffqo.b(sArrD, sArrA3);
            sArr17[i9] = sArrB3;
            short[][] sArrA4 = ffqo.a(sArrB3, sArrH6[i9]);
            sArr17[i9] = sArrA4;
            int length2 = sArrA4.length;
            short[][] sArr22 = sArrF;
            if (length2 != sArrA4[0].length) {
                throw new RuntimeException("Computation to upper triangular matrix is not possible!");
            }
            short[][] sArr23 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, length2, length2);
            int i10 = 0;
            while (i10 < sArrA4.length) {
                sArr23[i10][i10] = sArrA4[i10][i10];
                short[][] sArr24 = sArrA4;
                int i11 = i10 + 1;
                while (i11 < sArr24[0].length) {
                    int i12 = i11;
                    sArr23[i10][i12] = ffqp.a(sArr24[i10][i12], sArr24[i12][i10]);
                    i11 = i12 + 1;
                }
                sArrA4 = sArr24;
                i10 = i11;
            }
            sArr17[i9] = sArr23;
            sArr18[i9] = ffqo.b(sArrD, sArr20[i9]);
            sArr18[i9] = ffqo.a(sArr18[i9], ffqo.b(ffqo.d(sArr14[i9]), sArrA));
            short[][] sArrA5 = ffqo.a(sArr18[i9], ffqo.b(ffqo.e(sArrH6[i9]), sArrF4));
            sArr18[i9] = sArrA5;
            sArr18[i9] = ffqo.a(sArrA5, sArrH7[i9]);
            i9++;
            sArr16 = sArr20;
            sArr15 = sArr19;
            sArr12 = sArr21;
            sArrF = sArr22;
        }
        ffqt ffqtVar = new ffqt(ffqsVar, bArrC, sArrF, sArrF2, sArrF4, sArrA, sArrG, sArr12, sArrG2, sArr15, sArr16, sArr17, sArr18);
        this.p = ffqtVar.p;
        this.d = ffqtVar.d;
        this.e = ffqtVar.e;
        this.f = ffqtVar.f;
        this.g = ffqtVar.g;
        this.h = ffqtVar.h;
        this.i = ffqtVar.i;
        this.j = ffqtVar.j;
        this.k = ffqtVar.k;
        this.l = ffqtVar.l;
        this.m = ffqtVar.m;
        this.n = ffqtVar.n;
    }

    public ffqt(ffqs ffqsVar, byte[] bArr, short[][] sArr, short[][] sArr2, short[][] sArr3, short[][] sArr4, short[][][] sArr5, short[][][] sArr6, short[][][] sArr7, short[][][] sArr8, short[][][] sArr9, short[][][] sArr10, short[][][] sArr11) {
        super(true, ffqsVar);
        this.o = null;
        this.p = null;
        this.c = (byte[]) bArr.clone();
        this.d = ffqv.e(sArr);
        this.e = ffqv.e(sArr2);
        this.f = ffqv.e(sArr3);
        this.g = ffqv.e(sArr4);
        this.h = ffqv.g(sArr5);
        this.i = ffqv.g(sArr6);
        this.j = ffqv.g(sArr7);
        this.k = ffqv.g(sArr8);
        this.l = ffqv.g(sArr9);
        this.m = ffqv.g(sArr10);
        this.n = ffqv.g(sArr11);
    }
}
