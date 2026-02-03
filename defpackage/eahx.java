package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eahx extends evsn implements evui {
    public static final eahx a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        eahx eahxVar = new eahx();
        a = eahxVar;
        evsn.registerDefaultInstance(eahx.class, eahxVar);
    }

    private eahx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", eahr.class, eaht.class, eahn.class});
        }
        if (iOrdinal == 3) {
            return new eahx();
        }
        if (iOrdinal == 4) {
            return new eahw();
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
        synchronized (eahx.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
