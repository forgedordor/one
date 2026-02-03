package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hiy extends fcyz implements fdat {
    final /* synthetic */ hiz a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hiy(hiz hizVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = hizVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hiy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        fdjx fdjxVar = (fdjx) this.b;
        hiz hizVar = this.a;
        fdil.d(fdjxVar, null, null, new hit(hizVar, null), 3);
        fdil.d(fdjxVar, null, null, new hiv(hizVar, null), 3);
        fdil.d(fdjxVar, null, null, new hix(hizVar, null), 3);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        hiy hiyVar = new hiy(this.a, fcxyVar);
        hiyVar.b = obj;
        return hiyVar;
    }
}
