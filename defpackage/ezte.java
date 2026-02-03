package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezte extends evsn implements evui {
    public static final ezte a;
    private static volatile evuo c;
    public evqs b = evqs.b;

    static {
        ezte ezteVar = new ezte();
        a = ezteVar;
        evsn.registerDefaultInstance(ezte.class, ezteVar);
    }

    private ezte() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\n", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new ezte();
        }
        if (iOrdinal == 4) {
            return new eztd();
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
        synchronized (ezte.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
