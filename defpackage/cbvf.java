package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbvf extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ cbwd c;
    final /* synthetic */ cchc d;
    final /* synthetic */ eprw e;
    final /* synthetic */ ccep f;
    final /* synthetic */ int g;
    final /* synthetic */ enba h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbvf(cbwd cbwdVar, cchc cchcVar, eprw eprwVar, ccep ccepVar, int i, enba enbaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cbwdVar;
        this.d = cchcVar;
        this.e = eprwVar;
        this.f = ccepVar;
        this.g = i;
        this.h = enbaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbvf) c((cbum) obj, (fcxy) obj2)).b(fctx.a);
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
        ccep ccepVar = this.f;
        int i2 = this.g;
        enba enbaVar = this.h;
        this.a = 1;
        Object objQ = cbumVar.q(cbwdVar, cchcVar, eprwVar, ccepVar, i2, enbaVar, this);
        return objQ == fcylVar ? fcylVar : objQ;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbvf cbvfVar = new cbvf(this.c, this.d, this.e, this.f, this.g, this.h, fcxyVar);
        cbvfVar.b = obj;
        return cbvfVar;
    }
}
