package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enof extends evsn implements evui {
    public static final enof a;
    private static volatile evuo e;
    public int b;
    public enod c;
    public int d;

    static {
        enof enofVar = new enof();
        a = enofVar;
        evsn.registerDefaultInstance(enof.class, enofVar);
    }

    private enof() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003᠌\u0002", new Object[]{"b", "c", "d", enoe.a});
        }
        if (iOrdinal == 3) {
            return new enof();
        }
        if (iOrdinal == 4) {
            return new ennz();
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
        synchronized (enof.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
