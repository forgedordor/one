package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zgv extends fcyz implements fdat {
    final /* synthetic */ zij a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgv(zij zijVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = zijVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zgv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.o.invoke();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zgv(this.a, fcxyVar);
    }
}
