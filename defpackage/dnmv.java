package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnmv extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnmw b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnmv(dnmw dnmwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnmwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnmv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.c;
            dnmw dnmwVar = this.b;
            fdkf[] fdkfVarArr = {fdil.c(fdjxVar, null, new dnms(dnmwVar, null), 3), fdil.c(fdjxVar, null, new dnmt(dnmwVar, null), 3), fdil.c(fdjxVar, null, new dnmu(dnmwVar, null), 3)};
            this.a = 1;
            if (fdii.b(fdkfVarArr, this) == fcylVar) {
                return fcylVar;
            }
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dnmv dnmvVar = new dnmv(this.b, fcxyVar);
        dnmvVar.c = obj;
        return dnmvVar;
    }
}
