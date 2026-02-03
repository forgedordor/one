package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjls extends evsn implements evui {
    public static final cjls a;
    private static volatile evuo e;
    public int b;
    public evqe c;
    public cjgr d;

    static {
        cjls cjlsVar = new cjls();
        a = cjlsVar;
        evsn.registerDefaultInstance(cjls.class, cjlsVar);
    }

    private cjls() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new cjls();
        }
        if (iOrdinal == 4) {
            return new cjlr();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cjls.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
