package defpackage;

import org.whispersystems.curve25519.Curve25519;
import org.whispersystems.curve25519.Curve25519KeyPair;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgvz {
    public static fgwc a() {
        Curve25519KeyPair curve25519KeyPairGenerateKeyPair = Curve25519.getInstance(Curve25519.BEST).generateKeyPair();
        return new fgwc(new fgwb(curve25519KeyPairGenerateKeyPair.getPublicKey()), new fgwa(curve25519KeyPairGenerateKeyPair.getPrivateKey()));
    }

    public static fgwb b(byte[] bArr) throws fgvy {
        int i = bArr[0] & 255;
        if (i != 5) {
            throw new fgvy(a.g(i, "Bad key type: "));
        }
        byte[] bArr2 = new byte[32];
        System.arraycopy(bArr, 1, bArr2, 0, 32);
        return new fgwb(bArr2);
    }
}
