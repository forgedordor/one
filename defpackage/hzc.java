package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzc extends hzg {
    private final fdap a;
    private final hzg b;

    public hzc(long j, hzn hznVar, fdap fdapVar, hzg hzgVar) {
        super(j, hznVar);
        this.a = fdapVar;
        this.b = hzgVar;
        hzgVar.f();
    }

    @Override // defpackage.hzg
    public final /* bridge */ /* synthetic */ hzg b(fdap fdapVar) {
        return new hzc(this.i, this.h, hzt.p(fdapVar, this.a, true), this.b);
    }

    @Override // defpackage.hzg
    public final void d() {
        if (this.j) {
            return;
        }
        long j = this.i;
        hzg hzgVar = this.b;
        if (j != hzgVar.v()) {
            y();
        }
        hzgVar.g();
        super.d();
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
    public final /* bridge */ /* synthetic */ void p(iaw iawVar) {
        hzt.A();
        throw new fcta();
    }

    @Override // defpackage.hzg
    public final boolean u() {
        return true;
    }

    @Override // defpackage.hzg
    public final void e() {
    }
}
