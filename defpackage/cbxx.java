package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbxx extends fcyz implements fdat {
    final /* synthetic */ cbyh a;
    final /* synthetic */ cbwd b;
    final /* synthetic */ cchc c;
    final /* synthetic */ eprw d;
    final /* synthetic */ ccep e;
    final /* synthetic */ int f;
    final /* synthetic */ enba g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbxx(fcxy fcxyVar, cbyh cbyhVar, cbwd cbwdVar, cchc cchcVar, eprw eprwVar, ccep ccepVar, int i, enba enbaVar) {
        super(2, fcxyVar);
        this.a = cbyhVar;
        this.b = cbwdVar;
        this.c = cchcVar;
        this.d = eprwVar;
        this.e = ccepVar;
        this.f = i;
        this.g = enbaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbxx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.c.d(this.b, this.c, this.d, this.e, this.f, this.g);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbxx cbxxVar = new cbxx(fcxyVar, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        cbxxVar.h = obj;
        return cbxxVar;
    }
}
