package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vni extends fcyz implements fdat {
    int a;
    private /* synthetic */ Object b;

    public vni(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vni) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpm fdpmVar = (fdpm) this.b;
            this.a = 1;
            if (fdpmVar.fO(false, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        vni vniVar = new vni(fcxyVar);
        vniVar.b = obj;
        return vniVar;
    }
}
