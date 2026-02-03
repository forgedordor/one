package defpackage;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erwl {
    public static byte[] a(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 32);
        int i = 0;
        bArrCopyOf[0] = (byte) (bArrCopyOf[0] & 248);
        int i2 = bArrCopyOf[31] & 127;
        bArrCopyOf[31] = (byte) i2;
        bArrCopyOf[31] = (byte) (i2 | 64);
        byte[][] bArr3 = erdm.a;
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr2, 32);
        bArrCopyOf2[31] = (byte) (bArrCopyOf2[31] & 127);
        for (int i3 = 0; i3 < 7; i3++) {
            byte[][] bArr4 = erdm.a;
            if (MessageDigest.isEqual(bArr4[i3], bArrCopyOf2)) {
                throw new InvalidKeyException("Banned public key: ".concat(ervq.a(bArr4[i3])));
            }
        }
        long[] jArrL = erdz.l(bArrCopyOf2);
        long[] jArr2 = new long[19];
        long[] jArr3 = new long[19];
        jArr3[0] = 1;
        long[] jArr4 = new long[19];
        jArr4[0] = 1;
        long[] jArr5 = new long[19];
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        jArr7[0] = 1;
        long[] jArr8 = new long[19];
        long[] jArr9 = new long[19];
        jArr9[0] = 1;
        int i4 = 10;
        System.arraycopy(jArrL, 0, jArr2, 0, 10);
        for (int i5 = 32; i < i5; i5 = 32) {
            int i6 = bArrCopyOf[31 - i] & 255;
            int i7 = 0;
            while (i7 < 8) {
                int i8 = (i6 >> (7 - i7)) & 1;
                erdm.b(jArr4, jArr2, i8);
                erdm.b(jArr5, jArr3, i8);
                byte[] bArr5 = bArrCopyOf;
                long[] jArrCopyOf = Arrays.copyOf(jArr4, 10);
                int i9 = i6;
                long[] jArr10 = new long[19];
                int i10 = i;
                long[] jArr11 = new long[19];
                int i11 = i7;
                long[] jArr12 = new long[19];
                long[] jArr13 = jArr;
                long[] jArr14 = new long[19];
                long[] jArr15 = new long[19];
                long[] jArr16 = jArr9;
                long[] jArr17 = new long[19];
                long[] jArr18 = new long[19];
                erdz.j(jArr4, jArr4, jArr5);
                erdz.i(jArr5, jArrCopyOf, jArr5);
                long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
                erdz.j(jArr2, jArr2, jArr3);
                erdz.i(jArr3, jArrCopyOf2, jArr3);
                erdz.c(jArr14, jArr2, jArr5);
                erdz.c(jArr15, jArr4, jArr3);
                erdz.f(jArr14);
                erdz.e(jArr14);
                erdz.f(jArr15);
                erdz.e(jArr15);
                long[] jArr19 = jArr2;
                System.arraycopy(jArr14, 0, jArrCopyOf2, 0, 10);
                erdz.j(jArr14, jArr14, jArr15);
                erdz.i(jArr15, jArrCopyOf2, jArr15);
                erdz.h(jArr18, jArr14);
                erdz.h(jArr17, jArr15);
                erdz.c(jArr15, jArr17, jArrL);
                erdz.f(jArr15);
                erdz.e(jArr15);
                System.arraycopy(jArr18, 0, jArr6, 0, 10);
                System.arraycopy(jArr15, 0, jArr7, 0, 10);
                erdz.h(jArr11, jArr4);
                erdz.h(jArr12, jArr5);
                erdz.c(jArr8, jArr11, jArr12);
                erdz.f(jArr8);
                erdz.e(jArr8);
                erdz.i(jArr12, jArr11, jArr12);
                Arrays.fill(jArr10, 10, 18, 0L);
                erdz.g(jArr10, jArr12, 121665L);
                erdz.e(jArr10);
                erdz.j(jArr10, jArr10, jArr11);
                erdz.c(jArr16, jArr12, jArr10);
                erdz.f(jArr16);
                erdz.e(jArr16);
                erdm.b(jArr8, jArr6, i8);
                erdm.b(jArr16, jArr7, i8);
                i7 = i11 + 1;
                long[] jArr20 = jArr7;
                jArr7 = jArr3;
                jArr3 = jArr20;
                long[] jArr21 = jArr4;
                jArr4 = jArr8;
                jArr8 = jArr21;
                long[] jArr22 = jArr5;
                jArr5 = jArr16;
                jArr9 = jArr22;
                jArr2 = jArr6;
                i6 = i9;
                bArrCopyOf = bArr5;
                i = i10;
                jArr = jArr13;
                jArr6 = jArr19;
            }
            i++;
            i4 = 10;
        }
        int i12 = i4;
        long[] jArr23 = jArr;
        long[] jArr24 = new long[i12];
        erdz.a(jArr24, jArr5);
        erdz.b(jArr23, jArr4, jArr24);
        long[] jArr25 = new long[i12];
        long[] jArr26 = new long[i12];
        long[] jArr27 = new long[11];
        long[] jArr28 = new long[11];
        long[] jArr29 = new long[11];
        erdz.b(jArr25, jArrL, jArr23);
        erdz.j(jArr26, jArrL, jArr23);
        long[] jArr30 = new long[i12];
        jArr30[0] = 486662;
        erdz.j(jArr28, jArr26, jArr30);
        erdz.b(jArr28, jArr28, jArr3);
        erdz.j(jArr28, jArr28, jArr2);
        erdz.b(jArr28, jArr28, jArr25);
        erdz.b(jArr28, jArr28, jArr2);
        erdz.g(jArr27, jArr28, 4L);
        erdz.e(jArr27);
        erdz.b(jArr28, jArr25, jArr3);
        erdz.i(jArr28, jArr28, jArr3);
        erdz.b(jArr29, jArr26, jArr2);
        erdz.j(jArr28, jArr28, jArr29);
        erdz.h(jArr28, jArr28);
        if (MessageDigest.isEqual(erdz.k(jArr27), erdz.k(jArr28))) {
            return erdz.k(jArr23);
        }
        throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(ervq.a(bArr2)));
    }

    public static byte[] b() {
        byte[] bArrB = erfy.b(32);
        bArrB[0] = (byte) (bArrB[0] | 7);
        int i = bArrB[31] & 63;
        bArrB[31] = (byte) i;
        bArrB[31] = (byte) (i | 128);
        return bArrB;
    }

    public static byte[] c(byte[] bArr) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return a(bArr, bArr2);
    }
}
