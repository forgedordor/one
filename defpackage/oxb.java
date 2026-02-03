package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oxb extends fcyz implements fdat {
    final /* synthetic */ oxc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxb(oxc oxcVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = oxcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oxb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.b.invoke();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new oxb(this.a, fcxyVar);
    }
}
