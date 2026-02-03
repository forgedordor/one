package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpaf extends fcyz implements fdat {
    final /* synthetic */ dpao a;
    final /* synthetic */ doyu b;
    final /* synthetic */ Boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpaf(dpao dpaoVar, doyu doyuVar, Boolean bool, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dpaoVar;
        this.b = doyuVar;
        this.c = bool;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpaf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        doyo doyoVarBn = this.a.bn();
        doyu doyuVar = this.b;
        doyuVar.getClass();
        Boolean bool = this.c;
        bool.getClass();
        ((doyn) doyoVarBn).a.g(doyuVar.a, bool.booleanValue());
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpaf(this.a, this.b, this.c, fcxyVar);
    }
}
