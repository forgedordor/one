package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erqr {
    public static final erfp a = new erfn(erql.class, eqsv.class, new erfo() { // from class: erqo
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) {
            return erwc.b((erql) eqsgVar);
        }
    });
    public static final erfp b = new erfn(erqn.class, eqsw.class, new erfo() { // from class: erqp
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) {
            return erwe.b((erqn) eqsgVar);
        }
    });
    public static final eqsh c;
    public static final erer d;
    public static final int e;
    public static final erek f;

    static {
        erno.a.getParserForType();
        f = new erek("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", eqsv.class);
        ernq.a.getParserForType();
        c = new erel("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", eqsw.class, 5);
        d = new erer() { // from class: erqq
            @Override // defpackage.erer
            public final eqsg a(eqst eqstVar, Integer num) throws GeneralSecurityException {
                erqj erqjVar = (erqj) eqstVar;
                erfp erfpVar = erqr.a;
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) ervg.f.a("RSA");
                keyPairGenerator.initialize(new RSAKeyGenParameterSpec(erqjVar.b, new BigInteger(1, erqjVar.c.toByteArray())));
                KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
                erqn erqnVarA = erqm.a(erqjVar, rSAPublicKey.getModulus(), num);
                erqk erqkVar = new erqk();
                erqkVar.a = erqnVarA;
                erqkVar.c(new erwo(rSAPrivateCrtKey.getPrimeP()), new erwo(rSAPrivateCrtKey.getPrimeQ()));
                erqkVar.b = new erwo(rSAPrivateCrtKey.getPrivateExponent());
                erqkVar.b(new erwo(rSAPrivateCrtKey.getPrimeExponentP()), new erwo(rSAPrivateCrtKey.getPrimeExponentQ()));
                erqkVar.c = new erwo(rSAPrivateCrtKey.getCrtCoefficient());
                return erqkVar.a();
            }
        };
        e = 2;
    }
}
