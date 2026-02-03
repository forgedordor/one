package defpackage;

import java.lang.reflect.Array;
import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffqq extends SecureRandom {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private ffil d;

    public ffqq(byte[] bArr, ffil ffilVar) {
        this.a = bArr;
        this.d = ffilVar;
        int length = bArr.length;
        if (length >= 48) {
            b(bArr);
            return;
        }
        int i = 48 - length;
        int iB = ffilVar.b();
        ffilVar.e(bArr, 0, length);
        byte[] bArrF = new byte[iB];
        ffilVar.a(bArrF, 0);
        if (i != iB) {
            if (i < iB) {
                bArrF = ffwk.f(bArrF, i);
            } else {
                byte[] bArrF2 = ffwk.f(bArrF, iB);
                while (true) {
                    i -= iB;
                    if (i < iB) {
                        break;
                    }
                    ffilVar.e(bArrF, 0, iB);
                    bArrF = new byte[iB];
                    ffilVar.a(bArrF, 0);
                    bArrF2 = ffwk.e(bArrF2, bArrF);
                }
                if (i > 0) {
                    ffilVar.e(bArrF, 0, iB);
                    byte[] bArr2 = new byte[iB];
                    ffilVar.a(bArr2, 0);
                    int length2 = bArrF2.length;
                    bArrF2 = ffwk.f(bArrF2, length2 + i);
                    System.arraycopy(bArr2, 0, bArrF2, length2, i);
                }
                bArrF = bArrF2;
            }
        }
        b(ffwk.e(this.a, bArrF));
    }

    private static final void a(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        char c;
        byte[] bArr4 = bArr2;
        try {
            byte[] bArr5 = ffiy.a;
            ffij.b();
            int length = bArr.length;
            byte[] bArr6 = new byte[32];
            System.arraycopy(bArr, 0, bArr6, 0, 32);
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 15, 4);
            int iB = ffwp.b(bArr6, 0);
            iArr[0][0] = iB;
            int iB2 = ffwp.b(bArr6, 4);
            iArr[0][1] = iB2;
            int i2 = 8;
            int iB3 = ffwp.b(bArr6, 8);
            iArr[0][2] = iB3;
            int iB4 = ffwp.b(bArr6, 12);
            char c2 = 3;
            iArr[0][3] = iB4;
            int i3 = 16;
            int iB5 = ffwp.b(bArr6, 16);
            iArr[1][0] = iB5;
            int iB6 = ffwp.b(bArr6, 20);
            iArr[1][1] = iB6;
            int i4 = 24;
            int iB7 = ffwp.b(bArr6, 24);
            iArr[1][2] = iB7;
            int iB8 = ffwp.b(bArr6, 28);
            iArr[1][3] = iB8;
            int i5 = 2;
            int i6 = 1;
            while (true) {
                int iB9 = ffiy.b(ffiy.a(iB8, i2)) ^ i6;
                i6 += i6;
                iB ^= iB9;
                int[] iArr2 = iArr[i5];
                iArr2[0] = iB;
                iB2 ^= iB;
                iArr2[1] = iB2;
                iB3 ^= iB2;
                iArr2[2] = iB3;
                iB4 ^= iB3;
                iArr2[c2] = iB4;
                c = c2;
                int i7 = i5 + 1;
                if (i7 >= 15) {
                    break;
                }
                int[][] iArr3 = iArr;
                int i8 = i4;
                int i9 = i2;
                int i10 = i3;
                iB5 ^= ffiy.b(iB4);
                int[] iArr4 = iArr3[i7];
                iArr4[0] = iB5;
                iB6 ^= iB5;
                iArr4[1] = iB6;
                iB7 ^= iB6;
                iArr4[2] = iB7;
                iB8 ^= iB7;
                iArr4[c] = iB8;
                i5 += 2;
                bArr4 = bArr2;
                c2 = c;
                i2 = i9;
                i3 = i10;
                i4 = i8;
                iArr = iArr3;
            }
            byte[] bArr7 = ffiy.a;
            byte[] bArrC = ffwk.c(bArr7);
            ffij.b();
            int i11 = 0;
            while (true) {
                int length2 = bArr4.length;
                if (i11 == i3) {
                    return;
                }
                int i12 = i + i11;
                if (i11 > 0) {
                    throw new ffik("input buffer too short");
                }
                if (i12 > bArr3.length - 16) {
                    throw new ffim();
                }
                int iB10 = ffwp.b(bArr4, i11);
                int iB11 = ffwp.b(bArr4, i11 + 4);
                int iB12 = ffwp.b(bArr4, i11 + 8);
                int iB13 = ffwp.b(bArr4, i11 + 12);
                int[] iArr5 = iArr[0];
                int i13 = iB10 ^ iArr5[0];
                int i14 = iB11 ^ iArr5[1];
                int iA = iB12 ^ iArr5[2];
                int iA2 = iB13 ^ iArr5[c];
                int i15 = 1;
                while (i15 < 13) {
                    int[] iArr6 = ffiy.b;
                    int iA3 = (ffiy.a(iArr6[(iA >> 16) & 255], 16) ^ (iArr6[i13 & 255] ^ ffiy.a(iArr6[(i14 >> 8) & 255], i4))) ^ ffiy.a(iArr6[(iA2 >> 24) & 255], 8);
                    int[] iArr7 = iArr[i15];
                    byte[] bArr8 = bArr7;
                    int i16 = iA3 ^ iArr7[0];
                    int iA4 = ((ffiy.a(iArr6[(iA2 >> 16) & 255], 16) ^ (iArr6[i14 & 255] ^ ffiy.a(iArr6[(iA >> 8) & 255], 24))) ^ ffiy.a(iArr6[(i13 >> 24) & 255], 8)) ^ iArr7[1];
                    int[][] iArr8 = iArr;
                    int iA5 = ((ffiy.a(iArr6[(i13 >> 16) & 255], 16) ^ (iArr6[iA & 255] ^ ffiy.a(iArr6[(iA2 >> 8) & 255], 24))) ^ ffiy.a(iArr6[(i14 >> 24) & 255], 8)) ^ iArr7[2];
                    int iA6 = (((iArr6[iA2 & 255] ^ ffiy.a(iArr6[(i13 >> 8) & 255], 24)) ^ ffiy.a(iArr6[(i14 >> 16) & 255], 16)) ^ ffiy.a(iArr6[(iA >> 24) & 255], 8)) ^ iArr7[c];
                    int iA7 = ((iArr6[i16 & 255] ^ ffiy.a(iArr6[(iA4 >> 8) & 255], 24)) ^ ffiy.a(iArr6[(iA5 >> 16) & 255], 16)) ^ ffiy.a(iArr6[(iA6 >> 24) & 255], 8);
                    int[] iArr9 = iArr8[i15 + 1];
                    int i17 = iA7 ^ iArr9[0];
                    int iA8 = (((iArr6[iA4 & 255] ^ ffiy.a(iArr6[(iA5 >> 8) & 255], 24)) ^ ffiy.a(iArr6[(iA6 >> 16) & 255], 16)) ^ ffiy.a(iArr6[(i16 >> 24) & 255], 8)) ^ iArr9[1];
                    iA = (((iArr6[iA5 & 255] ^ ffiy.a(iArr6[(iA6 >> 8) & 255], 24)) ^ ffiy.a(iArr6[(i16 >> 16) & 255], 16)) ^ ffiy.a(iArr6[(iA4 >> 24) & 255], 8)) ^ iArr9[2];
                    i15 += 2;
                    iA2 = ((ffiy.a(iArr6[(iA4 >> 16) & 255], 16) ^ (iArr6[iA6 & 255] ^ ffiy.a(iArr6[(i16 >> 8) & 255], 24))) ^ ffiy.a(iArr6[(iA5 >> 24) & 255], 8)) ^ iArr9[c];
                    i13 = i17;
                    i14 = iA8;
                    bArr7 = bArr8;
                    iArr = iArr8;
                    i4 = 24;
                }
                byte[] bArr9 = bArr7;
                int[][] iArr10 = iArr;
                int[] iArr11 = ffiy.b;
                int iA9 = ((iArr11[i13 & 255] ^ ffiy.a(iArr11[(i14 >> 8) & 255], 24)) ^ ffiy.a(iArr11[(iA >> 16) & 255], 16)) ^ ffiy.a(iArr11[(iA2 >> 24) & 255], 8);
                int[] iArr12 = iArr10[i15];
                int i18 = iA9 ^ iArr12[0];
                int iA10 = (((iArr11[i14 & 255] ^ ffiy.a(iArr11[(iA >> 8) & 255], 24)) ^ ffiy.a(iArr11[(iA2 >> 16) & 255], 16)) ^ ffiy.a(iArr11[(i13 >> 24) & 255], 8)) ^ iArr12[1];
                int iA11 = (((iArr11[iA & 255] ^ ffiy.a(iArr11[(iA2 >> 8) & 255], 24)) ^ ffiy.a(iArr11[(i13 >> 16) & 255], 16)) ^ ffiy.a(iArr11[(i14 >> 24) & 255], 8)) ^ iArr12[2];
                int iA12 = (ffiy.a(iArr11[(iA >> 24) & 255], 8) ^ ((ffiy.a(iArr11[(i13 >> 8) & 255], 24) ^ iArr11[iA2 & 255]) ^ ffiy.a(iArr11[(i14 >> 16) & 255], 16))) ^ iArr12[c];
                int i19 = (((bArr9[i18 & 255] & 255) ^ ((bArr9[(iA10 >> 8) & 255] & 255) << 8)) ^ ((bArrC[(iA11 >> 16) & 255] & 255) << 16)) ^ (bArrC[(iA12 >> 24) & 255] << 24);
                int[] iArr13 = iArr10[i15 + 1];
                int i20 = i19 ^ iArr13[0];
                int i21 = ((((bArrC[iA10 & 255] & 255) ^ ((bArr9[(iA11 >> 8) & 255] & 255) << 8)) ^ ((bArr9[(iA12 >> 16) & 255] & 255) << 16)) ^ (bArrC[(i18 >> 24) & 255] << 24)) ^ iArr13[1];
                int i22 = ((((bArrC[iA11 & 255] & 255) ^ ((bArr9[(iA12 >> 8) & 255] & 255) << 8)) ^ ((bArr9[(i18 >> 16) & 255] & 255) << 16)) ^ (bArr9[(iA10 >> 24) & 255] << 24)) ^ iArr13[2];
                int i23 = ((((bArrC[iA12 & 255] & 255) ^ ((bArrC[(i18 >> 8) & 255] & 255) << 8)) ^ ((bArrC[(iA10 >> 16) & 255] & 255) << 16)) ^ (bArr9[(iA11 >> 24) & 255] << 24)) ^ iArr13[c];
                ffwp.f(i20, bArr3, i12);
                ffwp.f(i21, bArr3, i12 + 4);
                ffwp.f(i22, bArr3, i12 + 8);
                ffwp.f(i23, bArr3, i12 + 12);
                i11 += 16;
                bArr4 = bArr2;
                bArr7 = bArr9;
                i3 = 16;
                i4 = 24;
                iArr = iArr10;
            }
        } catch (Throwable th) {
            throw new IllegalStateException("drbg failure: ".concat(String.valueOf(th.getMessage())), th);
        }
    }

    private final void b(byte[] bArr) {
        byte[] bArr2 = new byte[48];
        System.arraycopy(bArr, 0, bArr2, 0, 48);
        byte[] bArr3 = new byte[32];
        this.b = bArr3;
        byte[] bArr4 = new byte[16];
        this.c = bArr4;
        c(bArr2, bArr3, bArr4);
    }

    private static final void c(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[48];
        for (int i = 0; i < 3; i++) {
            int i2 = 15;
            while (true) {
                if (i2 >= 0) {
                    byte b = bArr3[i2];
                    if ((b & 255) != 255) {
                        bArr3[i2] = (byte) (b + 1);
                        break;
                    } else {
                        bArr3[i2] = 0;
                        i2--;
                    }
                }
            }
            a(bArr2, bArr3, bArr4, i * 16);
        }
        if (bArr != null) {
            for (int i3 = 0; i3 < 48; i3++) {
                bArr4[i3] = (byte) (bArr4[i3] ^ bArr[i3]);
            }
        }
        int length = bArr2.length;
        System.arraycopy(bArr4, 0, bArr2, 0, 32);
        int length2 = bArr3.length;
        System.arraycopy(bArr4, 32, bArr3, 0, 16);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int length = bArr.length;
        int i = 0;
        while (length > 0) {
            int i2 = 15;
            while (true) {
                if (i2 < 0) {
                    break;
                }
                byte[] bArr3 = this.c;
                byte b = bArr3[i2];
                if ((b & 255) != 255) {
                    bArr3[i2] = (byte) (b + 1);
                    break;
                } else {
                    bArr3[i2] = 0;
                    i2--;
                }
            }
            a(this.b, this.c, bArr2, 0);
            if (length > 15) {
                System.arraycopy(bArr2, 0, bArr, i, 16);
                i += 16;
                length -= 16;
            } else {
                System.arraycopy(bArr2, 0, bArr, i, length);
                length = 0;
            }
        }
        c(null, this.b, this.c);
    }
}
