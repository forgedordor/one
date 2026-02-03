package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erum implements eqrz {
    private final SecretKey a;
    private final byte[] b;

    public erum(byte[] bArr) {
        this(bArr, erwn.b(new byte[0]));
    }

    @Override // defpackage.eqrz
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.b;
        int length = bArr.length;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ergh.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec algorithmParameterSpecB = eqxg.b(bArr, length2, 12);
        SecretKey secretKey = this.a;
        Cipher cipherC = eqxg.c();
        cipherC.init(2, secretKey, algorithmParameterSpecB);
        return cipherC.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }

    @Override // defpackage.eqrz
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrB = erfy.b(12);
        AlgorithmParameterSpec algorithmParameterSpecA = eqxg.a(bArrB);
        SecretKey secretKey = this.a;
        Cipher cipherC = eqxg.c();
        cipherC.init(1, secretKey, algorithmParameterSpecA);
        int length = bArr.length;
        int outputSize = cipherC.getOutputSize(length);
        byte[] bArr3 = this.b;
        int length2 = bArr3.length;
        if (outputSize > 2147483635 - length2) {
            throw new GeneralSecurityException("plaintext too long");
        }
        int i = length2 + 12;
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, i + outputSize);
        System.arraycopy(bArrB, 0, bArrCopyOf, length2, 12);
        if (cipherC.doFinal(bArr, 0, length, bArrCopyOf, i) == outputSize) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    public erum(byte[] bArr, erwn erwnVar) throws GeneralSecurityException {
        if (!eqza.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.a = eqxg.d(bArr);
        this.b = erwnVar.c();
    }
}
