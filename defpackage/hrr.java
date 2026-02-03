package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hrr extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdat b;
    final /* synthetic */ hox c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hrr(fdat fdatVar, hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdatVar;
        this.c = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hrr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.d;
            fdat fdatVar = this.b;
            hps hpsVar = new hps(this.c, fdjxVar.hE());
            this.a = 1;
            if (fdatVar.a(hpsVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        hrr hrrVar = new hrr(this.b, this.c, fcxyVar);
        hrrVar.d = obj;
        return hrrVar;
    }
}
