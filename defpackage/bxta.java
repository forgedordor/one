package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxta extends fcyz implements fdat {
    int a;
    final /* synthetic */ bxtd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxta(bxtd bxtdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bxtdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bxta) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            bxtd bxtdVar = this.b;
            bxsz bxszVar = new bxsz(null);
            this.a = 1;
            if (bxtdVar.a.a(bxszVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bxta(this.b, fcxyVar);
    }
}
