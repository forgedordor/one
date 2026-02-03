package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etwq extends evsn implements evui {
    public static final etwq a;
    private static volatile evuo c;
    public etwy b;
    private int d;

    static {
        etwq etwqVar = new etwq();
        a = etwqVar;
        evsn.registerDefaultInstance(etwq.class, etwqVar);
    }

    private etwq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new etwq();
        }
        if (iOrdinal == 4) {
            return new etwp();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etwq.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
