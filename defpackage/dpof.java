package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpof extends fcyz implements fdat {
    final /* synthetic */ dpmg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpof(dpmg dpmgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dpmgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpof) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((dpnw) this.a.c).a.f();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpof(this.a, fcxyVar);
    }
}
