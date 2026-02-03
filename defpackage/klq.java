package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class klq extends fdbr implements fdae {
    final /* synthetic */ klr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klq(klr klrVar) {
        super(0);
        this.a = klrVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        klr klrVar = this.a;
        klrVar.y.invoke(klrVar.x);
        return fctx.a;
    }
}
