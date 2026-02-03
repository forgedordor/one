package defpackage;

import java.security.GeneralSecurityException;
import java.security.NoSuchProviderException;
import java.security.Provider;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eruv implements eqsv {
    private final byte[] a;

    private eruv(byte[] bArr) throws GeneralSecurityException {
        if (!eqza.a(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
        }
        byte[] bArrI = erds.i(bArr);
        this.a = bArrI;
        erds.j(bArrI);
    }

    public static eqsv b(eror erorVar) throws GeneralSecurityException {
        if (!eqza.a(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            int i = errm.a;
            Provider providerA = erdl.a();
            if (providerA == null) {
                throw new NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
            }
            byte[] bArrD = erorVar.b.d();
            erorVar.g().c();
            erorVar.a().a.equals(erop.c);
            return new errm(bArrD, providerA);
        } catch (GeneralSecurityException unused) {
            byte[] bArrD2 = erorVar.b.d();
            erorVar.g().c();
            erorVar.a().a.equals(erop.c);
            return new eruv(bArrD2);
        }
    }

    @Override // defpackage.eqsv
    public final void a(byte[] bArr) {
        throw null;
    }
}
