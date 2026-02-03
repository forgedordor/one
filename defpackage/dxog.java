package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxog extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxoq b;
    final /* synthetic */ evjz c;
    final /* synthetic */ dxha d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxog(dxoq dxoqVar, evjz evjzVar, dxha dxhaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxoqVar;
        this.c = evjzVar;
        this.d = dxhaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxog) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        Object objH = dxoq.h(dxoqVar, fdjxVar, evjzVar, false, dxhaVar, this);
        return objH == fcylVar ? fcylVar : objH;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dxog dxogVar = new dxog(this.b, this.c, this.d, fcxyVar);
        dxogVar.e = obj;
        return dxogVar;
    }
}
