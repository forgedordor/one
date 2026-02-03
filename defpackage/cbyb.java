package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbyb extends fcyz implements fdat {
    int a;
    final /* synthetic */ cbyh b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbyb(fcxy fcxyVar, cbyh cbyhVar) {
        super(2, fcxyVar);
        this.b = cbyhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbyb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cbyh cbyhVar = this.b;
        this.a = 1;
        Object objX = cbyhVar.x(this);
        return objX == fcylVar ? fcylVar : objX;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbyb cbybVar = new cbyb(fcxyVar, this.b);
        cbybVar.c = obj;
        return cbybVar;
    }
}
