package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class ekxy {
    public static int a(ekya ekyaVar, ekxp ekxpVar) {
        return eonn.a(ekyaVar.a().k(), ekxpVar.d);
    }

    public static ekxp b(ekya ekyaVar) {
        return new ekxp(ekyaVar.a().k());
    }

    public static ekyj c(ekya ekyaVar) {
        return ekyj.m(b(ekyaVar).z());
    }

    public static boolean d(ekya ekyaVar, ekyj ekyjVar) {
        ekxp ekxpVarU = ekxp.u(ekyjVar);
        ekyaVar.b(ekxpVarU);
        if (!ekyaVar.d() && b(ekyaVar).y().I(ekxpVarU)) {
            return true;
        }
        if (ekyaVar.c()) {
            return false;
        }
        ekyaVar.e();
        return b(ekyaVar).x().C(ekxpVarU);
    }

    public static int e(ekya ekyaVar, ekxp ekxpVar) {
        ekyaVar.b(ekxpVar.y());
        if (!ekyaVar.d()) {
            if (b(ekyaVar).C(ekxpVar) && b(ekyaVar).y().I(ekxpVar)) {
                return 1;
            }
            if (b(ekyaVar).I(ekxpVar.x())) {
                return 2;
            }
        }
        if (ekyaVar.c()) {
            return 3;
        }
        ekyaVar.e();
        return b(ekyaVar).x().C(ekxpVar) ? 1 : 3;
    }
}
