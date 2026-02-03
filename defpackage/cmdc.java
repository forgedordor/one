package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmdc extends fcyz implements fdat {
    final /* synthetic */ cmdd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmdc(cmdd cmddVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cmddVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmdc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((ains) this.a.b.b()).c("Bugle.ScreenCapture.Detection.Counts");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cmdc(this.a, fcxyVar);
    }
}
