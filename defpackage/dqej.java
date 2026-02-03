package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqej extends fcyz implements fdat {
    int a;
    private /* synthetic */ Object b;

    public dqej(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqej) c((dqee) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dqee dqeeVar = (dqee) this.b;
            this.a = 1;
            if (dqeeVar.g(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dqej dqejVar = new dqej(fcxyVar);
        dqejVar.b = obj;
        return dqejVar;
    }
}
