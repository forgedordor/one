package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erva {
    public static int a(EllipticCurve ellipticCurve) {
        return (erdw.d(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static KeyPair b(erux eruxVar) {
        return c(g(eruxVar));
    }

    public static KeyPair c(ECParameterSpec eCParameterSpec) throws InvalidAlgorithmParameterException {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) ervg.f.a("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    public static ECPrivateKey d(erux eruxVar, byte[] bArr) throws NoSuchAlgorithmException {
        return (ECPrivateKey) ((KeyFactory) ervg.g.a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), g(eruxVar)));
    }

    public static ECPublicKey e(erux eruxVar, eruz eruzVar, byte[] bArr) {
        return f(g(eruxVar), eruzVar, bArr);
    }

    public static ECPublicKey f(ECParameterSpec eCParameterSpec, eruz eruzVar, byte[] bArr) {
        return (ECPublicKey) ((KeyFactory) ervg.g.a("EC")).generatePublic(new ECPublicKeySpec(h(eCParameterSpec.getCurve(), eruzVar, bArr), eCParameterSpec));
    }

    public static ECParameterSpec g(erux eruxVar) throws NoSuchAlgorithmException {
        int iOrdinal = eruxVar.ordinal();
        if (iOrdinal == 0) {
            return erdw.a;
        }
        if (iOrdinal == 1) {
            return erdw.b;
        }
        if (iOrdinal == 2) {
            return erdw.c;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(String.valueOf(String.valueOf(eruxVar))));
    }

    public static ECPoint h(EllipticCurve ellipticCurve, eruz eruzVar, byte[] bArr) throws GeneralSecurityException {
        int iA = a(ellipticCurve);
        int iOrdinal = eruzVar.ordinal();
        boolean z = false;
        if (iOrdinal == 0) {
            int length = bArr.length;
            if (length != iA + iA + 1) {
                throw new GeneralSecurityException("invalid point size");
            }
            if (bArr[0] != 4) {
                throw new GeneralSecurityException("invalid point format");
            }
            int i = iA + 1;
            ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i)), new BigInteger(1, Arrays.copyOfRange(bArr, i, length)));
            erdw.f(eCPoint, ellipticCurve);
            return eCPoint;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new GeneralSecurityException("invalid format:".concat(String.valueOf(String.valueOf(eruzVar))));
            }
            int i2 = iA + iA;
            int length2 = bArr.length;
            if (length2 != i2) {
                throw new GeneralSecurityException("invalid point size");
            }
            ECPoint eCPoint2 = new ECPoint(new BigInteger(1, Arrays.copyOf(bArr, iA)), new BigInteger(1, Arrays.copyOfRange(bArr, iA, length2)));
            erdw.f(eCPoint2, ellipticCurve);
            return eCPoint2;
        }
        int i3 = iA + 1;
        BigInteger bigIntegerD = erdw.d(ellipticCurve);
        int length3 = bArr.length;
        if (length3 != i3) {
            throw new GeneralSecurityException("compressed point has wrong length");
        }
        byte b = bArr[0];
        if (b != 2) {
            if (b != 3) {
                throw new GeneralSecurityException("invalid format");
            }
            z = true;
        }
        BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, length3));
        if (bigInteger.signum() == -1 || bigInteger.compareTo(bigIntegerD) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        }
        return new ECPoint(bigInteger, m(bigInteger, z, ellipticCurve));
    }

    public static byte[] i(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) throws IllegalStateException, GeneralSecurityException {
        try {
            if (!erdw.g(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
                throw new GeneralSecurityException("invalid public key spec");
            }
            ECPoint w = eCPublicKey.getW();
            erdw.f(w, eCPrivateKey.getParams().getCurve());
            PublicKey publicKeyGeneratePublic = ((KeyFactory) ervg.g.a("EC")).generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
            KeyAgreement keyAgreement = (KeyAgreement) ervg.e.a("ECDH");
            keyAgreement.init(eCPrivateKey);
            try {
                keyAgreement.doPhase(publicKeyGeneratePublic, true);
                byte[] bArrGenerateSecret = keyAgreement.generateSecret();
                EllipticCurve curve = eCPrivateKey.getParams().getCurve();
                BigInteger bigInteger = new BigInteger(1, bArrGenerateSecret);
                if (bigInteger.signum() == -1 || bigInteger.compareTo(erdw.d(curve)) >= 0) {
                    throw new GeneralSecurityException("shared secret is out of range");
                }
                m(bigInteger, true, curve);
                return bArrGenerateSecret;
            } catch (IllegalStateException e) {
                throw new GeneralSecurityException(e);
            }
        } catch (IllegalArgumentException | NullPointerException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    public static byte[] j(erux eruxVar, eruz eruzVar, ECPoint eCPoint) {
        return k(g(eruxVar).getCurve(), eruzVar, eCPoint);
    }

    public static byte[] k(EllipticCurve ellipticCurve, eruz eruzVar, ECPoint eCPoint) throws GeneralSecurityException {
        erdw.f(eCPoint, ellipticCurve);
        int iA = a(ellipticCurve);
        int iOrdinal = eruzVar.ordinal();
        if (iOrdinal == 0) {
            int i = iA + 1;
            int i2 = iA + iA + 1;
            byte[] bArr = new byte[i2];
            byte[] bArrA = erdk.a(eCPoint.getAffineX());
            byte[] bArrA2 = erdk.a(eCPoint.getAffineY());
            int length = bArrA2.length;
            System.arraycopy(bArrA2, 0, bArr, i2 - length, length);
            int length2 = bArrA.length;
            System.arraycopy(bArrA, 0, bArr, i - length2, length2);
            bArr[0] = 4;
            return bArr;
        }
        if (iOrdinal == 1) {
            int i3 = iA + 1;
            byte[] bArr2 = new byte[i3];
            byte[] bArrA3 = erdk.a(eCPoint.getAffineX());
            int length3 = bArrA3.length;
            System.arraycopy(bArrA3, 0, bArr2, i3 - length3, length3);
            bArr2[0] = true == eCPoint.getAffineY().testBit(0) ? (byte) 3 : (byte) 2;
            return bArr2;
        }
        if (iOrdinal != 2) {
            throw new GeneralSecurityException("invalid format:".concat(String.valueOf(String.valueOf(eruzVar))));
        }
        int i4 = iA + iA;
        byte[] bArr3 = new byte[i4];
        byte[] bArrA4 = erdk.a(eCPoint.getAffineX());
        int length4 = bArrA4.length;
        if (length4 > iA) {
            bArrA4 = Arrays.copyOfRange(bArrA4, length4 - iA, length4);
        }
        byte[] bArrA5 = erdk.a(eCPoint.getAffineY());
        int length5 = bArrA5.length;
        if (length5 > iA) {
            bArrA5 = Arrays.copyOfRange(bArrA5, length5 - iA, length5);
        }
        int length6 = bArrA5.length;
        System.arraycopy(bArrA5, 0, bArr3, i4 - length6, length6);
        int length7 = bArrA4.length;
        System.arraycopy(bArrA4, 0, bArr3, iA - length7, length7);
        return bArr3;
    }

    public static byte[] l(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i >= length || bArr[i] != 0) {
                break;
            }
            i++;
        }
        if (i == length) {
            i = length - 1;
        }
        int i2 = (bArr[i] & 128) == 128 ? 1 : 0;
        int i3 = length - i;
        byte[] bArr2 = new byte[i3 + i2];
        System.arraycopy(bArr, i, bArr2, i2, i3);
        return bArr2;
    }

    private static BigInteger m(BigInteger bigInteger, boolean z, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigIntegerModPow;
        BigInteger bigInteger2;
        BigInteger bigIntegerD = erdw.d(ellipticCurve);
        BigInteger bigIntegerMod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(bigIntegerD);
        if (bigIntegerD.signum() != 1) {
            throw new InvalidAlgorithmParameterException("p must be positive");
        }
        BigInteger bigIntegerMod2 = bigIntegerMod.mod(bigIntegerD);
        if (bigIntegerMod2.equals(BigInteger.ZERO)) {
            bigInteger2 = BigInteger.ZERO;
        } else {
            if (bigIntegerD.testBit(0) && bigIntegerD.testBit(1)) {
                bigIntegerModPow = bigIntegerMod2.modPow(bigIntegerD.add(BigInteger.ONE).shiftRight(2), bigIntegerD);
            } else {
                bigIntegerModPow = null;
                if (bigIntegerD.testBit(0) && !bigIntegerD.testBit(1)) {
                    BigInteger bigIntegerAdd = BigInteger.ONE;
                    BigInteger bigIntegerShiftRight = bigIntegerD.subtract(BigInteger.ONE).shiftRight(1);
                    int i = 0;
                    while (true) {
                        BigInteger bigIntegerMod3 = bigIntegerAdd.multiply(bigIntegerAdd).subtract(bigIntegerMod2).mod(bigIntegerD);
                        if (bigIntegerMod3.equals(BigInteger.ZERO)) {
                            bigInteger2 = bigIntegerAdd;
                            break;
                        }
                        BigInteger bigIntegerModPow2 = bigIntegerMod3.modPow(bigIntegerShiftRight, bigIntegerD);
                        if (bigIntegerModPow2.add(BigInteger.ONE).equals(bigIntegerD)) {
                            BigInteger bigIntegerShiftRight2 = bigIntegerD.add(BigInteger.ONE).shiftRight(1);
                            BigInteger bigIntegerMod4 = BigInteger.ONE;
                            BigInteger bigInteger3 = bigIntegerAdd;
                            for (int iBitLength = bigIntegerShiftRight2.bitLength() - 2; iBitLength >= 0; iBitLength--) {
                                BigInteger bigIntegerMultiply = bigInteger3.multiply(bigIntegerMod4);
                                BigInteger bigIntegerMod5 = bigInteger3.multiply(bigInteger3).add(bigIntegerMod4.multiply(bigIntegerMod4).mod(bigIntegerD).multiply(bigIntegerMod3)).mod(bigIntegerD);
                                BigInteger bigIntegerMod6 = bigIntegerMultiply.add(bigIntegerMultiply).mod(bigIntegerD);
                                if (bigIntegerShiftRight2.testBit(iBitLength)) {
                                    BigInteger bigIntegerMod7 = bigIntegerMod5.multiply(bigIntegerAdd).add(bigIntegerMod6.multiply(bigIntegerMod3)).mod(bigIntegerD);
                                    bigIntegerMod4 = bigIntegerAdd.multiply(bigIntegerMod6).add(bigIntegerMod5).mod(bigIntegerD);
                                    bigInteger3 = bigIntegerMod7;
                                } else {
                                    bigInteger3 = bigIntegerMod5;
                                    bigIntegerMod4 = bigIntegerMod6;
                                }
                            }
                            bigIntegerModPow = bigInteger3;
                        } else {
                            if (!bigIntegerModPow2.equals(BigInteger.ONE)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                            bigIntegerAdd = bigIntegerAdd.add(BigInteger.ONE);
                            i++;
                            if (i == 128 && !bigIntegerD.isProbablePrime(80)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        }
                    }
                }
            }
            if (bigIntegerModPow != null && bigIntegerModPow.multiply(bigIntegerModPow).mod(bigIntegerD).compareTo(bigIntegerMod2) != 0) {
                throw new GeneralSecurityException("Could not find a modular square root");
            }
            bigInteger2 = bigIntegerModPow;
        }
        return z != bigInteger2.testBit(0) ? bigIntegerD.subtract(bigInteger2).mod(bigIntegerD) : bigInteger2;
    }
}
