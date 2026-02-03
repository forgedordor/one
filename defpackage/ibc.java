package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibc extends hzg {
    public fdap a;
    public final long b;
    private final hzg c;
    private final boolean d;
    private final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibc(hzg hzgVar, fdap fdapVar, boolean z, boolean z2) {
        fdap fdapVarK;
        super(0L, hzn.a);
        fdap fdapVar2 = hzt.a;
        this.c = hzgVar;
        this.d = z;
        this.e = z2;
        this.a = hzt.p(fdapVar, (hzgVar == null || (fdapVarK = hzgVar.k()) == null) ? hzt.i.a : fdapVarK, z);
        this.b = hxr.a();
    }

    private final hzg a() {
        hzg hzgVar = this.c;
        return hzgVar == null ? hzt.i : hzgVar;
    }

    @Override // defpackage.hzg
    public final hzg b(fdap fdapVar) {
        fdap fdapVarP = hzt.p(fdapVar, this.a, true);
        return !this.d ? hzt.a(a().b(null), fdapVarP, true) : a().b(fdapVarP);
    }

    @Override // defpackage.hzg
    public final void d() {
        hzg hzgVar;
        D();
        if (!this.e || (hzgVar = this.c) == null) {
            return;
        }
        hzgVar.d();
    }

    @Override // defpackage.hzg
    public final void e() {
        a().e();
    }

    @Override // defpackage.hzg
    public final /* bridge */ /* synthetic */ void f() {
        iag.a();
        throw new fcta();
    }

    @Override // defpackage.hzg
    public final /* bridge */ /* synthetic */ void g() {
        iag.a();
        throw new fcta();
    }

    @Override // defpackage.hzg
    public final /* synthetic */ fdap k() {
        return this.a;
    }

    @Override // defpackage.hzg
    public final fdap m() {
        return null;
    }

    @Override // defpackage.hzg
    public final void p(iaw iawVar) {
        a().p(iawVar);
    }

    @Override // defpackage.hzg
    public final boolean u() {
        return a().u();
    }

    @Override // defpackage.hzg
    public final long v() {
        return a().v();
    }

    @Override // defpackage.hzg
    public final hzn x() {
        return a().x();
    }
}
