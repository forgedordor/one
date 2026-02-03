package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxsd extends fcyz implements fdat {
    final /* synthetic */ bxsg a;
    final /* synthetic */ esal b;
    final /* synthetic */ int c;
    final /* synthetic */ Exception d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxsd(bxsg bxsgVar, esal esalVar, int i, Exception exc, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = bxsgVar;
        this.b = esalVar;
        this.c = i;
        this.d = exc;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bxsd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        byap byapVar = (byap) this.a.c.b();
        String strA = this.b.a();
        strA.getClass();
        byapVar.c(strA, this.c, 2, this.d);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bxsd(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
