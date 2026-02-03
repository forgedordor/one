package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eso extends fcyz implements fdat {
    int a;
    final /* synthetic */ etv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eso(etv etvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = etvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eso) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objZ;
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            etv etvVar = this.b;
            this.a = 1;
            etd etdVar = eua.a;
            if (etvVar.j() + 1 >= etvVar.b() || (objZ = etv.z(etvVar, etvVar.j() + 1, null, this, 6)) != obj2) {
                objZ = fctx.a;
            }
            if (objZ == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new eso(this.b, fcxyVar);
    }
}
