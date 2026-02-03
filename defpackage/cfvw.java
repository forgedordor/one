package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfvw extends fcyz implements fdat {
    int a;
    final /* synthetic */ cfvx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfvw(cfvx cfvxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cfvxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfvw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cfvv cfvvVar = new cfvv((fdvc) this.b.a.e.a());
            this.a = 1;
            if (fdtc.a(cfvvVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        this.b.b.a(cfuy.g);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cfvw(this.b, fcxyVar);
    }
}
