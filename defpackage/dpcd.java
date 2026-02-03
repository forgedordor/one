package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpcd extends fcyz implements fdax {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ int e;
    final /* synthetic */ dpcf f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpcd(dpcf dpcfVar, fcxy fcxyVar) {
        super(6, fcxyVar);
        this.f = dpcfVar;
    }

    @Override // defpackage.fdax
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int iIntValue = ((Number) obj5).intValue();
        dpcd dpcdVar = new dpcd(this.f, (fcxy) obj6);
        dpcdVar.a = (dpuv) obj;
        dpcdVar.b = (dpjd) obj2;
        dpcdVar.c = (dpzj) obj3;
        dpcdVar.d = (dpyr) obj4;
        dpcdVar.e = iIntValue;
        return dpcdVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [dpyr, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        dplj dpliVar;
        fctl.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        ?? r2 = this.d;
        int i = this.e;
        dpuv dpuvVar = (dpuv) obj2;
        int iOrdinal = dpuvVar.ordinal();
        dpcf dpcfVar = this.f;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                int iC = dpcfVar.j.c(dpuvVar);
                obj4.getClass();
                dpzi dpziVar = (dpzi) obj4;
                dplk dplkVarO = dpcfVar.o((dpjd) obj3);
                dpliVar = dplkVarO instanceof dplj ? (dplj) dplkVarO : null;
                if (dpliVar == null) {
                    dpliVar = new dpli(0, dpcfVar.c.c());
                }
                return new dpym(r2, iC, dpziVar, dpliVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new fctg();
                }
                dplk dplkVarO2 = dpcfVar.o((dpjd) obj3);
                if (dplkVarO2 instanceof dplj) {
                    return new dpys((dplj) dplkVarO2);
                }
                if (fdbq.f(dplkVarO2, dplf.a)) {
                    return dpyk.a;
                }
                throw new fctg();
            }
        }
        if (!(obj4 instanceof dpzd)) {
            if (obj4 instanceof dpyw) {
                return dpyk.a;
            }
            obj4.getClass();
            return new dpyl(r2, i, (dpzi) obj4);
        }
        dplk dplkVarO3 = dpcfVar.o((dpjd) obj3);
        dpliVar = dplkVarO3 instanceof dplj ? (dplj) dplkVarO3 : null;
        if (dpliVar == null) {
            dpliVar = new dpli(0, dpcfVar.c.c());
        }
        return new dpys(dpliVar);
    }
}
