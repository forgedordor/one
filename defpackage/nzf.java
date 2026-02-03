package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nzf implements nzr {
    private final nze a;
    private final mfr b = new mfr(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public nzf(nze nzeVar) {
        this.a = nzeVar;
    }

    @Override // defpackage.nzr
    public final void a(mfr mfrVar, int i) {
        int i2 = i & 1;
        int iJ = i2 != 0 ? mfrVar.b + mfrVar.j() : -1;
        if (this.f) {
            if (i2 == 0) {
                return;
            }
            this.f = false;
            mfrVar.K(iJ);
            this.d = 0;
        }
        while (mfrVar.a() > 0) {
            int i3 = this.d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int iJ2 = mfrVar.j();
                    mfrVar.K(mfrVar.b - 1);
                    if (iJ2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(mfrVar.a(), 3 - this.d);
                mfr mfrVar2 = this.b;
                mfrVar.F(mfrVar2.a, this.d, iMin);
                int i4 = this.d + iMin;
                this.d = i4;
                if (i4 == 3) {
                    mfrVar2.K(0);
                    mfrVar2.J(3);
                    mfrVar2.L(1);
                    int iJ3 = mfrVar2.j();
                    int iJ4 = mfrVar2.j();
                    this.e = (iJ3 & 128) != 0;
                    this.c = (((iJ3 & 15) << 8) | iJ4) + 3;
                    int iB = mfrVar2.b();
                    int i5 = this.c;
                    if (iB < i5) {
                        int iB2 = mfrVar2.b();
                        mfrVar2.D(Math.min(4098, Math.max(i5, iB2 + iB2)));
                    }
                }
            } else {
                int iMin2 = Math.min(mfrVar.a(), this.c - this.d);
                mfr mfrVar3 = this.b;
                mfrVar.F(mfrVar3.a, this.d, iMin2);
                int i6 = this.d + iMin2;
                this.d = i6;
                int i7 = this.c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.e) {
                        mfrVar3.J(i7);
                    } else {
                        if (mgb.f(mfrVar3.a, 0, i7, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        mfrVar3.J(this.c - 4);
                    }
                    mfrVar3.K(0);
                    this.a.a(mfrVar3);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.nzr
    public final void b(mfy mfyVar, nnu nnuVar, nzq nzqVar) {
        this.a.b(mfyVar, nnuVar, nzqVar);
        this.f = true;
    }

    @Override // defpackage.nzr
    public final void c() {
        this.f = true;
    }
}
