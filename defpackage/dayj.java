package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dayj extends fcyz implements fdat {
    int a;
    final /* synthetic */ daym b;
    final /* synthetic */ efwo c;
    final /* synthetic */ ctcj d;
    final /* synthetic */ chnc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dayj(daym daymVar, efwo efwoVar, ctcj ctcjVar, chnc chncVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = daymVar;
        this.c = efwoVar;
        this.d = ctcjVar;
        this.e = chncVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dayj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            daym daymVar = this.b;
            dauc daucVar = (dauc) daymVar.f.b();
            efwo efwoVar = this.c;
            String strA = ((dawe) daymVar.d.b()).a();
            if (strA == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            daucVar.a(efwoVar, strA, this.d, this.e);
            fdue fdueVar = daymVar.p;
            fctx fctxVar = fctx.a;
            this.a = 1;
            if (fdueVar.fO(fctxVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dayj(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
