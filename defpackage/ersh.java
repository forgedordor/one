package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ersh implements eqsw {
    public static final byte[] a = new byte[0];
    public static final byte[] b = {0};
    private final RSAPublicKey c;
    private final String d;
    private final PSSParameterSpec e;
    private final byte[] f;
    private final byte[] g;
    private final Provider h;

    public ersh(RSAPublicKey rSAPublicKey, erqh erqhVar, erqh erqhVar2, int i, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!eqza.a(2)) {
            throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!erqhVar.equals(erqhVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        erwk.b(rSAPublicKey.getModulus().bitLength());
        erwk.c(rSAPublicKey.getPublicExponent());
        this.c = rSAPublicKey;
        this.d = b(erqhVar);
        this.e = d(erqhVar, erqhVar2, i);
        this.f = bArr;
        this.g = bArr2;
        this.h = provider;
    }

    static String b(erqh erqhVar) {
        if (erqhVar == erqh.a) {
            return "SHA256withRSA/PSS";
        }
        if (erqhVar == erqh.b) {
            return "SHA384withRSA/PSS";
        }
        if (erqhVar == erqh.c) {
            return "SHA512withRSA/PSS";
        }
        throw new IllegalArgumentException("Unsupported hash: ".concat(String.valueOf(String.valueOf(erqhVar))));
    }

    public static Provider c() {
        if (ergh.d()) {
            ergh.c().intValue();
        }
        return erdl.a();
    }

    static PSSParameterSpec d(erqh erqhVar, erqh erqhVar2, int i) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        erqh erqhVar3 = erqh.a;
        if (erqhVar == erqhVar3) {
            str = "SHA-256";
        } else if (erqhVar == erqh.b) {
            str = "SHA-384";
        } else {
            if (erqhVar != erqh.c) {
                throw new IllegalArgumentException("Unsupported MD hash: ".concat(String.valueOf(String.valueOf(erqhVar))));
            }
            str = "SHA-512";
        }
        if (erqhVar2 == erqhVar3) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (erqhVar2 == erqh.b) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (erqhVar2 != erqh.c) {
                throw new IllegalArgumentException("Unsupported MGF1 hash: ".concat(String.valueOf(String.valueOf(erqhVar2))));
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i, 1);
    }

    @Override // defpackage.eqsw
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f;
        if (!ergh.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        String str = this.d;
        Provider provider = this.h;
        RSAPublicKey rSAPublicKey = this.c;
        Signature signature = Signature.getInstance(str, provider);
        signature.initVerify(rSAPublicKey);
        signature.setParameter(this.e);
        signature.update(bArr2);
        byte[] bArr4 = this.g;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        int length = bArr.length;
        int length2 = bArr3.length;
        if (!signature.verify(bArr, length2, length - length2)) {
            throw new GeneralSecurityException("signature verification failed");
        }
    }
}
