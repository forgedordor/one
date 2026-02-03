package defpackage;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erwa implements eqsw {
    static final erdy a;
    private static final byte[] b = new byte[0];
    private static final byte[] c = {0};

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        erdx.b(ervp.SHA256, erpv.a, map, map2);
        erdx.b(ervp.SHA384, erpv.b, map, map2);
        erdx.b(ervp.SHA512, erpv.c, map, map2);
        a = erdx.a(map, map2);
    }

    public static eqsw b(erqb erqbVar) throws NoSuchProviderException {
        try {
            Provider providerD = erry.d();
            if (providerD != null) {
                return erry.b(erqbVar, providerD);
            }
            throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
        } catch (NoSuchProviderException unused) {
            KeyFactory keyFactory = (KeyFactory) ervg.g.a("RSA");
            BigInteger bigInteger = erqbVar.b;
            erpx erpxVar = erqbVar.a;
            return new ervz((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, erpxVar.c)), (ervp) a.a(erpxVar.e), erqbVar.c.c(), erpxVar.d.equals(erpw.c) ? c : b);
        }
    }

    @Override // defpackage.eqsw
    public final void a(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
