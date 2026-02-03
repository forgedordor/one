package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eres {
    private final Map c = new HashMap();
    private static final erer b = new erer() { // from class: ereq
        @Override // defpackage.erer
        public final eqsg a(eqst eqstVar, Integer num) throws GeneralSecurityException {
            ermh ermhVar = ((ereo) eqstVar).a.b;
            eres eresVar = eres.a;
            erec erecVar = erec.a;
            eqsh eqshVarB = erecVar.b(ermhVar.b);
            if (!((Boolean) erecVar.b.get(ermhVar.b)).booleanValue()) {
                throw new GeneralSecurityException("Creating new keys is not allowed.");
            }
            erme ermeVarA = eqshVarB.a(ermhVar.c);
            String str = ermeVarA.b;
            evqs evqsVar = ermeVarA.c;
            int iB = ermd.b(ermeVarA.d);
            if (iB == 0) {
                iB = 1;
            }
            ermy ermyVarB = ermy.b(ermhVar.d);
            if (ermyVarB == null) {
                ermyVarB = ermy.UNRECOGNIZED;
            }
            return new eren(erfv.a(str, evqsVar, iB, ermyVarB, num));
        }
    };
    public static final eres a = c();

    private static eres c() {
        eres eresVar = new eres();
        try {
            eresVar.b(b, ereo.class);
            return eresVar;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public final synchronized eqsg a(eqst eqstVar, Integer num) {
        erer ererVar;
        ererVar = (erer) this.c.get(eqstVar.getClass());
        if (ererVar == null) {
            throw new GeneralSecurityException(a.I(eqstVar, "Cannot create a new key for parameters ", ": no key creator for this class was registered."));
        }
        return ererVar.a(eqstVar, num);
    }

    public final synchronized void b(erer ererVar, Class cls) {
        Map map = this.c;
        erer ererVar2 = (erer) map.get(cls);
        if (ererVar2 != null && !ererVar2.equals(ererVar)) {
            throw new GeneralSecurityException(a.b(cls, "Different key creator for parameters class ", " already inserted"));
        }
        map.put(cls, ererVar);
    }
}
