package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dvf extends fcyz implements fdat {
    int a;
    final /* synthetic */ dvh b;
    final /* synthetic */ long c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvf(dvh dvhVar, long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dvhVar;
        this.c = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.d;
            dvh dvhVar = this.b;
            long j = this.c;
            fdau fdauVar = dvhVar.d;
            ihs ihsVar = new ihs(j);
            this.a = 1;
            if (fdauVar.a(fdjxVar, ihsVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dvf dvfVar = new dvf(this.b, this.c, fcxyVar);
        dvfVar.d = obj;
        return dvfVar;
    }
}
