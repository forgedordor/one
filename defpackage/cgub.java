package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgub extends fcyz implements fdat {
    int a;
    final /* synthetic */ cgum b;
    final /* synthetic */ efwo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgub(cgum cgumVar, efwo efwoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cgumVar;
        this.c = efwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgub) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cgum cgumVar = this.b;
            cgua cguaVar = new cgua(this.c, null);
            this.a = 1;
            if (cgumVar.d.a(cguaVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cgub(this.b, this.c, fcxyVar);
    }
}
