package defpackage;

import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erds {
    private static final erdn c = new erdn(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final erdp a = new erdp(new erdq(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final byte[] b = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public static int a(long[] jArr) {
        return erdz.k(jArr)[0] & 1;
    }

    public static long b(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    public static long c(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | b(bArr, i);
    }

    public static void d(erdp erdpVar, erdr erdrVar, erdn erdnVar) {
        erdq erdqVar = erdrVar.a;
        erdq erdqVar2 = erdpVar.a;
        long[] jArr = new long[10];
        long[] jArr2 = erdqVar2.a;
        long[] jArr3 = erdqVar.b;
        long[] jArr4 = erdqVar.a;
        erdz.j(jArr2, jArr3, jArr4);
        long[] jArr5 = erdqVar2.b;
        erdz.i(jArr5, jArr3, jArr4);
        erdz.b(jArr5, jArr5, erdnVar.b);
        long[] jArr6 = erdnVar.a;
        long[] jArr7 = erdqVar2.c;
        erdz.b(jArr7, jArr2, jArr6);
        long[] jArr8 = erdpVar.b;
        erdz.b(jArr8, erdrVar.b, erdnVar.c);
        erdnVar.b(jArr2, erdqVar.c);
        erdz.j(jArr, jArr2, jArr2);
        erdz.i(jArr2, jArr7, jArr5);
        erdz.j(jArr5, jArr7, jArr5);
        erdz.j(jArr7, jArr, jArr8);
        erdz.i(jArr8, jArr, jArr8);
    }

    public static void e(erdp erdpVar, erdq erdqVar) {
        erdq erdqVar2 = erdpVar.a;
        long[] jArr = erdqVar2.a;
        long[] jArr2 = erdqVar.a;
        long[] jArr3 = new long[10];
        erdz.h(jArr, jArr2);
        long[] jArr4 = erdqVar2.c;
        long[] jArr5 = erdqVar.b;
        erdz.h(jArr4, jArr5);
        long[] jArr6 = erdpVar.b;
        erdz.h(jArr6, erdqVar.c);
        erdz.j(jArr6, jArr6, jArr6);
        long[] jArr7 = erdqVar2.b;
        erdz.j(jArr7, jArr2, jArr5);
        erdz.h(jArr3, jArr7);
        erdz.j(jArr7, jArr4, jArr);
        erdz.i(jArr4, jArr4, jArr);
        erdz.i(jArr, jArr3, jArr7);
        erdz.i(jArr6, jArr6, jArr4);
    }

    public static void f(long[] jArr, long[] jArr2) {
        for (int i = 0; i < jArr2.length; i++) {
            jArr[i] = -jArr2[i];
        }
    }

    public static void g(erdp erdpVar, erdr erdrVar, erdn erdnVar) {
        erdq erdqVar = erdrVar.a;
        erdq erdqVar2 = erdpVar.a;
        long[] jArr = new long[10];
        long[] jArr2 = erdqVar2.a;
        long[] jArr3 = erdqVar.b;
        long[] jArr4 = erdqVar.a;
        erdz.j(jArr2, jArr3, jArr4);
        long[] jArr5 = erdqVar2.b;
        erdz.i(jArr5, jArr3, jArr4);
        erdz.b(jArr5, jArr5, erdnVar.a);
        long[] jArr6 = erdnVar.b;
        long[] jArr7 = erdqVar2.c;
        erdz.b(jArr7, jArr2, jArr6);
        long[] jArr8 = erdpVar.b;
        erdz.b(jArr8, erdrVar.b, erdnVar.c);
        erdnVar.b(jArr2, erdqVar.c);
        erdz.j(jArr, jArr2, jArr2);
        erdz.i(jArr2, jArr7, jArr5);
        erdz.j(jArr5, jArr7, jArr5);
        erdz.i(jArr7, jArr, jArr8);
        erdz.j(jArr8, jArr, jArr8);
    }

    public static boolean h(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        erdz.e(jArr2);
        byte[] bArrK = erdz.k(jArr2);
        for (int i = 0; i < 32; i++) {
            if (bArrK[i] != 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[] i(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) ervg.d.a("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        int i = bArrDigest[31] & 127;
        bArrDigest[31] = (byte) i;
        bArrDigest[31] = (byte) (i | 64);
        return bArrDigest;
    }

    public static byte[] j(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = i2 + i2;
            bArr2[i3] = (byte) (bArr[i2] & 15);
            bArr2[i3 + 1] = (byte) ((bArr[i2] & 255) >> 4);
            i2++;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < 63) {
            byte b2 = (byte) (bArr2[i4] + i5);
            bArr2[i4] = b2;
            int i6 = (b2 + 8) >> 4;
            bArr2[i4] = (byte) (b2 - (i6 << 4));
            i4++;
            i5 = i6;
        }
        bArr2[63] = (byte) (bArr2[63] + i5);
        erdp erdpVar = new erdp(a);
        erdr erdrVar = new erdr();
        for (i = 1; i < 64; i += 2) {
            erdn erdnVar = new erdn(c);
            m(erdnVar, i / 2, bArr2[i]);
            erdr.a(erdrVar, erdpVar);
            d(erdpVar, erdrVar, erdnVar);
        }
        erdq erdqVar = new erdq();
        erdq.b(erdqVar, erdpVar);
        e(erdpVar, erdqVar);
        erdq.b(erdqVar, erdpVar);
        e(erdpVar, erdqVar);
        erdq.b(erdqVar, erdpVar);
        e(erdpVar, erdqVar);
        erdq.b(erdqVar, erdpVar);
        e(erdpVar, erdqVar);
        for (int i7 = 0; i7 < 64; i7 += 2) {
            erdn erdnVar2 = new erdn(c);
            m(erdnVar2, i7 / 2, bArr2[i7]);
            erdr.a(erdrVar, erdpVar);
            d(erdpVar, erdrVar, erdnVar2);
        }
        erdq erdqVar2 = new erdq(erdpVar);
        long[] jArr = new long[10];
        erdz.h(jArr, erdqVar2.a);
        long[] jArr2 = new long[10];
        erdz.h(jArr2, erdqVar2.b);
        long[] jArr3 = new long[10];
        erdz.h(jArr3, erdqVar2.c);
        long[] jArr4 = new long[10];
        erdz.h(jArr4, jArr3);
        long[] jArr5 = new long[10];
        erdz.i(jArr5, jArr2, jArr);
        erdz.b(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        erdz.b(jArr6, jArr, jArr2);
        erdz.b(jArr6, jArr6, erdu.a);
        erdz.j(jArr6, jArr6, jArr4);
        erdz.d(jArr6, jArr6);
        if (MessageDigest.isEqual(erdz.k(jArr5), erdz.k(jArr6))) {
            return erdqVar2.a();
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static byte[] k(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[256];
        for (int i2 = 0; i2 < 256; i2++) {
            bArr2[i2] = (byte) (1 & ((bArr[i2 >> 3] & 255) >> (i2 & 7)));
        }
        for (int i3 = 0; i3 < 256; i3++) {
            if (bArr2[i3] != 0) {
                for (int i4 = 1; i4 <= 6 && (i = i3 + i4) < 256; i4++) {
                    byte b2 = bArr2[i];
                    if (b2 != 0) {
                        byte b3 = bArr2[i3];
                        int i5 = b2 << i4;
                        int i6 = b3 + i5;
                        if (i6 <= 15) {
                            bArr2[i3] = (byte) i6;
                            bArr2[i] = 0;
                        } else {
                            int i7 = b3 - i5;
                            if (i7 >= -15) {
                                bArr2[i3] = (byte) i7;
                                while (true) {
                                    if (i >= 256) {
                                        break;
                                    }
                                    if (bArr2[i] == 0) {
                                        bArr2[i] = 1;
                                        break;
                                    }
                                    bArr2[i] = 0;
                                    i++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    private static int l(int i, int i2) {
        int i3 = (~(i ^ i2)) & 255;
        int i4 = i3 & (i3 << 4);
        int i5 = i4 & (i4 << 2);
        return (i5 & (i5 + i5)) >> 7;
    }

    private static void m(erdn erdnVar, int i, byte b2) {
        erdn[][] erdnVarArr = erdu.d;
        int i2 = (b2 & 255) >> 7;
        int i3 = (-i2) & b2;
        int i4 = b2 - (i3 + i3);
        erdnVar.a(erdnVarArr[i][0], l(i4, 1));
        erdnVar.a(erdnVarArr[i][1], l(i4, 2));
        erdnVar.a(erdnVarArr[i][2], l(i4, 3));
        erdnVar.a(erdnVarArr[i][3], l(i4, 4));
        erdnVar.a(erdnVarArr[i][4], l(i4, 5));
        erdnVar.a(erdnVarArr[i][5], l(i4, 6));
        erdnVar.a(erdnVarArr[i][6], l(i4, 7));
        erdnVar.a(erdnVarArr[i][7], l(i4, 8));
        long[] jArr = erdnVar.c;
        long[] jArr2 = erdnVar.a;
        long[] jArrCopyOf = Arrays.copyOf(erdnVar.b, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(jArr, 10);
        f(jArrCopyOf3, jArrCopyOf3);
        erdnVar.a(new erdn(jArrCopyOf, jArrCopyOf2, jArrCopyOf3), i2);
    }
}
