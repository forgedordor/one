package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hqm extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdau b;
    final /* synthetic */ hoq c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqm(fdau fdauVar, hoq hoqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdauVar;
        this.c = hoqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hqm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.d;
            fdau fdauVar = this.b;
            hoq hoqVar = this.c;
            this.a = 1;
            if (fdauVar.a(fdjxVar, hoqVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        hqm hqmVar = new hqm(this.b, this.c, fcxyVar);
        hqmVar.d = obj;
        return hqmVar;
    }
}
