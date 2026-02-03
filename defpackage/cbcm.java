package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbcm extends fcyz implements fdat {
    int a;
    final /* synthetic */ cbcr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbcm(cbcr cbcrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cbcrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbcm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            Object objE = cbcr.a.e();
            objE.getClass();
            long jLongValue = ((Number) objE).longValue();
            this.a = 1;
            if (fdkj.c(jLongValue, this) == fcylVar) {
                return fcylVar;
            }
        }
        fdue fdueVar = this.b.d;
        fctx fctxVar = fctx.a;
        fdueVar.h(fctxVar);
        return fctxVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cbcm(this.b, fcxyVar);
    }
}
