package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xfv extends fcyz implements fdat {
    int a;
    final /* synthetic */ xgc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfv(xgc xgcVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xgcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xfv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            xgc xgcVar = this.b;
            this.a = 1;
            if (xgcVar.a(1, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xfv(this.b, fcxyVar);
    }
}
