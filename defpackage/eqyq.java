package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqyq implements eqrz {
    private final byte[] a;
    private final byte[] b;

    public eqyq(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!eqza.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!c()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.a = bArr;
        this.b = bArr2;
    }

    public static boolean c() {
        return eqxt.c() != null;
    }

    static byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[12];
        System.arraycopy(bArr, 16, bArr2, 4, 8);
        return bArr2;
    }

    @Override // defpackage.eqrz
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.b;
        int length = bArr.length;
        int length2 = bArr3.length;
        if (length < length2 + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ergh.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, length2, bArr4, 0, 24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(eqxz.d(this.a, bArr4), "ChaCha20");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(d(bArr4));
        Cipher cipherC = eqxt.c();
        cipherC.init(2, secretKeySpec, ivParameterSpec);
        return cipherC.doFinal(bArr, length2 + 24, (length - length2) - 24);
    }

    @Override // defpackage.eqrz
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArr3 = this.a;
        byte[] bArrB = erfy.b(24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(eqxz.d(bArr3, bArrB), "ChaCha20");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(d(bArrB));
        Cipher cipherC = eqxt.c();
        cipherC.init(1, secretKeySpec, ivParameterSpec);
        int length = bArr.length;
        int outputSize = cipherC.getOutputSize(length);
        byte[] bArr4 = this.b;
        int length2 = bArr4.length;
        if (outputSize > 2147483623 - length2) {
            throw new GeneralSecurityException("plaintext too long");
        }
        int i = length2 + 24;
        byte[] bArrCopyOf = Arrays.copyOf(bArr4, i + outputSize);
        System.arraycopy(bArrB, 0, bArrCopyOf, length2, 24);
        if (cipherC.doFinal(bArr, 0, length, bArrCopyOf, i) == outputSize) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
