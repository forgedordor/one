package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class diwj extends fcyz implements fdat {
    final /* synthetic */ diwl a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public diwj(diwl diwlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = diwlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((diwj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        fdjx fdjxVar = (fdjx) this.b;
        diwl diwlVar = this.a;
        fdil.d(fdjxVar, null, null, new diwg(diwlVar, null), 3);
        fdil.d(fdjxVar, null, null, new diwi(diwlVar, null), 3);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        diwj diwjVar = new diwj(this.a, fcxyVar);
        diwjVar.b = obj;
        return diwjVar;
    }
}
