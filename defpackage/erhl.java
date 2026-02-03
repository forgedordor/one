package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erhl implements erfu {
    public static final erhl a = new erhl();
    public static final erfp b = new erfn(eren.class, eqss.class, new erfo() { // from class: erhi
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) throws GeneralSecurityException {
            eren erenVar = (eren) eqsgVar;
            erfv erfvVar = erenVar.a;
            int iOrdinal = erfvVar.d.ordinal();
            if (iOrdinal == 1) {
                erfc.b(erenVar.b().intValue()).c();
            } else if (iOrdinal == 2) {
                erfc.a(erenVar.b().intValue()).c();
            } else if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
                erfc.a(erenVar.b().intValue()).c();
            } else {
                erfc.a.c();
            }
            return new erif();
        }
    });

    @Override // defpackage.erfu
    public final Class a() {
        return eqss.class;
    }

    @Override // defpackage.erfu
    public final Class b() {
        return eqss.class;
    }

    @Override // defpackage.erfu
    public final /* synthetic */ Object c(erej erejVar, erep erepVar, erfq erfqVar) throws GeneralSecurityException {
        erwn erwnVarC;
        HashMap map = new HashMap();
        for (int i = 0; i < erejVar.a(); i++) {
            eqsn eqsnVarB = ((eqso) erejVar).b(i);
            if (eqsnVarB.b.equals(eqsi.a)) {
                eqsg eqsgVar = eqsnVarB.a;
                if (eqsgVar instanceof erhg) {
                    erwnVarC = ((erhg) eqsgVar).c();
                } else {
                    if (!(eqsgVar instanceof eren)) {
                        throw new GeneralSecurityException(a.T(eqsgVar));
                    }
                    erwnVarC = ((eren) eqsgVar).b;
                }
                int i2 = eqsnVarB.c;
                erfk.a(erwnVarC, new erhj(), map);
            }
        }
        if (!erepVar.a()) {
            erew.a.a();
        }
        eqso eqsoVar = (eqso) erejVar;
        eqsoVar.c();
        int i3 = erfm.a;
        return new erhk();
    }
}
