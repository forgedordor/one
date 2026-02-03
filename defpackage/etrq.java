package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etrq extends evsn implements evui {
    public static final etrq a;
    private static volatile evuo g;
    public int b;
    public etru c;
    public evtg d = emptyProtobufList();
    public int e;
    public int f;

    static {
        etrq etrqVar = new etrq();
        a = etrqVar;
        evsn.registerDefaultInstance(etrq.class, etrqVar);
    }

    private etrq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003င\u0001\u0004င\u0002", new Object[]{"b", "c", "d", etrs.class, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new etrq();
        }
        if (iOrdinal == 4) {
            return new etrp();
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
        synchronized (etrq.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
