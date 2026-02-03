package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzf extends fcyz implements fdat {
    final /* synthetic */ aoer a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vzf(fcxy fcxyVar, aoer aoerVar) {
        super(2, fcxyVar);
        this.a = aoerVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vzf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(this.a.w());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        vzf vzfVar = new vzf(fcxyVar, this.a);
        vzfVar.b = obj;
        return vzfVar;
    }
}
