package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ergt implements erfu {
    public static final ergt a = new ergt();

    private ergt() {
    }

    @Override // defpackage.erfu
    public final Class a() {
        return ergr.class;
    }

    @Override // defpackage.erfu
    public final Class b() {
        return ergr.class;
    }

    @Override // defpackage.erfu
    public final /* synthetic */ Object c(erej erejVar, erep erepVar, erfq erfqVar) throws GeneralSecurityException {
        erwn erwnVarC;
        eqso eqsoVar = (eqso) erejVar;
        eqsn eqsnVarC = eqsoVar.c();
        HashMap map = new HashMap();
        for (int i = 0; i < erejVar.a(); i++) {
            eqsn eqsnVarB = eqsoVar.b(i);
            if (eqsnVarB.b.equals(eqsi.a)) {
                ergr ergrVar = (ergr) erfqVar.a(eqsnVarB);
                eqsg eqsgVar = eqsnVarB.a;
                if (eqsgVar instanceof erhg) {
                    erwnVarC = ((erhg) eqsgVar).c();
                } else {
                    if (!(eqsgVar instanceof eren)) {
                        throw new GeneralSecurityException(a.T(eqsgVar));
                    }
                    erwnVarC = ((eren) eqsgVar).b;
                }
                erfk.a(erwnVarC, ergrVar, map);
            }
        }
        int i2 = erfm.a;
        return new ergs();
    }
}
