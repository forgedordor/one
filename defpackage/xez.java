package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xez extends fcyz implements fdat {
    int a;
    final /* synthetic */ xfi b;
    final /* synthetic */ djdk c;
    final /* synthetic */ djdi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xez(xfi xfiVar, djdk djdkVar, djdi djdiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xfiVar;
        this.c = djdkVar;
        this.d = djdiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xez) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            xfi xfiVar = this.b;
            djdk djdkVar = this.c;
            this.a = 1;
            obj = xfiVar.h(djdkVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        xfi xfiVar2 = this.b;
        dpzj dpzjVar = (dpzj) obj;
        xfiVar2.r.f(dpzjVar);
        xfiVar2.m.a(new vus(this.d, dpzjVar, null));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xez(this.b, this.c, this.d, fcxyVar);
    }
}
