package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfoi extends fcyz implements fdat {
    final /* synthetic */ cfoj a;
    final /* synthetic */ cfmy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfoi(cfoj cfojVar, cfmy cfmyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cfojVar;
        this.b = cfmyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfoi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        epfq epfqVar = (epfq) epfr.a.createBuilder();
        epfqVar.getClass();
        epfs.b(((bvkr) this.a.a.b()).s(((cfjg) this.b).c), epfqVar);
        return epfs.a(epfqVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cfoi(this.a, this.b, fcxyVar);
    }
}
