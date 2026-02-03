package defpackage;

import java.security.GeneralSecurityException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ertq implements erfu {
    public static final ertq a = new ertq();
    public static final erfp b = new erfn(eren.class, eqsz.class, new erfo() { // from class: ertp
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) {
            erfv erfvVar = ((eren) eqsgVar).a;
            return (eqsz) erec.a.a(erfvVar.a, eqsz.class).c(erfvVar.c);
        }
    });

    @Override // defpackage.erfu
    public final Class a() {
        return eqsz.class;
    }

    @Override // defpackage.erfu
    public final Class b() {
        return eqsz.class;
    }

    @Override // defpackage.erfu
    public final /* bridge */ /* synthetic */ Object c(erej erejVar, erep erepVar, erfq erfqVar) throws GeneralSecurityException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < erejVar.a(); i++) {
            eqsn eqsnVarB = ((eqso) erejVar).b(i);
            if (eqsnVarB.b.equals(eqsi.a)) {
                arrayList.add((eqsz) erfqVar.a(eqsnVarB));
            }
        }
        eqsz eqszVar = (eqsz) erfqVar.a(((eqso) erejVar).c());
        if (eqszVar != null) {
            return new ertm(arrayList, eqszVar);
        }
        throw new GeneralSecurityException("No primary set");
    }
}
