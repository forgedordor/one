package defpackage;

import androidx.car.app.model.Alert;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqya {
    public static final byte[] a(byte[] bArr, byte[] bArr2, int i, SecretKey secretKey) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        int length = bArr2.length;
        if (length < i + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = eqxg.a(bArr);
        Cipher cipherC = eqxg.c();
        cipherC.init(2, secretKey, algorithmParameterSpecA);
        return cipherC.doFinal(bArr2, i, length - i);
    }

    public static final byte[] b(byte[] bArr, byte[] bArr2, int i, SecretKey secretKey) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = eqxg.a(bArr);
        Cipher cipherC = eqxg.c();
        cipherC.init(1, secretKey, algorithmParameterSpecA);
        int length = bArr2.length;
        int outputSize = cipherC.getOutputSize(length);
        if (outputSize > Alert.DURATION_SHOW_INDEFINITELY - i) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[i + outputSize];
        if (cipherC.doFinal(bArr2, 0, length, bArr3, i) == outputSize) {
            return bArr3;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
