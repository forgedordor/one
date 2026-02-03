package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mpk implements mse {
    public final mpj b;
    public mth c;
    public mse d;
    public boolean f;
    public final mtr a = new mtr();
    public boolean e = true;

    public mpk(mpj mpjVar) {
        this.b = mpjVar;
    }

    @Override // defpackage.mse
    public final long a() {
        if (this.e) {
            return this.a.a();
        }
        mse mseVar = this.d;
        mee.f(mseVar);
        return mseVar.a();
    }

    @Override // defpackage.mse
    public final mca b() {
        mse mseVar = this.d;
        return mseVar != null ? mseVar.b() : this.a.a;
    }

    public final void c(mth mthVar) {
        mse mseVar;
        mse mseVarK = mthVar.k();
        if (mseVarK == null || mseVarK == (mseVar = this.d)) {
            return;
        }
        if (mseVar != null) {
            throw new mpn(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.d = mseVarK;
        this.c = mthVar;
        mseVarK.d(this.a.a);
    }

    @Override // defpackage.mse
    public final void d(mca mcaVar) {
        mse mseVar = this.d;
        if (mseVar != null) {
            mseVar.d(mcaVar);
            mcaVar = this.d.b();
        }
        this.a.d(mcaVar);
    }

    public final void e() {
        this.f = true;
        this.a.e();
    }

    public final void f() {
        this.f = false;
        this.a.f();
    }

    @Override // defpackage.mse
    public final boolean g() {
        if (this.e) {
            return false;
        }
        mse mseVar = this.d;
        mee.f(mseVar);
        return mseVar.g();
    }
}
