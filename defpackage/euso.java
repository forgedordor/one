package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euso extends evsn implements evui {
    public static final euso a;
    private static volatile evuo e;
    public int b;
    public eybk c;
    public evvp d;
    private int f;

    static {
        euso eusoVar = new euso();
        a = eusoVar;
        evsn.registerDefaultInstance(euso.class, eusoVar);
    }

    private euso() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"f", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new euso();
        }
        if (iOrdinal == 4) {
            return new eusm();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (euso.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
