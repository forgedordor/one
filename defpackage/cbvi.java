package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbvi extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ enba c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbvi(enba enbaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = enbaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbvi) c((cbum) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cbum cbumVar = (cbum) this.b;
            enba enbaVar = this.c;
            this.a = 1;
            if (cbumVar.t(enbaVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbvi cbviVar = new cbvi(this.c, fcxyVar);
        cbviVar.b = obj;
        return cbviVar;
    }
}
