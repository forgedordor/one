package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eryk extends evsn implements evui {
    public static final eryk a;
    private static volatile evuo f;
    public evsx b = emptyIntList();
    public evsx c = emptyIntList();
    public evsx d = emptyIntList();
    public evsx e = emptyIntList();

    static {
        eryk erykVar = new eryk();
        a = erykVar;
        evsn.registerDefaultInstance(eryk.class, erykVar);
    }

    private eryk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001'\u0002'\u0003'\u0004'", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eryk();
        }
        if (iOrdinal == 4) {
            return new eryj();
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
        synchronized (eryk.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
