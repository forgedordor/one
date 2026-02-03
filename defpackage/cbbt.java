package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbbt extends fcyz implements fdat {
    int a;
    final /* synthetic */ cbcf b;
    final /* synthetic */ cbbk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbbt(cbcf cbcfVar, cbbk cbbkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cbcfVar;
        this.c = cbbkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbbt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cbcf cbcfVar = this.b;
        cbbk cbbkVar = this.c;
        this.a = 1;
        Object objA = fdin.a(eicg.a(cbcfVar.d.hE()), new cbbs(null, cbbkVar, cbcfVar), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cbbt(this.b, this.c, fcxyVar);
    }
}
