package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dprj extends fcyz implements fdat {
    int a;
    final /* synthetic */ dprl b;
    final /* synthetic */ long c;
    final /* synthetic */ float d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dprj(dprl dprlVar, long j, float f, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dprlVar;
        this.c = j;
        this.d = f;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dprj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        dprl dprlVar = this.b;
        fdkf[] fdkfVarArr = {fdil.c(fdjxVar, null, new dprh(dprlVar, this.c, null), 3), fdil.c(fdjxVar, null, new dpri(dprlVar, this.d, null), 3)};
        this.a = 1;
        Object objB = fdii.b(fdkfVarArr, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dprj dprjVar = new dprj(this.b, this.c, this.d, fcxyVar);
        dprjVar.e = obj;
        return dprjVar;
    }
}
