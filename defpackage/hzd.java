package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzd extends hzg {
    private final fdap a;
    private int b;

    public hzd(long j, hzn hznVar, fdap fdapVar) {
        super(j, hznVar);
        this.a = fdapVar;
        this.b = 1;
    }

    @Override // defpackage.hzg
    public final hzg b(fdap fdapVar) {
        hzt.w(this);
        return new hzc(this.i, this.h, hzt.p(fdapVar, this.a, true), this);
    }

    @Override // defpackage.hzg
    public final void d() {
        if (this.j) {
            return;
        }
        g();
        super.d();
    }

    @Override // defpackage.hzg
    public final void f() {
        this.b++;
    }

    @Override // defpackage.hzg
    public final void g() {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            y();
        }
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
