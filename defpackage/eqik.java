package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqik extends evsn implements evui {
    public static final eqik a;
    private static volatile evuo d;
    public evtg b = emptyProtobufList();
    public evtg c = emptyProtobufList();

    static {
        eqik eqikVar = new eqik();
        a = eqikVar;
        evsn.registerDefaultInstance(eqik.class, eqikVar);
    }

    private eqik() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"b", eqnl.class, "c", exmy.class});
        }
        if (iOrdinal == 3) {
            return new eqik();
        }
        if (iOrdinal == 4) {
            return new eqij();
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
        synchronized (eqik.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
