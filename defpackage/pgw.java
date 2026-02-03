package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pgw extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdjc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgw(fdjc fdjcVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdjcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((pgw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        fcyh fcyhVar = this.b;
        this.a = 1;
        Object objHJ = ((fdme) fcyhVar).hJ(this);
        return objHJ == fcylVar ? fcylVar : objHJ;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new pgw(this.b, fcxyVar);
    }
}
