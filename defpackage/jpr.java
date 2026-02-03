package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jpr extends fcyz implements fdat {
    int a;
    final /* synthetic */ jpw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpr(jpw jpwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = jpwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jpr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            jpw jpwVar = this.b;
            this.a = 1;
            Object objS = jpwVar.a.r.s(this);
            if (objS != fcylVar) {
                objS = fctx.a;
            }
            if (objS == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new jpr(this.b, fcxyVar);
    }
}
