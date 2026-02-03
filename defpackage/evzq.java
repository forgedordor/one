package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evzq extends evsn implements evui {
    public static final evzq a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        evzq evzqVar = new evzq();
        a = evzqVar;
        evsn.registerDefaultInstance(evzq.class, evzqVar);
    }

    private evzq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", evzs.class});
        }
        if (iOrdinal == 3) {
            return new evzq();
        }
        if (iOrdinal == 4) {
            return new evzp();
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
        synchronized (evzq.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
