package defpackage;

import androidx.car.app.model.Alert;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erbv implements ercj {
    @Override // defpackage.ercj
    public final int a() {
        return 32;
    }

    @Override // defpackage.ercj
    public final byte[] b() {
        return ercv.k;
    }

    @Override // defpackage.ercj
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length != 32) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
        }
        if (!eqyf.a()) {
            return new eqyd(bArr).c(ByteBuffer.wrap(Arrays.copyOfRange(bArr3, i, bArr3.length)), bArr2, bArr4);
        }
        if (!eqza.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!eqyf.a()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "ChaCha20");
        if (bArr3 == null) {
            throw new NullPointerException("ciphertext is null");
        }
        if (bArr2.length != 12) {
            throw new GeneralSecurityException("nonce length must be 12 bytes.");
        }
        int length = bArr3.length;
        if (length < i + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        Cipher cipherC = eqxt.c();
        cipherC.init(2, secretKeySpec, ivParameterSpec);
        return cipherC.doFinal(bArr3, i, length - i);
    }

    @Override // defpackage.ercj
    public final byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length != 32) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
        }
        if (!eqyf.a()) {
            eqyd eqydVar = new eqyd(bArr);
            int length = bArr3.length;
            if (length > 2147483631) {
                throw new GeneralSecurityException("plaintext too long");
            }
            int i2 = Alert.DURATION_SHOW_INDEFINITELY - i;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 16);
            eqydVar.b(byteBufferAllocate, bArr2, bArr3, bArr4);
            byte[] bArrArray = byteBufferAllocate.array();
            int length2 = bArrArray.length;
            if (length2 > i2) {
                throw new InvalidAlgorithmParameterException("Plaintext too long");
            }
            byte[] bArr5 = new byte[i + length2];
            System.arraycopy(bArrArray, 0, bArr5, i, length2);
            return bArr5;
        }
        if (!eqza.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!eqyf.a()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "ChaCha20");
        if (bArr3 == null) {
            throw new NullPointerException("plaintext is null");
        }
        if (bArr2.length != 12) {
            throw new GeneralSecurityException("nonce length must be 12 bytes.");
        }
        int i3 = Alert.DURATION_SHOW_INDEFINITELY - i;
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        Cipher cipherC = eqxt.c();
        cipherC.init(1, secretKeySpec, ivParameterSpec);
        int length3 = bArr3.length;
        int outputSize = cipherC.getOutputSize(length3);
        if (outputSize > i3) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr6 = new byte[i + outputSize];
        if (cipherC.doFinal(bArr3, 0, length3, bArr6, i) == outputSize) {
            return bArr6;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
