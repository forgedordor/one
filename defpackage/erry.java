package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erry implements eqsw {
    private static final byte[] a = new byte[0];
    private static final byte[] b = {0};
    private final RSAPublicKey c;
    private final String d;
    private final byte[] e;
    private final byte[] f;
    private final Provider g;

    private erry(RSAPublicKey rSAPublicKey, erpv erpvVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!eqza.a(2)) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        erwk.b(rSAPublicKey.getModulus().bitLength());
        erwk.c(rSAPublicKey.getPublicExponent());
        this.c = rSAPublicKey;
        this.d = c(erpvVar);
        this.e = bArr;
        this.f = bArr2;
        this.g = provider;
    }

    public static eqsw b(erqb erqbVar, Provider provider) {
        erpx erpxVar = erqbVar.a;
        return new erry((RSAPublicKey) KeyFactory.getInstance("RSA", provider).generatePublic(new RSAPublicKeySpec(erqbVar.b, erpxVar.c)), erpxVar.e, erqbVar.c.c(), erpxVar.d.equals(erpw.c) ? b : a, provider);
    }

    public static String c(erpv erpvVar) throws GeneralSecurityException {
        if (erpvVar == erpv.a) {
            return "SHA256withRSA";
        }
        if (erpvVar == erpv.b) {
            return "SHA384withRSA";
        }
        if (erpvVar == erpv.c) {
            return "SHA512withRSA";
        }
        throw new GeneralSecurityException("unknown hash type");
    }

    public static Provider d() {
        if (ergh.d()) {
            ergh.c().intValue();
        }
        return erdl.a();
    }

    @Override // defpackage.eqsw
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.e;
        if (!ergh.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        String str = this.d;
        Provider provider = this.g;
        RSAPublicKey rSAPublicKey = this.c;
        Signature signature = Signature.getInstance(str, provider);
        signature.initVerify(rSAPublicKey);
        signature.update(bArr2);
        byte[] bArr4 = this.f;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            if (signature.verify(Arrays.copyOfRange(bArr, bArr3.length, bArr.length))) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        throw new GeneralSecurityException("Invalid signature");
    }
}
