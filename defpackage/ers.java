package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ers extends fcyz implements fdat {
    int a;
    final /* synthetic */ isn b;
    final /* synthetic */ etv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ers(isn isnVar, etv etvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = isnVar;
        this.c = etvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ers) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            isn isnVar = this.b;
            err errVar = new err(this.c, null);
            this.a = 1;
            if (dvn.b(isnVar, errVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ers(this.b, this.c, fcxyVar);
    }
}
