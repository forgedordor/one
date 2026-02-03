package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eprz extends evsn implements evui {
    public static final eprz a;
    private static volatile evuo c;
    public evqs b = evqs.b;
    private int d;

    static {
        eprz eprzVar = new eprz();
        a = eprzVar;
        evsn.registerDefaultInstance(eprz.class, eprzVar);
    }

    private eprz() {
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
            return new eprz();
        }
        if (iOrdinal == 4) {
            return new epry();
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
        synchronized (eprz.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
