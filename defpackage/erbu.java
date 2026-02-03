package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erbu implements ercj {
    private final int a;

    public erbu(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(a.g(i, "Unsupported key length: "));
        }
        this.a = i;
    }

    @Override // defpackage.ercj
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ercj
    public final byte[] b() throws GeneralSecurityException {
        int i = this.a;
        if (i == 16) {
            return ercv.i;
        }
        if (i == 32) {
            return ercv.j;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    @Override // defpackage.ercj
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws GeneralSecurityException {
        int length = bArr.length;
        if (length != this.a) {
            throw new InvalidAlgorithmParameterException(a.g(length, "Unexpected key length: "));
        }
        if (eqza.a(2)) {
            return eqya.a(bArr2, bArr3, i, eqxg.d(bArr));
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // defpackage.ercj
    public final byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws GeneralSecurityException {
        int length = bArr.length;
        if (length != this.a) {
            throw new InvalidAlgorithmParameterException(a.g(length, "Unexpected key length: "));
        }
        if (eqza.a(2)) {
            return eqya.b(bArr2, bArr3, i, eqxg.d(bArr));
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
