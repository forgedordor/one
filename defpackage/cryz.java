package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cryz extends fcyz implements fdat {
    int a;
    final /* synthetic */ crzb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cryz(crzb crzbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = crzbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cryz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        crzb crzbVar = this.b;
        this.a = 1;
        Object objG = crzbVar.g(this);
        return objG == fcylVar ? fcylVar : objG;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cryz(this.b, fcxyVar);
    }
}
