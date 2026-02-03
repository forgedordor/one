package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fxk extends fcyz implements fdat {
    int a;
    final /* synthetic */ fxl b;
    final /* synthetic */ ddz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxk(fxl fxlVar, ddz ddzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fxlVar;
        this.c = ddzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fxk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fxl fxlVar = this.b;
            Float f = new Float(0.0f);
            ddz ddzVar = this.c;
            this.a = 1;
            if (ddp.k(fxlVar.c, f, ddzVar, null, this, 12) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fxk(this.b, this.c, fcxyVar);
    }
}
