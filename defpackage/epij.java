package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epij extends evsn implements evui {
    public static final epij a;
    private static volatile evuo d;
    public evtg b = emptyProtobufList();
    public int c;

    static {
        epij epijVar = new epij();
        a = epijVar;
        evsn.registerDefaultInstance(epij.class, epijVar);
    }

    private epij() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\f", new Object[]{"b", ezgi.class, "c"});
        }
        if (iOrdinal == 3) {
            return new epij();
        }
        if (iOrdinal == 4) {
            return new epii();
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
        synchronized (epij.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
