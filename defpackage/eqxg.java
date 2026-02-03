package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqxg {
    private static final ThreadLocal a = new eqxf();

    public static AlgorithmParameterSpec a(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public static AlgorithmParameterSpec b(byte[] bArr, int i, int i2) {
        Integer numC = ergh.c();
        if (numC != null) {
            numC.intValue();
        }
        return new GCMParameterSpec(128, bArr, i, i2);
    }

    public static Cipher c() {
        return (Cipher) a.get();
    }

    public static SecretKey d(byte[] bArr) throws InvalidAlgorithmParameterException {
        erwk.a(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }
}
