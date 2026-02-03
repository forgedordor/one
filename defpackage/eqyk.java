package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.SecretKey;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqyk implements eqrz {
    private final byte[] a;
    private final int b;
    private final erig c;

    public eqyk(byte[] bArr, erwn erwnVar, int i) {
        this.c = new ervv(bArr);
        this.a = erwnVar.c();
        this.b = i;
    }

    private final byte[] c(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr3 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length = bArr.length;
        if (length > 12 || length < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArr, 0, bArr2, 4, length);
        System.arraycopy(bArr, 0, bArr3, 4, length);
        erig erigVar = this.c;
        byte[] bArr4 = new byte[32];
        System.arraycopy(erigVar.a(bArr2, 16), 0, bArr4, 0, 16);
        System.arraycopy(erigVar.a(bArr3, 16), 0, bArr4, 16, 16);
        return bArr4;
    }

    @Override // defpackage.eqrz
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.a;
        int i = this.b;
        int length = bArr.length;
        int length2 = bArr3.length;
        int i2 = i + length2;
        if (length < i2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ergh.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrC = c(Arrays.copyOfRange(bArr, length2, i2));
        if (!eqza.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i3 = i2 + 12;
        return eqya.a(Arrays.copyOfRange(bArr, i2, i3), bArr, i3, eqxg.d(bArrC));
    }

    @Override // defpackage.eqrz
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        int i = this.b;
        int i2 = i + 12;
        byte[] bArrB = erfy.b(i2);
        byte[] bArrCopyOf = Arrays.copyOf(bArrB, i);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrB, i, i2);
        byte[] bArrC = c(bArrCopyOf);
        if (!eqza.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        SecretKey secretKeyD = eqxg.d(bArrC);
        byte[] bArr3 = this.a;
        int length = bArr3.length;
        byte[] bArrB2 = eqya.b(bArrCopyOfRange, bArr, i + length + bArrCopyOfRange.length, secretKeyD);
        System.arraycopy(bArr3, 0, bArrB2, 0, length);
        System.arraycopy(bArrB, 0, bArrB2, length, bArrB.length);
        return bArrB2;
    }
}
