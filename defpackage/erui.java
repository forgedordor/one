package defpackage;

import androidx.car.app.model.Alert;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erui implements eqrz {
    public static final /* synthetic */ int a = 0;
    private static final ThreadLocal b = new erug();
    private static final ThreadLocal c = new eruh();
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;
    private final SecretKeySpec g;
    private final int h;

    public erui(byte[] bArr, int i, byte[] bArr2) throws GeneralSecurityException {
        if (!eqza.a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.h = i;
        erwk.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.g = secretKeySpec;
        Cipher cipher = (Cipher) b.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrD = d(cipher.doFinal(new byte[16]));
        this.d = bArrD;
        this.e = d(bArrD);
        this.f = bArr2;
    }

    private static void c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    private static byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b2 = bArr[i];
            int i2 = i + 1;
            bArr2[i] = (byte) (((b2 + b2) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        byte b3 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b3 + b3));
        return bArr2;
    }

    private final byte[] e(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        int length;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i3 == 0) {
            c(bArr2, this.d);
            return cipher.doFinal(bArr2);
        }
        byte[] bArr3 = new byte[16];
        cipher.doFinal(bArr2, 0, 16, bArr3);
        byte[] bArr4 = bArr3;
        byte[] bArr5 = bArr2;
        int i4 = 0;
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                bArr4[i5] = (byte) (bArr[(i2 + i4) + i5] ^ bArr4[i5]);
            }
            cipher.doFinal(bArr4, 0, 16, bArr5);
            i4 += 16;
            byte[] bArr6 = bArr4;
            bArr4 = bArr5;
            bArr5 = bArr6;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
        if (bArrCopyOfRange.length == 16) {
            c(bArrCopyOfRange, this.d);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(this.e, 16);
            int i6 = 0;
            while (true) {
                length = bArrCopyOfRange.length;
                if (i6 >= length) {
                    break;
                }
                bArrCopyOf[i6] = (byte) (bArrCopyOf[i6] ^ bArrCopyOfRange[i6]);
                i6++;
            }
            bArrCopyOf[length] = (byte) (bArrCopyOf[length] ^ 128);
            bArrCopyOfRange = bArrCopyOf;
        }
        c(bArr4, bArrCopyOfRange);
        cipher.doFinal(bArr4, 0, 16, bArr5);
        return bArr5;
    }

    @Override // defpackage.eqrz
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f;
        int length = bArr.length;
        int length2 = bArr3.length;
        int i = this.h;
        int i2 = ((length - length2) - i) - 16;
        if (i2 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ergh.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) b.get();
        SecretKeySpec secretKeySpec = this.g;
        cipher.init(1, secretKeySpec);
        byte[] bArrE = e(cipher, 0, bArr, length2, i);
        byte[] bArrE2 = e(cipher, 1, new byte[0], 0, 0);
        byte[] bArrE3 = e(cipher, 2, bArr, length2 + i, i2);
        int i3 = length - 16;
        byte b2 = 0;
        for (int i4 = 0; i4 < 16; i4++) {
            b2 = (byte) (b2 | (((bArr[i3 + i4] ^ bArrE2[i4]) ^ bArrE[i4]) ^ bArrE3[i4]));
        }
        if (b2 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) c.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrE));
        return cipher2.doFinal(bArr, bArr3.length + i, i2);
    }

    @Override // defpackage.eqrz
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f;
        int length = bArr3.length;
        int i = Alert.DURATION_SHOW_INDEFINITELY - length;
        int i2 = this.h;
        int length2 = bArr.length;
        if (length2 > (i - i2) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        int i3 = length + i2;
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, i3 + length2 + 16);
        byte[] bArrB = erfy.b(i2);
        System.arraycopy(bArrB, 0, bArrCopyOf, length, i2);
        Cipher cipher = (Cipher) b.get();
        SecretKeySpec secretKeySpec = this.g;
        cipher.init(1, secretKeySpec);
        byte[] bArrE = e(cipher, 0, bArrB, 0, bArrB.length);
        byte[] bArrE2 = e(cipher, 1, new byte[0], 0, 0);
        Cipher cipher2 = (Cipher) c.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrE));
        cipher2.doFinal(bArr, 0, length2, bArrCopyOf, i3);
        byte[] bArrE3 = e(cipher, 2, bArrCopyOf, i3, length2);
        int i4 = length + length2 + i2;
        for (int i5 = 0; i5 < 16; i5++) {
            bArrCopyOf[i4 + i5] = (byte) ((bArrE2[i5] ^ bArrE[i5]) ^ bArrE3[i5]);
        }
        return bArrCopyOf;
    }
}
