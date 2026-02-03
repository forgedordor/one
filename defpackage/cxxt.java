package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxxt extends fcyz implements fdap {
    int a;
    final /* synthetic */ cxyh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxxt(cxyh cxyhVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = cxyhVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cxyh cxyhVar = this.b;
        this.a = 1;
        cxze cxzeVar = cxyhVar.a;
        Object objA = fdin.a(eicg.a(cxzeVar.d), new cxzi(null, cxzeVar), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cxxt(this.b, (fcxy) obj).b(fctx.a);
    }
}
