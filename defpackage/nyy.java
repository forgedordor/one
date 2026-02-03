package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nyy implements nzr {
    public int b;
    private final nyf c;
    private int e;
    private mfy f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private boolean k;
    private final mfq d = new mfq(new byte[10]);
    public int a = 0;

    public nyy(nyf nyfVar) {
        this.c = nyfVar;
    }

    private final void d(int i) {
        this.a = i;
        this.e = 0;
    }

    private final boolean e(mfr mfrVar, byte[] bArr, int i) {
        int iMin = Math.min(mfrVar.a(), i - this.e);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            mfrVar.L(iMin);
        } else {
            mfrVar.F(bArr, this.e, iMin);
        }
        int i2 = this.e + iMin;
        this.e = i2;
        return i2 == i;
    }

    @Override // defpackage.nzr
    public final void a(mfr mfrVar, int i) {
        int i2;
        int i3;
        int i4;
        long jB;
        long j;
        mee.g(this.f);
        int i5 = -1;
        int i6 = 2;
        if ((i & 1) != 0) {
            int i7 = this.a;
            if (i7 != 0 && i7 != 1) {
                if (i7 != 2) {
                    int i8 = this.b;
                    if (i8 != -1) {
                        mff.f("PesReader", a.e(i8, "Unexpected start indicator: expected ", " more bytes"));
                    }
                    this.c.c(mfrVar.c == 0);
                } else {
                    mff.f("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            d(1);
        }
        int i9 = i;
        while (mfrVar.a() > 0) {
            int i10 = this.a;
            if (i10 == 0) {
                i2 = i6;
                i3 = i5;
                mfrVar.L(mfrVar.a());
            } else if (i10 != 1) {
                if (i10 != i6) {
                    int iA = mfrVar.a();
                    int i11 = this.b;
                    int i12 = i11 == i5 ? 0 : iA - i11;
                    if (i12 > 0) {
                        iA -= i12;
                        mfrVar.J(mfrVar.b + iA);
                    }
                    nyf nyfVar = this.c;
                    nyfVar.a(mfrVar);
                    int i13 = this.b;
                    if (i13 != i5) {
                        int i14 = i13 - iA;
                        this.b = i14;
                        if (i14 == 0) {
                            nyfVar.c(false);
                            d(1);
                        }
                    }
                } else {
                    int iMin = Math.min(10, this.j);
                    mfq mfqVar = this.d;
                    if (e(mfrVar, mfqVar.a, iMin) && e(mfrVar, null, this.j)) {
                        mfqVar.l(0);
                        if (this.g) {
                            mfqVar.n(4);
                            long jD = mfqVar.d(3);
                            mfqVar.n(1);
                            int iD = mfqVar.d(15) << 15;
                            mfqVar.n(1);
                            long jD2 = mfqVar.d(15);
                            mfqVar.n(1);
                            if (this.i || !this.h) {
                                j = jD;
                            } else {
                                mfqVar.n(4);
                                j = jD;
                                mfqVar.n(1);
                                int iD2 = mfqVar.d(15) << 15;
                                mfqVar.n(1);
                                long jD3 = mfqVar.d(15);
                                mfqVar.n(1);
                                this.f.b(jD3 | (mfqVar.d(3) << 30) | iD2);
                                this.i = true;
                            }
                            jB = this.f.b(jD2 | (j << 30) | iD);
                        } else {
                            jB = -9223372036854775807L;
                        }
                        i9 |= true != this.k ? 0 : 4;
                        this.c.d(jB, i9);
                        d(3);
                        i5 = -1;
                        i6 = 2;
                    }
                }
                i2 = i6;
                i3 = i5;
            } else {
                mfq mfqVar2 = this.d;
                if (e(mfrVar, mfqVar2.a, 9)) {
                    mfqVar2.l(0);
                    int iD3 = mfqVar2.d(24);
                    if (iD3 != 1) {
                        mff.f("PesReader", a.g(iD3, "Unexpected start code prefix: "));
                        this.b = -1;
                        i3 = -1;
                        i4 = 0;
                        i2 = 2;
                    } else {
                        mfqVar2.n(8);
                        int iD4 = mfqVar2.d(16);
                        mfqVar2.n(5);
                        this.k = mfqVar2.p();
                        i2 = 2;
                        mfqVar2.n(2);
                        this.g = mfqVar2.p();
                        this.h = mfqVar2.p();
                        mfqVar2.n(6);
                        int iD5 = mfqVar2.d(8);
                        this.j = iD5;
                        i3 = -1;
                        if (iD4 == 0) {
                            this.b = -1;
                        } else {
                            int i15 = (iD4 - 3) - iD5;
                            this.b = i15;
                            if (i15 < 0) {
                                mff.f("PesReader", a.g(i15, "Found negative packet payload size: "));
                                this.b = -1;
                            }
                        }
                        i4 = 2;
                    }
                    d(i4);
                } else {
                    i3 = -1;
                    i2 = 2;
                }
            }
            i5 = i3;
            i6 = i2;
        }
    }

    @Override // defpackage.nzr
    public final void b(mfy mfyVar, nnu nnuVar, nzq nzqVar) {
        this.f = mfyVar;
        this.c.b(nnuVar, nzqVar);
    }

    @Override // defpackage.nzr
    public final void c() {
        this.a = 0;
        this.e = 0;
        this.i = false;
        this.c.e();
    }
}
