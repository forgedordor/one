package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbuy extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;

    public cbuy(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbuy) c((cbum) obj, (fcxy) obj2)).b(fctx.a);
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
        Object objJ = cbumVar.j(this);
        return objJ == fcylVar ? fcylVar : objJ;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbuy cbuyVar = new cbuy(fcxyVar);
        cbuyVar.b = obj;
        return cbuyVar;
    }
}
