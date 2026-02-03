package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuax extends fcyz implements fdat {
    int a;
    final /* synthetic */ cuay b;
    final /* synthetic */ ajpq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuax(cuay cuayVar, ajpq ajpqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cuayVar;
        this.c = ajpqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuax) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cuay cuayVar = this.b;
            alqm alqmVarB = this.c.b();
            aoer aoerVarD = cuayVar.d();
            this.a = 1;
            if (cuayVar.d.a(alqmVarB, aoerVarD, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cuax(this.b, this.c, fcxyVar);
    }
}
