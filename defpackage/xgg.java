package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xgg extends fcyz implements fdat {
    int a;
    final /* synthetic */ xgm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgg(xgm xgmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xgmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xgg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            xgm xgmVar = this.b;
            xgf xgfVar = new xgf(xgmVar);
            this.a = 1;
            if (xgmVar.d.i.a(xgfVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xgg(this.b, fcxyVar);
    }
}
