package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aadv extends fcyz implements fdat {
    int a;
    final /* synthetic */ aady b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aadv(aady aadyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aadyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aadv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aady aadyVar = this.b;
            fdpl fdplVarE = aadyVar.a.e();
            aadu aaduVar = new aadu(aadyVar);
            this.a = 1;
            if (fdplVarE.a(aaduVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aadv(this.b, fcxyVar);
    }
}
