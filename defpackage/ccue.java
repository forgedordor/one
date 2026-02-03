package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccue extends fcyz implements fdat {
    int a;
    final /* synthetic */ ccuf b;
    final /* synthetic */ ccui c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccue(ccuf ccufVar, ccui ccuiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ccufVar;
        this.c = ccuiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccue) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ccuf ccufVar = this.b;
            ccps ccpsVar = this.c.c;
            if (ccpsVar == null) {
                ccpsVar = ccps.a;
            }
            ccpm ccpmVar = ccufVar.b;
            ccpsVar.getClass();
            ccud ccudVar = ccufVar.a;
            ccpl ccplVarA = ccpmVar.a(ccpsVar);
            this.a = 1;
            if (ccudVar.e(ccplVarA, null, this) == fcylVar) {
                return fcylVar;
            }
        }
        return cbcw.i();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ccue(this.b, this.c, fcxyVar);
    }
}
