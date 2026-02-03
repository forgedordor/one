package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbkm extends fcyz implements fdat {
    int a;
    final /* synthetic */ cbkq b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbkm(fcxy fcxyVar, cbkq cbkqVar) {
        super(2, fcxyVar);
        this.b = cbkqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbkm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cbkq cbkqVar = this.b;
        this.a = 1;
        Object objC = cbkqVar.c(this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbkm cbkmVar = new cbkm(fcxyVar, this.b);
        cbkmVar.c = obj;
        return cbkmVar;
    }
}
