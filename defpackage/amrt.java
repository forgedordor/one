package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amrt extends fcyz implements fdat {
    int a;
    final /* synthetic */ amsc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amrt(amsc amscVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = amscVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amrt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            amsc amscVar = this.b;
            this.a = 1;
            if (amscVar.g(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amrt(this.b, fcxyVar);
    }
}
