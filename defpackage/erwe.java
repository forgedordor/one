package defpackage;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erwe implements eqsw {
    static final erdy a;
    private static final byte[] b;
    private static final byte[] c;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        erdx.b(ervp.SHA256, erqh.a, map, map2);
        erdx.b(ervp.SHA384, erqh.b, map, map2);
        erdx.b(ervp.SHA512, erqh.c, map, map2);
        a = erdx.a(map, map2);
        b = new byte[0];
        c = new byte[]{0};
    }

    public static eqsw b(erqn erqnVar) throws NoSuchAlgorithmException, NoSuchProviderException {
        try {
            Provider providerC = ersh.c();
            if (providerC == null) {
                throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
            }
            KeyFactory keyFactory = KeyFactory.getInstance("RSA", providerC);
            BigInteger bigInteger = erqnVar.b;
            erqj erqjVar = erqnVar.a;
            return new ersh((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, erqjVar.c)), erqjVar.e, erqjVar.f, erqjVar.g, erqnVar.c.c(), erqjVar.d.equals(erqi.c) ? ersh.b : ersh.a, providerC);
        } catch (NoSuchProviderException unused) {
            KeyFactory keyFactory2 = (KeyFactory) ervg.g.a("RSA");
            BigInteger bigInteger2 = erqnVar.b;
            erqj erqjVar2 = erqnVar.a;
            RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory2.generatePublic(new RSAPublicKeySpec(bigInteger2, erqjVar2.c));
            erqh erqhVar = erqjVar2.e;
            erdy erdyVar = a;
            return new erwd(rSAPublicKey, (ervp) erdyVar.a(erqhVar), (ervp) erdyVar.a(erqjVar2.f), erqjVar2.g, erqnVar.c.c(), erqjVar2.d.equals(erqi.c) ? c : b);
        }
    }

    @Override // defpackage.eqsw
    public final void a(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
