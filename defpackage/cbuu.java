package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbuu extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ccep c;
    final /* synthetic */ eprw d;
    final /* synthetic */ enba e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbuu(ccep ccepVar, eprw eprwVar, enba enbaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ccepVar;
        this.d = eprwVar;
        this.e = enbaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbuu) c((cbum) obj, (fcxy) obj2)).b(fctx.a);
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
        ccep ccepVar = this.c;
        eprw eprwVar = this.d;
        enba enbaVar = this.e;
        this.a = 1;
        Object objF = cbumVar.f(ccepVar, eprwVar, enbaVar, this);
        return objF == fcylVar ? fcylVar : objF;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbuu cbuuVar = new cbuu(this.c, this.d, this.e, fcxyVar);
        cbuuVar.b = obj;
        return cbuuVar;
    }
}
