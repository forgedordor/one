package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbut extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ cbwd c;
    final /* synthetic */ ccep d;
    final /* synthetic */ basd e;
    final /* synthetic */ ccct f;
    final /* synthetic */ enba g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbut(cbwd cbwdVar, ccep ccepVar, basd basdVar, ccct ccctVar, enba enbaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cbwdVar;
        this.d = ccepVar;
        this.e = basdVar;
        this.f = ccctVar;
        this.g = enbaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbut) c((cbum) obj, (fcxy) obj2)).b(fctx.a);
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
        ccep ccepVar = this.d;
        basd basdVar = this.e;
        ccct ccctVar = this.f;
        enba enbaVar = this.g;
        this.a = 1;
        Object objE = cbumVar.e(cbwdVar, ccepVar, basdVar, ccctVar, enbaVar, this);
        return objE == fcylVar ? fcylVar : objE;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbut cbutVar = new cbut(this.c, this.d, this.e, this.f, this.g, fcxyVar);
        cbutVar.b = obj;
        return cbutVar;
    }
}
