package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pbh extends vq {
    private final pbj a;

    public pbh(pbj pbjVar) {
        lcg.a(true);
        this.a = pbjVar;
    }

    @Override // defpackage.vq
    public final void a() {
        this.a.f();
    }

    @Override // defpackage.vq
    public final void c(int i, int i2, Object obj) {
        if ("Selection-Changed".equals(obj)) {
            return;
        }
        this.a.f();
    }

    @Override // defpackage.vq
    public final void d(int i, int i2) {
        this.a.c();
    }

    @Override // defpackage.vq
    public final void e(int i, int i2) {
        pbj pbjVar = this.a;
        pbjVar.c();
        pbjVar.f();
    }

    @Override // defpackage.vq
    public final void g(int i, int i2) {
        this.a.c();
    }
}
