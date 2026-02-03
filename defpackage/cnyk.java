package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnyk extends evsn implements evui {
    public static final cnyk a;
    private static volatile evuo k;
    public int b;
    public cnyz c;
    public evvp d;
    public evvp e;
    public evvp f;
    public int g;
    public int h;
    public evvp i;
    public boolean j;

    static {
        cnyk cnykVar = new cnyk();
        a = cnykVar;
        evsn.registerDefaultInstance(cnyk.class, cnykVar);
    }

    private cnyk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u0004\u0006\u0004\u0007ဉ\u0004\b\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new cnyk();
        }
        if (iOrdinal == 4) {
            return new cnyj();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cnyk.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
