package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbva extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ccep c;
    final /* synthetic */ epti d;
    final /* synthetic */ enba e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbva(ccep ccepVar, epti eptiVar, enba enbaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ccepVar;
        this.d = eptiVar;
        this.e = enbaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbva) c((cbum) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cbum cbumVar = (cbum) this.b;
        ccep ccepVar = this.c;
        epti eptiVar = this.d;
        enba enbaVar = this.e;
        this.a = 1;
        Object objL = cbumVar.l(ccepVar, eptiVar, enbaVar, this);
        return objL == fcylVar ? fcylVar : objL;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbva cbvaVar = new cbva(this.c, this.d, this.e, fcxyVar);
        cbvaVar.b = obj;
        return cbvaVar;
    }
}
