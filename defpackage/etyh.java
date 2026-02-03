package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etyh extends evsn implements evui {
    public static final etyh a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        etyh etyhVar = new etyh();
        a = etyhVar;
        evsn.registerDefaultInstance(etyh.class, etyhVar);
    }

    private etyh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"b", etyw.class});
        }
        if (iOrdinal == 3) {
            return new etyh();
        }
        if (iOrdinal == 4) {
            return new etyg();
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
        synchronized (etyh.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
