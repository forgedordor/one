package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbxc extends fcyz implements fdat {
    final /* synthetic */ cbyh a;
    final /* synthetic */ ccep b;
    final /* synthetic */ eprw c;
    final /* synthetic */ enba d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbxc(fcxy fcxyVar, cbyh cbyhVar, ccep ccepVar, eprw eprwVar, enba enbaVar) {
        super(2, fcxyVar);
        this.a = cbyhVar;
        this.b = ccepVar;
        this.c = eprwVar;
        this.d = enbaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbxc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.c.g(this.b, this.c, this.d);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbxc cbxcVar = new cbxc(fcxyVar, this.a, this.b, this.c, this.d);
        cbxcVar.e = obj;
        return cbxcVar;
    }
}
