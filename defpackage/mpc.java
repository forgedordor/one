package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mpc implements mth, mtk {
    public final int b;
    public int c;
    public ngc d;
    public long e;
    public long f;
    public boolean g;
    public mtj i;
    private mtl k;
    private int l;
    private mwx m;
    private mej n;
    private mau[] o;
    private boolean q;
    private nen r;
    public final Object a = new Object();
    private final msa j = new msa();
    private long p = Long.MIN_VALUE;
    public mcl h = mcl.a;

    public mpc(int i) {
        this.b = i;
    }

    private final void W(long j, boolean z) {
        this.g = false;
        this.f = j;
        this.p = j;
        w(j, z);
    }

    @Override // defpackage.mth
    public final void C() {
        mee.c(this.c == 0);
        x();
    }

    @Override // defpackage.mth
    public final void D(mau[] mauVarArr, ngc ngcVar, long j, long j2, nen nenVar) {
        mee.c(!this.g);
        this.d = ngcVar;
        this.r = nenVar;
        if (this.p == Long.MIN_VALUE) {
            this.p = j;
        }
        this.o = mauVarArr;
        this.e = j2;
        B(mauVarArr, j, j2, nenVar);
    }

    @Override // defpackage.mth
    public final void E() {
        mee.c(this.c == 0);
        this.j.a();
        y();
    }

    @Override // defpackage.mth
    public final void F(long j) {
        W(j, false);
    }

    @Override // defpackage.mth
    public final void G() {
        this.g = true;
    }

    @Override // defpackage.mtk
    public final void H(mtj mtjVar) {
        synchronized (this.a) {
            this.i = mtjVar;
        }
    }

    @Override // defpackage.mth
    public final void J(mcl mclVar) {
        if (Objects.equals(this.h, mclVar)) {
            return;
        }
        this.h = mclVar;
    }

    @Override // defpackage.mth
    public final void K() {
        mee.c(this.c == 1);
        this.c = 2;
        z();
    }

    @Override // defpackage.mth
    public final void L() {
        mee.c(this.c == 2);
        this.c = 1;
        A();
    }

    @Override // defpackage.mth
    public final boolean M() {
        return this.p == Long.MIN_VALUE;
    }

    @Override // defpackage.mth
    public final boolean N() {
        return this.g;
    }

    protected final mau[] O() {
        mau[] mauVarArr = this.o;
        mee.f(mauVarArr);
        return mauVarArr;
    }

    @Override // defpackage.mth
    public final void P(mtl mtlVar, mau[] mauVarArr, ngc ngcVar, boolean z, boolean z2, long j, long j2, nen nenVar) {
        mee.c(this.c == 0);
        this.k = mtlVar;
        this.r = nenVar;
        this.c = 1;
        v(z, z2);
        D(mauVarArr, ngcVar, j, j2, nenVar);
        W(j, z);
    }

    protected final void Q() {
        mee.f(this.k);
    }

    protected final int c(msa msaVar, mix mixVar, int i) {
        ngc ngcVar = this.d;
        mee.f(ngcVar);
        int iA = ngcVar.a(msaVar, mixVar, i);
        if (iA == -4) {
            if (mixVar.eS()) {
                this.p = Long.MIN_VALUE;
                return this.g ? -4 : -3;
            }
            long j = mixVar.f + this.e;
            mixVar.f = j;
            this.p = Math.max(this.p, j);
            return iA;
        }
        if (iA == -5) {
            mau mauVar = msaVar.b;
            mee.f(mauVar);
            long j2 = mauVar.t;
            if (j2 != Long.MAX_VALUE) {
                mat matVar = new mat(mauVar);
                matVar.r = j2 + this.e;
                msaVar.b = new mau(matVar);
                return -5;
            }
        }
        return iA;
    }

    @Override // defpackage.mtk
    public int e() {
        return 0;
    }

    @Override // defpackage.mth
    public final int eL() {
        return this.c;
    }

    @Override // defpackage.mth, defpackage.mtk
    public final int eM() {
        return this.b;
    }

    protected final int eN(long j) {
        ngc ngcVar = this.d;
        mee.f(ngcVar);
        return ngcVar.b(j - this.e);
    }

    protected final mej eO() {
        mej mejVar = this.n;
        mee.f(mejVar);
        return mejVar;
    }

    @Override // defpackage.mth
    public final long f() {
        return this.p;
    }

    public final mpn h(Throwable th, mau mauVar, int i) {
        return i(th, mauVar, false, i);
    }

    protected final mpn i(Throwable th, mau mauVar, boolean z, int i) {
        int iE;
        if (mauVar == null || this.q) {
            iE = 4;
        } else {
            this.q = true;
            try {
                iE = mti.e(V(mauVar));
            } catch (mpn unused) {
            } finally {
                this.q = false;
            }
        }
        return new mpn(1, th, i, R(), this.l, mauVar, mauVar == null ? 4 : iE, this.r, z);
    }

    protected final msa j() {
        msa msaVar = this.j;
        msaVar.a();
        return msaVar;
    }

    @Override // defpackage.mth
    public mse k() {
        return null;
    }

    protected final mwx m() {
        mwx mwxVar = this.m;
        mee.f(mwxVar);
        return mwxVar;
    }

    @Override // defpackage.mth
    public final ngc n() {
        return this.d;
    }

    @Override // defpackage.mtk
    public final void o() {
        synchronized (this.a) {
            this.i = null;
        }
    }

    @Override // defpackage.mth
    public final void p() {
        mee.c(this.c == 1);
        this.j.a();
        this.c = 0;
        this.d = null;
        this.o = null;
        this.g = false;
        u();
        this.r = null;
    }

    @Override // defpackage.mth
    public final void s(int i, mwx mwxVar, mej mejVar) {
        this.l = i;
        this.m = mwxVar;
        this.n = mejVar;
    }

    @Override // defpackage.mth
    public final void t() {
        ngc ngcVar = this.d;
        mee.f(ngcVar);
        ngcVar.c();
    }

    protected void A() {
    }

    @Override // defpackage.mth
    public final mtk l() {
        return this;
    }

    @Override // defpackage.mth
    public /* synthetic */ void q() {
    }

    protected void u() {
    }

    protected void x() {
    }

    protected void y() {
    }

    protected void z() {
    }

    @Override // defpackage.mth
    public /* synthetic */ void I(float f, float f2) {
    }

    @Override // defpackage.mtd
    public void r(int i, Object obj) {
    }

    protected void v(boolean z, boolean z2) {
    }

    protected void w(long j, boolean z) {
    }

    protected void B(mau[] mauVarArr, long j, long j2, nen nenVar) {
    }
}
