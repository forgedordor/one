package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xfb extends fcyz implements fdat {
    int a;
    final /* synthetic */ xfi b;
    final /* synthetic */ vwf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfb(xfi xfiVar, vwf vwfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xfiVar;
        this.c = vwfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xfb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            xfi xfiVar = this.b;
            vwf vwfVar = this.c;
            this.a = 1;
            obj = xfiVar.g(vwfVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        xfi xfiVar2 = this.b;
        dpzj dpzjVar = (dpzj) obj;
        if (fdbq.f(dpzjVar, xfiVar2.r.c())) {
            xfiVar2.u.set(false);
            return fctx.a;
        }
        xfiVar2.r.f(dpzjVar);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xfb(this.b, this.c, fcxyVar);
    }
}
