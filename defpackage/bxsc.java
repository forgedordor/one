package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxsc extends fcyz implements fdat {
    final /* synthetic */ bxsg a;
    final /* synthetic */ esal b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxsc(bxsg bxsgVar, esal esalVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = bxsgVar;
        this.b = esalVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bxsc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        byap byapVar = (byap) this.a.c.b();
        String strA = this.b.a();
        strA.getClass();
        byapVar.d(strA, this.c, 2);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bxsc(this.a, this.b, this.c, fcxyVar);
    }
}
