package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lxz extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ hps c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxz(fdpl fdplVar, hps hpsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
        this.c = hpsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lxz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpl fdplVar = this.b;
            lxy lxyVar = new lxy(this.c);
            this.a = 1;
            if (fdplVar.a(lxyVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new lxz(this.b, this.c, fcxyVar);
    }
}
