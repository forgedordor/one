package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgty extends fcyz implements fdat {
    int a;
    final /* synthetic */ cgum b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgty(cgum cgumVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cgumVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgty) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cgum cgumVar = this.b;
            cgtx cgtxVar = new cgtx(null);
            this.a = 1;
            if (cgumVar.d.a(cgtxVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cgty(this.b, fcxyVar);
    }
}
