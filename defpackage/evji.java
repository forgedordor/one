package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evji extends evsn implements evui {
    public static final evji a;
    private static volatile evuo d;
    public int b;
    public evmx c;

    static {
        evji evjiVar = new evji();
        a = evjiVar;
        evsn.registerDefaultInstance(evji.class, evjiVar);
    }

    private evji() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new evji();
        }
        if (iOrdinal == 4) {
            return new evjh();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (evji.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
