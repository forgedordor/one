package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eozz extends evsn implements evui {
    public static final eozz a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        eozz eozzVar = new eozz();
        a = eozzVar;
        evsn.registerDefaultInstance(eozz.class, eozzVar);
    }

    private eozz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", eozy.class});
        }
        if (iOrdinal == 3) {
            return new eozz();
        }
        if (iOrdinal == 4) {
            return new eozw();
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
        synchronized (eozz.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
