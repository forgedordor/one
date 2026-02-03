package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ervz implements eqsw {
    private final RSAPublicKey a;
    private final ervp b;
    private final byte[] c;
    private final byte[] d;

    public ervz(RSAPublicKey rSAPublicKey, ervp ervpVar, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (eqzb.a()) {
            throw new GeneralSecurityException("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
        }
        erwk.d(ervpVar);
        erwk.b(rSAPublicKey.getModulus().bitLength());
        erwk.c(rSAPublicKey.getPublicExponent());
        this.a = rSAPublicKey;
        this.b = ervpVar;
        this.c = bArr;
        this.d = bArr2;
    }

    private final void b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrB;
        int i;
        RSAPublicKey rSAPublicKey = this.a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        if (iBitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] bArrB2 = erdk.b(bigInteger.modPow(publicExponent, modulus), iBitLength);
        ervp ervpVar = this.b;
        erwk.d(ervpVar);
        MessageDigest messageDigest = (MessageDigest) ervg.d.a(erwj.a(ervpVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.d;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int iOrdinal = ervpVar.ordinal();
        int i2 = 2;
        if (iOrdinal == 2) {
            bArrB = ervq.b("3031300d060960864801650304020105000420");
        } else if (iOrdinal == 3) {
            bArrB = ervq.b("3041300d060960864801650304020205000430");
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unsupported hash ".concat(ervpVar.toString()));
            }
            bArrB = ervq.b("3051300d060960864801650304020305000440");
        }
        if (iBitLength < bArrB.length + bArrDigest.length + 11) {
            throw new GeneralSecurityException("intended encoded message length too short");
        }
        byte[] bArr4 = new byte[iBitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i3 = 0;
        while (true) {
            i = i2 + 1;
            if (i3 >= (iBitLength - r5) - 3) {
                break;
            }
            bArr4[i2] = -1;
            i3++;
            i2 = i;
        }
        bArr4[i2] = 0;
        int length = bArrB.length;
        System.arraycopy(bArrB, 0, bArr4, i, length);
        System.arraycopy(bArrDigest, 0, bArr4, i + length, bArrDigest.length);
        if (!MessageDigest.isEqual(bArrB2, bArr4)) {
            throw new GeneralSecurityException("invalid signature");
        }
    }

    @Override // defpackage.eqsw
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.c;
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
