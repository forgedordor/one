package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ygf extends fcyz implements fdat {
    int a;
    final /* synthetic */ ddp b;
    final /* synthetic */ hox c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygf(ddp ddpVar, hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ddpVar;
        this.c = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ygf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ddp ddpVar = this.b;
            Object objA = this.c.a();
            this.a = 1;
            if (ddp.k(ddpVar, objA, null, null, this, 14) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ygf(this.b, this.c, fcxyVar);
    }
}
