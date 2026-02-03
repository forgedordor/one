package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpla extends fcyz implements fdat {
    int a;
    final /* synthetic */ dplc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpla(dplc dplcVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dplcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpla) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        eiju eijuVarG = eiju.g(this.b.b.a());
        eijuVarG.getClass();
        this.a = 1;
        Object objC = fdxs.c(eijuVarG, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpla(this.b, fcxyVar);
    }
}
