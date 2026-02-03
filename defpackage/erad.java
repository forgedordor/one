package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erad {
    public static final erfp a = new erfn(eral.class, eqse.class, new erfo() { // from class: eraa
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) {
            return erur.b((eral) eqsgVar);
        }
    });
    public static final erfp b = new erfn(eram.class, eqsf.class, new erfo() { // from class: erab
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) {
            return erus.b((eram) eqsgVar);
        }
    });
    public static final eqsh c;
    public static final erer d;
    public static final erek e;

    static {
        erkw.a.getParserForType();
        e = new erek("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", eqse.class);
        erky.a.getParserForType();
        c = new erel("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", eqsf.class, 5);
        d = new erer() { // from class: erac
            @Override // defpackage.erer
            public final eqsg a(eqst eqstVar, Integer num) throws GeneralSecurityException {
                ECParameterSpec eCParameterSpec;
                erak erakVar = (erak) eqstVar;
                erag eragVar = erakVar.b;
                erfp erfpVar = erad.a;
                if (eragVar == erag.a) {
                    eCParameterSpec = erdw.a;
                } else if (eragVar == erag.b) {
                    eCParameterSpec = erdw.b;
                } else {
                    if (eragVar != erag.c) {
                        throw new GeneralSecurityException("Unsupported curve type: ".concat(String.valueOf(String.valueOf(eragVar))));
                    }
                    eCParameterSpec = erdw.c;
                }
                KeyPair keyPairC = erva.c(eCParameterSpec);
                return eral.e(eram.d(erakVar, ((ECPublicKey) keyPairC.getPublic()).getW(), num), new erwo(((ECPrivateKey) keyPairC.getPrivate()).getS()));
            }
        };
    }
}
