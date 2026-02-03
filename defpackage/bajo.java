package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bajo extends evsn implements evui {
    public static final bajo a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        bajo bajoVar = new bajo();
        a = bajoVar;
        evsn.registerDefaultInstance(bajo.class, bajoVar);
    }

    private bajo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002င\u0000\u0003\u0004", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new bajo();
        }
        if (iOrdinal == 4) {
            return new bajn();
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
        synchronized (bajo.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
