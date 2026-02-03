package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eviu extends evsn implements evui {
    public static final eviu a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        eviu eviuVar = new eviu();
        a = eviuVar;
        evsn.registerDefaultInstance(eviu.class, eviuVar);
    }

    private eviu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", evix.class});
        }
        if (iOrdinal == 3) {
            return new eviu();
        }
        if (iOrdinal == 4) {
            return new evit();
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
        synchronized (eviu.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
