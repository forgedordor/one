package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daqg extends fcyz implements fdat {
    int a;
    final /* synthetic */ daql b;
    final /* synthetic */ int c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daqg(fcxy fcxyVar, daql daqlVar, int i) {
        super(2, fcxyVar);
        this.b = daqlVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((daqg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        daql daqlVar = this.b;
        aeum aeumVarI = daqlVar.a().i(daqb.a(this.c), (cogw) daqlVar.b.b());
        this.a = 1;
        Object objC = daqlVar.c(aeumVarI, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        daqg daqgVar = new daqg(fcxyVar, this.b, this.c);
        daqgVar.d = obj;
        return daqgVar;
    }
}
