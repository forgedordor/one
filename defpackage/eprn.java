package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eprn extends evsn implements evui {
    public static final eprn a;
    private static volatile evuo g;
    public int b;
    public epwn d;
    public String c = "";
    public evtg e = emptyProtobufList();
    public evqs f = evqs.b;

    static {
        eprn eprnVar = new eprn();
        a = eprnVar;
        evsn.registerDefaultInstance(eprn.class, eprnVar);
    }

    private eprn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ለ\u0000\u0002ဉ\u0001\u0003ည\u0002\u0004\u001c", new Object[]{"b", "c", "d", "f", "e"});
        }
        if (iOrdinal == 3) {
            return new eprn();
        }
        if (iOrdinal == 4) {
            return new eprm();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eprn.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
