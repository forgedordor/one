package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbwy extends fcyz implements fdat {
    final /* synthetic */ cbyh a;
    final /* synthetic */ ccep b;
    final /* synthetic */ enba c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbwy(fcxy fcxyVar, cbyh cbyhVar, ccep ccepVar, enba enbaVar) {
        super(2, fcxyVar);
        this.a = cbyhVar;
        this.b = ccepVar;
        this.c = enbaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbwy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(this.a.c.p(this.b, this.c));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbwy cbwyVar = new cbwy(fcxyVar, this.a, this.b, this.c);
        cbwyVar.d = obj;
        return cbwyVar;
    }
}
