package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfsr extends evsn implements evui {
    public static final cfsr a;
    private static volatile evuo d;
    public int b;
    public ezns c;

    static {
        cfsr cfsrVar = new cfsr();
        a = cfsrVar;
        evsn.registerDefaultInstance(cfsr.class, cfsrVar);
    }

    private cfsr() {
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
            return new cfsr();
        }
        if (iOrdinal == 4) {
            return new cfsq();
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
        synchronized (cfsr.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
