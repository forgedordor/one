package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erwd implements eqsw {
    private final RSAPublicKey a;
    private final ervp b;
    private final ervp c;
    private final int d;
    private final byte[] e;
    private final byte[] f;

    public erwd(RSAPublicKey rSAPublicKey, ervp ervpVar, ervp ervpVar2, int i, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (eqzb.a()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        erwk.d(ervpVar);
        if (!ervpVar.equals(ervpVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        erwk.b(rSAPublicKey.getModulus().bitLength());
        erwk.c(rSAPublicKey.getPublicExponent());
        this.a = rSAPublicKey;
        this.b = ervpVar;
        this.c = ervpVar2;
        this.d = i;
        this.e = bArr;
        this.f = bArr2;
    }

    private final void b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        RSAPublicKey rSAPublicKey = this.a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = modulus.bitLength() + 7;
        int iBitLength2 = modulus.bitLength() + 6;
        if (iBitLength / 8 != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] bArrB = erdk.b(bigInteger.modPow(publicExponent, modulus), iBitLength2 / 8);
        int iBitLength3 = modulus.bitLength() - 1;
        ervp ervpVar = this.b;
        erwk.d(ervpVar);
        ervg ervgVar = ervg.d;
        MessageDigest messageDigest = (MessageDigest) ervgVar.a(erwj.a(ervpVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = bArrB.length;
        int i = this.d;
        if (length < digestLength + i + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (bArrB[length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i2 = length - digestLength;
        int i3 = i2 - 1;
        byte[] bArrCopyOf = Arrays.copyOf(bArrB, i3);
        int length2 = bArrCopyOf.length;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrB, length2, length2 + digestLength);
        int i4 = 0;
        while (true) {
            long j = (length * 8) - iBitLength3;
            if (i4 < j) {
                if (((bArrCopyOf[i4 / 8] >> (7 - (i4 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i4++;
            } else {
                MessageDigest messageDigest2 = (MessageDigest) ervgVar.a(erwj.a(this.c));
                int digestLength2 = messageDigest2.getDigestLength();
                byte[] bArr4 = new byte[i3];
                int i5 = 0;
                int i6 = 0;
                while (i5 <= (i2 - 2) / digestLength2) {
                    messageDigest2.reset();
                    messageDigest2.update(bArrCopyOfRange);
                    int i7 = i;
                    messageDigest2.update(erdk.b(BigInteger.valueOf(i5), 4));
                    byte[] bArrDigest2 = messageDigest2.digest();
                    int length3 = bArrDigest2.length;
                    System.arraycopy(bArrDigest2, 0, bArr4, i6, Math.min(length3, i3 - i6));
                    i6 += length3;
                    i5++;
                    i = i7;
                    messageDigest2 = messageDigest2;
                }
                int i8 = i;
                byte[] bArr5 = new byte[i3];
                for (int i9 = 0; i9 < i3; i9++) {
                    bArr5[i9] = (byte) (bArr4[i9] ^ bArrCopyOf[i9]);
                }
                for (int i10 = 0; i10 <= j; i10++) {
                    int i11 = i10 / 8;
                    bArr5[i11] = (byte) ((~(1 << (7 - (i10 % 8)))) & bArr5[i11]);
                }
                int i12 = 0;
                while (true) {
                    int i13 = (i2 - i8) - 2;
                    if (i12 >= i13) {
                        if (bArr5[i13] != 1) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr5, i3 - i8, i3);
                        int i14 = digestLength + 8;
                        byte[] bArr6 = new byte[i14 + i8];
                        System.arraycopy(bArrDigest, 0, bArr6, 8, bArrDigest.length);
                        System.arraycopy(bArrCopyOfRange2, 0, bArr6, i14, bArrCopyOfRange2.length);
                        if (!MessageDigest.isEqual(messageDigest.digest(bArr6), bArrCopyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                    if (bArr5[i12] != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i12++;
                }
            }
        }
    }

    @Override // defpackage.eqsw
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.e;
        int length = bArr3.length;
        if (length == 0) {
            b(bArr, bArr2);
        } else {
            if (!ergh.e(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            b(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
