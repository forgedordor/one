package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fflc {
    public static final BigInteger a = BigInteger.valueOf(1);
    public static final BigInteger b = BigInteger.valueOf(2);

    static {
        BigInteger.valueOf(3L);
    }

    public static void a(BigInteger bigInteger) {
        if (bigInteger.signum() <= 0 || bigInteger.bitLength() < 2) {
            throw new IllegalArgumentException("'candidate' must be non-null and >= 2");
        }
    }
}
