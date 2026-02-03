package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpiy extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ dpjc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpiy(dpjc dpjcVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dpjcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpiy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            obj2 = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            dpjc dpjcVar = this.c;
            this.a = dpjcVar;
            this.b = 1;
            dplc dplcVar = (dplc) dpjcVar.c;
            Object objC = dplcVar.d.c("KeyboardDataPersistenceProtoDataStore#savedKeyboardData", new dplb(dplcVar, null), this);
            if (objC == fcylVar) {
                return fcylVar;
            }
            obj2 = dpjcVar;
            obj = objC;
        }
        dple dpleVar = (dple) obj;
        dpleVar.getClass();
        if (true == fdbq.f(dpleVar, dple.a)) {
            dpleVar = null;
        }
        if (dpleVar != null) {
            dpjc dpjcVar2 = (dpjc) obj2;
            dpjcVar2.i = dpleVar.c;
            dpjcVar2.j = dpleVar.d;
        }
        dpjc dpjcVar3 = (dpjc) obj2;
        if (!dpjcVar3.h) {
            Integer numValueOf = Integer.valueOf(dpgx.f(dpjcVar3.b) ? dpjcVar3.i : dpjcVar3.j);
            Integer num = numValueOf.intValue() >= 0 ? numValueOf : null;
            if (num != null) {
                dpjcVar3.o(num.intValue());
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpiy(this.c, fcxyVar);
    }
}
