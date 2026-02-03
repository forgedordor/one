package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dprh extends fcyz implements fdat {
    int a;
    final /* synthetic */ dprl b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dprh(dprl dprlVar, long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dprlVar;
        this.c = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dprh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dprl dprlVar = this.b;
        ihs ihsVar = new ihs(this.c);
        dew dewVarB = new dtgd().b();
        this.a = 1;
        Object objK = ddp.k(dprlVar.c, ihsVar, dewVarB, null, this, 12);
        return objK == fcylVar ? fcylVar : objK;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dprh(this.b, this.c, fcxyVar);
    }
}
