package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avbx extends fcyz implements fdat {
    int a;
    final /* synthetic */ avby b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avbx(avby avbyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = avbyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avbx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            avco avcoVar = (avco) this.b.b.b();
            this.a = 1;
            Object objA = avcoVar.a(true, this);
            if (objA != fcylVar) {
                objA = fctx.a;
            }
            if (objA == fcylVar) {
                return fcylVar;
            }
        }
        ((eksl) avby.a.h()).q("Successfully scheduled periodic contacts import.");
        return new qao();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new avbx(this.b, fcxyVar);
    }
}
