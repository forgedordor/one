package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ybc extends fcyz implements fdat {
    int a;
    private /* synthetic */ Object b;

    public ybc(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ybc) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpm fdpmVar = (fdpm) this.b;
            int i2 = ekgb.d;
            ekgb ekgbVar = ekoe.a;
            ekgbVar.getClass();
            this.a = 1;
            if (fdpmVar.fO(ekgbVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ybc ybcVar = new ybc(fcxyVar);
        ybcVar.b = obj;
        return ybcVar;
    }
}
