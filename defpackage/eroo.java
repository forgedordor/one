package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.Provider;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPublicKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eroo {
    public static final erfp a = new erfn(eroi.class, eqsv.class, new erfo() { // from class: erol
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) {
            eroi eroiVar = (eroi) eqsgVar;
            Provider providerA = erdl.a();
            ervp ervpVar = (ervp) erre.c.a(eroiVar.a().c);
            eroiVar.g().c();
            eroiVar.a().d.equals(erof.c);
            return new errd(ervpVar);
        }
    });
    public static final erfp b = new erfn(erok.class, eqsw.class, new erfo() { // from class: erom
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) {
            erok erokVar = (erok) eqsgVar;
            erog erogVar = erokVar.a;
            eroc erocVar = erogVar.b;
            byte[] bArr = erre.a;
            Provider providerA = erdl.a();
            return new erre((ECPublicKey) (providerA != null ? KeyFactory.getInstance("EC", providerA) : (KeyFactory) ervg.g.a("EC")).generatePublic(new ECPublicKeySpec(erokVar.b, erva.g((erux) erre.e.a(erocVar)))), (ervp) erre.c.a(erogVar.c), (eruy) erre.d.a(erogVar.a), erokVar.c.c(), erogVar.d.equals(erof.c) ? erre.b : erre.a, providerA);
        }
    });
    public static final eqsh c;
    public static final erer d;
    public static final int e;
    public static final erek f;

    static {
        erkl.a.getParserForType();
        f = new erek("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", eqsv.class);
        erkn.a.getParserForType();
        c = new erel("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", eqsw.class, 5);
        d = new erer() { // from class: eron
            @Override // defpackage.erer
            public final eqsg a(eqst eqstVar, Integer num) throws InvalidAlgorithmParameterException {
                erog erogVar = (erog) eqstVar;
                ECParameterSpec eCParameterSpec = erogVar.b.e;
                erfp erfpVar = eroo.a;
                KeyPair keyPairC = erva.c(eCParameterSpec);
                return eroh.a(eroj.a(erogVar, ((ECPublicKey) keyPairC.getPublic()).getW(), num), new erwo(((ECPrivateKey) keyPairC.getPrivate()).getS()));
            }
        };
        e = 2;
    }
}
