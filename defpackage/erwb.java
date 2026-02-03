package defpackage;

import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPrivateCrtKey;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erwb implements eqsv {
    public erwb(RSAPrivateCrtKey rSAPrivateCrtKey, ervp ervpVar, ervp ervpVar2) throws GeneralSecurityException {
        if (eqzb.a()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        erwk.d(ervpVar);
        if (!ervpVar.equals(ervpVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        erwk.b(rSAPrivateCrtKey.getModulus().bitLength());
        erwk.c(rSAPrivateCrtKey.getPublicExponent());
    }

    @Override // defpackage.eqsv
    public final void a(byte[] bArr) {
        throw null;
    }
}
