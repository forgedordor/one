package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nqd implements nnr {
    private nnu b;
    private int c;
    private int d;
    private int e;
    private nrn g;
    private nns h;
    private nqg i;
    private ntp j;
    private final mfr a = new mfr(6);
    private long f = -1;

    private final int h(nns nnsVar) {
        mfr mfrVar = this.a;
        mfrVar.G(2);
        nnsVar.i(mfrVar.a, 0, 2);
        return mfrVar.n();
    }

    private final void i() {
        nnu nnuVar = this.b;
        mee.f(nnuVar);
        nnuVar.r();
        this.b.w(new nop(-9223372036854775807L));
        this.c = 6;
    }

    @Override // defpackage.nnr
    public final int a(nns nnsVar, non nonVar) throws mby {
        String strW;
        nqf nqfVarA;
        long j;
        int i = this.c;
        long j2 = -1;
        if (i == 0) {
            mfr mfrVar = this.a;
            mfrVar.G(2);
            nnsVar.j(mfrVar.a, 0, 2);
            int iN = mfrVar.n();
            this.d = iN;
            if (iN == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                } else {
                    i();
                }
            } else if ((iN < 65488 || iN > 65497) && iN != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i == 1) {
            mfr mfrVar2 = this.a;
            mfrVar2.G(2);
            nnsVar.j(mfrVar2.a, 0, 2);
            this.e = mfrVar2.n() - 2;
            this.c = 2;
            return 0;
        }
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.i == null || nnsVar != this.h) {
                    this.h = nnsVar;
                    this.i = new nqg(nnsVar, this.f);
                }
                ntp ntpVar = this.j;
                mee.f(ntpVar);
                int iA = ntpVar.a(this.i, nonVar);
                if (iA == 1) {
                    nonVar.a += this.f;
                }
                return iA;
            }
            long j3 = ((nni) nnsVar).b;
            long j4 = this.f;
            if (j3 != j4) {
                nonVar.a = j4;
                return 1;
            }
            if (nnsVar.n(this.a.a, 0, 1, true)) {
                nnsVar.k();
                if (this.j == null) {
                    this.j = new ntp(nvl.a, 8);
                }
                nqg nqgVar = new nqg(nnsVar, this.f);
                this.i = nqgVar;
                if (this.j.f(nqgVar)) {
                    ntp ntpVar2 = this.j;
                    long j5 = this.f;
                    nnu nnuVar = this.b;
                    mee.f(nnuVar);
                    ntpVar2.c(new nqi(j5, nnuVar));
                    nrn nrnVar = this.g;
                    mee.f(nrnVar);
                    nnu nnuVar2 = this.b;
                    mee.f(nnuVar2);
                    nox noxVarP = nnuVar2.p(1024, 4);
                    mat matVar = new mat();
                    matVar.a("image/jpeg");
                    matVar.k = new mbt(nrnVar);
                    noxVarP.i(new mau(matVar));
                    this.c = 5;
                } else {
                    i();
                }
            } else {
                i();
            }
            return 0;
        }
        if (this.d == 65505) {
            mfr mfrVar3 = new mfr(this.e);
            nnsVar.j(mfrVar3.a, 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(mfrVar3.w()) && (strW = mfrVar3.w()) != null) {
                long j6 = ((nni) nnsVar).a;
                nrn nrnVar2 = null;
                if (j6 != -1 && (nqfVarA = nqj.a(strW)) != null) {
                    List list = nqfVarA.b;
                    int i2 = ((ekoe) list).c;
                    if (i2 >= 2) {
                        int i3 = i2 - 1;
                        long j7 = -1;
                        long j8 = -1;
                        long j9 = -1;
                        long j10 = -1;
                        boolean z = false;
                        while (i3 >= 0) {
                            nqe nqeVar = (nqe) list.get(i3);
                            long j11 = j2;
                            boolean zEquals = "video/mp4".equals(nqeVar.a) | z;
                            if (i3 == 0) {
                                j6 -= nqeVar.c;
                                j = 0;
                            } else {
                                j = j6 - nqeVar.b;
                            }
                            long j12 = j;
                            long j13 = j6;
                            j6 = j12;
                            if (zEquals && j6 != j13) {
                                j10 = j13 - j6;
                                j9 = j6;
                                zEquals = false;
                            }
                            if (i3 == 0) {
                                j8 = j13;
                            }
                            if (i3 == 0) {
                                j7 = j6;
                            }
                            i3--;
                            z = zEquals;
                            j2 = j11;
                        }
                        long j14 = j2;
                        if (j9 != j14 && j10 != j14 && j7 != j14 && j8 != j14) {
                            nrnVar2 = new nrn(j7, j8, nqfVarA.a, j9, j10);
                        }
                    }
                }
                this.g = nrnVar2;
                if (nrnVar2 != null) {
                    this.f = nrnVar2.d;
                }
            }
        } else {
            nnsVar.l(this.e);
        }
        this.c = 0;
        return 0;
    }

    @Override // defpackage.nnr
    public final void c(nnu nnuVar) {
        this.b = nnuVar;
    }

    @Override // defpackage.nnr
    public final void e(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            ntp ntpVar = this.j;
            mee.f(ntpVar);
            ntpVar.e(j, j2);
        }
    }

    @Override // defpackage.nnr
    public final boolean f(nns nnsVar) {
        if (h(nnsVar) != 65496) {
            return false;
        }
        int iH = h(nnsVar);
        this.d = iH;
        if (iH == 65504) {
            mfr mfrVar = this.a;
            mfrVar.G(2);
            nnsVar.i(mfrVar.a, 0, 2);
            nnsVar.g(mfrVar.n() - 2);
            iH = h(nnsVar);
            this.d = iH;
        }
        if (iH != 65505) {
            return false;
        }
        nnsVar.g(2);
        mfr mfrVar2 = this.a;
        mfrVar2.G(6);
        nnsVar.i(mfrVar2.a, 0, 6);
        return mfrVar2.r() == 1165519206 && mfrVar2.n() == 0;
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
