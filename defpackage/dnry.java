package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnry extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnsa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnry(dnsa dnsaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnsaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnry) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dnsa dnsaVar = this.b;
            fdpl fdplVarD = dphw.d(dnsaVar.f.a);
            dnrx dnrxVar = new dnrx(dnsaVar);
            this.a = 1;
            if (fdplVarD.a(dnrxVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnry(this.b, fcxyVar);
    }
}
