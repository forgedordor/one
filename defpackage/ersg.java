package defpackage;

import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPrivateCrtKey;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ersg implements eqsv {
    public ersg(RSAPrivateCrtKey rSAPrivateCrtKey, erqh erqhVar, erqh erqhVar2, int i) throws GeneralSecurityException {
        if (!eqza.a(2)) {
            throw new GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        erwk.b(rSAPrivateCrtKey.getModulus().bitLength());
        erwk.c(rSAPrivateCrtKey.getPublicExponent());
        ersh.b(erqhVar);
        ersh.d(erqhVar, erqhVar2, i);
    }

    @Override // defpackage.eqsv
    public final void a(byte[] bArr) {
        throw null;
    }
}
