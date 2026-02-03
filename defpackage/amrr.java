package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amrr extends fcyz implements fdat {
    final /* synthetic */ amsc a;
    final /* synthetic */ aoer b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amrr(fcxy fcxyVar, amsc amscVar, aoer aoerVar) {
        super(2, fcxyVar);
        this.a = amscVar;
        this.b = aoerVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amrr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(this.a.b.b(this.b.b()));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        amrr amrrVar = new amrr(fcxyVar, this.a, this.b);
        amrrVar.c = obj;
        return amrrVar;
    }
}
