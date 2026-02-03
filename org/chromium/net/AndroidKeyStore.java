package org.chromium.net;

import defpackage.a;
import defpackage.ffyc;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class AndroidKeyStore {
    private static final String TAG = "AndroidKeyStore";

    private static byte[] encryptWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            Cipher cipher = Cipher.getInstance(str);
            try {
                cipher.init(1, privateKey);
                return cipher.doFinal(bArr);
            } catch (Exception e) {
                ffyc.c(TAG, "Exception while encrypting input with " + str + " and " + privateKey.getAlgorithm() + " private key (" + privateKey.getClass().getName() + "): " + e.toString());
                return null;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            ffyc.c(TAG, a.G(str, e2, "Cipher ", " not supported: "));
            return null;
        }
    }

    private static String getPrivateKeyClassName(PrivateKey privateKey) {
        return privateKey.getClass().getName();
    }

    private static boolean privateKeySupportsCipher(PrivateKey privateKey, String str) throws InvalidKeyException {
        try {
            Cipher.getInstance(str).init(1, privateKey);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        } catch (Exception e) {
            ffyc.c(TAG, a.G(str, e, "Exception while checking support for ", ": "));
            return false;
        }
    }

    private static boolean privateKeySupportsSignature(PrivateKey privateKey, String str) throws InvalidKeyException {
        try {
            Signature.getInstance(str).initSign(privateKey);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            return false;
        } catch (Exception e) {
            ffyc.c(TAG, a.G(str, e, "Exception while checking support for ", ": "));
            return false;
        }
    }

    private static byte[] signWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        try {
            Signature signature = Signature.getInstance(str);
            try {
                signature.initSign(privateKey);
                signature.update(bArr);
                return signature.sign();
            } catch (Exception e) {
                ffyc.c(TAG, "Exception while signing message with " + str + " and " + privateKey.getAlgorithm() + " private key (" + privateKey.getClass().getName() + "): " + e.toString());
                return null;
            }
        } catch (NoSuchAlgorithmException e2) {
            ffyc.c(TAG, a.G(str, e2, "Signature algorithm ", " not supported: "));
            return null;
        }
    }
}
