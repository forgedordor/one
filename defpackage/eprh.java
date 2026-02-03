package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eprh extends evsn implements evui {
    public static final eprh a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        eprh eprhVar = new eprh();
        a = eprhVar;
        evsn.registerDefaultInstance(eprh.class, eprhVar);
    }

    private eprh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", eprf.class});
        }
        if (iOrdinal == 3) {
            return new eprh();
        }
        if (iOrdinal == 4) {
            return new eprg();
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
        synchronized (eprh.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
