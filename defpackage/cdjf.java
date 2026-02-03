package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdjf extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdjg b;
    final /* synthetic */ bzzx c;
    final /* synthetic */ cayy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdjf(cdjg cdjgVar, bzzx bzzxVar, cayy cayyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cdjgVar;
        this.c = bzzxVar;
        this.d = cayyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdjf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cdjg cdjgVar = this.b;
        if (cdjgVar.b.isEmpty()) {
            return cbcw.k();
        }
        bzzx bzzxVar = this.c;
        if ((bzzxVar.b & 1) == 0) {
            cdjg.a.r("Get GaiaAuthCheckResult not performed because accountId is not present");
            return cbcw.k();
        }
        int i2 = bzzxVar.c;
        cayy cayyVar = this.d;
        this.a = 1;
        Object objK = cdjgVar.k(i2, cayyVar, this);
        return objK == fcylVar ? fcylVar : objK;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cdjf(this.b, this.c, this.d, fcxyVar);
    }
}
