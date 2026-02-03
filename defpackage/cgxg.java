package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgxg extends fcyz implements fdat {
    int a;
    final /* synthetic */ cgxh b;
    final /* synthetic */ Exception c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgxg(fcxy fcxyVar, cgxh cgxhVar, Exception exc) {
        super(2, fcxyVar);
        this.b = cgxhVar;
        this.c = exc;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgxg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        eiju eijuVarB = this.b.b.b(this.c);
        this.a = 1;
        Object objC = fdxs.c(eijuVarB, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cgxg cgxgVar = new cgxg(fcxyVar, this.b, this.c);
        cgxgVar.d = obj;
        return cgxgVar;
    }
}
