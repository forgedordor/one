package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avjm extends fcyz implements fdat {
    int a;
    final /* synthetic */ avjn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avjm(avjn avjnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = avjnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avjm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Exception {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                avjo avjoVar = (avjo) this.b.c.b();
                this.a = 1;
                if (avjoVar.a(2, this) == fcylVar) {
                    return fcylVar;
                }
            }
        } catch (Exception e) {
            cczi ccziVar = avbs.j;
            if (((Boolean) ccziVar.e()).booleanValue() && (!((Boolean) ccziVar.e()).booleanValue() || !avcb.a(e))) {
                ((eksl) ((eksl) avjn.a.j()).g(e)).q("Encountered an exception during sync. Throwing an exception.");
                throw e;
            }
            ((eksl) ((eksl) avjn.a.e()).g(e)).q("Caught an exception during sync. Logging and skipping current sync");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new avjm(this.b, fcxyVar);
    }
}
