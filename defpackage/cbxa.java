package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbxa extends fcyz implements fdat {
    final /* synthetic */ cbyh a;
    final /* synthetic */ cbwd b;
    final /* synthetic */ ccep c;
    final /* synthetic */ basd d;
    final /* synthetic */ ccct e;
    final /* synthetic */ enba f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbxa(fcxy fcxyVar, cbyh cbyhVar, cbwd cbwdVar, ccep ccepVar, basd basdVar, ccct ccctVar, enba enbaVar) {
        super(2, fcxyVar);
        this.a = cbyhVar;
        this.b = cbwdVar;
        this.c = ccepVar;
        this.d = basdVar;
        this.e = ccctVar;
        this.f = enbaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbxa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.c.f(this.b, this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbxa cbxaVar = new cbxa(fcxyVar, this.a, this.b, this.c, this.d, this.e, this.f);
        cbxaVar.g = obj;
        return cbxaVar;
    }
}
