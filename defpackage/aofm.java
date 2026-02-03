package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aofm extends fcyz implements fdat {
    int a;
    final /* synthetic */ aofo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aofm(aofo aofoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aofoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aofm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aofo aofoVar = this.b;
            cliy cliyVar = aofoVar.b;
            cliyVar.i();
            fdvc fdvcVarH = cliyVar.h();
            aofl aoflVar = new aofl(aofoVar);
            this.a = 1;
            if (fdvcVarH.a(aoflVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aofm(this.b, fcxyVar);
    }
}
