package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xgr extends fcyz implements fdat {
    final /* synthetic */ xgt a;
    final /* synthetic */ vvo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgr(xgt xgtVar, vvo vvoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = xgtVar;
        this.b = vvoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xgr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((whw) this.a.d.b()).a(this.b);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xgr(this.a, this.b, fcxyVar);
    }
}
