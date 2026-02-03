package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezkj extends evsn implements evui {
    public static final ezkj a;
    private static volatile evuo b;
    private int c;
    private ezpp d;

    static {
        ezkj ezkjVar = new ezkj();
        a = ezkjVar;
        evsn.registerDefaultInstance(ezkj.class, ezkjVar);
    }

    private ezkj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new ezkj();
        }
        if (iOrdinal == 4) {
            return new ezki();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = b;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezkj.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
