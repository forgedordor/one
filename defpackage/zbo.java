package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zbo extends fcyz implements fdat {
    int a;
    private /* synthetic */ Object b;

    public zbo(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zbo) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpm fdpmVar = (fdpm) this.b;
            fcvo fcvoVar = fcvo.a;
            this.a = 1;
            if (fdpmVar.fO(fcvoVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        zbo zboVar = new zbo(fcxyVar);
        zboVar.b = obj;
        return zboVar;
    }
}
