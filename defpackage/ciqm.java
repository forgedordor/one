package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ciqm extends fcyz implements fdat {
    final /* synthetic */ ciqt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ciqm(ciqt ciqtVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ciqtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ciqm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(this.a.d.d());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ciqm(this.a, fcxyVar);
    }
}
