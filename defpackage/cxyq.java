package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxyq extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ hox c;
    final /* synthetic */ cxyt d;
    final /* synthetic */ hox e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxyq(hox hoxVar, cxyt cxytVar, hox hoxVar2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = hoxVar;
        this.d = cxytVar;
        this.e = hoxVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxyq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        hox hoxVar;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            fctl.b(obj);
            hoxVar = obj2;
        } else {
            fctl.b(obj);
            hox hoxVar2 = this.c;
            cxyt cxytVar = this.d;
            String strC = cxyt.c(this.e);
            this.a = hoxVar2;
            this.b = 1;
            cxze cxzeVar = cxytVar.b;
            Object objA = fdin.a(eicg.a(cxzeVar.d), new cxzv(null, cxzeVar, strC), this);
            if (objA == fcylVar) {
                return fcylVar;
            }
            hoxVar = hoxVar2;
            obj = objA;
        }
        hoxVar.b(obj);
        ekrw ekrwVarH = cxyt.a.h();
        ekrwVarH.X(eksq.a, "BugleCms");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/ui/debug/cloudstore/analysisui/RpcPlaygroundPage$ButtonsColumn$1$2$2$1$1", "invokeSuspend", 99, "RpcPlaygroundPage.kt")).D("getConversationByCorrelationId with correlationId %s result: %s", cxyt.c(this.e), this.c.a());
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cxyq(this.c, this.d, this.e, fcxyVar);
    }
}
