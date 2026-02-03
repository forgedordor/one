package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlqf extends fcyy implements fdat {
    int a;
    private /* synthetic */ Object b;

    public dlqf(fcxy fcxyVar) {
        super(fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlqf) c((ire) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ire ireVar = (ire) this.b;
        this.a = 1;
        Object objB = dlqj.b(ireVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dlqf dlqfVar = new dlqf(fcxyVar);
        dlqfVar.b = obj;
        return dlqfVar;
    }
}
