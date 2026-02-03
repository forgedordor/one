package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dyr extends fcyz implements fdat {
    final /* synthetic */ dwr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyr(dwr dwrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dwrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dyr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.q();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dyr(this.a, fcxyVar);
    }
}
