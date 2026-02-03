package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eysb extends evsn implements evui {
    public static final eysb a;
    private static volatile evuo d;
    public ezop b;
    public evqs c = evqs.b;
    private int e;

    static {
        eysb eysbVar = new eysb();
        a = eysbVar;
        evsn.registerDefaultInstance(eysb.class, eysbVar);
    }

    private eysb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003\n", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new eysb();
        }
        if (iOrdinal == 4) {
            return new eysa();
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
        synchronized (eysb.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
