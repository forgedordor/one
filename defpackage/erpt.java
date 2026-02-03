package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erpt implements erfu {
    public static final erpt a = new erpt();
    public static final erfp b = new erfn(eren.class, eqsw.class, new erfo() { // from class: erpq
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) {
            erfv erfvVar = ((eren) eqsgVar).a;
            return new errp((eqsw) erec.a.a(erfvVar.a, eqsw.class).c(erfvVar.c), errp.c(erfvVar), errp.b(erfvVar));
        }
    });

    @Override // defpackage.erfu
    public final Class a() {
        return eqsw.class;
    }

    @Override // defpackage.erfu
    public final Class b() {
        return eqsw.class;
    }

    @Override // defpackage.erfu
    public final /* synthetic */ Object c(erej erejVar, erep erepVar, erfq erfqVar) throws GeneralSecurityException {
        erwn erwnVarC;
        HashMap map = new HashMap();
        for (int i = 0; i < erejVar.a(); i++) {
            eqsn eqsnVarB = ((eqso) erejVar).b(i);
            if (eqsnVarB.b.equals(eqsi.a)) {
                eqsw eqswVar = (eqsw) erfqVar.a(eqsnVarB);
                eqsg eqsgVar = eqsnVarB.a;
                if (eqsgVar instanceof erqv) {
                    erwnVarC = ((erqv) eqsgVar).c();
                } else {
                    if (!(eqsgVar instanceof eren)) {
                        throw new GeneralSecurityException(a.T(eqsgVar));
                    }
                    erwnVarC = ((eren) eqsgVar).b;
                }
                erfk.a(erwnVarC, new erpr(eqswVar, eqsnVarB.c), map);
            }
        }
        if (!erepVar.a()) {
            erew.a.a();
        }
        return new erps(new erfm(map));
    }
}
