package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbvh extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;

    public cbvh(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbvh) c((cbum) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cbum cbumVar = (cbum) this.b;
            this.a = 1;
            if (cbumVar.s(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbvh cbvhVar = new cbvh(fcxyVar);
        cbvhVar.b = obj;
        return cbvhVar;
    }
}
