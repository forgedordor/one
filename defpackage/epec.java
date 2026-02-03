package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epec extends evsn implements evui {
    public static final epec a;
    private static volatile evuo f;
    public int b;
    public evtg c = emptyProtobufList();
    public eoxc d;
    public epcy e;

    static {
        epec epecVar = new epec();
        a = epecVar;
        evsn.registerDefaultInstance(epec.class, epecVar);
    }

    private epec() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002\u001b\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"b", "c", epew.class, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new epec();
        }
        if (iOrdinal == 4) {
            return new epeb();
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
        synchronized (epec.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
