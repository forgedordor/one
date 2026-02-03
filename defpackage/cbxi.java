package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbxi extends fcyz implements fdat {
    final /* synthetic */ cbyh a;
    final /* synthetic */ enba b;
    final /* synthetic */ int c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbxi(fcxy fcxyVar, cbyh cbyhVar, enba enbaVar, int i) {
        super(2, fcxyVar);
        this.a = cbyhVar;
        this.b = enbaVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbxi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.c.a(this.b, this.c);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbxi cbxiVar = new cbxi(fcxyVar, this.a, this.b, this.c);
        cbxiVar.d = obj;
        return cbxiVar;
    }
}
