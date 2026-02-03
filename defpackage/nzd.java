package defpackage;

import android.util.SparseArray;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nzd implements nnr {
    private boolean e;
    private boolean f;
    private boolean g;
    private long h;
    private nza i;
    private nnu j;
    private boolean k;
    private final mfy a = new mfy(0);
    private final mfr c = new mfr(4096);
    private final SparseArray b = new SparseArray();
    private final nzb d = new nzb();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    @Override // defpackage.nnr
    public final int a(nns nnsVar, non nonVar) {
        ?? r11;
        ?? r10;
        long jB;
        long j;
        char c;
        nyf nyhVar;
        long jA;
        long jA2;
        mee.g(this.j);
        nni nniVar = (nni) nnsVar;
        long j2 = nniVar.a;
        if (j2 != -1) {
            nzb nzbVar = this.d;
            if (!nzbVar.c) {
                if (!nzbVar.e) {
                    int iMin = (int) Math.min(20000L, j2);
                    long j3 = j2 - iMin;
                    if (nniVar.b != j3) {
                        nonVar.a = j3;
                        return 1;
                    }
                    mfr mfrVar = nzbVar.b;
                    mfrVar.G(iMin);
                    nnsVar.k();
                    nnsVar.i(mfrVar.a, 0, iMin);
                    int i = mfrVar.b;
                    int i2 = mfrVar.c - 4;
                    while (true) {
                        if (i2 < i) {
                            jA2 = -9223372036854775807L;
                            break;
                        }
                        if (nzb.c(mfrVar.a, i2) == 442) {
                            mfrVar.K(i2 + 4);
                            jA2 = nzb.a(mfrVar);
                            if (jA2 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i2--;
                    }
                    nzbVar.g = jA2;
                    nzbVar.e = true;
                    return 0;
                }
                if (nzbVar.g == -9223372036854775807L) {
                    nzbVar.b(nnsVar);
                    return 0;
                }
                if (nzbVar.d) {
                    long j4 = nzbVar.f;
                    if (j4 == -9223372036854775807L) {
                        nzbVar.b(nnsVar);
                        return 0;
                    }
                    mfy mfyVar = nzbVar.a;
                    nzbVar.h = mfyVar.c(nzbVar.g) - mfyVar.b(j4);
                    nzbVar.b(nnsVar);
                    return 0;
                }
                int iMin2 = (int) Math.min(20000L, j2);
                if (nniVar.b != 0) {
                    nonVar.a = 0L;
                    return 1;
                }
                mfr mfrVar2 = nzbVar.b;
                mfrVar2.G(iMin2);
                nnsVar.k();
                nnsVar.i(mfrVar2.a, 0, iMin2);
                int i3 = mfrVar2.b;
                int i4 = mfrVar2.c;
                while (true) {
                    if (i3 >= i4 - 3) {
                        jA = -9223372036854775807L;
                        break;
                    }
                    if (nzb.c(mfrVar2.a, i3) == 442) {
                        mfrVar2.K(i3 + 4);
                        jA = nzb.a(mfrVar2);
                        if (jA != -9223372036854775807L) {
                            break;
                        }
                    }
                    i3++;
                }
                nzbVar.f = jA;
                nzbVar.d = true;
                return 0;
            }
        }
        if (this.k) {
            r11 = 1;
            r10 = 0;
        } else {
            this.k = true;
            nzb nzbVar2 = this.d;
            boolean z = false;
            long j5 = nzbVar2.h;
            if (j5 != -9223372036854775807L) {
                r11 = 1;
                nza nzaVar = new nza(nzbVar2.a, j5, j2);
                this.i = nzaVar;
                this.j.w(nzaVar.a);
                r10 = z;
            } else {
                r11 = 1;
                this.j.w(new nop(-9223372036854775807L));
                r10 = z;
            }
        }
        nza nzaVar2 = this.i;
        if (nzaVar2 != null && nzaVar2.c()) {
            return nzaVar2.a(nnsVar, nonVar);
        }
        nnsVar.k();
        long jE = j2 != -1 ? j2 - nnsVar.e() : -1L;
        if (jE != -1 && jE < 4) {
            return -1;
        }
        mfr mfrVar3 = this.c;
        if (!nnsVar.n(mfrVar3.a, r10, 4, r11)) {
            return -1;
        }
        mfrVar3.K(r10);
        int iE = mfrVar3.e();
        if (iE == 441) {
            return -1;
        }
        if (iE == 442) {
            nnsVar.i(mfrVar3.a, r10, 10);
            mfrVar3.K(9);
            nnsVar.l((mfrVar3.j() & 7) + 14);
            return r10;
        }
        if (iE == 443) {
            nnsVar.i(mfrVar3.a, r10, 2);
            mfrVar3.K(r10);
            nnsVar.l(mfrVar3.n() + 6);
            return r10;
        }
        if ((iE >> 8) != r11) {
            nnsVar.l(r11);
            return r10;
        }
        int i5 = iE & 255;
        SparseArray sparseArray = this.b;
        nzc nzcVar = (nzc) sparseArray.get(i5);
        if (!this.e) {
            if (nzcVar == null) {
                if (i5 == 189) {
                    nyhVar = new nxx("video/mp2p");
                    this.f = r11;
                    this.h = nniVar.b;
                } else if ((iE & 224) == 192) {
                    nyhVar = new nys(null, r10, "video/mp2p");
                    this.f = r11;
                    this.h = nniVar.b;
                } else if ((iE & 240) == 224) {
                    nyhVar = new nyh(null, "video/mp2p");
                    this.g = r11;
                    this.h = nniVar.b;
                } else {
                    nyhVar = null;
                }
                if (nyhVar != null) {
                    nyhVar.b(this.j, new nzq(i5, 256));
                    nzcVar = new nzc(nyhVar, this.a);
                    sparseArray.put(i5, nzcVar);
                }
            }
            long j6 = 1048576;
            if (this.f && this.g) {
                j6 = this.h + 8192;
            }
            if (nniVar.b > j6) {
                this.e = r11;
                this.j.r();
            }
        }
        nnsVar.i(mfrVar3.a, r10, 2);
        mfrVar3.K(r10);
        int iN = mfrVar3.n() + 6;
        if (nzcVar == null) {
            nnsVar.l(iN);
        } else {
            mfrVar3.G(iN);
            nnsVar.j(mfrVar3.a, r10, iN);
            mfrVar3.K(6);
            mfq mfqVar = nzcVar.c;
            mfrVar3.F(mfqVar.a, r10, 3);
            mfqVar.l(r10);
            mfqVar.n(8);
            nzcVar.d = mfqVar.p();
            nzcVar.e = mfqVar.p();
            mfqVar.n(6);
            mfrVar3.F(mfqVar.a, r10, mfqVar.d(8));
            mfqVar.l(r10);
            if (nzcVar.d) {
                mfqVar.n(4);
                long jD = mfqVar.d(3);
                mfqVar.n(r11);
                int iD = mfqVar.d(15) << 15;
                mfqVar.n(r11);
                long jD2 = mfqVar.d(15);
                mfqVar.n(r11);
                if (nzcVar.f || !nzcVar.e) {
                    j = jD;
                    c = 30;
                } else {
                    mfqVar.n(4);
                    c = 30;
                    mfqVar.n(r11);
                    int iD2 = mfqVar.d(15) << 15;
                    mfqVar.n(r11);
                    j = jD;
                    long jD3 = mfqVar.d(15);
                    mfqVar.n(r11);
                    nzcVar.b.b(iD2 | (mfqVar.d(3) << 30) | jD3);
                    nzcVar.f = r11;
                }
                jB = nzcVar.b.b((j << c) | iD | jD2);
            } else {
                jB = 0;
            }
            nyf nyfVar = nzcVar.a;
            nyfVar.d(jB, 4);
            nyfVar.a(mfrVar3);
            nyfVar.c(r10);
            mfrVar3.J(mfrVar3.b());
        }
        return r10;
    }

    @Override // defpackage.nnr
    public final void c(nnu nnuVar) {
        this.j = nnuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    @Override // defpackage.nnr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r5, long r7) {
        /*
            r4 = this;
            mfy r5 = r4.a
            long r0 = r5.f()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L21
            long r0 = r5.d()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L24
        L21:
            r5.i(r7)
        L24:
            nza r5 = r4.i
            r6 = 0
            if (r5 == 0) goto L2c
            r5.b(r7)
        L2c:
            r5 = r6
        L2d:
            android.util.SparseArray r7 = r4.b
            int r8 = r7.size()
            if (r5 >= r8) goto L45
            java.lang.Object r7 = r7.valueAt(r5)
            nzc r7 = (defpackage.nzc) r7
            r7.f = r6
            nyf r7 = r7.a
            r7.e()
            int r5 = r5 + 1
            goto L2d
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nzd.e(long, long):void");
    }

    @Override // defpackage.nnr
    public final boolean f(nns nnsVar) {
        byte[] bArr = new byte[14];
        nnsVar.i(bArr, 0, 14);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        nnsVar.g(bArr[13] & 7);
        nnsVar.i(bArr, 0, 3);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    @Override // defpackage.nnr
    public final /* synthetic */ List x() {
        int i = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.nnr
    public final void d() {
    }

    @Override // defpackage.nnr
    public final /* synthetic */ void g() {
    }
}
