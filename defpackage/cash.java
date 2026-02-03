package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cash extends fcyz implements fdat {
    int a;
    final /* synthetic */ casj b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cash(fcxy fcxyVar, casj casjVar) {
        super(2, fcxyVar);
        this.b = casjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cash) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        this.a = 1;
        Object objA = cart.a();
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cash cashVar = new cash(fcxyVar, this.b);
        cashVar.c = obj;
        return cashVar;
    }
}
