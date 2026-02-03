package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuga extends fcyz implements fdat {
    final /* synthetic */ cugb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuga(cugb cugbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cugbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuga) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((crif) this.a.b.b()).l();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cuga(this.a, fcxyVar);
    }
}
