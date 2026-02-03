package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbhi extends fcyz implements fdat {
    int a;
    final /* synthetic */ cbhl b;
    final /* synthetic */ cbdg c;
    final /* synthetic */ cazg d;
    final /* synthetic */ fdjc e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbhi(fcxy fcxyVar, cbhl cbhlVar, cbdg cbdgVar, cazg cazgVar, fdjc fdjcVar) {
        super(2, fcxyVar);
        this.b = cbhlVar;
        this.c = cbdgVar;
        this.d = cazgVar;
        this.e = fdjcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbhi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cbhl cbhlVar = this.b;
            cbdg cbdgVar = this.c;
            cbhg cbhgVar = new cbhg(this.e);
            caya cayaVarA = this.d.a();
            this.a = 1;
            if (cbhl.j(cbhlVar, cbdgVar, cbhgVar, cayaVarA, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbhi cbhiVar = new cbhi(fcxyVar, this.b, this.c, this.d, this.e);
        cbhiVar.f = obj;
        return cbhiVar;
    }
}
