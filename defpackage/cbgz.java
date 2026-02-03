package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbgz extends fcyz implements fdat {
    int a;
    final /* synthetic */ cbhl b;
    final /* synthetic */ cbdg c;
    final /* synthetic */ cazg d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbgz(fcxy fcxyVar, cbhl cbhlVar, cbdg cbdgVar, cazg cazgVar) {
        super(2, fcxyVar);
        this.b = cbhlVar;
        this.c = cbdgVar;
        this.d = cazgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbgz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cbhl cbhlVar = this.b;
            cbdg cbdgVar = this.c;
            cazg cazgVar = this.d;
            cazgVar.getClass();
            this.a = 1;
            if (cbhlVar.g(cbdgVar, cazgVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbgz cbgzVar = new cbgz(fcxyVar, this.b, this.c, this.d);
        cbgzVar.e = obj;
        return cbgzVar;
    }
}
