package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elcp extends elcn {
    public static final elcu a = new elcp();

    private static long h(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    private static long i(long j) {
        return j ^ (j >>> 47);
    }

    private static void j(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long jB = j + elde.b(bArr, i);
        long jB2 = elde.b(bArr, i + 8);
        long jB3 = elde.b(bArr, i + 16);
        long jB4 = elde.b(bArr, i + 24);
        long j3 = jB2 + jB + jB3;
        long jRotateRight = Long.rotateRight(j2 + jB + jB4, 21) + Long.rotateRight(j3, 44);
        jArr[0] = j3 + jB4;
        jArr[1] = jRotateRight + jB;
    }

    @Override // defpackage.elcj
    public final elct e(byte[] bArr, int i) {
        int i2;
        boolean z;
        int i3;
        long j;
        long j2;
        long jRotateRight;
        long[] jArr;
        long j3;
        byte[] bArr2 = bArr;
        boolean z2 = false;
        ejwl.k(0, i, bArr2.length);
        long j4 = -4348849565147123417L;
        long jH = -7286425919675154353L;
        if (i <= 32) {
            if (i > 16) {
                long jB = elde.b(bArr2, 0) * (-5435081209227447693L);
                long jB2 = elde.b(bArr2, 8);
                long j5 = i;
                long j6 = (j5 + j5) - 7286425919675154353L;
                long jB3 = elde.b(bArr2, i - 8) * j6;
                jH = h(Long.rotateRight(jB + jB2, 43) + Long.rotateRight(jB3, 30) + (elde.b(bArr2, i - 16) * (-7286425919675154353L)), jB + Long.rotateRight(jB2 - 7286425919675154353L, 18) + jB3, j6);
            } else if (i >= 8) {
                long j7 = i;
                long j8 = (j7 + j7) - 7286425919675154353L;
                long jB4 = elde.b(bArr2, 0) - 7286425919675154353L;
                long jB5 = elde.b(bArr2, i - 8);
                jH = h((Long.rotateRight(jB5, 37) * j8) + jB4, (Long.rotateRight(jB4, 25) + jB5) * j8, j8);
            } else if (i >= 4) {
                jH = h(i + ((elde.a(bArr2, 0) & 4294967295L) << 3), elde.a(bArr2, i - 4) & 4294967295L, (i + i) - 7286425919675154353L);
            } else if (i > 0) {
                jH = (-7286425919675154353L) * i((((bArr2[0] & 255) + ((bArr2[i >> 1] & 255) << 8)) * (-7286425919675154353L)) ^ ((((bArr2[i - 1] & 255) << 2) + i) * (-4348849565147123417L)));
            }
        } else if (i <= 64) {
            long jB6 = elde.b(bArr2, 0) * (-7286425919675154353L);
            long jB7 = elde.b(bArr2, 8);
            long j9 = i;
            long j10 = (j9 + j9) - 7286425919675154353L;
            long jB8 = elde.b(bArr2, i - 8) * j10;
            long jB9 = elde.b(bArr2, i - 16) * (-7286425919675154353L);
            long jRotateRight2 = Long.rotateRight(jB6 + jB7, 43) + Long.rotateRight(jB8, 30);
            long jRotateRight3 = Long.rotateRight(jB7 - 7286425919675154353L, 18) + jB6;
            long jB10 = elde.b(bArr2, 16) * j10;
            long jB11 = elde.b(bArr2, 24);
            long j11 = jRotateRight2 + jB9;
            long jB12 = j11 + elde.b(bArr2, i - 32);
            long j12 = jB12 * j10;
            jH = h(Long.rotateRight(jB10 + jB11, 43) + Long.rotateRight(j12, 30) + ((h(j11, jRotateRight3 + jB8, j10) + elde.b(bArr2, i - 24)) * j10), jB10 + Long.rotateRight(jB11 + jB6, 18) + j12, j10);
        } else {
            long[] jArr2 = new long[2];
            long[] jArr3 = new long[2];
            long jB13 = elde.b(bArr2, 0) + 95310865018149119L;
            long jI = i(-7956866745689871395L) * (-7286425919675154353L);
            long j13 = 2480279821605975764L;
            int i4 = 0;
            while (true) {
                i2 = i - 1;
                z = z2;
                i3 = (i2 >> 6) * 64;
                j = j4;
                long jRotateRight4 = Long.rotateRight(jB13 + j13 + jArr2[z ? 1 : 0] + elde.b(bArr2, i4 + 8), 37) * (-5435081209227447693L);
                long jRotateRight5 = Long.rotateRight(j13 + jArr2[1] + elde.b(bArr2, i4 + 48), 42) * (-5435081209227447693L);
                j2 = jRotateRight4 ^ jArr3[1];
                long jB14 = jArr2[z ? 1 : 0] + elde.b(bArr2, i4 + 40);
                jRotateRight = Long.rotateRight(jI + jArr3[z ? 1 : 0], 33) * (-5435081209227447693L);
                j(bArr2, i4, jArr2[1] * (-5435081209227447693L), j2 + jArr3[z ? 1 : 0], jArr2);
                int i5 = i4;
                jArr = jArr2;
                j3 = jRotateRight5 + jB14;
                j(bArr2, i5 + 32, jRotateRight + jArr3[1], elde.b(bArr2, i5 + 16) + j3, jArr3);
                i4 = i5 + 64;
                if (i4 == i3) {
                    break;
                }
                bArr2 = bArr;
                z2 = z ? 1 : 0;
                jI = j2;
                jB13 = jRotateRight;
                jArr2 = jArr;
                j13 = j3;
                j4 = j;
            }
            int i6 = i2 & 63;
            int i7 = i3 + i6;
            long j14 = j2 & 255;
            long j15 = (j14 + j14) - 5435081209227447693L;
            long j16 = jArr3[z ? 1 : 0] + i6;
            long j17 = jArr[z ? 1 : 0] + j16;
            jArr[z ? 1 : 0] = j17;
            jArr3[z ? 1 : 0] = j16 + j17;
            long jRotateRight6 = Long.rotateRight(jRotateRight + j3 + j17 + elde.b(bArr2, i7 - 55), 37) * j15;
            long jRotateRight7 = Long.rotateRight(j3 + jArr[1] + elde.b(bArr2, i7 - 15), 42) * j15;
            long j18 = jArr3[1] * 9;
            long jB15 = (jArr[z ? 1 : 0] * 9) + elde.b(bArr2, i7 - 23);
            long jRotateRight8 = Long.rotateRight(j2 + jArr3[z ? 1 : 0], 33) * j15;
            long j19 = jRotateRight6 ^ j18;
            j(bArr2, i7 - 63, jArr[1] * j15, j19 + jArr3[z ? 1 : 0], jArr);
            long j20 = jRotateRight7 + jB15;
            j(bArr2, i7 - 31, jArr3[1] + jRotateRight8, elde.b(bArr2, i7 - 47) + j20, jArr3);
            jH = h(h(jArr[z ? 1 : 0], jArr3[z ? 1 : 0], j15) + (i(j20) * j) + j19, h(jArr[1], jArr3[1], j15) + jRotateRight8, j15);
        }
        long j21 = jH;
        int i8 = elct.b;
        return new elcs(j21);
    }

    @Override // defpackage.elcu
    public final int g() {
        throw null;
    }

    public final String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}
