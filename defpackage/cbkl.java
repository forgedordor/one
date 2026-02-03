package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbkl extends fcyz implements fdat {
    int a;
    final /* synthetic */ cbkq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbkl(cbkq cbkqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cbkqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbkl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        cbjy cbjyVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cbkq cbkqVar = this.b;
            if (cqbe.d()) {
                cbjyVar = cbjy.b;
            } else {
                double dA = (fddg.d(cbkqVar.d.f().toEpochMilli()).a(24) / 1.6777216E7f) % 1.0d;
                if (dA != 0.0d && Math.signum(dA) != Math.signum(1.0d)) {
                    dA += 1.0d;
                }
                cbjyVar = dA < ((double) ((Number) cbkq.b.e()).floatValue()) ? cbjy.b : cbjy.a;
            }
            this.a = 1;
            if (cbkqVar.d(cbjyVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cbkl(this.b, fcxyVar);
    }
}
