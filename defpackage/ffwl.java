package defpackage;

import java.math.BigInteger;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffwl {
    private final Map a = new WeakHashMap();
    private final BigInteger[] b = new BigInteger[8];
    private int c = 0;

    public final synchronized void a(BigInteger bigInteger) {
        this.a.put(bigInteger, Boolean.TRUE);
        BigInteger[] bigIntegerArr = this.b;
        int i = this.c;
        bigIntegerArr[i] = bigInteger;
        this.c = (i + 1) % 8;
    }

    public final synchronized boolean b(BigInteger bigInteger) {
        return this.a.containsKey(bigInteger);
    }
}
