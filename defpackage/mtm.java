package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mtm {
    public final mth a;
    public final int b;
    public final mth c;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;

    public mtm(mth mthVar, mth mthVar2, int i) {
        this.a = mthVar;
        this.b = i;
        this.c = mthVar2;
    }

    public static boolean p(mth mthVar) {
        return mthVar.eL() != 0;
    }

    public static mau[] r(nif nifVar) {
        int iH = nifVar != null ? nifVar.h() : 0;
        mau[] mauVarArr = new mau[iH];
        for (int i = 0; i < iH; i++) {
            mee.f(nifVar);
            mauVarArr[i] = nifVar.a(i);
        }
        return mauVarArr;
    }

    public static final void s(mth mthVar) {
        if (mthVar.eL() == 2) {
            mthVar.L();
        }
    }

    public static final void t(mth mthVar, long j) {
        mthVar.G();
        if (mthVar instanceof ngz) {
            ngz ngzVar = (ngz) mthVar;
            mee.c(ngzVar.g);
            ngzVar.j = j;
        }
    }

    public final int a() {
        mth mthVar = this.c;
        boolean zP = p(this.a);
        int i = 0;
        if (mthVar != null && p(mthVar)) {
            i = 1;
        }
        return (zP ? 1 : 0) + i;
    }

    public final int b() {
        return this.a.eM();
    }

    public final int c(mth mthVar, msf msfVar, nin ninVar, mpk mpkVar) {
        if (mthVar != null && p(mthVar)) {
            mth mthVar2 = this.a;
            boolean z = mthVar != mthVar2;
            if ((mthVar != mthVar2 || !m()) && (mthVar != this.c || !q())) {
                ngc ngcVarN = mthVar.n();
                ngc[] ngcVarArr = msfVar.c;
                int i = this.b;
                ngc ngcVar = ngcVarArr[i];
                boolean zB = ninVar.b(i);
                if (zB && ngcVarN == ngcVar) {
                    return 1;
                }
                if (!mthVar.N()) {
                    mau[] mauVarArrR = r(ninVar.c[i]);
                    ngc ngcVar2 = ngcVarArr[i];
                    mee.f(ngcVar2);
                    mthVar.D(mauVarArrR, ngcVar2, msfVar.d(), msfVar.l, msfVar.g.a);
                    return 3;
                }
                if (!mthVar.T()) {
                    return 0;
                }
                e(mthVar, mpkVar);
                if (!zB || l()) {
                    g(!z);
                }
                return 1;
            }
        }
        return 1;
    }

    public final mth d(msf msfVar) {
        if (msfVar != null) {
            int i = this.b;
            ngc[] ngcVarArr = msfVar.c;
            if (ngcVarArr[i] != null) {
                mth mthVar = this.a;
                ngc ngcVarN = mthVar.n();
                ngc ngcVar = ngcVarArr[i];
                if (ngcVarN == ngcVar) {
                    return mthVar;
                }
                mth mthVar2 = this.c;
                if (mthVar2 != null && mthVar2.n() == ngcVar) {
                    return mthVar2;
                }
            }
        }
        return null;
    }

    public final void e(mth mthVar, mpk mpkVar) {
        mee.c(this.a == mthVar || this.c == mthVar);
        if (p(mthVar)) {
            if (mthVar == mpkVar.c) {
                mpkVar.d = null;
                mpkVar.c = null;
                mpkVar.e = true;
            }
            s(mthVar);
            mthVar.p();
        }
    }

    public final void f(mth mthVar, ngc ngcVar, mpk mpkVar, long j, boolean z) {
        if (p(mthVar)) {
            if (ngcVar != mthVar.n()) {
                e(mthVar, mpkVar);
            } else if (z) {
                mthVar.F(j);
            }
        }
    }

    public final void g(boolean z) {
        if (z) {
            if (this.e) {
                this.a.E();
                this.e = false;
                return;
            }
            return;
        }
        if (this.f) {
            mth mthVar = this.c;
            mee.f(mthVar);
            mthVar.E();
            this.f = false;
        }
    }

    public final void h() {
        if (!p(this.a)) {
            g(true);
        }
        mth mthVar = this.c;
        if (mthVar == null || p(mthVar)) {
            return;
        }
        g(false);
    }

    public final void i() {
        mth mthVar = this.a;
        if (mthVar.eL() == 1 && this.d != 4) {
            mthVar.K();
            return;
        }
        mth mthVar2 = this.c;
        if (mthVar2 == null || mthVar2.eL() != 1 || this.d == 3) {
            return;
        }
        mthVar2.K();
    }

    public final void j(boolean z) {
        if (z) {
            mth mthVar = this.c;
            mee.f(mthVar);
            mthVar.r(17, this.a);
        } else {
            mth mthVar2 = this.a;
            mth mthVar3 = this.c;
            mee.f(mthVar3);
            mthVar2.r(17, mthVar3);
        }
    }

    public final boolean k(msf msfVar, mth mthVar) {
        if (mthVar == null) {
            return true;
        }
        ngc[] ngcVarArr = msfVar.c;
        int i = this.b;
        ngc ngcVar = ngcVarArr[i];
        if (mthVar.n() != null) {
            if (mthVar.n() == ngcVar) {
                if (ngcVar != null && !mthVar.M()) {
                    boolean z = msfVar.g.g;
                }
            }
            msf msfVar2 = msfVar.i;
            return msfVar2 != null && msfVar2.c[i] == mthVar.n();
        }
        return true;
    }

    public final boolean l() {
        return m() || q();
    }

    public final boolean m() {
        int i = this.d;
        return i == 2 || i == 4;
    }

    public final boolean n(msf msfVar) {
        return d(msfVar) != null;
    }

    public final boolean o() {
        int i = this.d;
        if (i == 0 || i == 2 || i == 4) {
            return p(this.a);
        }
        mth mthVar = this.c;
        mee.f(mthVar);
        return p(mthVar);
    }

    public final boolean q() {
        return this.d == 3;
    }
}
