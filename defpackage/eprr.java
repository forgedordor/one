package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eprr extends evsn implements evui {
    public static final eprr a;
    private static volatile evuo c;
    public evqs b = evqs.b;
    private int d;

    static {
        eprr eprrVar = new eprr();
        a = eprrVar;
        evsn.registerDefaultInstance(eprr.class, eprrVar);
    }

    private eprr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new eprr();
        }
        if (iOrdinal == 4) {
            return new eprq();
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
        synchronized (eprr.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
