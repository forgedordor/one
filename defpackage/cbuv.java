package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbuv extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ccep c;
    final /* synthetic */ epsb d;
    final /* synthetic */ enba e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbuv(ccep ccepVar, epsb epsbVar, enba enbaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ccepVar;
        this.d = epsbVar;
        this.e = enbaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbuv) c((cbum) obj, (fcxy) obj2)).b(fctx.a);
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
        epsb epsbVar = this.d;
        enba enbaVar = this.e;
        this.a = 1;
        Object objG = cbumVar.g(ccepVar, epsbVar, enbaVar, this);
        return objG == fcylVar ? fcylVar : objG;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbuv cbuvVar = new cbuv(this.c, this.d, this.e, fcxyVar);
        cbuvVar.b = obj;
        return cbuvVar;
    }
}
