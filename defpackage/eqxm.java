package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqxm implements eqrz {
    public static final /* synthetic */ int a = 0;
    private static final byte[] b = ervq.b("7a806c");
    private static final byte[] c = ervq.b("46bb91c3c5");
    private static final byte[] d = ervq.b("36864200e0eaf5284d884a0e77d31646");
    private static final byte[] e = ervq.b("bae8e37fc83441b16034566b");
    private static final byte[] f = ervq.b("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    private final SecretKey g;
    private final byte[] h;

    public eqxm(byte[] bArr, byte[] bArr2) throws InvalidAlgorithmParameterException {
        this.h = bArr2;
        erwk.a(bArr.length);
        this.g = new SecretKeySpec(bArr, "AES");
    }

    public static boolean c(Cipher cipher) throws InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            cipher.init(2, new SecretKeySpec(d, "AES"), d(e));
            cipher.updateAAD(c);
            byte[] bArr = f;
            return MessageDigest.isEqual(cipher.doFinal(bArr, 0, bArr.length), b);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    private static AlgorithmParameterSpec d(byte[] bArr) {
        return new GCMParameterSpec(128, bArr, 0, bArr.length);
    }

    @Override // defpackage.eqrz
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.h;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ergh.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipherC = eqyx.c();
        cipherC.init(2, this.g, new GCMParameterSpec(128, bArr, length2, 12));
        return cipherC.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }

    @Override // defpackage.eqrz
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipherC = eqyx.c();
        int length = bArr.length;
        byte[] bArr3 = this.h;
        int length2 = bArr3.length;
        if (length > 2147483619 - length2) {
            throw new GeneralSecurityException("plaintext too long");
        }
        int i = length2 + 12;
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, i + length + 16);
        byte[] bArrB = erfy.b(12);
        System.arraycopy(bArrB, 0, bArrCopyOf, length2, 12);
        cipherC.init(1, this.g, d(bArrB));
        int iDoFinal = cipherC.doFinal(bArr, 0, length, bArrCopyOf, i);
        if (iDoFinal == length + 16) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException(String.format("encryption failed; AES-GCM-SIV tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - length)));
    }
}
