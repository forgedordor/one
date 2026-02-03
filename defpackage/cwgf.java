package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwgf extends fcyz implements fdat {
    int a;
    final /* synthetic */ etv b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwgf(etv etvVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = etvVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwgf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            etv etvVar = this.b;
            int i2 = this.c;
            dia diaVarC = dea.c(350, 0, null, 6);
            this.a = 1;
            if (etv.z(etvVar, i2, diaVarC, this, 2) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cwgf(this.b, this.c, fcxyVar);
    }
}
