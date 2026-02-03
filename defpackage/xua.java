package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xua extends fcyz implements fdat {
    int a;
    final /* synthetic */ xuj b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xua(xuj xujVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xujVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xua) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ccwi ccwiVar = (ccwi) this.b.b.b();
            String str = this.c;
            amrb amrbVar = amrb.a;
            this.a = 1;
            obj = ccwiVar.e(str, amrbVar);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ((Number) obj).intValue();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xua(this.b, this.c, fcxyVar);
    }
}
