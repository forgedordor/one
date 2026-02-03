package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbvc extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ cbwd c;
    final /* synthetic */ cchc d;
    final /* synthetic */ epsb e;
    final /* synthetic */ int f;
    final /* synthetic */ enba g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbvc(cbwd cbwdVar, cchc cchcVar, epsb epsbVar, int i, enba enbaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cbwdVar;
        this.d = cchcVar;
        this.e = epsbVar;
        this.f = i;
        this.g = enbaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbvc) c((cbum) obj, (fcxy) obj2)).b(fctx.a);
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
        cbwd cbwdVar = this.c;
        cchc cchcVar = this.d;
        epsb epsbVar = this.e;
        int i2 = this.f;
        enba enbaVar = this.g;
        this.a = 1;
        Object objN = cbumVar.n(cbwdVar, cchcVar, epsbVar, i2, enbaVar, this);
        return objN == fcylVar ? fcylVar : objN;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbvc cbvcVar = new cbvc(this.c, this.d, this.e, this.f, this.g, fcxyVar);
        cbvcVar.b = obj;
        return cbvcVar;
    }
}
