package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avig extends fcyz implements fdat {
    int a;
    final /* synthetic */ avih b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avig(avih avihVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = avihVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avig) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Exception {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                avii aviiVar = (avii) this.b.c.b();
                this.a = 1;
                if (aviiVar.a(2, this) == fcylVar) {
                    return fcylVar;
                }
            }
        } catch (Exception e) {
            cczi ccziVar = avbs.j;
            if (((Boolean) ccziVar.e()).booleanValue() && (!((Boolean) ccziVar.e()).booleanValue() || !avcb.a(e))) {
                ((eksl) ((eksl) avih.a.j()).g(e)).q("Encountered an exception during sync. Throwing an exception.");
                throw e;
            }
            ((eksl) ((eksl) avih.a.e()).g(e)).q("Caught an exception during sync. Logging and skipping current sync");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new avig(this.b, fcxyVar);
    }
}
