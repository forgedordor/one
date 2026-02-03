package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class epl extends fcyz implements fdat {
    int a;
    final /* synthetic */ epm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epl(epm epmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = epmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((epl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            deb debVar = this.b.b;
            Float f = new Float(0.0f);
            dgi dgiVarB = dea.b(0.0f, 400.0f, new Float(0.5f), 1);
            this.a = 1;
            if (dgv.j(debVar, f, dgiVarB, true, null, this, 8) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new epl(this.b, fcxyVar);
    }
}
