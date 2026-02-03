package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fxf extends fcyz implements fdat {
    int a;
    final /* synthetic */ fxg b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxf(fxg fxgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fxgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fxf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.c;
            fxg fxgVar = this.b;
            fxe fxeVar = new fxe(fxgVar, fdjxVar);
            this.a = 1;
            if (fdum.g((fdum) fxgVar.h.a, fxeVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fxf fxfVar = new fxf(this.b, fcxyVar);
        fxfVar.c = obj;
        return fxfVar;
    }
}
