package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsnh extends fcyz implements fdat {
    int a;
    final /* synthetic */ dsni b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsnh(dsni dsniVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dsniVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsnh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        try {
            if (i == 0) {
                fctl.b(obj);
                eksp ekspVar = dsni.a;
                ekspVar.o().q("Executing PeriodicSyncJob");
                dsni dsniVar = this.b;
                if (!((Boolean) dsniVar.b.b()).booleanValue()) {
                    ekspVar.o().q("GrowthKit is disabled, aborting PeriodicSyncJob");
                    return new dxfx(fctx.a);
                }
                fcyh fcyhVar = dsniVar.e;
                dsng dsngVar = new dsng(dsniVar, null);
                this.a = 1;
                if (fdin.a(fcyhVar, dsngVar, this) != fcylVar) {
                }
            }
            if (i != 1) {
                fctl.b(obj);
                return obj;
            }
            fctl.b(obj);
            dsni.a.o().q("PeriodicSyncJob triggering a sync for all accounts");
            dsni dsniVar2 = this.b;
            evje evjeVar = evje.GROWTHKIT_PERIODIC_FETCH;
            this.a = 2;
            Object objA = dsniVar2.d.a(evjeVar, this);
            return objA == fcylVar ? fcylVar : objA;
        } catch (Exception e) {
            ((eksl) ((eksl) dsni.a.i()).g(e)).q("Failed to install security provider, GrowthKit sync can't run.");
            return new dxfq(e, 3);
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dsnh(this.b, fcxyVar);
    }
}
