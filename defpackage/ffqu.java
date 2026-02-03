package defpackage;

import java.lang.reflect.Array;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffqu extends ffqr {
    public short[][][] c;
    public byte[] d;
    public short[][][] e;
    public short[][][] f;
    public short[][][] g;
    public short[][][] h;
    public short[][][] i;

    public ffqu(ffqs ffqsVar, byte[] bArr) {
        super(false, ffqsVar);
        int i = ffqsVar.k;
        int i2 = ffqsVar.j;
        if (this.b.m == 1) {
            this.c = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i, i2, i2);
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                for (int i5 = 0; i5 < i2; i5++) {
                    for (int i6 = 0; i6 < i; i6++) {
                        if (i4 > i5) {
                            this.c[i6][i4][i5] = 0;
                        } else {
                            this.c[i6][i4][i5] = (short) (bArr[i3] & 255);
                            i3++;
                        }
                    }
                }
            }
            return;
        }
        this.d = ffwk.g(bArr, 0, 32);
        int i7 = ffqsVar.h;
        int i8 = ffqsVar.g;
        int i9 = ffqsVar.i;
        this.e = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i7, i8, i9);
        this.f = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i7, i7, i7);
        this.g = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i7, i7, i9);
        this.h = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i7, i9, i9);
        this.i = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i9, i9, i9);
        int iB = ffqv.b(this.e, bArr, 32, false) + 32;
        int iB2 = iB + ffqv.b(this.f, bArr, iB, true);
        int iB3 = iB2 + ffqv.b(this.g, bArr, iB2, false);
        int iB4 = iB3 + ffqv.b(this.h, bArr, iB3, true);
        if (iB4 + ffqv.b(this.i, bArr, iB4, true) != bArr.length) {
            throw new IllegalArgumentException("unparsed data in key encoding");
        }
    }
}
