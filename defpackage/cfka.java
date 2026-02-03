package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfka extends fcyz implements fdat {
    int a;
    final /* synthetic */ cfjs b;
    final /* synthetic */ cfmy c;
    final /* synthetic */ epnf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfka(cfjs cfjsVar, cfmy cfmyVar, epnf epnfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cfjsVar;
        this.c = cfmyVar;
        this.d = epnfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfka) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cfjs cfjsVar = this.b;
        cfmy cfmyVar = this.c;
        epnf epnfVar = this.d;
        this.a = 1;
        Object objG = cfjsVar.g(cfmyVar, epnfVar, this);
        return objG == fcylVar ? fcylVar : objG;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cfka(this.b, this.c, this.d, fcxyVar);
    }
}
