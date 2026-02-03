package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class errx implements eqsv {
    public static final byte[] a = new byte[0];
    public static final byte[] b = {0};
    public static final byte[] c = {1, 2, 3};
    Provider d;
    private final RSAPrivateCrtKey e;
    private final String f;
    private final byte[] g;
    private final byte[] h;
    private final eqsw i;

    public errx(RSAPrivateCrtKey rSAPrivateCrtKey, erpv erpvVar, byte[] bArr, byte[] bArr2, eqsw eqswVar, Provider provider) throws GeneralSecurityException {
        if (!eqza.a(2)) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (erpvVar != erpv.a && erpvVar != erpv.b && erpvVar != erpv.c) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(String.valueOf(erpvVar))));
        }
        erwk.b(rSAPrivateCrtKey.getModulus().bitLength());
        erwk.c(rSAPrivateCrtKey.getPublicExponent());
        this.e = rSAPrivateCrtKey;
        this.f = erry.c(erpvVar);
        this.g = bArr;
        this.h = bArr2;
        this.i = eqswVar;
        this.d = provider;
    }

    @Override // defpackage.eqsv
    public final void a(byte[] bArr) throws GeneralSecurityException {
        Provider provider = this.d;
        Signature signature = provider != null ? Signature.getInstance(this.f, provider) : (Signature) ervg.c.a(this.f);
        signature.initSign(this.e);
        signature.update(bArr);
        byte[] bArr2 = this.h;
        if (bArr2.length > 0) {
            signature.update(bArr2);
        }
        byte[] bArrSign = signature.sign();
        byte[] bArr3 = this.g;
        if (bArr3.length > 0) {
            bArrSign = erup.b(bArr3, bArrSign);
        }
        try {
            this.i.a(bArrSign, bArr);
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("RSA signature computation error", e);
        }
    }
}
