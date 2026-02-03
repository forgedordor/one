package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnjg extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnjh b;
    final /* synthetic */ dnnp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnjg(dnjh dnjhVar, dnnp dnnpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnjhVar;
        this.c = dnnpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnjg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dnjh dnjhVar = this.b;
            dnnp dnnpVar = this.c;
            this.a = 1;
            if (dnjhVar.c.b(dnnpVar.a, dnnpVar.b, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnjg(this.b, this.c, fcxyVar);
    }
}
