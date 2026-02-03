package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chay extends fcyz implements fdat {
    int a;
    final /* synthetic */ chbc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chay(chbc chbcVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chbcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chay) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        chbc chbcVar = this.b;
        this.a = 1;
        Object objA = eicj.a(chbcVar.a.a, new chan(null), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chay(this.b, fcxyVar);
    }
}
