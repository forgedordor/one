package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbuw extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ccep c;
    final /* synthetic */ enba d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbuw(ccep ccepVar, enba enbaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ccepVar;
        this.d = enbaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbuw) c((cbum) obj, (fcxy) obj2)).b(fctx.a);
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
        enba enbaVar = this.d;
        this.a = 1;
        Object objH = cbumVar.h(ccepVar, enbaVar, this);
        return objH == fcylVar ? fcylVar : objH;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbuw cbuwVar = new cbuw(this.c, this.d, fcxyVar);
        cbuwVar.b = obj;
        return cbuwVar;
    }
}
