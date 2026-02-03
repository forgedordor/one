package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbuz extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;

    public cbuz(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbuz) c((cbum) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cbum cbumVar = (cbum) this.b;
        this.a = 1;
        Object objK = cbumVar.k(this);
        return objK == fcylVar ? fcylVar : objK;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbuz cbuzVar = new cbuz(fcxyVar);
        cbuzVar.b = obj;
        return cbuzVar;
    }
}
