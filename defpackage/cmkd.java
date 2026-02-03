package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmkd extends fcyz implements fdat {
    final /* synthetic */ cmkg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmkd(cmkg cmkgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cmkgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmkd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.f.a();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cmkd(this.a, fcxyVar);
    }
}
