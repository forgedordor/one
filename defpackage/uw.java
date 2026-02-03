package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class uw extends vq {
    final /* synthetic */ uy a;

    public uw(uy uyVar) {
        this.a = uyVar;
    }

    @Override // defpackage.vq
    public final void a() {
        uy uyVar = this.a;
        uyVar.d = uyVar.b.a();
        sr srVar = (sr) uyVar.c;
        srVar.a.p();
        srVar.d();
    }

    @Override // defpackage.vq
    public final void b(int i, int i2) {
        uy uyVar = this.a;
        uyVar.c.e(uyVar, i, i2, null);
    }

    @Override // defpackage.vq
    public final void c(int i, int i2, Object obj) {
        uy uyVar = this.a;
        uyVar.c.e(uyVar, i, i2, obj);
    }

    @Override // defpackage.vq
    public final void d(int i, int i2) {
        uy uyVar = this.a;
        uyVar.d += i2;
        sr srVar = (sr) uyVar.c;
        srVar.a.w(i + srVar.a(uyVar), i2);
        if (uyVar.d <= 0 || uyVar.b.c != 2) {
            return;
        }
        srVar.d();
    }

    @Override // defpackage.vq
    public final void e(int i, int i2) {
        uy uyVar = this.a;
        uyVar.d -= i2;
        sr srVar = (sr) uyVar.c;
        srVar.a.x(i + srVar.a(uyVar), i2);
        if (uyVar.d > 0 || uyVar.b.c != 2) {
            return;
        }
        srVar.d();
    }

    @Override // defpackage.vq
    public final void f() {
        ((sr) this.a.c).d();
    }

    @Override // defpackage.vq
    public final void g(int i, int i2) {
        lcg.b(true, "moving more than 1 item is not supported in RecyclerView");
        uy uyVar = this.a;
        sr srVar = (sr) uyVar.c;
        int iA = srVar.a(uyVar);
        srVar.a.t(i + iA, i2 + iA);
    }
}
