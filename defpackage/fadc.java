package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fadc extends evsn implements evui {
    public static final fadc a;
    private static volatile evuo d;
    public ezol b;
    public evtg c = emptyProtobufList();
    private int e;

    static {
        fadc fadcVar = new fadc();
        a = fadcVar;
        evsn.registerDefaultInstance(fadc.class, fadcVar);
    }

    private fadc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"e", "b", "c", faeb.class});
        }
        if (iOrdinal == 3) {
            return new fadc();
        }
        if (iOrdinal == 4) {
            return new fadb();
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
        synchronized (fadc.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
