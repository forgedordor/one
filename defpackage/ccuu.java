package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccuu extends fcyz implements fdat {
    int a;
    final /* synthetic */ ccuv b;
    final /* synthetic */ ccux c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccuu(ccuv ccuvVar, ccux ccuxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ccuvVar;
        this.c = ccuxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccuu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ccuv ccuvVar = this.b;
            ccps ccpsVar = this.c.b;
            if (ccpsVar == null) {
                ccpsVar = ccps.a;
            }
            ccpm ccpmVar = ccuvVar.a;
            ccpsVar.getClass();
            ccut ccutVar = ccuvVar.b;
            ccpl ccplVarA = ccpmVar.a(ccpsVar);
            this.a = 1;
            if (ccutVar.b(ccplVarA, this) == fcylVar) {
                return fcylVar;
            }
        }
        return cbcw.i();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ccuu(this.b, this.c, fcxyVar);
    }
}
