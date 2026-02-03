package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cte {
    public long[] a = cvp.a;
    public int[] b;
    public int[] c;
    public int d;
    public int e;

    public cte() {
        int[] iArr = ctm.a;
        this.b = iArr;
        this.c = iArr;
    }

    public final int a(int i) {
        int i2 = (-862048943) * i;
        int i3 = this.d;
        int i4 = ((i2 ^ (i2 << 16)) >>> 7) & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = (((-i7) >> 63) & (jArr[i6 + 1] << (64 - i7))) | (jArr[i6] >>> i7);
            long j2 = j ^ ((r0 & 127) * 72340172838076673L);
            for (long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public final int b(int i) {
        int iA = a(i);
        if (iA >= 0) {
            return this.c[iA];
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof defpackage.cte
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            cte r1 = (defpackage.cte) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L17
            return r4
        L17:
            int[] r3 = r0.b
            int[] r5 = r0.c
            long[] r6 = r0.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L75
            r8 = r4
        L23:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L6c
            int r11 = r8 - r7
            r12 = r4
        L36:
            int r13 = ~r11
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            if (r12 >= r13) goto L67
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r9
            r17 = 128(0x80, double:6.32E-322)
            int r13 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r13 >= 0) goto L5f
            int r13 = r8 << 3
            int r13 = r13 + r12
            r15 = r3[r13]
            r13 = r5[r13]
            int r15 = r1.a(r15)
            if (r15 < 0) goto L5e
            r16 = r2
            int[] r2 = r1.c
            r2 = r2[r15]
            if (r13 != r2) goto L5e
            goto L61
        L5e:
            return r4
        L5f:
            r16 = r2
        L61:
            long r9 = r9 >> r14
            int r12 = r12 + 1
            r2 = r16
            goto L36
        L67:
            r16 = r2
            if (r13 != r14) goto L77
            goto L6e
        L6c:
            r16 = r2
        L6e:
            if (r8 == r7) goto L77
            int r8 = r8 + 1
            r2 = r16
            goto L23
        L75:
            r16 = r2
        L77:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cte.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i2 - length;
                int i5 = 0;
                while (true) {
                    i = 8 - ((~i4) >>> 31);
                    if (i5 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i6 = (i2 << 3) + i5;
                        i3 += iArr2[i6] ^ iArr[i6];
                    }
                    j >>= 8;
                    i5++;
                }
                if (i != 8) {
                    return i3;
                }
            }
            if (i2 == length) {
                return i3;
            }
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[PHI: r8
      0x0063: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:8:0x0029, B:18:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.e
            if (r1 == 0) goto L72
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            int[] r2 = r0.b
            int[] r3 = r0.c
            long[] r4 = r0.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L68
            r6 = 0
            r7 = r6
            r8 = r7
        L1b:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L63
            int r11 = r7 - r5
            r12 = r6
        L2e:
            int r13 = ~r11
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            if (r12 >= r13) goto L61
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r9
            r17 = 128(0x80, double:6.32E-322)
            int r13 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r13 >= 0) goto L5d
            int r13 = r7 << 3
            int r13 = r13 + r12
            r15 = r2[r13]
            r13 = r3[r13]
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r13)
            int r8 = r8 + 1
            int r13 = r0.e
            if (r8 >= r13) goto L5d
            java.lang.String r13 = ", "
            r1.append(r13)
        L5d:
            long r9 = r9 >> r14
            int r12 = r12 + 1
            goto L2e
        L61:
            if (r13 != r14) goto L68
        L63:
            if (r7 == r5) goto L68
            int r7 = r7 + 1
            goto L1b
        L68:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L72:
            java.lang.String r1 = "{}"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cte.toString():java.lang.String");
    }
}
