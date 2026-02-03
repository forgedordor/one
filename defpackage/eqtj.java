package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqtj implements erfu {
    public static final eqtj a = new eqtj();
    public static final erfp b = new erfn(eren.class, eqrz.class, new erfo() { // from class: eqtg
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) throws GeneralSecurityException {
            byte[] bArrC;
            eren erenVar = (eren) eqsgVar;
            erfv erfvVar = erenVar.a;
            eqrz eqrzVar = (eqrz) erec.a.a(erfvVar.a, eqrz.class).c(erfvVar.c);
            ermy ermyVar = erfvVar.d;
            int iOrdinal = ermyVar.ordinal();
            if (iOrdinal == 1) {
                bArrC = erfc.b(erenVar.b().intValue()).c();
            } else if (iOrdinal == 2) {
                bArrC = erfc.a(erenVar.b().intValue()).c();
            } else if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(String.valueOf(ermyVar))));
                }
                bArrC = erfc.a(erenVar.b().intValue()).c();
            } else {
                bArrC = erfc.a.c();
            }
            return new eqyi(eqrzVar, bArrC);
        }
    });

    @Override // defpackage.erfu
    public final Class a() {
        return eqrz.class;
    }

    @Override // defpackage.erfu
    public final Class b() {
        return eqrz.class;
    }

    @Override // defpackage.erfu
    public final /* synthetic */ Object c(erej erejVar, erep erepVar, erfq erfqVar) throws GeneralSecurityException {
        erwn erwnVarC;
        HashMap map = new HashMap();
        for (int i = 0; i < erejVar.a(); i++) {
            eqsn eqsnVarB = ((eqso) erejVar).b(i);
            if (eqsnVarB.b.equals(eqsi.a)) {
                eqsg eqsgVar = eqsnVarB.a;
                if (eqsgVar instanceof eqtd) {
                    erwnVarC = ((eqtd) eqsgVar).c();
                } else {
                    if (!(eqsgVar instanceof eren)) {
                        throw new GeneralSecurityException(a.T(eqsgVar));
                    }
                    erwnVarC = ((eren) eqsgVar).b;
                }
                erfk.a(erwnVarC, new eqth((eqrz) erfqVar.a(eqsnVarB), eqsnVarB.c), map);
            }
        }
        if (!erepVar.a()) {
            erew.a.a();
        }
        eqso eqsoVar = (eqso) erejVar;
        return new eqti(new eqth((eqrz) erfqVar.a(eqsoVar.c()), eqsoVar.c().c), new erfm(map));
    }
}
