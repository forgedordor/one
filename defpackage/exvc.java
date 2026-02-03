package defpackage;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHPublicKeySpec;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exvc {
    public static final BigInteger a;
    public static final BigInteger b;
    private static final Boolean c;
    private static final BigInteger d;
    private static final BigInteger e;
    private static final ECParameterSpec f;
    private static final BigInteger g;
    private static final BigInteger h;
    private static final BigInteger i;

    static {
        boolean z;
        try {
            h();
            z = false;
        } catch (Exception unused) {
            z = true;
        }
        c = Boolean.valueOf(z);
        d = new BigInteger("1");
        BigInteger bigInteger = new BigInteger("2");
        e = bigInteger;
        ECParameterSpec params = f() ? null : ((ECPublicKey) b().getPublic()).getParams();
        f = params;
        g = f() ? null : ((ECFieldFp) params.getCurve().getField()).getP();
        h = f() ? null : params.getCurve().getA();
        i = f() ? null : params.getCurve().getB();
        a = new BigInteger("FFFFFFFFFFFFFFFFC90FDAA22168C234C4C6628B80DC1CD129024E088A67CC74020BBEA63B139B22514A08798E3404DDEF9519B3CD3A431B302B0A6DF25F14374FE1356D6D51C245E485B576625E7EC6F44C42E9A637ED6B0BFF5CB6F406B7EDEE386BFB5A899FA5AE9F24117C4B1FE649286651ECE45B3DC2007CB8A163BF0598DA48361C55D39A69163FA8FD24CF5F83655D23DCA3AD961C62F356208552BB9ED529077096966D670C354E4ABC9804F1746C08CA18217C32905E462E36CE3BE39E772C180E86039B2783A2EC07A28FB5C55DF06F4C52C9DE2BCBF6955817183995497CEA956AE515D2261898FA051015728E5A8AACAA68FFFFFFFFFFFFFFFF", 16);
        b = bigInteger;
    }

    public static exvi a(PublicKey publicKey) {
        publicKey.getClass();
        if (publicKey instanceof ECPublicKey) {
            exvh exvhVar = (exvh) exvi.a.createBuilder();
            exvhVar.copyOnWrite();
            exvi exviVar = (exvi) exvhVar.instance;
            exviVar.c = 1;
            exviVar.b |= 1;
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            exvf exvfVar = (exvf) exvg.a.createBuilder();
            evqs evqsVarX = evqs.x(eCPublicKey.getW().getAffineX().toByteArray());
            exvfVar.copyOnWrite();
            exvg exvgVar = (exvg) exvfVar.instance;
            exvgVar.b = 1 | exvgVar.b;
            exvgVar.c = evqsVarX;
            evqs evqsVarX2 = evqs.x(eCPublicKey.getW().getAffineY().toByteArray());
            exvfVar.copyOnWrite();
            exvg exvgVar2 = (exvg) exvfVar.instance;
            exvgVar2.b |= 2;
            exvgVar2.d = evqsVarX2;
            exvg exvgVar3 = (exvg) exvfVar.build();
            exvhVar.copyOnWrite();
            exvi exviVar2 = (exvi) exvhVar.instance;
            exvgVar3.getClass();
            exviVar2.d = exvgVar3;
            exviVar2.b |= 2;
            return (exvi) exvhVar.build();
        }
        if (!(publicKey instanceof RSAPublicKey)) {
            if (!(publicKey instanceof DHPublicKey)) {
                throw new IllegalArgumentException("Unsupported PublicKey type");
            }
            exvh exvhVar2 = (exvh) exvi.a.createBuilder();
            exvhVar2.copyOnWrite();
            exvi exviVar3 = (exvi) exvhVar2.instance;
            exviVar3.c = 3;
            exviVar3.b |= 1;
            exvd exvdVar = (exvd) exve.a.createBuilder();
            evqs evqsVarX3 = evqs.x(((DHPublicKey) publicKey).getY().toByteArray());
            exvdVar.copyOnWrite();
            exve exveVar = (exve) exvdVar.instance;
            exveVar.b = 1 | exveVar.b;
            exveVar.c = evqsVarX3;
            exve exveVar2 = (exve) exvdVar.build();
            exvhVar2.copyOnWrite();
            exvi exviVar4 = (exvi) exvhVar2.instance;
            exveVar2.getClass();
            exviVar4.f = exveVar2;
            exviVar4.b |= 8;
            return (exvi) exvhVar2.build();
        }
        exvh exvhVar3 = (exvh) exvi.a.createBuilder();
        exvhVar3.copyOnWrite();
        exvi exviVar5 = (exvi) exvhVar3.instance;
        exviVar5.c = 2;
        exviVar5.b |= 1;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey;
        exvl exvlVar = (exvl) exvm.a.createBuilder();
        evqs evqsVarX4 = evqs.x(rSAPublicKey.getModulus().toByteArray());
        exvlVar.copyOnWrite();
        exvm exvmVar = (exvm) exvlVar.instance;
        exvmVar.b = 1 | exvmVar.b;
        exvmVar.c = evqsVarX4;
        int iIntValue = rSAPublicKey.getPublicExponent().intValue();
        exvlVar.copyOnWrite();
        exvm exvmVar2 = (exvm) exvlVar.instance;
        exvmVar2.b = 2 | exvmVar2.b;
        exvmVar2.d = iIntValue;
        exvm exvmVar3 = (exvm) exvlVar.build();
        exvhVar3.copyOnWrite();
        exvi exviVar6 = (exvi) exvhVar3.instance;
        exvmVar3.getClass();
        exviVar6.e = exvmVar3;
        exviVar6.b |= 4;
        return (exvi) exvhVar3.build();
    }

    public static KeyPair b() {
        return h().generateKeyPair();
    }

    public static ECPublicKey c(exvg exvgVar) throws InvalidKeySpecException {
        int i2 = exvgVar.b;
        if ((i2 & 1) == 0 || (i2 & 2) == 0) {
            throw new InvalidKeySpecException("Key is missing a required coordinate");
        }
        if (f()) {
            throw new InvalidKeySpecException("Elliptic Curve keys not supported on this platform");
        }
        byte[] bArrI = exvgVar.c.I();
        byte[] bArrI2 = exvgVar.d.I();
        try {
            i(bArrI);
            i(bArrI2);
            BigInteger bigInteger = new BigInteger(bArrI);
            BigInteger bigInteger2 = new BigInteger(bArrI2);
            if (bigInteger.signum() == -1 || bigInteger2.signum() == -1) {
                throw new InvalidKeySpecException("Point encoding must use only non-negative integers");
            }
            BigInteger bigInteger3 = g;
            if (bigInteger.compareTo(bigInteger3) >= 0 || bigInteger2.compareTo(bigInteger3) >= 0) {
                throw new InvalidKeySpecException("Point lies outside of the expected field");
            }
            if (g(bigInteger2, bigInteger3).equals(g(bigInteger, bigInteger3).add(h).multiply(bigInteger).mod(bigInteger3).add(i).mod(bigInteger3))) {
                return (ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(bigInteger, bigInteger2), f));
            }
            throw new InvalidKeySpecException("Point does not lie on the expected curve");
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static RSAPublicKey d(exvm exvmVar) throws InvalidKeySpecException {
        if ((exvmVar.b & 1) == 0) {
            throw new InvalidKeySpecException("required field is missing");
        }
        byte[] bArrI = exvmVar.c.I();
        int length = bArrI.length;
        if (length == 0 || length > 257) {
            throw new InvalidKeySpecException();
        }
        BigInteger bigInteger = new BigInteger(bArrI);
        if (bigInteger.bitLength() != 2048) {
            throw new InvalidKeySpecException();
        }
        try {
            return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(bigInteger, BigInteger.valueOf(exvmVar.d)));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static DHPublicKey e(exve exveVar) throws InvalidKeySpecException {
        if ((exveVar.b & 1) == 0) {
            throw new InvalidKeySpecException("required field is missing");
        }
        byte[] bArrI = exveVar.c.I();
        int length = bArrI.length;
        if (length == 0 || length > 257) {
            throw new InvalidKeySpecException();
        }
        try {
            BigInteger bigInteger = new BigInteger(bArrI);
            BigInteger bigInteger2 = d;
            if (bigInteger.compareTo(bigInteger2) > 0) {
                BigInteger bigInteger3 = a;
                if (bigInteger.compareTo(bigInteger3.subtract(bigInteger2)) < 0) {
                    try {
                        return (DHPublicKey) KeyFactory.getInstance("DH").generatePublic(new DHPublicKeySpec(bigInteger, bigInteger3, b));
                    } catch (NoSuchAlgorithmException e2) {
                        throw new AssertionError(e2);
                    }
                }
            }
            throw new InvalidKeySpecException();
        } catch (NumberFormatException e3) {
            throw new InvalidKeySpecException(e3);
        }
    }

    public static boolean f() {
        return c.booleanValue();
    }

    private static BigInteger g(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.multiply(bigInteger).mod(bigInteger2);
    }

    private static KeyPairGenerator h() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
            try {
                try {
                    keyPairGenerator.initialize(new ECGenParameterSpec("prime256v1"));
                    return keyPairGenerator;
                } catch (InvalidAlgorithmParameterException unused) {
                    keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
                    return keyPairGenerator;
                }
            } catch (InvalidAlgorithmParameterException e2) {
                throw new RuntimeException("Unable to find the NIST P-256 curve", e2);
            }
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static void i(byte[] bArr) throws InvalidKeySpecException {
        int length = bArr.length;
        if (length == 0 || length > 33 || (length == 33 && bArr[0] != 0)) {
            throw new InvalidKeySpecException();
        }
    }
}
