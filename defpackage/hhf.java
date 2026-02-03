package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hhf extends fcyy implements fdat {
    int a;
    final /* synthetic */ iru b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhf(iru iruVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = iruVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hhf) c((ire) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ire ireVar = (ire) this.c;
        iru iruVar = this.b;
        this.a = 1;
        Object objF = dzm.f(ireVar, iruVar, this);
        return objF == fcylVar ? fcylVar : objF;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        hhf hhfVar = new hhf(this.b, fcxyVar);
        hhfVar.c = obj;
        return hhfVar;
    }
}
