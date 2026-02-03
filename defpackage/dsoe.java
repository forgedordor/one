package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsoe extends fcyz implements fdat {
    final /* synthetic */ Exception a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsoe(Exception exc, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = exc;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsoe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekrw ekrwVarJ = dsof.a.j();
        Exception exc = this.a;
        ((eksl) ((eksl) ekrwVarJ).g(exc)).q("Failed to install security provider, GNP in-app sync can't run.");
        return new dxfq(exc, 3);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dsoe(this.a, fcxyVar);
    }
}
