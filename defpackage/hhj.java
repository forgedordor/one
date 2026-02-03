package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hhj extends fcyz implements fdat {
    int a;
    final /* synthetic */ isn b;
    final /* synthetic */ hcj c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhj(isn isnVar, hcj hcjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = isnVar;
        this.c = hcjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hhj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.d;
            isn isnVar = this.b;
            hhi hhiVar = new hhi(fdjxVar, this.c, null);
            this.a = 1;
            if (dvn.b(isnVar, hhiVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        hhj hhjVar = new hhj(this.b, this.c, fcxyVar);
        hhjVar.d = obj;
        return hhjVar;
    }
}
