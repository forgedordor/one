package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gmz extends fcyz implements fdat {
    int a;
    final /* synthetic */ gnc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmz(gnc gncVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = gncVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gmz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            gnc gncVar = this.b;
            Float f = new Float(0.0f);
            this.a = 1;
            if (ddp.k(gncVar.a, f, null, null, this, 14) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new gmz(this.b, fcxyVar);
    }
}
