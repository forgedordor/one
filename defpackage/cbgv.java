package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbgv extends fcyz implements fdat {
    int a;
    final /* synthetic */ cbhl b;
    final /* synthetic */ cbdg c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbgv(fcxy fcxyVar, cbhl cbhlVar, cbdg cbdgVar) {
        super(2, fcxyVar);
        this.b = cbhlVar;
        this.c = cbdgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbgv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarB = this.b.b(this.c);
            this.a = 1;
            if (fdxs.c(eijuVarB, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbgv cbgvVar = new cbgv(fcxyVar, this.b, this.c);
        cbgvVar.d = obj;
        return cbgvVar;
    }
}
