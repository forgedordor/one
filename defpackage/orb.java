package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class orb extends fcyz implements fdat {
    int a;
    final /* synthetic */ orc b;
    final /* synthetic */ ovx c;
    final /* synthetic */ orr d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public orb(orc orcVar, ovx ovxVar, orr orrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = orcVar;
        this.c = ovxVar;
        this.d = orrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((orb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdjx fdjxVar;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            fdjxVar = (fdjx) this.e;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            fdjx fdjxVar2 = (fdjx) this.e;
            orc orcVar = this.b;
            ovx ovxVar = this.c;
            this.e = fdjxVar2;
            this.a = 1;
            Object objC = orcVar.a.c(ovxVar, this);
            if (objC == fcylVar) {
                return fcylVar;
            }
            fdjxVar = fdjxVar2;
            obj = objC;
        }
        orc orcVar2 = this.b;
        owc owcVar = (owc) obj;
        if (orcVar2.a.h()) {
            orcVar2.a();
            return fctx.a;
        }
        fdil.d(fdjxVar, orcVar2.b, null, new ora(owcVar, orcVar2, this.d, null), 2);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        orb orbVar = new orb(this.b, this.c, this.d, fcxyVar);
        orbVar.e = obj;
        return orbVar;
    }
}
