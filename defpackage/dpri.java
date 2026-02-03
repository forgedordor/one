package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpri extends fcyz implements fdat {
    int a;
    final /* synthetic */ dprl b;
    final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpri(dprl dprlVar, float f, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dprlVar;
        this.c = f;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpri) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        Float f = new Float(this.c);
        dew dewVarB = new dtgd().b();
        this.a = 1;
        Object objK = ddp.k(dprlVar.b, f, dewVarB, null, this, 12);
        return objK == fcylVar ? fcylVar : objK;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpri(this.b, this.c, fcxyVar);
    }
}
