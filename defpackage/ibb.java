package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibb extends hza {
    public fdap l;
    public fdap m;
    public final long n;
    private final hza o;
    private final boolean p;
    private final boolean q;

    /* JADX WARN: Illegal instructions before constructor call */
    public ibb(hza hzaVar, fdap fdapVar, fdap fdapVar2, boolean z, boolean z2) {
        fdap fdapVarM;
        fdap fdapVarK;
        fdap fdapVar3 = hzt.a;
        super(0L, hzn.a, hzt.p(fdapVar, (hzaVar == null || (fdapVarK = hzaVar.k()) == null) ? hzt.i.a : fdapVarK, z), hzt.q(fdapVar2, (hzaVar == null || (fdapVarM = hzaVar.m()) == null) ? hzt.i.b : fdapVarM));
        this.o = hzaVar;
        this.p = z;
        this.q = z2;
        this.l = this.a;
        this.m = this.b;
        this.n = hxr.a();
    }

    private final hza F() {
        hza hzaVar = this.o;
        return hzaVar == null ? hzt.i : hzaVar;
    }

    @Override // defpackage.hzg
    public final void A(hzn hznVar) {
        iag.a();
        throw new fcta();
    }

    @Override // defpackage.hzg
    public final void B(long j) {
        iag.a();
        throw new fcta();
    }

    @Override // defpackage.hza
    public final hza a(fdap fdapVar, fdap fdapVar2) {
        fdap fdapVarP = hzt.p(fdapVar, this.l, true);
        fdap fdapVarQ = hzt.q(fdapVar2, this.m);
        return !this.p ? new ibb(F().a(null, fdapVarQ), fdapVarP, fdapVarQ, false, true) : F().a(fdapVarP, fdapVarQ);
    }

    @Override // defpackage.hza, defpackage.hzg
    public final hzg b(fdap fdapVar) {
        fdap fdapVarP = hzt.p(fdapVar, this.l, true);
        return !this.p ? hzt.a(F().b(null), fdapVarP, true) : F().b(fdapVarP);
    }

    @Override // defpackage.hza
    public final hzj c() {
        return F().c();
    }

    @Override // defpackage.hza, defpackage.hzg
    public final void d() {
        hza hzaVar;
        D();
        if (!this.q || (hzaVar = this.o) == null) {
            return;
        }
        hzaVar.d();
    }

    @Override // defpackage.hza, defpackage.hzg
    public final void e() {
        F().e();
    }

    @Override // defpackage.hza, defpackage.hzg
    public final /* bridge */ /* synthetic */ void f() {
        iag.a();
        throw new fcta();
    }

    @Override // defpackage.hza, defpackage.hzg
    public final /* bridge */ /* synthetic */ void g() {
        iag.a();
        throw new fcta();
    }

    @Override // defpackage.hza, defpackage.hzg
    public final int h() {
        return F().h();
    }

    @Override // defpackage.hza
    public final cva i() {
        return F().i();
    }

    @Override // defpackage.hza, defpackage.hzg
    public final /* synthetic */ fdap k() {
        return this.l;
    }

    @Override // defpackage.hza
    /* renamed from: l */
    public final fdap k() {
        return this.l;
    }

    @Override // defpackage.hza, defpackage.hzg
    public final fdap m() {
        return this.m;
    }

    @Override // defpackage.hza, defpackage.hzg
    public final void p(iaw iawVar) {
        F().p(iawVar);
    }

    @Override // defpackage.hza
    public final void s(cva cvaVar) {
        iag.a();
        throw new fcta();
    }

    @Override // defpackage.hza, defpackage.hzg
    public final void t(int i) {
        F().t(i);
    }

    @Override // defpackage.hza, defpackage.hzg
    public final boolean u() {
        F().u();
        return false;
    }

    @Override // defpackage.hzg
    public final long v() {
        return F().v();
    }

    @Override // defpackage.hzg
    public final hzn x() {
        return F().x();
    }
}
