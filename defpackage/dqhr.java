package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqhr implements fdap {
    final /* synthetic */ kow a;
    final /* synthetic */ kow b;

    public dqhr(kow kowVar, kow kowVar2) {
        this.a = kowVar;
        this.b = kowVar2;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        kov kovVar = (kov) obj;
        kovVar.getClass();
        kqa.a(kovVar.e, this.a.d, 8.0f, 4);
        kqa.a(kovVar.g, this.b.b, 8.0f, 4);
        kos kosVar = kovVar.f;
        kow kowVar = kovVar.c;
        kpt.a(kosVar, kowVar.c, 0.0f, 6);
        kpt.a(kovVar.h, kowVar.e, 0.0f, 6);
        kovVar.a(new kpr("spread"));
        kpr kprVar = new kpr(44.0f);
        kovVar.d.d(kov.a[1], kprVar);
        return fctx.a;
    }
}
