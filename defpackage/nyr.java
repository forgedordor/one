package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nyr implements nyf {
    private final String a;
    private final int b;
    private final String c = "video/mp2t";
    private final mfr d;
    private final mfq e;
    private nox f;
    private String g;
    private mau h;
    private int i;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private long s;
    private int t;
    private long u;
    private int v;
    private String w;

    public nyr(String str, int i) {
        this.a = str;
        this.b = i;
        mfr mfrVar = new mfr(1024);
        this.d = mfrVar;
        this.e = new mfq(mfrVar.a);
        this.m = -9223372036854775807L;
    }

    private final int f(mfq mfqVar) throws mby {
        int iA = mfqVar.a();
        nmr nmrVarB = nms.b(mfqVar, true);
        this.w = nmrVarB.c;
        this.t = nmrVarB.a;
        this.v = nmrVarB.b;
        return iA - mfqVar.a();
    }

    private static long g(mfq mfqVar) {
        return mfqVar.d((mfqVar.d(2) + 1) * 8);
    }

    @Override // defpackage.nyf
    public final void a(mfr mfrVar) throws mby {
        int i;
        int i2;
        int iD;
        boolean zP;
        mee.g(this.f);
        while (mfrVar.a() > 0) {
            int i3 = this.i;
            if (i3 != 0) {
                if (i3 == 1) {
                    int iJ = mfrVar.j();
                    if ((iJ & 224) == 224) {
                        this.l = iJ;
                        this.i = 2;
                    } else if (iJ != 86) {
                        this.i = 0;
                    }
                } else if (i3 != 2) {
                    int iMin = Math.min(mfrVar.a(), this.k - this.j);
                    mfq mfqVar = this.e;
                    mfrVar.F(mfqVar.a, this.j, iMin);
                    int i4 = this.j + iMin;
                    this.j = i4;
                    if (i4 == this.k) {
                        mfqVar.l(0);
                        if (mfqVar.p()) {
                            if (this.n) {
                            }
                            this.i = 0;
                        } else {
                            this.n = true;
                            int iD2 = mfqVar.d(1);
                            if (iD2 == 1) {
                                iD = mfqVar.d(1);
                                i2 = 1;
                            } else {
                                i2 = iD2;
                                iD = 0;
                            }
                            this.o = iD;
                            if (iD != 0) {
                                throw new mby(null, null, true, 1);
                            }
                            if (i2 == 1) {
                                g(mfqVar);
                                i2 = 1;
                            }
                            if (!mfqVar.p()) {
                                throw new mby(null, null, true, 1);
                            }
                            this.p = mfqVar.d(6);
                            int iD3 = mfqVar.d(4);
                            int iD4 = mfqVar.d(3);
                            if (iD3 != 0 || iD4 != 0) {
                                throw new mby(null, null, true, 1);
                            }
                            if (i2 == 0) {
                                int iC = mfqVar.c();
                                int iF = f(mfqVar);
                                mfqVar.l(iC);
                                byte[] bArr = new byte[(iF + 7) / 8];
                                mfqVar.q(bArr, iF);
                                mat matVar = new mat();
                                matVar.a = this.g;
                                matVar.a(this.c);
                                matVar.c("audio/mp4a-latm");
                                matVar.j = this.w;
                                matVar.E = this.v;
                                matVar.F = this.t;
                                matVar.p = Collections.singletonList(bArr);
                                matVar.d = this.a;
                                matVar.f = this.b;
                                mau mauVar = new mau(matVar);
                                if (!mauVar.equals(this.h)) {
                                    this.h = mauVar;
                                    this.u = 1024000000 / mauVar.H;
                                    this.f.i(mauVar);
                                }
                            } else {
                                mfqVar.n(((int) g(mfqVar)) - f(mfqVar));
                            }
                            int iD5 = mfqVar.d(3);
                            this.q = iD5;
                            if (iD5 == 0) {
                                mfqVar.n(8);
                            } else if (iD5 == 1) {
                                mfqVar.n(9);
                            } else if (iD5 == 3 || iD5 == 4 || iD5 == 5) {
                                mfqVar.n(6);
                            } else {
                                if (iD5 != 6 && iD5 != 7) {
                                    throw new IllegalStateException();
                                }
                                mfqVar.n(1);
                            }
                            boolean zP2 = mfqVar.p();
                            this.r = zP2;
                            this.s = 0L;
                            if (zP2) {
                                if (i2 != 1) {
                                    do {
                                        zP = mfqVar.p();
                                        this.s = (this.s << 8) + mfqVar.d(8);
                                    } while (zP);
                                } else {
                                    this.s = g(mfqVar);
                                }
                            }
                            if (mfqVar.p()) {
                                mfqVar.n(8);
                            }
                        }
                        if (this.o != 0) {
                            throw new mby(null, null, true, 1);
                        }
                        if (this.p != 0) {
                            throw new mby(null, null, true, 1);
                        }
                        if (this.q != 0) {
                            throw new mby(null, null, true, 1);
                        }
                        int i5 = 0;
                        while (true) {
                            int iD6 = mfqVar.d(8);
                            i = i5 + iD6;
                            if (iD6 != 255) {
                                break;
                            } else {
                                i5 = i;
                            }
                        }
                        int iC2 = mfqVar.c();
                        if ((iC2 & 7) == 0) {
                            this.d.K(iC2 >> 3);
                        } else {
                            mfr mfrVar2 = this.d;
                            mfqVar.q(mfrVar2.a, i * 8);
                            mfrVar2.K(0);
                        }
                        this.f.m(this.d, i);
                        mee.c(this.m != -9223372036854775807L);
                        this.f.o(this.m, 1, i, 0, null);
                        this.m += this.u;
                        if (this.r) {
                            mfqVar.n((int) this.s);
                        }
                        this.i = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iJ2 = ((this.l & (-225)) << 8) | mfrVar.j();
                    this.k = iJ2;
                    mfr mfrVar3 = this.d;
                    if (iJ2 > mfrVar3.a.length) {
                        mfrVar3.G(iJ2);
                        this.e.j(mfrVar3.a);
                    }
                    this.j = 0;
                    this.i = 3;
                }
            } else if (mfrVar.j() == 86) {
                this.i = 1;
            }
        }
    }

    @Override // defpackage.nyf
    public final void b(nnu nnuVar, nzq nzqVar) {
        nzqVar.c();
        this.f = nnuVar.p(nzqVar.a(), 1);
        this.g = nzqVar.b();
    }

    @Override // defpackage.nyf
    public final void d(long j, int i) {
        this.m = j;
    }

    @Override // defpackage.nyf
    public final void e() {
        this.i = 0;
        this.m = -9223372036854775807L;
        this.n = false;
    }

    @Override // defpackage.nyf
    public final void c(boolean z) {
    }
}
