package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eruo implements eqsd {
    public final byte[] b;
    public final byte[] c;
    private final ervv f;
    private static final Collection d = Arrays.asList(64);
    private static final byte[] e = new byte[16];
    public static final ThreadLocal a = new erun();

    private eruo(byte[] bArr, erwn erwnVar) throws GeneralSecurityException {
        if (!eqza.a(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        int length = bArr.length;
        if (!d.contains(Integer.valueOf(length))) {
            throw new InvalidKeyException(a.e(length, "invalid key size: ", " bytes; key must have 64 bytes"));
        }
        int i = length >> 1;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i);
        this.b = Arrays.copyOfRange(bArr, i, length);
        this.f = new ervv(bArrCopyOfRange);
        this.c = erwnVar.c();
    }

    public static eqsd a(eqzd eqzdVar) {
        return new eruo(eqzdVar.b.d(), eqzdVar.c);
    }

    public final byte[] b(byte[]... bArr) throws GeneralSecurityException {
        byte[] bArrC;
        ervv ervvVar = this.f;
        byte[] bArrA = ervvVar.a(e, 16);
        for (char c = 0; c <= 0; c = 1) {
            byte[] bArr2 = bArr[0];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrA = erup.c(erhx.b(bArrA), ervvVar.a(bArr2, 16));
        }
        byte[] bArr3 = bArr[1];
        int length = bArr3.length;
        if (length >= 16) {
            int length2 = bArrA.length;
            if (length < length2) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            bArrC = Arrays.copyOf(bArr3, length);
            for (int i = 0; i < bArrA.length; i++) {
                int i2 = (length - length2) + i;
                bArrC[i2] = (byte) (bArrC[i2] ^ bArrA[i]);
            }
        } else {
            bArrC = erup.c(erhx.a(bArr3), erhx.b(bArrA));
        }
        return ervvVar.a(bArrC, 16);
    }
}
