package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.spec.PKCS8EncodedKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class errm implements eqsv {
    public static final /* synthetic */ int a = 0;
    private static final byte[] b = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};

    public errm(byte[] bArr, Provider provider) throws GeneralSecurityException {
        if (!eqza.a(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
        }
        KeyFactory.getInstance("Ed25519", provider).generatePrivate(new PKCS8EncodedKeySpec(erup.b(b, bArr)));
    }

    @Override // defpackage.eqsv
    public final void a(byte[] bArr) {
        throw null;
    }
}
