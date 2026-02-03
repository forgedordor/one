package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxom extends fcyz implements fdat {
    int a;
    final /* synthetic */ bxnl b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxom(fcxy fcxyVar, bxnl bxnlVar) {
        super(2, fcxyVar);
        this.b = bxnlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bxom) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        eiju eijuVarC = this.b.c();
        eijuVarC.getClass();
        this.a = 1;
        Object objC = fdxs.c(eijuVarC, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bxom bxomVar = new bxom(fcxyVar, this.b);
        bxomVar.c = obj;
        return bxomVar;
    }
}
