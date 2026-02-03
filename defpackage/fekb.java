package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fekb extends fcyz implements fdat {
    int a;
    final /* synthetic */ fekg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fekb(fekg fekgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fekgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fekb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fekg fekgVar = this.b;
            fcyh fcyhVarA = eicg.a(fekgVar.b);
            feka fekaVar = new feka(null, fekgVar);
            this.a = 1;
            if (fdin.a(fcyhVarA, fekaVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fekb(this.b, fcxyVar);
    }
}
