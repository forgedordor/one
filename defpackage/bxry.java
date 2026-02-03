package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxry extends fcyz implements fdat {
    final /* synthetic */ bxsg a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxry(bxsg bxsgVar, String str, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = bxsgVar;
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bxry) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((byap) this.a.c.b()).d(this.b, this.c, 3);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bxry(this.a, this.b, this.c, fcxyVar);
    }
}
