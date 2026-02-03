package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpta extends fcyz implements fdat {
    int a;
    final /* synthetic */ hox b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpta(hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpta) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            this.a = 1;
            if (fdkj.c(2000L, this) == fcylVar) {
                return fcylVar;
            }
        }
        dpti.d(this.b, false);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpta(this.b, fcxyVar);
    }
}
