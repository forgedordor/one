package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjkq extends evsn implements evui {
    public static final cjkq a;
    private static volatile evuo f;
    public int b;
    public evqe c;
    public cjgr d;
    public cjjw e;

    static {
        cjkq cjkqVar = new cjkq();
        a = cjkqVar;
        evsn.registerDefaultInstance(cjkq.class, cjkqVar);
    }

    private cjkq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new cjkq();
        }
        if (iOrdinal == 4) {
            return new cjkp();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cjkq.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
