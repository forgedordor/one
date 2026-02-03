package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctur extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctus b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctur(ctus ctusVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ctusVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctur) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ctus ctusVar = this.b;
            fdpl fdplVarA = ((cudy) ctusVar.b.b()).a();
            ctuq ctuqVar = new ctuq(ctusVar);
            this.a = 1;
            if (fdplVarA.a(ctuqVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctur(this.b, fcxyVar);
    }
}
