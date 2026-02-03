package defpackage;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erby implements erbz {
    private final eqzk a;
    private final int b;

    public erby(eqzk eqzkVar) {
        this.a = eqzkVar;
        this.b = eqzkVar.a;
    }

    private final eqsd d(byte[] bArr) {
        return eruo.a(eqzc.a(this.a, erwp.c(bArr), null));
    }

    @Override // defpackage.erbz
    public final int a() {
        return this.b;
    }

    @Override // defpackage.erbz
    public final byte[] b(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        int length = bArr2.length;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, i, length);
        eqsd eqsdVarD = d(bArr);
        int length2 = bArrCopyOfRange.length;
        eruo eruoVar = (eruo) eqsdVarD;
        byte[] bArr3 = eruoVar.c;
        int length3 = bArr3.length;
        int i2 = length3 + 16;
        if (length2 < i2) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        if (!ergh.e(bArr3, bArrCopyOfRange)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) eruo.a.get();
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArrCopyOfRange, length3, i2);
        byte[] bArr4 = (byte[]) bArrCopyOfRange2.clone();
        bArr4[8] = (byte) (bArr4[8] & 127);
        bArr4[12] = (byte) (bArr4[12] & 127);
        cipher.init(2, new SecretKeySpec(eruoVar.b, "AES"), new IvParameterSpec(bArr4));
        int i3 = length2 - i2;
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange, i2, i3);
        if (i3 == 0 && bArrDoFinal == null && erwj.d()) {
            bArrDoFinal = new byte[0];
        }
        if (MessageDigest.isEqual(bArrCopyOfRange2, eruoVar.b(erca.a, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    @Override // defpackage.erbz
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        eruo eruoVar = (eruo) d(bArr);
        byte[] bArr5 = eruoVar.c;
        int length = bArr5.length;
        int length2 = bArr4.length;
        if (length2 > 2147483631 - length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) eruo.a.get();
        byte[] bArrB = eruoVar.b(erca.a, bArr4);
        byte[] bArr6 = (byte[]) bArrB.clone();
        bArr6[8] = (byte) (bArr6[8] & 127);
        bArr6[12] = (byte) (bArr6[12] & 127);
        cipher.init(1, new SecretKeySpec(eruoVar.b, "AES"), new IvParameterSpec(bArr6));
        int length3 = bArrB.length;
        int i = length + length3;
        byte[] bArrCopyOf = Arrays.copyOf(bArr5, i + length2);
        System.arraycopy(bArrB, 0, bArrCopyOf, length, length3);
        if (cipher.doFinal(bArr4, 0, length2, bArrCopyOf, i) == length2) {
            return erup.b(bArr2, bArr3, bArrCopyOf);
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
