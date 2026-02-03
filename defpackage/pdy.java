package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pdy extends fcyz implements fdat {
    int a;
    final /* synthetic */ pdz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdy(pdz pdzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = pdzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((pdy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            pdz pdzVar = this.b;
            this.a = 1;
            if (pdzVar.a(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new pdy(this.b, fcxyVar);
    }
}
