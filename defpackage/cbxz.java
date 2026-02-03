package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbxz extends fcyz implements fdat {
    final /* synthetic */ cbyh a;
    final /* synthetic */ cbwd b;
    final /* synthetic */ cchc c;
    final /* synthetic */ eprw d;
    final /* synthetic */ int e;
    final /* synthetic */ enba f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbxz(fcxy fcxyVar, cbyh cbyhVar, cbwd cbwdVar, cchc cchcVar, eprw eprwVar, int i, enba enbaVar) {
        super(2, fcxyVar);
        this.a = cbyhVar;
        this.b = cbwdVar;
        this.c = cchcVar;
        this.d = eprwVar;
        this.e = i;
        this.f = enbaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbxz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.c.e(this.b, this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbxz cbxzVar = new cbxz(fcxyVar, this.a, this.b, this.c, this.d, this.e, this.f);
        cbxzVar.g = obj;
        return cbxzVar;
    }
}
