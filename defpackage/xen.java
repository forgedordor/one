package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xen extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ xfi c;
    final /* synthetic */ asgk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xen(fdpl fdplVar, xfi xfiVar, asgk asgkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
        this.c = xfiVar;
        this.d = asgkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xen) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpl fdplVar = this.b;
            xfi xfiVar = this.c;
            asgk asgkVar = this.d;
            fdpl fdplVarA = fdqq.a(fdplVar);
            xem xemVar = new xem(xfiVar, asgkVar);
            this.a = 1;
            if (fdplVarA.a(xemVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xen(this.b, this.c, this.d, fcxyVar);
    }
}
