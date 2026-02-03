package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cboc extends fcyz implements fdat {
    final /* synthetic */ Throwable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cboc(Throwable th, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = th;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cboc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        auvh.d(this.a);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cboc(this.a, fcxyVar);
    }
}
