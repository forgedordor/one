package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crxz extends fcyz implements fdat {
    int a;
    final /* synthetic */ cryb b;
    final /* synthetic */ eoeb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crxz(cryb crybVar, eoeb eoebVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = crybVar;
        this.c = eoebVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crxz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cryb crybVar = this.b;
            eoeb eoebVar = this.c;
            this.a = 1;
            if (crybVar.a(eoebVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crxz(this.b, this.c, fcxyVar);
    }
}
