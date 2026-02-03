package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxyp extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ hox c;
    final /* synthetic */ cxyt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxyp(hox hoxVar, cxyt cxytVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = hoxVar;
        this.d = cxytVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxyp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
            this.a = hoxVar2;
            this.b = 1;
            cxze cxzeVar = cxytVar.b;
            Object objA = fdin.a(eicg.a(cxzeVar.d), new cxzs(null, cxzeVar), this);
            if (objA == fcylVar) {
                return fcylVar;
            }
            hoxVar = hoxVar2;
            obj = objA;
        }
        hoxVar.b(obj);
        ekrw ekrwVarH = cxyt.a.h();
        ekrwVarH.X(eksq.a, "BugleCms");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/ui/debug/cloudstore/analysisui/RpcPlaygroundPage$ButtonsColumn$1$1$1$1", "invokeSuspend", 71, "RpcPlaygroundPage.kt")).t("exportUserDataReference result %s", this.c.a());
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cxyp(this.c, this.d, fcxyVar);
    }
}
