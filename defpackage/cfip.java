package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfip extends fcyz implements fdat {
    int a;
    final /* synthetic */ cfiq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfip(cfiq cfiqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cfiqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfip) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cfiq cfiqVar = this.b;
        this.a = 1;
        Object objC = cfiqVar.c(this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cfip(this.b, fcxyVar);
    }
}
