package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dyv extends fcyz implements fdat {
    int a;
    final /* synthetic */ isn b;
    final /* synthetic */ fdau c;
    final /* synthetic */ fdap d;
    final /* synthetic */ dwr e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyv(isn isnVar, fdau fdauVar, fdap fdapVar, dwr dwrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = isnVar;
        this.c = fdauVar;
        this.d = fdapVar;
        this.e = dwrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dyv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.f;
            isn isnVar = this.b;
            dyu dyuVar = new dyu(fdjxVar, this.c, this.d, this.e, null);
            this.a = 1;
            if (dvn.b(isnVar, dyuVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dyv dyvVar = new dyv(this.b, this.c, this.d, this.e, fcxyVar);
        dyvVar.f = obj;
        return dyvVar;
    }
}
