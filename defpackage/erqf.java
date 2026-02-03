package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;
import java.security.spec.RSAPrivateCrtKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erqf {
    public static final erfp a = new erfn(erpz.class, eqsv.class, new erfo() { // from class: erqc
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) {
            erpz erpzVar = (erpz) eqsgVar;
            byte[] bArr = errx.a;
            Provider providerD = erry.d();
            KeyFactory keyFactory = providerD != null ? KeyFactory.getInstance("RSA", providerD) : (KeyFactory) ervg.g.a("RSA");
            erqb erqbVar = erpzVar.a;
            errx errxVar = new errx((RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(erqbVar.b, erpzVar.a().c, erpzVar.b.a, erpzVar.c.a, erpzVar.d.a, erpzVar.e.a, erpzVar.f.a, erpzVar.g.a)), erpzVar.a().e, erpzVar.g().c(), erpzVar.a().d.equals(erpw.c) ? errx.b : errx.a, providerD != null ? erry.b(erqbVar, providerD) : erwa.b(erqbVar), providerD);
            errxVar.a(errx.c);
            return errxVar;
        }
    });
    public static final erfp b = new erfn(erqb.class, eqsw.class, new erfo() { // from class: erqd
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) {
            return erwa.b((erqb) eqsgVar);
        }
    });
    public static final eqsh c;
    public static final erer d;
    public static final int e;
    public static final erek f;

    static {
        erng.a.getParserForType();
        f = new erek("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", eqsv.class);
        erni.a.getParserForType();
        c = new erel("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", eqsw.class, 5);
        d = new erer() { // from class: erqe
            @Override // defpackage.erer
            public final eqsg a(eqst eqstVar, Integer num) throws GeneralSecurityException {
                erpx erpxVar = (erpx) eqstVar;
                erfp erfpVar = erqf.a;
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) ervg.f.a("RSA");
                keyPairGenerator.initialize(new RSAKeyGenParameterSpec(erpxVar.b, new BigInteger(1, erpxVar.c.toByteArray())));
                KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
                erqb erqbVarA = erqa.a(erpxVar, rSAPublicKey.getModulus(), num);
                erpy erpyVar = new erpy();
                erpyVar.a = erqbVarA;
                erpyVar.c(new erwo(rSAPrivateCrtKey.getPrimeP()), new erwo(rSAPrivateCrtKey.getPrimeQ()));
                erpyVar.b = new erwo(rSAPrivateCrtKey.getPrivateExponent());
                erpyVar.b(new erwo(rSAPrivateCrtKey.getPrimeExponentP()), new erwo(rSAPrivateCrtKey.getPrimeExponentQ()));
                erpyVar.c = new erwo(rSAPrivateCrtKey.getCrtCoefficient());
                return erpyVar.a();
            }
        };
        e = 2;
    }
}
