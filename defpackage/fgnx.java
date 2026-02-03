package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
class fgnx extends fgov {
    private final fgnt a;
    private final int c;
    private final int d;

    public fgnx(fgnt fgntVar) {
        super(fgmu.h, 2629746000L);
        this.a = fgntVar;
        this.c = 12;
        this.d = 2;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final int a(long j) {
        fgnt fgntVar = this.a;
        return fgntVar.T(j, fgntVar.Y(j));
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final int c() {
        return this.c;
    }

    @Override // defpackage.fgms
    public final int d() {
        return 1;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long e(long j, int i) {
        int i2;
        int i3;
        int i4;
        if (i == 0) {
            return j;
        }
        fgnt fgntVar = this.a;
        long jS = fgntVar.S(j);
        int iY = fgntVar.Y(j);
        int iT = fgntVar.T(j, iY);
        int i5 = iT - 1;
        int i6 = i5 + i;
        if (i6 < 0) {
            int i7 = this.c;
            int i8 = i + i7;
            if (Math.signum(i8) == Math.signum(i)) {
                i2 = iY - 1;
            } else {
                i8 = i - i7;
                i2 = iY + 1;
            }
            i6 = i5 + i8;
        } else {
            i2 = iY;
        }
        if (i6 >= 0) {
            int i9 = this.c;
            i3 = i2 + (i6 / i9);
            i4 = (i6 % i9) + 1;
        } else {
            int i10 = this.c;
            i3 = i2 + (i6 / i10);
            int i11 = i3 - 1;
            int iAbs = Math.abs(i6) % i10;
            if (iAbs == 0) {
                iAbs = i10;
            }
            i4 = (i10 - iAbs) + 1;
            if (i4 != 1) {
                i3 = i11;
            }
        }
        int iN = fgntVar.N(j, iY, iT);
        int iR = fgntVar.R(i3, i4);
        if (iN > iR) {
            iN = iR;
        }
        return fgntVar.ad(i3, i4, iN) + jS;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long g(long j) {
        fgnt fgntVar = this.a;
        int iY = fgntVar.Y(j);
        return fgntVar.ac(iY) + fgntVar.ab(iY, fgntVar.T(j, iY));
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long h(long j, int i) {
        fgot.c(this, i, 1, this.c);
        fgnt fgntVar = this.a;
        int iY = fgntVar.Y(j);
        int iN = fgntVar.N(j, iY, fgntVar.T(j, iY));
        int iR = fgntVar.R(iY, i);
        if (iN > iR) {
            iN = iR;
        }
        return fgntVar.ad(iY, i, iN) + fgntVar.S(j);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final fgna r() {
        return this.a.c;
    }

    @Override // defpackage.fgms
    public final fgna s() {
        return this.a.g;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final boolean t(long j) {
        fgnt fgntVar = this.a;
        int iY = fgntVar.Y(j);
        return fgntVar.ag(iY) && fgntVar.T(j, iY) == this.d;
    }

    @Override // defpackage.fgov
    public final long x(long j, long j2) {
        long j3;
        long j4;
        long j5;
        int i = (int) j2;
        if (i == j2) {
            return e(j, i);
        }
        fgnt fgntVar = this.a;
        long jS = fgntVar.S(j);
        int iY = fgntVar.Y(j);
        long j6 = iY;
        int iT = fgntVar.T(j, iY);
        long j7 = (iT - 1) + j2;
        if (j7 >= 0) {
            j3 = jS;
            long j8 = this.c;
            j4 = j6 + (j7 / j8);
            j5 = (j7 % j8) + 1;
        } else {
            j3 = jS;
            int i2 = this.c;
            long j9 = i2;
            long j10 = j6 + (j7 / j9);
            int iAbs = (int) (Math.abs(j7) % j9);
            if (iAbs == 0) {
                iAbs = i2;
            }
            j4 = j10 - 1;
            j5 = (i2 - iAbs) + 1;
            if (j5 == 1) {
                j4 = j10;
            }
        }
        if (j4 < -292275054 || j4 > 292278993) {
            throw new IllegalArgumentException(a.u(j2, "Magnitude of add amount is too large: "));
        }
        int i3 = (int) j5;
        int iN = fgntVar.N(j, iY, iT);
        int i4 = (int) j4;
        int iR = fgntVar.R(i4, i3);
        if (iN > iR) {
            iN = iR;
        }
        return fgntVar.ad(i4, i3, iN) + j3;
    }

    @Override // defpackage.fgms
    public final void v() {
    }
}
