package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dyz extends fcyz implements fdat {
    final /* synthetic */ dwr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyz(dwr dwrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dwrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dyz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.r();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dyz(this.a, fcxyVar);
    }
}
