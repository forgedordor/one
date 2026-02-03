package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erbl implements erfu {
    public static final erbl a = new erbl();
    public static final erfp b = new erfn(eren.class, eqse.class, new erfo() { // from class: erbi
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) throws GeneralSecurityException {
            byte[] bArrC;
            eren erenVar = (eren) eqsgVar;
            erfv erfvVar = erenVar.a;
            eqse eqseVar = (eqse) erec.a.a(erfvVar.a, eqse.class).c(erfvVar.c);
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
            return new ercw(eqseVar, bArrC);
        }
    });

    @Override // defpackage.erfu
    public final Class a() {
        return eqse.class;
    }

    @Override // defpackage.erfu
    public final Class b() {
        return eqse.class;
    }

    @Override // defpackage.erfu
    public final /* synthetic */ Object c(erej erejVar, erep erepVar, erfq erfqVar) throws GeneralSecurityException {
        erwn erwnVarG;
        HashMap map = new HashMap();
        for (int i = 0; i < erejVar.a(); i++) {
            eqsn eqsnVarB = ((eqso) erejVar).b(i);
            if (eqsnVarB.b.equals(eqsi.a)) {
                eqse eqseVar = (eqse) erfqVar.a(eqsnVarB);
                eqsg eqsgVar = eqsnVarB.a;
                if (eqsgVar instanceof erbs) {
                    erwnVarG = ((erbs) eqsgVar).g();
                } else {
                    if (!(eqsgVar instanceof eren)) {
                        throw new GeneralSecurityException(a.T(eqsgVar));
                    }
                    erwnVarG = ((eren) eqsgVar).b;
                }
                erfk.a(erwnVarG, new erbj(eqseVar, eqsnVarB.c), map);
            }
        }
        if (!erepVar.a()) {
            erew.a.a();
        }
        return new erbk(new erfm(map));
    }
}
