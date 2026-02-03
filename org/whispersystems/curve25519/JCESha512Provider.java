package org.whispersystems.curve25519;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.whispersystems.curve25519.java.Sha512;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class JCESha512Provider implements Sha512 {
    @Override // org.whispersystems.curve25519.java.Sha512
    public void calculateDigest(byte[] bArr, byte[] bArr2, long j) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.update(bArr2, 0, (int) j);
            byte[] bArrDigest = messageDigest.digest();
            System.arraycopy(bArrDigest, 0, bArr, 0, bArrDigest.length);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
