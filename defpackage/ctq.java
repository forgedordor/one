package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ctq {
    public long[] a = cvp.a;
    public long[] b = cty.a;
    public int[] c = ctm.a;
    public int d;
    public int e;

    public final int a(long j) {
        int iA = ctp.a(j) * (-862048943);
        int i = this.d;
        int i2 = ((iA ^ (iA << 16)) >>> 7) & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.a;
            int i4 = i2 >> 3;
            int i5 = (i2 & 7) << 3;
            long j2 = (((-i5) >> 63) & (jArr[i4 + 1] << (64 - i5))) | (jArr[i4] >>> i5);
            long j3 = j2 ^ ((r0 & 127) * 72340172838076673L);
            for (long j4 = (~j3) & ((-72340172838076673L) + j3) & (-9187201950435737472L); j4 != 0; j4 &= (-1) + j4) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i2) & i;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i3 += 8;
            i2 = (i2 + i3) & i;
        }
    }

    public final int b(long j) {
        int iA = a(j);
        if (iA < 0) {
            cwh.d(a.u(j, "Cannot find value for key "));
        }
        return this.c[iA];
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
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
            boolean r3 = r1 instanceof defpackage.ctq
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            ctq r1 = (defpackage.ctq) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L17
            return r4
        L17:
            long[] r3 = r0.b
            int[] r5 = r0.c
            long[] r6 = r0.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7b
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
            if (r11 == 0) goto L70
            int r11 = r8 - r7
            r12 = r4
        L36:
            int r13 = ~r11
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            if (r12 >= r13) goto L6a
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r9
            r17 = 128(0x80, double:6.32E-322)
            int r13 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r13 >= 0) goto L60
            int r13 = r8 << 3
            int r13 = r13 + r12
            r15 = r2
            r16 = r3
            r2 = r16[r13]
            r13 = r5[r13]
            int r2 = r1.a(r2)
            if (r2 < 0) goto L5f
            int[] r3 = r1.c
            r2 = r3[r2]
            if (r13 != r2) goto L5f
            goto L63
        L5f:
            return r4
        L60:
            r15 = r2
            r16 = r3
        L63:
            long r9 = r9 >> r14
            int r12 = r12 + 1
            r2 = r15
            r3 = r16
            goto L36
        L6a:
            r15 = r2
            r16 = r3
            if (r13 != r14) goto L7c
            goto L73
        L70:
            r15 = r2
            r16 = r3
        L73:
            if (r8 == r7) goto L7c
            int r8 = r8 + 1
            r2 = r15
            r3 = r16
            goto L23
        L7b:
            r15 = r2
        L7c:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctq.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        long[] jArr = this.b;
        int[] iArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int iA = 0;
        while (true) {
            long j = jArr2[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i5 = (i2 << 3) + i4;
                        iA += iArr[i5] ^ ctp.a(jArr[i5]);
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return iA;
                }
            }
            if (i2 == length) {
                return iA;
            }
            i2++;
        }
    }

    public final String toString() {
        int i;
        int i2;
        int i3;
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.b;
        int[] iArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                long j = jArr2[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = i4 - length;
                    int i7 = 0;
                    while (true) {
                        i2 = 8 - ((~i6) >>> 31);
                        if (i7 >= i2) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i8 = (i4 << 3) + i7;
                            i3 = i4;
                            long j2 = jArr[i8];
                            int i9 = iArr[i8];
                            sb.append(j2);
                            sb.append("=");
                            sb.append(i9);
                            i5++;
                            if (i5 < this.e) {
                                sb.append(", ");
                            }
                        } else {
                            i3 = i4;
                        }
                        j >>= 8;
                        i7++;
                        i4 = i3;
                    }
                    int i10 = i4;
                    if (i2 != 8) {
                        break;
                    }
                    i = i10;
                } else {
                    i = i4;
                }
                if (i == length) {
                    break;
                }
                i4 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
