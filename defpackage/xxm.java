package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xxm extends fcyz implements fdat {
    final /* synthetic */ xxe a;
    final /* synthetic */ etv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxm(xxe xxeVar, etv etvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = xxeVar;
        this.b = etvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xxm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.c.f(new Integer(this.b.j()));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xxm(this.a, this.b, fcxyVar);
    }
}
