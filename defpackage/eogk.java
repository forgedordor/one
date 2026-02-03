package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eogk extends evsn implements evui {
    public static final eogk a;
    private static volatile evuo c;
    public evtg b = evsn.emptyProtobufList();

    static {
        eogk eogkVar = new eogk();
        a = eogkVar;
        evsn.registerDefaultInstance(eogk.class, eogkVar);
    }

    private eogk() {
        evsn.emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001a", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new eogk();
        }
        if (iOrdinal == 4) {
            return new eogj();
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
        synchronized (eogk.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
