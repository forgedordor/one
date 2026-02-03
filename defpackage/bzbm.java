package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzbm extends fcyz implements fdat {
    int a;
    final /* synthetic */ bzbx b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzbm(bzbx bzbxVar, String str, String str2, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bzbxVar;
        this.c = str;
        this.d = str2;
        this.e = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzbm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objG;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            objG = ((fctk) obj).a;
        } else {
            bzbx bzbxVar = this.b;
            String str = this.c;
            String str2 = this.d;
            int i2 = this.e;
            this.a = 1;
            objG = bzbxVar.g(true, str, str2, i2, this);
            if (objG == fcylVar) {
                return fcylVar;
            }
        }
        Throwable thC = fctk.c(objG);
        if (thC != null) {
            try {
                if (!(thC instanceof bzde) && !(thC instanceof bzfm)) {
                    throw thC;
                }
                objG = null;
            } catch (Throwable th) {
                objG = fctl.a(th);
            }
        }
        fctl.b(objG);
        return true;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bzbm(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
