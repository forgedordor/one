package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbvg extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ cbwd c;
    final /* synthetic */ cchc d;
    final /* synthetic */ eprw e;
    final /* synthetic */ int f;
    final /* synthetic */ enba g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbvg(cbwd cbwdVar, cchc cchcVar, eprw eprwVar, int i, enba enbaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cbwdVar;
        this.d = cchcVar;
        this.e = eprwVar;
        this.f = i;
        this.g = enbaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbvg) c((cbum) obj, (fcxy) obj2)).b(fctx.a);
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
        eprw eprwVar = this.e;
        int i2 = this.f;
        enba enbaVar = this.g;
        this.a = 1;
        Object objR = cbumVar.r(cbwdVar, cchcVar, eprwVar, i2, enbaVar, this);
        return objR == fcylVar ? fcylVar : objR;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbvg cbvgVar = new cbvg(this.c, this.d, this.e, this.f, this.g, fcxyVar);
        cbvgVar.b = obj;
        return cbvgVar;
    }
}
