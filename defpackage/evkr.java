package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evkr extends evsn implements evui {
    public static final evkr a;
    private static volatile evuo d;
    public evtg b = evsn.emptyProtobufList();
    public evtg c = evsn.emptyProtobufList();

    static {
        evkr evkrVar = new evkr();
        a = evkrVar;
        evsn.registerDefaultInstance(evkr.class, evkrVar);
    }

    private evkr() {
        evsn.emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001a", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new evkr();
        }
        if (iOrdinal == 4) {
            return new evkq();
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
        synchronized (evkr.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
