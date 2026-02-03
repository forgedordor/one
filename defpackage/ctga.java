package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctga extends fcyz implements fdat {
    final /* synthetic */ ctgb a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctga(ctgb ctgbVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ctgbVar;
        this.b = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctga) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((ains) this.a.g.b()).e("Bugle.Spam.UrlClick.Counts", this.b);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctga(this.a, this.b, fcxyVar);
    }
}
