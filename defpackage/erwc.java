package defpackage;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erwc implements eqsv {
    public static eqsv b(erql erqlVar) throws NoSuchAlgorithmException, NoSuchProviderException {
        try {
            Provider providerC = ersh.c();
            if (providerC == null) {
                throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
            }
            KeyFactory keyFactory = KeyFactory.getInstance("RSA", providerC);
            erqj erqjVarA = erqlVar.a();
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(erqlVar.a.b, erqjVarA.c, erqlVar.b.a, erqlVar.c.a, erqlVar.d.a, erqlVar.e.a, erqlVar.f.a, erqlVar.g.a));
            erqh erqhVar = erqjVarA.e;
            erqh erqhVar2 = erqjVarA.f;
            int i = erqjVarA.g;
            erqlVar.g().c();
            erqjVarA.d.equals(erqi.c);
            return new ersg(rSAPrivateCrtKey, erqhVar, erqhVar2, i);
        } catch (NoSuchProviderException unused) {
            RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) ((KeyFactory) ervg.g.a("RSA")).generatePrivate(new RSAPrivateCrtKeySpec(erqlVar.a.b, erqlVar.a().c, erqlVar.b.a, erqlVar.c.a, erqlVar.d.a, erqlVar.e.a, erqlVar.f.a, erqlVar.g.a));
            erqj erqjVarA2 = erqlVar.a();
            erqh erqhVar3 = erqjVarA2.e;
            erdy erdyVar = erwe.a;
            ervp ervpVar = (ervp) erdyVar.a(erqhVar3);
            ervp ervpVar2 = (ervp) erdyVar.a(erqjVarA2.f);
            erqlVar.g().c();
            erqlVar.a().d.equals(erqi.c);
            return new erwb(rSAPrivateCrtKey2, ervpVar, ervpVar2);
        }
    }

    @Override // defpackage.eqsv
    public final void a(byte[] bArr) {
        throw null;
    }
}
