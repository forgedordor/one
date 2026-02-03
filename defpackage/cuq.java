package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cuq extends cve {
    private int f;

    public cuq() {
        this((byte[]) null);
    }

    private final int j(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    private final int k(Object obj) {
        long j;
        long j2;
        int i;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i2 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = this.d;
        int i6 = i4 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j4 = jArr3[i8] >>> i9;
            long j5 = jArr3[i8 + 1] << (64 - i9);
            int i10 = i3;
            int i11 = 0;
            long j6 = i3 & 127;
            long j7 = (j5 & ((-i9) >> 63)) | j4;
            long j8 = (72340172838076673L * j6) ^ j7;
            long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L);
            while (j9 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j9) >> 3) + i6) & i5;
                int i12 = i2;
                if (fdbq.f(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j9 &= j9 - 1;
                i2 = i12;
            }
            int i13 = i2;
            long j10 = j7 & ((~j7) << 6) & (-9187201950435737472L);
            char c = '\b';
            if (j10 != 0) {
                int iJ = j(i4);
                long j11 = 255;
                if (this.f != 0 || ((this.a[iJ >> 3] >> ((iJ & 7) << 3)) & 255) == 254) {
                    j = j6;
                    j2 = 255;
                    i = 0;
                    j3 = 128;
                } else {
                    int i14 = this.d;
                    if (i14 > 8) {
                        j3 = 128;
                        if (Long.compare((this.e * 32) ^ Long.MIN_VALUE, (i14 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.a;
                            int i15 = this.d;
                            Object[] objArr = this.b;
                            int[] iArr = this.c;
                            int i16 = i15 + 7;
                            int i17 = 0;
                            while (i17 < (i16 >> 3)) {
                                char c2 = c;
                                long j12 = jArr4[i17] & (-9187201950435737472L);
                                jArr4[i17] = (-72340172838076674L) & ((~j12) + (j12 >>> 7));
                                i17++;
                                i16 = i16;
                                i11 = i11;
                                c = c2;
                                j11 = j11;
                            }
                            j2 = j11;
                            int i18 = i11;
                            int iB = fcur.B(jArr4);
                            int i19 = iB - 1;
                            jArr4[i19] = (jArr4[i19] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iB] = jArr4[i18];
                            int i20 = i18;
                            while (i20 != i15) {
                                int i21 = i20 >> 3;
                                int i22 = (i20 & 7) << 3;
                                long j13 = (jArr4[i21] >> i22) & j2;
                                if (j13 != 128 && j13 == 254) {
                                    Object obj2 = objArr[i20];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : i18) * i13;
                                    int i23 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i24 = i23 & 127;
                                    int i25 = i23 >>> 7;
                                    int iJ2 = j(i25);
                                    int i26 = i25 & i15;
                                    int i27 = i18;
                                    long j14 = j6;
                                    long[] jArr5 = jArr4;
                                    long j15 = i24;
                                    if (((iJ2 - i26) & i15) / 8 == ((i20 - i26) & i15) / 8) {
                                        jArr5[i21] = (j15 << i22) | ((~(j2 << i22)) & jArr5[i21]);
                                        jArr5[fcur.B(jArr5)] = (jArr5[i27] & 72057594037927935L) | Long.MIN_VALUE;
                                        i20++;
                                    } else {
                                        int i28 = iJ2 >> 3;
                                        long j16 = jArr5[i28];
                                        int i29 = (iJ2 & 7) << 3;
                                        long j17 = j15 << i29;
                                        long j18 = (~(j2 << i29)) & j16;
                                        if (((j16 >> i29) & j2) == 128) {
                                            long j19 = ~(j2 << i22);
                                            jArr5[i28] = j18 | j17;
                                            jArr5[i21] = (jArr5[i21] & j19) | (128 << i22);
                                            objArr[iJ2] = objArr[i20];
                                            objArr[i20] = null;
                                            iArr[iJ2] = iArr[i20];
                                            iArr[i20] = i27;
                                        } else {
                                            jArr5[i28] = j18 | j17;
                                            Object obj3 = objArr[iJ2];
                                            objArr[iJ2] = objArr[i20];
                                            objArr[i20] = obj3;
                                            int i30 = iArr[iJ2];
                                            iArr[iJ2] = iArr[i20];
                                            iArr[i20] = i30;
                                            i20--;
                                        }
                                        jArr5[fcur.B(jArr5)] = (jArr5[i27] & 72057594037927935L) | Long.MIN_VALUE;
                                        i20++;
                                    }
                                    jArr4 = jArr5;
                                    i18 = i27;
                                    j6 = j14;
                                } else {
                                    i20++;
                                }
                            }
                            j = j6;
                            i = i18;
                            l();
                        }
                        iJ = j(i4);
                    } else {
                        j3 = 128;
                    }
                    j = j6;
                    j2 = 255;
                    i = 0;
                    int iB2 = cvp.b(this.d);
                    long[] jArr6 = this.a;
                    Object[] objArr2 = this.b;
                    int[] iArr2 = this.c;
                    int i31 = this.d;
                    m(iB2);
                    long[] jArr7 = this.a;
                    Object[] objArr3 = this.b;
                    int[] iArr3 = this.c;
                    int i32 = this.d;
                    int i33 = 0;
                    while (i33 < i31) {
                        if (((jArr6[i33 >> 3] >> ((i33 & 7) << 3)) & 255) < j3) {
                            Object obj4 = objArr2[i33];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i13;
                            int iJ3 = j((iHashCode3 ^ (iHashCode3 << 16)) >>> 7);
                            int i34 = iJ3 >> 3;
                            int i35 = (iJ3 & 7) << 3;
                            jArr = jArr7;
                            jArr2 = jArr6;
                            long j20 = (jArr7[i34] & (~(255 << i35))) | ((r12 & 127) << i35);
                            jArr[i34] = j20;
                            jArr[(((iJ3 - 7) & i32) + (i32 & 7)) >> 3] = j20;
                            objArr3[iJ3] = obj4;
                            iArr3[iJ3] = iArr2[i33];
                        } else {
                            jArr = jArr7;
                            jArr2 = jArr6;
                        }
                        i33++;
                        jArr6 = jArr2;
                        jArr7 = jArr;
                    }
                    iJ = j(i4);
                }
                this.e++;
                int i36 = this.f;
                long[] jArr8 = this.a;
                int i37 = iJ >> 3;
                long j21 = jArr8[i37];
                int i38 = (iJ & 7) << 3;
                this.f = i36 - (((j21 >> i38) & j2) != j3 ? i : 1);
                int i39 = this.d;
                long j22 = (j21 & (~(j2 << i38))) | (j << i38);
                jArr8[i37] = j22;
                jArr8[(((iJ - 7) & i39) + (i39 & 7)) >> 3] = j22;
                return ~iJ;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i3 = i10;
            i2 = i13;
        }
    }

    private final void l() {
        this.f = cvp.a(this.d) - this.e;
    }

    private final void m(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, cvp.c(i)) : 0;
        this.d = iMax;
        if (iMax == 0) {
            jArr = cvp.a;
        } else {
            jArr = new long[(iMax + 15) >> 3];
            fcur.t(jArr, -9187201950435737472L, jArr.length);
        }
        this.a = jArr;
        long[] jArr2 = this.a;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr2[i2] = (jArr2[i2] & (~j)) | j;
        l();
        this.b = new Object[iMax];
        this.c = new int[iMax];
    }

    public final void a() {
        this.e = 0;
        if (this.a != cvp.a) {
            long[] jArr = this.a;
            fcur.t(jArr, -9187201950435737472L, jArr.length);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        fcur.d(this.b, null, 0, this.d);
        l();
    }

    public final void b(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = this.d;
        int i4 = (i & 7) << 3;
        long j = (jArr[i2] & (~(255 << i4))) | (254 << i4);
        jArr[i2] = j;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    public final void c(Object obj, int i) {
        int iK = k(obj);
        if (iK < 0) {
            iK = ~iK;
        }
        this.b[iK] = obj;
        this.c[iK] = i;
    }

    public final int d(Object obj, int i) {
        int i2;
        int iK = k(obj);
        if (iK < 0) {
            iK = ~iK;
            i2 = -1;
        } else {
            i2 = this.c[iK];
        }
        this.b[iK] = obj;
        this.c[iK] = i;
        return i2;
    }

    public cuq(int i) {
        if (i < 0) {
            cwh.a("Capacity must be a positive value.");
        }
        m(cvp.d(i));
    }

    public /* synthetic */ cuq(byte[] bArr) {
        this(6);
    }
}
