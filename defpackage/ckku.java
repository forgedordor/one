package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckku extends fcyz implements fdat {
    final /* synthetic */ ckkv a;
    final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckku(ckkv ckkvVar, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ckkvVar;
        this.b = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckku) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((ains) this.a.a.b()).e("Bugle.UI.FiMultiDeviceSync.UserSignOut.Count", !this.b ? 1 : 0);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ckku(this.a, this.b, fcxyVar);
    }
}
