package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbxr extends fcyz implements fdat {
    final /* synthetic */ cbyh a;
    final /* synthetic */ cbwd b;
    final /* synthetic */ cchc c;
    final /* synthetic */ epsb d;
    final /* synthetic */ int e;
    final /* synthetic */ enba f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbxr(fcxy fcxyVar, cbyh cbyhVar, cbwd cbwdVar, cchc cchcVar, epsb epsbVar, int i, enba enbaVar) {
        super(2, fcxyVar);
        this.a = cbyhVar;
        this.b = cbwdVar;
        this.c = cchcVar;
        this.d = epsbVar;
        this.e = i;
        this.f = enbaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbxr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.c.c(this.b, this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbxr cbxrVar = new cbxr(fcxyVar, this.a, this.b, this.c, this.d, this.e, this.f);
        cbxrVar.g = obj;
        return cbxrVar;
    }
}
