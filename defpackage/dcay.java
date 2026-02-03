package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcay {
    public static long a(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        long j = -5435081209227447693L;
        boolean z = false;
        if (length <= 32) {
            if (length > 16) {
                long jD = d(bArr2, 0) * (-5435081209227447693L);
                long jD2 = d(bArr2, 8);
                long j2 = (length + length) - 7286425919675154353L;
                long jD3 = d(bArr2, length - 8) * j2;
                return c(Long.rotateRight(jD + jD2, 43) + Long.rotateRight(jD3, 30) + (d(bArr2, length - 16) * (-7286425919675154353L)), jD + Long.rotateRight(jD2 - 7286425919675154353L, 18) + jD3, j2);
            }
            if (length >= 8) {
                long j3 = (length + length) - 7286425919675154353L;
                long jD4 = d(bArr2, 0) - 7286425919675154353L;
                long jD5 = d(bArr2, length - 8);
                return c((Long.rotateRight(jD5, 37) * j3) + jD4, (Long.rotateRight(jD4, 25) + jD5) * j3, j3);
            }
            if (length >= 4) {
                return c(length + ((b(bArr2, 0) & 4294967295L) << 3), b(bArr2, length - 4) & 4294967295L, (length + length) - 7286425919675154353L);
            }
            if (length <= 0) {
                return -7286425919675154353L;
            }
            return e((((bArr2[0] & 255) + ((bArr2[length >> 1] & 255) << 8)) * (-7286425919675154353L)) ^ ((length + ((bArr2[length - 1] & 255) << 2)) * (-4348849565147123417L))) * (-7286425919675154353L);
        }
        char c = '@';
        if (length <= 64) {
            long jD6 = d(bArr2, 0) * (-7286425919675154353L);
            long jD7 = d(bArr2, 8);
            long j4 = (length + length) - 7286425919675154353L;
            long jD8 = d(bArr2, length - 8) * j4;
            long jD9 = d(bArr2, length - 16) * (-7286425919675154353L);
            long jRotateRight = Long.rotateRight(jD6 + jD7, 43) + Long.rotateRight(jD8, 30);
            long jRotateRight2 = Long.rotateRight(jD7 - 7286425919675154353L, 18) + jD6;
            long jD10 = d(bArr2, 16) * j4;
            long jD11 = d(bArr2, 24);
            long j5 = jRotateRight + jD9;
            long jD12 = j5 + d(bArr2, length - 32);
            long j6 = jD12 * j4;
            return c(Long.rotateRight(jD10 + jD11, 43) + Long.rotateRight(j6, 30) + ((c(j5, jRotateRight2 + jD8, j4) + d(bArr2, length - 24)) * j4), jD10 + Long.rotateRight(jD11 + jD6, 18) + j6, j4);
        }
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long jD13 = d(bArr2, 0) + 95310865018149119L;
        long jE = e(-7956866745689871395L) * (-7286425919675154353L);
        long j7 = 2480279821605975764L;
        int i = 0;
        while (true) {
            int i2 = length - 1;
            boolean z2 = z;
            int i3 = (i2 >> 6) * 64;
            char c2 = c;
            long jRotateRight3 = Long.rotateRight(jD13 + j7 + jArr[z2 ? 1 : 0] + d(bArr2, i + 8), 37) * j;
            long jRotateRight4 = Long.rotateRight(j7 + jArr[1] + d(bArr2, i + 48), 42) * j;
            long j8 = jRotateRight3 ^ jArr2[1];
            long j9 = j;
            long jD14 = d(bArr2, i + 40) + jArr[z2 ? 1 : 0];
            long jRotateRight5 = Long.rotateRight(jE + jArr2[z2 ? 1 : 0], 33) * j9;
            int i4 = i;
            f(bArr2, i4, jArr[1] * j9, j8 + jArr2[z2 ? 1 : 0], jArr);
            long[] jArr3 = jArr;
            j7 = jRotateRight4 + jD14;
            f(bArr2, i4 + 32, jRotateRight5 + jArr2[1], d(bArr2, i4 + 16) + j7, jArr2);
            i = i4 + 64;
            if (i == i3) {
                int i5 = i2 & 63;
                int i6 = i3 + i5;
                long j10 = j8 & 255;
                long j11 = j10 + j10 + j9;
                long j12 = jArr2[z2 ? 1 : 0] + i5;
                long j13 = jArr3[z2 ? 1 : 0] + j12;
                jArr3[z2 ? 1 : 0] = j13;
                jArr2[z2 ? 1 : 0] = j12 + j13;
                long jRotateRight6 = Long.rotateRight(jRotateRight5 + j7 + j13 + d(bArr2, i6 - 55), 37) * j11;
                long jRotateRight7 = Long.rotateRight(j7 + jArr3[1] + d(bArr2, i6 - 15), 42) * j11;
                long j14 = jArr2[1] * 9;
                long jD15 = (jArr3[z2 ? 1 : 0] * 9) + d(bArr2, i6 - 23);
                long jRotateRight8 = Long.rotateRight(j8 + jArr2[z2 ? 1 : 0], 33) * j11;
                long j15 = jRotateRight6 ^ j14;
                f(bArr2, i6 - 63, jArr3[1] * j11, j15 + jArr2[z2 ? 1 : 0], jArr3);
                long j16 = jRotateRight7 + jD15;
                f(bArr2, i6 - 31, jArr2[1] + jRotateRight8, d(bArr2, i6 - 47) + j16, jArr2);
                return c(c(jArr3[z2 ? 1 : 0], jArr2[z2 ? 1 : 0], j11) + (e(j16) * (-4348849565147123417L)) + j15, c(jArr3[1], jArr2[1], j11) + jRotateRight8, j11);
            }
            bArr2 = bArr;
            c = c2;
            z = z2 ? 1 : 0;
            jE = j8;
            j = j9;
            jD13 = jRotateRight5;
            jArr = jArr3;
        }
    }

    private static int b(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    private static long c(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    private static long d(byte[] bArr, int i) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, 8);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferWrap.getLong();
    }

    private static long e(long j) {
        return j ^ (j >>> 47);
    }

    private static void f(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long jD = j + d(bArr, i);
        long jD2 = d(bArr, i + 8);
        long jD3 = d(bArr, i + 16);
        long jD4 = d(bArr, i + 24);
        long j3 = jD2 + jD + jD3;
        long jRotateRight = Long.rotateRight(j2 + jD + jD4, 21) + Long.rotateRight(j3, 44);
        jArr[0] = j3 + jD4;
        jArr[1] = jRotateRight + jD;
    }
}
