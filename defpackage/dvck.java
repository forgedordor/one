package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvck extends fcyz implements fdat {
    final /* synthetic */ dvcp a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvck(dvcp dvcpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dvcpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvck) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        fdjx fdjxVar = (fdjx) this.b;
        dvcp dvcpVar = this.a;
        return ejaa.a(fdjxVar, dvcpVar.c, new dvcj(dvcpVar, null));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dvck dvckVar = new dvck(this.a, fcxyVar);
        dvckVar.b = obj;
        return dvckVar;
    }
}
