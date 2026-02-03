package defpackage;

import java.math.BigInteger;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffll extends fflj {
    final fflt e;
    private final int f;
    private final int g;
    private final int[] h;

    public ffll(int i, int[] iArr, fflt ffltVar) {
        this.g = i;
        this.f = iArr.length == 1 ? 2 : 3;
        this.h = iArr;
        this.e = ffltVar;
    }

    @Override // defpackage.ffln
    public final int b() {
        return this.e.a();
    }

    @Override // defpackage.ffln
    public final int c() {
        return this.g;
    }

    @Override // defpackage.ffln
    public final BigInteger d() {
        fflt ffltVar = this.e;
        int iC = ffltVar.c();
        if (iC == 0) {
            return ffld.a;
        }
        int i = iC - 1;
        long j = ffltVar.b[i];
        byte[] bArr = new byte[8];
        int i2 = 0;
        boolean z = false;
        for (int i3 = 7; i3 >= 0; i3--) {
            byte b = (byte) (j >>> (i3 * 8));
            if (z || b != 0) {
                bArr[i2] = b;
                i2++;
                z = true;
            } else {
                z = false;
            }
        }
        byte[] bArr2 = new byte[(i * 8) + i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4] = bArr[i4];
        }
        for (int i5 = iC - 2; i5 >= 0; i5--) {
            long j2 = ffltVar.b[i5];
            int i6 = 7;
            while (i6 >= 0) {
                bArr2[i2] = (byte) (j2 >>> (i6 * 8));
                i6--;
                i2++;
            }
        }
        return new BigInteger(1, bArr2);
    }

    @Override // defpackage.ffln
    public final ffln e(ffln fflnVar) {
        fflt ffltVar = (fflt) this.e.clone();
        ffltVar.m(((ffll) fflnVar).e);
        return new ffll(this.g, this.h, ffltVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ffll)) {
            return false;
        }
        ffll ffllVar = (ffll) obj;
        return this.g == ffllVar.g && this.f == ffllVar.f && Arrays.equals(this.h, ffllVar.h) && this.e.equals(ffllVar.e);
    }

    @Override // defpackage.ffln
    public final ffln f() {
        fflt ffltVar;
        fflt ffltVar2 = this.e;
        if (ffltVar2.b.length == 0) {
            ffltVar = new fflt(new long[]{1});
        } else {
            long[] jArrL = ffltVar2.l(Math.max(1, ffltVar2.c()));
            jArrL[0] = 1 ^ jArrL[0];
            ffltVar = new fflt(jArrL);
        }
        return new ffll(this.g, this.h, ffltVar);
    }

    @Override // defpackage.ffln
    public final ffln g(ffln fflnVar) {
        return i(fflnVar.h());
    }

    @Override // defpackage.ffln
    public final ffln h() {
        int i;
        fflt ffltVar = this.e;
        int iA = ffltVar.a();
        if (iA == 0) {
            throw new IllegalStateException();
        }
        int[] iArr = this.h;
        int i2 = this.g;
        int i3 = 1;
        if (iA != 1) {
            Object objClone = ffltVar.clone();
            int i4 = (i2 + 63) >>> 6;
            fflt ffltVar2 = new fflt(i4);
            fflt.p(ffltVar2.b, i2, i2, iArr);
            fflt ffltVar3 = new fflt(i4);
            int iB = 0;
            ffltVar3.b[0] = 1;
            fflt ffltVar4 = new fflt(i4);
            int[] iArr2 = new int[2];
            iArr2[0] = iA;
            int i5 = i2 + 1;
            iArr2[1] = i5;
            fflt[] ffltVarArr = {(fflt) objClone, ffltVar2};
            int[] iArr3 = new int[2];
            iArr3[0] = 1;
            iArr3[1] = 0;
            fflt[] ffltVarArr2 = {ffltVar3, ffltVar4};
            int i6 = i5 - iArr2[0];
            while (true) {
                if (i6 < 0) {
                    i6 = -i6;
                    iArr2[i3] = i5;
                    iArr3[i3] = iB;
                    int i7 = 1 - i3;
                    int i8 = iArr2[i7];
                    iB = iArr3[i7];
                    i3 = i7;
                    i5 = i8;
                }
                i = 1 - i3;
                ffltVarArr[i3].h(ffltVarArr[i], iArr2[i], i6);
                int iB2 = ffltVarArr[i3].b(i5);
                if (iB2 == 0) {
                    break;
                }
                int i9 = iArr3[i];
                ffltVarArr2[i3].h(ffltVarArr2[i], i9, i6);
                int i10 = i9 + i6;
                if (i10 > iB) {
                    iB = i10;
                } else if (i10 == iB) {
                    iB = ffltVarArr2[i3].b(iB);
                }
                i6 += iB2 - i5;
                i5 = iB2;
            }
            ffltVar = ffltVarArr2[i];
        }
        return new ffll(i2, iArr, ffltVar);
    }

    public final int hashCode() {
        return (this.e.hashCode() ^ this.g) ^ ffwk.b(this.h);
    }

    @Override // defpackage.ffln
    public final ffln i(ffln fflnVar) {
        int i;
        int i2;
        fflt ffltVarR = ((ffll) fflnVar).e;
        int i3 = this.g;
        int[] iArr = this.h;
        fflt ffltVar = this.e;
        int iA = ffltVar.a();
        if (iA == 0) {
            ffltVarR = ffltVar;
        } else {
            int iA2 = ffltVarR.a();
            if (iA2 != 0) {
                fflt ffltVar2 = iA > iA2 ? ffltVar : ffltVarR;
                if (iA <= iA2) {
                    ffltVarR = ffltVar;
                }
                int i4 = iA > iA2 ? iA : iA2;
                if (iA > iA2) {
                    iA = iA2;
                }
                int i5 = iA + i4 + 62;
                int i6 = (iA + 63) >>> 6;
                int i7 = i5 >>> 6;
                int i8 = (i4 + 63) >>> 6;
                int i9 = 0;
                if (i6 == 1) {
                    long j = ffltVarR.b[0];
                    if (j != 1) {
                        long[] jArr = new long[i7];
                        fflt.o(j, ffltVar2.b, i8, jArr);
                        ffltVarR = fflt.r(jArr, i7, i3, iArr);
                    } else {
                        ffltVarR = ffltVar2;
                    }
                } else {
                    int i10 = (i4 + 70) >>> 6;
                    int i11 = i10 << 4;
                    int[] iArr2 = new int[16];
                    long[] jArr2 = new long[i11];
                    iArr2[1] = i10;
                    System.arraycopy(ffltVar2.b, 0, jArr2, i10, i8);
                    int i12 = 2;
                    int i13 = i10;
                    while (i12 < 16) {
                        int i14 = i13 + i10;
                        iArr2[i12] = i14;
                        if ((i12 & 1) == 0) {
                            int i15 = i10;
                            fflt.s(jArr2, i14 >>> 1, jArr2, i14, i15, 1);
                            i2 = i15;
                        } else {
                            int i16 = i10;
                            i2 = i16;
                            fflt.f(jArr2, i16, jArr2, i14 - i16, jArr2, i14, i2);
                            i14 = i14;
                        }
                        i12++;
                        i13 = i14;
                        i10 = i2;
                    }
                    int i17 = i10;
                    long[] jArr3 = new long[i11];
                    fflt.s(jArr2, 0, jArr3, 0, i11, 4);
                    long[] jArr4 = ffltVarR.b;
                    int i18 = i7 << 3;
                    long[] jArr5 = new long[i18];
                    while (i9 < i6) {
                        long j2 = jArr4[i9];
                        int i19 = i9;
                        while (true) {
                            long[] jArr6 = jArr3;
                            long[] jArr7 = jArr2;
                            fflt.g(jArr5, i19, jArr7, iArr2[((int) j2) & 15], jArr6, iArr2[((int) (j2 >>> 4)) & 15], i17);
                            int i20 = i19;
                            jArr2 = jArr7;
                            jArr3 = jArr6;
                            i = i17;
                            j2 >>>= 8;
                            if (j2 == 0) {
                                break;
                            }
                            i17 = i;
                            i19 = i20 + i7;
                        }
                        i9++;
                        i17 = i;
                    }
                    while (true) {
                        int i21 = i18 - i7;
                        if (i21 == 0) {
                            break;
                        }
                        fflt.d(jArr5, i21 - i7, jArr5, i21, i7, 8);
                        i18 = i21;
                    }
                    ffltVarR = fflt.r(jArr5, i7, i3, iArr);
                }
            }
        }
        return new ffll(i3, iArr, ffltVarR);
    }

    @Override // defpackage.ffln
    public final ffln j(ffln fflnVar, ffln fflnVar2, ffln fflnVar3) {
        return k(fflnVar, fflnVar2, fflnVar3);
    }

    @Override // defpackage.ffln
    public final ffln k(ffln fflnVar, ffln fflnVar2, ffln fflnVar3) {
        fflt ffltVar = ((ffll) fflnVar).e;
        fflt ffltVar2 = ((ffll) fflnVar2).e;
        fflt ffltVar3 = ((ffll) fflnVar3).e;
        fflt ffltVar4 = this.e;
        fflt ffltVarN = ffltVar4.n(ffltVar);
        fflt ffltVarN2 = ffltVar2.n(ffltVar3);
        Object objClone = ffltVarN;
        if (ffltVarN == ffltVar4 || ffltVarN == ffltVar) {
            objClone = ffltVarN.clone();
        }
        fflt ffltVar5 = (fflt) objClone;
        ffltVar5.m(ffltVarN2);
        int i = this.g;
        int[] iArr = this.h;
        ffltVar5.i(i, iArr);
        return new ffll(i, iArr, ffltVar5);
    }

    @Override // defpackage.ffln
    public final ffln m() {
        fflt ffltVar = this.e;
        return (ffltVar.k() || ffltVar.j()) ? this : p(this.g - 1);
    }

    @Override // defpackage.ffln
    public final ffln n() {
        int i = this.g;
        int[] iArr = this.h;
        fflt ffltVar = this.e;
        int iC = ffltVar.c();
        if (iC != 0) {
            int i2 = iC + iC;
            long[] jArr = new long[i2];
            for (int i3 = 0; i3 < i2; i3 += 2) {
                long j = ffltVar.b[i3 >>> 1];
                jArr[i3] = fflt.e((int) j);
                jArr[i3 + 1] = fflt.e((int) (j >>> 32));
            }
            ffltVar = new fflt(jArr, fflt.q(jArr, i2, i, iArr));
        }
        return new ffll(i, iArr, ffltVar);
    }

    @Override // defpackage.ffln
    public final ffln o(ffln fflnVar, ffln fflnVar2) {
        fflt ffltVar;
        fflt ffltVar2 = ((ffll) fflnVar).e;
        fflt ffltVar3 = ((ffll) fflnVar2).e;
        fflt ffltVar4 = this.e;
        int iC = ffltVar4.c();
        if (iC == 0) {
            ffltVar = ffltVar4;
        } else {
            int i = iC + iC;
            long[] jArr = new long[i];
            for (int i2 = 0; i2 < i; i2 += 2) {
                long j = ffltVar4.b[i2 >>> 1];
                jArr[i2] = fflt.e((int) j);
                jArr[i2 + 1] = fflt.e((int) (j >>> 32));
            }
            ffltVar = new fflt(jArr, i);
        }
        fflt ffltVarN = ffltVar2.n(ffltVar3);
        Object objClone = ffltVar;
        if (ffltVar == ffltVar4) {
            objClone = ffltVar.clone();
        }
        fflt ffltVar5 = (fflt) objClone;
        ffltVar5.m(ffltVarN);
        int i3 = this.g;
        int[] iArr = this.h;
        ffltVar5.i(i3, iArr);
        return new ffll(i3, iArr, ffltVar5);
    }

    @Override // defpackage.ffln
    public final ffln p(int i) {
        if (i <= 0) {
            return this;
        }
        int i2 = this.g;
        int[] iArr = this.h;
        fflt ffltVar = this.e;
        int iC = ffltVar.c();
        if (iC != 0) {
            int i3 = (i2 + 63) >>> 6;
            int i4 = i3 + i3;
            long[] jArr = new long[i4];
            System.arraycopy(ffltVar.b, 0, jArr, 0, iC);
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                int i5 = iC + iC;
                while (true) {
                    iC--;
                    if (iC >= 0) {
                        long j = jArr[iC];
                        jArr[i5 - 1] = fflt.e((int) (j >>> 32));
                        i5 -= 2;
                        jArr[i5] = fflt.e((int) j);
                    }
                }
                iC = fflt.q(jArr, i4, i2, iArr);
            }
            ffltVar = new fflt(jArr, iC);
        }
        return new ffll(i2, iArr, ffltVar);
    }

    @Override // defpackage.ffln
    public final ffln q(ffln fflnVar) {
        return e(fflnVar);
    }

    @Override // defpackage.ffln
    public final boolean r() {
        return this.e.j();
    }

    @Override // defpackage.ffln
    public final boolean s() {
        return this.e.k();
    }

    @Override // defpackage.ffln
    public final ffln l() {
        return this;
    }
}
