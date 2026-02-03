package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctpf extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctph b;
    final /* synthetic */ ajpk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctpf(ctph ctphVar, ajpk ajpkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ctphVar;
        this.c = ajpkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctpf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ctph ctphVar = this.b;
            ajpk ajpkVar = this.c;
            aoer aoerVar = (aoer) ctphVar.d.a().c();
            this.a = 1;
            if (ctphVar.b.a(ajpkVar.a, aoerVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctpf(this.b, this.c, fcxyVar);
    }
}
