package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avci extends fcyz implements fdat {
    int a;
    final /* synthetic */ avco b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avci(avco avcoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = avcoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avci) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            avco avcoVar = this.b;
            this.a = 1;
            ((eksl) avco.a.h()).q("Stopping contacts sync");
            ((avjf) avcoVar.c.b()).c();
            Object objC = fdxs.c(((egsh) avcoVar.e.b()).a("ContactsSyncPeriodicImportScheduler"), this);
            if (objC != obj2) {
                objC = fctx.a;
            }
            if (objC == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new avci(this.b, fcxyVar);
    }
}
