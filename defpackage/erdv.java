package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erdv {
    static final erdv a = new erdv(BigInteger.ONE, BigInteger.ONE, BigInteger.ZERO);
    final BigInteger b;
    final BigInteger c;
    final BigInteger d;

    public erdv(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.b = bigInteger;
        this.c = bigInteger2;
        this.d = bigInteger3;
    }

    final boolean a() {
        return this.d.equals(BigInteger.ZERO);
    }
}
