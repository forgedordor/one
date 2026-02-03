package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkin implements fdap {
    final /* synthetic */ kow a;
    final /* synthetic */ dkkr b;

    public dkin(kow kowVar, dkkr dkkrVar) {
        this.a = kowVar;
        this.b = dkkrVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        kov kovVar = (kov) obj;
        kovVar.getClass();
        kos kosVar = kovVar.f;
        kow kowVar = this.a;
        kpt.a(kosVar, kowVar.e, 0.0f, 6);
        if (this.b.y.b == dkgv.c) {
            kqa.a(kovVar.g, kowVar.d, 0.0f, 6);
        } else {
            kqa.a(kovVar.e, kowVar.b, 0.0f, 6);
        }
        return fctx.a;
    }
}
