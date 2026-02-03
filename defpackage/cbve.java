package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbve extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ cbwd c;
    final /* synthetic */ cchc d;
    final /* synthetic */ evqs e;
    final /* synthetic */ aubq f;
    final /* synthetic */ enba g;
    final /* synthetic */ basd h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbve(cbwd cbwdVar, cchc cchcVar, evqs evqsVar, aubq aubqVar, enba enbaVar, basd basdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cbwdVar;
        this.d = cchcVar;
        this.e = evqsVar;
        this.f = aubqVar;
        this.g = enbaVar;
        this.h = basdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbve) c((cbum) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cbum cbumVar = (cbum) this.b;
        cbwd cbwdVar = this.c;
        cchc cchcVar = this.d;
        evqs evqsVar = this.e;
        aubq aubqVar = this.f;
        enba enbaVar = this.g;
        basd basdVar = this.h;
        this.a = 1;
        Object objP = cbumVar.p(cbwdVar, cchcVar, 1, evqsVar, aubqVar, enbaVar, basdVar, this);
        return objP == fcylVar ? fcylVar : objP;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbve cbveVar = new cbve(this.c, this.d, this.e, this.f, this.g, this.h, fcxyVar);
        cbveVar.b = obj;
        return cbveVar;
    }
}
