package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxvp extends fcyz implements fdat {
    int a;
    final /* synthetic */ cxvq b;
    final /* synthetic */ cqce c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxvp(cxvq cxvqVar, cqce cqceVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cxvqVar;
        this.c = cqceVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxvp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            bnbw bnbwVarA = bncb.a();
            bnbwVarA.A("logLocalCmsKeys");
            ekgb ekgbVarZ = bnbwVarA.b().z();
            cxvq cxvqVar = this.b;
            cqce cqceVar = this.c;
            fcyh fcyhVarA = eicg.a(cxvqVar.f);
            cxvo cxvoVar = new cxvo(null, cqceVar, ekgbVarZ);
            this.a = 1;
            if (fdin.a(fcyhVarA, cxvoVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cxvp(this.b, this.c, fcxyVar);
    }
}
