package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class endy extends evsn implements evui {
    public static final endy a;
    private static volatile evuo f;
    public int b;
    public int c = 1;
    public int d;
    public enof e;

    static {
        endy endyVar = new endy();
        a = endyVar;
        evsn.registerDefaultInstance(endy.class, endyVar);
    }

    private endy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0004ဉ\u0003", new Object[]{"b", "c", endx.a, "d", endz.a, "e"});
        }
        if (iOrdinal == 3) {
            return new endy();
        }
        if (iOrdinal == 4) {
            return new endw();
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
        synchronized (endy.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
