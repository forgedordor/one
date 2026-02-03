package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxop extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxoq b;
    final /* synthetic */ evjz c;
    final /* synthetic */ dxha d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxop(dxoq dxoqVar, evjz evjzVar, dxha dxhaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxoqVar;
        this.c = evjzVar;
        this.d = dxhaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxop) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        fdjx fdjxVar = (fdjx) this.e;
        dxoq dxoqVar = this.b;
        evjz evjzVar = this.c;
        dxha dxhaVar = this.d;
        this.a = 1;
        Object objH = dxoq.h(dxoqVar, fdjxVar, evjzVar, true, dxhaVar, this);
        return objH == fcylVar ? fcylVar : objH;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dxop dxopVar = new dxop(this.b, this.c, this.d, fcxyVar);
        dxopVar.e = obj;
        return dxopVar;
    }
}
