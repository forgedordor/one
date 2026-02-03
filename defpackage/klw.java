package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class klw extends fdbr implements fdae {
    final /* synthetic */ knp a;
    final /* synthetic */ fdae b;
    final /* synthetic */ knl c;
    final /* synthetic */ kji d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klw(knp knpVar, fdae fdaeVar, knl knlVar, kji kjiVar) {
        super(0);
        this.a = knpVar;
        this.b = fdaeVar;
        this.c = knlVar;
        this.d = kjiVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        this.a.a(this.b, this.c, this.d);
        return fctx.a;
    }
}
