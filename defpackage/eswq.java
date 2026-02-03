package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eswq extends evsn implements evui {
    public static final eswq a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        eswq eswqVar = new eswq();
        a = eswqVar;
        evsn.registerDefaultInstance(eswq.class, eswqVar);
    }

    private eswq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006᠌\u0000", new Object[]{"b", "c", eswp.a});
        }
        if (iOrdinal == 3) {
            return new eswq();
        }
        if (iOrdinal == 4) {
            return new eswo();
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
        synchronized (eswq.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
