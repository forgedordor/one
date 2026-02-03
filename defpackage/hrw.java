package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hrw extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ hps c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hrw(fdpl fdplVar, hps hpsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
        this.c = hpsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hrw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpl fdplVar = this.b;
            hrv hrvVar = new hrv(this.c);
            this.a = 1;
            if (fdplVar.a(hrvVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new hrw(this.b, this.c, fcxyVar);
    }
}
