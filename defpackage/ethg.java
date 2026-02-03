package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ethg extends evsn implements evui {
    public static final ethg a;
    private static volatile evuo g;
    public int b;
    public etht c;
    public int d;
    public evvp e;
    public ethf f;

    static {
        ethg ethgVar = new ethg();
        a = ethgVar;
        evsn.registerDefaultInstance(ethg.class, ethgVar);
    }

    private ethg() {
        evqs evqsVar = evqs.b;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001\u0005ဉ\u0002", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ethg();
        }
        if (iOrdinal == 4) {
            return new ethd();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ethg.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
