package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ets extends fcyz implements fdat {
    int a;
    final /* synthetic */ etv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ets(etv etvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = etvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ets) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            etv etvVar = this.b;
            this.a = 1;
            Object objE = etvVar.e(dod.a, new dwv(null), this);
            if (objE != fcylVar) {
                objE = fctx.a;
            }
            if (objE == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ets(this.b, fcxyVar);
    }
}
