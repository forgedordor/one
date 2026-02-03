package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epfc extends evsn implements evui {
    public static final epfc a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        epfc epfcVar = new epfc();
        a = epfcVar;
        evsn.registerDefaultInstance(epfc.class, epfcVar);
    }

    private epfc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"b", epey.class});
        }
        if (iOrdinal == 3) {
            return new epfc();
        }
        if (iOrdinal == 4) {
            return new epfb();
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
        synchronized (epfc.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
