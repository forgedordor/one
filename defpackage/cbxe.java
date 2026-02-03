package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbxe extends fcyz implements fdat {
    final /* synthetic */ cbyh a;
    final /* synthetic */ ccep b;
    final /* synthetic */ epsb c;
    final /* synthetic */ enba d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbxe(fcxy fcxyVar, cbyh cbyhVar, ccep ccepVar, epsb epsbVar, enba enbaVar) {
        super(2, fcxyVar);
        this.a = cbyhVar;
        this.b = ccepVar;
        this.c = epsbVar;
        this.d = enbaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbxe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.c.h(this.b, this.c, this.d);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbxe cbxeVar = new cbxe(fcxyVar, this.a, this.b, this.c, this.d);
        cbxeVar.e = obj;
        return cbxeVar;
    }
}
