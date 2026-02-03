package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etwm extends evsn implements evui {
    public static final etwm a;
    private static volatile evuo c;
    public etud b;
    private int d;

    static {
        etwm etwmVar = new etwm();
        a = etwmVar;
        evsn.registerDefaultInstance(etwm.class, etwmVar);
    }

    private etwm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new etwm();
        }
        if (iOrdinal == 4) {
            return new etwl();
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
        synchronized (etwm.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
