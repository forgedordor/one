package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbxg extends fcyz implements fdat {
    final /* synthetic */ cbyh a;
    final /* synthetic */ enba b;
    final /* synthetic */ ccep c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbxg(fcxy fcxyVar, cbyh cbyhVar, enba enbaVar, ccep ccepVar) {
        super(2, fcxyVar);
        this.a = cbyhVar;
        this.b = enbaVar;
        this.c = ccepVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbxg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.c.i(this.b, this.c);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbxg cbxgVar = new cbxg(fcxyVar, this.a, this.b, this.c);
        cbxgVar.d = obj;
        return cbxgVar;
    }
}
