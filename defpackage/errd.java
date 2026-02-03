package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class errd implements eqsv {
    public errd(ervp ervpVar) throws GeneralSecurityException {
        if (!eqza.a(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        erwj.b(ervpVar);
    }

    @Override // defpackage.eqsv
    public final void a(byte[] bArr) {
        throw null;
    }
}
