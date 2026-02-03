package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tza extends fcyz implements fdat {
    int a;
    final /* synthetic */ tzc b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tza(fcxy fcxyVar, tzc tzcVar) {
        super(2, fcxyVar);
        this.b = tzcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tza) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cpmc cpmcVar = (cpmc) this.b.a.b();
            evrv evrvVar = (evrv) evrw.a.createBuilder();
            evrvVar.a("box_devices");
            eiju eijuVarK = cpmcVar.k((evrw) evrvVar.build());
            eijuVarK.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarK, this);
            if (obj != fcylVar) {
            }
        }
        if (i != 1) {
            return obj;
        }
        eiju eijuVarA = ((txe) this.b.b.b()).a((eqiz) obj);
        this.a = 2;
        Object objC = fdxs.c(eijuVarA, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        tza tzaVar = new tza(fcxyVar, this.b);
        tzaVar.c = obj;
        return tzaVar;
    }
}
