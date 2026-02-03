package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccye extends fcyz implements fdat {
    int a;
    final /* synthetic */ ccyf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccye(ccyf ccyfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ccyfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccye) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ccyf ccyfVar = this.b;
            ccyd ccydVar = new ccyd(null);
            this.a = 1;
            if (ccyfVar.c.a(ccydVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        this.b.d.c = 1;
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ccye(this.b, fcxyVar);
    }
}
