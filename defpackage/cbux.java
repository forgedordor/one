package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbux extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ int c;
    final /* synthetic */ enba d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbux(int i, enba enbaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = i;
        this.d = enbaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbux) c((cbum) obj, (fcxy) obj2)).b(fctx.a);
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
        int i2 = this.c;
        enba enbaVar = this.d;
        this.a = 1;
        Object objI = cbumVar.i(i2, enbaVar, this);
        return objI == fcylVar ? fcylVar : objI;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbux cbuxVar = new cbux(this.c, this.d, fcxyVar);
        cbuxVar.b = obj;
        return cbuxVar;
    }
}
