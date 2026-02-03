package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dplb extends fcyz implements fdap {
    int a;
    final /* synthetic */ dplc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dplb(dplc dplcVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = dplcVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dplc dplcVar = this.b;
        fcyh fcyhVarHE = dplcVar.c.hE();
        dpla dplaVar = new dpla(dplcVar, null);
        this.a = 1;
        Object objA = fdin.a(fcyhVarHE, dplaVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dplb(this.b, (fcxy) obj).b(fctx.a);
    }
}
