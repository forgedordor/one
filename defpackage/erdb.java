package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erdb implements erda {
    public static final /* synthetic */ int b = 0;
    private static final byte[] c = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 110, 4, 34, 4, 32};
    private static final byte[] d = {48, 42, 48, 5, 6, 3, 43, 101, 110, 3, 33, 0};
    final Provider a;

    public erdb(Provider provider) {
        this.a = provider;
    }

    @Override // defpackage.erda
    public final ercz a() throws GeneralSecurityException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("XDH", this.a);
        keyPairGenerator.initialize(255);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        byte[] encoded = keyPairGenerateKeyPair.getPrivate().getEncoded();
        if (encoded.length != 48) {
            throw new GeneralSecurityException("Invalid encoded private key length");
        }
        if (!ergh.e(c, encoded)) {
            throw new GeneralSecurityException("Invalid encoded private key prefix");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(encoded, 16, 48);
        byte[] encoded2 = keyPairGenerateKeyPair.getPublic().getEncoded();
        if (encoded2.length != 44) {
            throw new GeneralSecurityException("Invalid encoded public key length");
        }
        if (ergh.e(d, encoded2)) {
            return new ercz(bArrCopyOfRange, Arrays.copyOfRange(encoded2, 12, 44));
        }
        throw new GeneralSecurityException("Invalid encoded public key prefix");
    }

    @Override // defpackage.erda
    public final byte[] b(byte[] bArr, byte[] bArr2) throws IllegalStateException, InvalidKeySpecException, NoSuchAlgorithmException, InvalidKeyException {
        Provider provider = this.a;
        KeyFactory keyFactory = KeyFactory.getInstance("XDH", provider);
        if (bArr.length != 32) {
            throw new InvalidKeyException("Invalid X25519 private key");
        }
        PrivateKey privateKeyGeneratePrivate = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(erup.b(c, bArr)));
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Invalid X25519 public key");
        }
        PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(new X509EncodedKeySpec(erup.b(d, bArr2)));
        KeyAgreement keyAgreement = KeyAgreement.getInstance("XDH", provider);
        keyAgreement.init(privateKeyGeneratePrivate);
        keyAgreement.doPhase(publicKeyGeneratePublic, true);
        return keyAgreement.generateSecret();
    }
}
