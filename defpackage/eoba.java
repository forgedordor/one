package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoba extends evsn implements evui {
    public static final eoba a;
    private static volatile evuo f;
    public int b;
    public int c;
    public evtg d = emptyProtobufList();
    public evsx e = emptyIntList();

    static {
        eoba eobaVar = new eoba();
        a = eobaVar;
        evsn.registerDefaultInstance(eoba.class, eobaVar);
    }

    private eoba() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0003,", new Object[]{"b", "c", "d", ensl.class, "e"});
        }
        if (iOrdinal == 3) {
            return new eoba();
        }
        if (iOrdinal == 4) {
            return new eoax();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eoba.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
