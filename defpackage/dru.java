package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dru extends fcyz implements fdat {
    int a;
    final /* synthetic */ drv b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dru(drv drvVar, long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = drvVar;
        this.c = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dru) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            drv drvVar = this.b;
            long jE = kjo.e(this.c, drvVar.k() ? -1.0f : 1.0f);
            float fB = drvVar.b == dwm.a ? kjo.b(jE) : kjo.a(jE);
            this.a = 1;
            if (drvVar.g(fB, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dru(this.b, this.c, fcxyVar);
    }
}
