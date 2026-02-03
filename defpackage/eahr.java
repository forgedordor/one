package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eahr extends evsn implements evui {
    public static final eahr a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        eahr eahrVar = new eahr();
        a = eahrVar;
        evsn.registerDefaultInstance(eahr.class, eahrVar);
    }

    private eahr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", eaim.class});
        }
        if (iOrdinal == 3) {
            return new eahr();
        }
        if (iOrdinal == 4) {
            return new eahq();
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
        synchronized (eahr.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
