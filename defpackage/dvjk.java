package defpackage;

import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvjk {
    public static evqs a(String str, KeyPair keyPair) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        byte[] bArrB = dvhz.b(str);
        try {
            PrivateKey privateKey = keyPair.getPrivate();
            Signature signature = Signature.getInstance("SHA256withECDSA");
            signature.initSign(privateKey);
            signature.update(bArrB);
            return evqs.x(signature.sign());
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            dvhv.c("CryptoUtils", e.toString().concat(" failed to signBytes"));
            return null;
        }
    }
}
