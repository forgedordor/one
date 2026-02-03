package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class excd extends evsn implements evui {
    public static final excd a;
    private static volatile evuo d;
    public int b;
    public evtg c = emptyProtobufList();
    private int e;

    static {
        excd excdVar = new excd();
        a = excdVar;
        evsn.registerDefaultInstance(excd.class, excdVar);
    }

    private excd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"e", "b", ewus.a, "c", ewvj.class});
        }
        if (iOrdinal == 3) {
            return new excd();
        }
        if (iOrdinal == 4) {
            return new excc();
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
        synchronized (excd.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
