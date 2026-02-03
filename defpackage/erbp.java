package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erbp implements erfu {
    public static final erbp a = new erbp();
    public static final erfp b = new erfn(eren.class, eqsf.class, new erfo() { // from class: erbm
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) throws GeneralSecurityException {
            byte[] bArrC;
            eren erenVar = (eren) eqsgVar;
            erfv erfvVar = erenVar.a;
            eqsf eqsfVar = (eqsf) erec.a.a(erfvVar.a, eqsf.class).c(erfvVar.c);
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
            return new ercx(eqsfVar, bArrC);
        }
    });

    @Override // defpackage.erfu
    public final Class a() {
        return eqsf.class;
    }

    @Override // defpackage.erfu
    public final Class b() {
        return eqsf.class;
    }

    @Override // defpackage.erfu
    public final /* bridge */ /* synthetic */ Object c(erej erejVar, erep erepVar, erfq erfqVar) {
        if (!erepVar.a()) {
            erew.a.a();
        }
        return new erbo(new erbn((eqsf) erfqVar.a(((eqso) erejVar).c())));
    }
}
