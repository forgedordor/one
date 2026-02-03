package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqzr implements erfu {
    public static final eqzr a = new eqzr();
    public static final erfp b = new erfn(eren.class, eqsd.class, new erfo() { // from class: eqzo
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) throws GeneralSecurityException {
            eren erenVar = (eren) eqsgVar;
            erfv erfvVar = erenVar.a;
            ermy ermyVar = erfvVar.d;
            int iOrdinal = ermyVar.ordinal();
            if (iOrdinal == 1) {
                erfc.b(erenVar.b().intValue()).c();
            } else if (iOrdinal == 2) {
                erfc.a(erenVar.b().intValue()).c();
            } else if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new GeneralSecurityException(a.U(ermyVar, "unknown output prefix type "));
                }
                erfc.a(erenVar.b().intValue()).c();
            } else {
                erfc.a.c();
            }
            return new eqzz();
        }
    });

    @Override // defpackage.erfu
    public final Class a() {
        return eqsd.class;
    }

    @Override // defpackage.erfu
    public final Class b() {
        return eqsd.class;
    }

    @Override // defpackage.erfu
    public final /* synthetic */ Object c(erej erejVar, erep erepVar, erfq erfqVar) throws GeneralSecurityException {
        erwn erwnVarC;
        HashMap map = new HashMap();
        for (int i = 0; i < erejVar.a(); i++) {
            eqsn eqsnVarB = ((eqso) erejVar).b(i);
            if (eqsnVarB.b.equals(eqsi.a)) {
                eqsg eqsgVar = eqsnVarB.a;
                if (eqsgVar instanceof eqzm) {
                    erwnVarC = ((eqzm) eqsgVar).c();
                } else {
                    if (!(eqsgVar instanceof eren)) {
                        throw new GeneralSecurityException(a.T(eqsgVar));
                    }
                    erwnVarC = ((eren) eqsgVar).b;
                }
                int i2 = eqsnVarB.c;
                erfk.a(erwnVarC, new eqzp(), map);
            }
        }
        if (!erepVar.a()) {
            erew.a.a();
        }
        eqso eqsoVar = (eqso) erejVar;
        eqsoVar.c();
        int i3 = erfm.a;
        return new eqzq();
    }
}
