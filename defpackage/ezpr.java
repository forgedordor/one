package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezpr extends evsn implements evui {
    public static final ezpr a;
    private static volatile evuo d;
    public long b;
    public long c;

    static {
        ezpr ezprVar = new ezpr();
        a = ezprVar;
        evsn.registerDefaultInstance(ezpr.class, ezprVar);
    }

    private ezpr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0002\u0004\u0002\u0000\u0000\u0000\u0002\u0003\u0004\u0002", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ezpr();
        }
        if (iOrdinal == 4) {
            return new ezpq();
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
        synchronized (ezpr.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
