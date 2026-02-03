package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dley extends fcyz implements fdat {
    final /* synthetic */ dleo a;
    final /* synthetic */ hri b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dley(dleo dleoVar, hri hriVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dleoVar;
        this.b = hriVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dley) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dleo dleoVar = this.a;
        hri hriVar = this.b;
        hriVar.i(dleoVar.b);
        dleoVar.c.invoke((dlff) dleoVar.a.get(hriVar.c()));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dley(this.a, this.b, fcxyVar);
    }
}
