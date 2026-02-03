package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbvd extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ cbwd c;
    final /* synthetic */ eyxu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbvd(cbwd cbwdVar, eyxu eyxuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cbwdVar;
        this.d = eyxuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbvd) c((cbum) obj, (fcxy) obj2)).b(fctx.a);
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
        eyxu eyxuVar = this.d;
        this.a = 1;
        Object objO = cbumVar.o(cbwdVar, eyxuVar, this);
        return objO == fcylVar ? fcylVar : objO;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbvd cbvdVar = new cbvd(this.c, this.d, fcxyVar);
        cbvdVar.b = obj;
        return cbvdVar;
    }
}
