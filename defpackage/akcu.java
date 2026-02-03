package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akcu extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;

    public akcu(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akcu) c((aoer) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarB = ((aoer) this.b).f().b();
            eijuVarB.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return Boolean.valueOf(((aoio) obj).a());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        akcu akcuVar = new akcu(fcxyVar);
        akcuVar.b = obj;
        return akcuVar;
    }
}
