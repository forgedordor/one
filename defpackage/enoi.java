package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enoi extends evsn implements evui {
    public static final enoi a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        enoi enoiVar = new enoi();
        a = enoiVar;
        evsn.registerDefaultInstance(enoi.class, enoiVar);
    }

    private enoi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = emok.a;
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", evsvVar, "d", evsvVar, "e", evsvVar});
        }
        if (iOrdinal == 3) {
            return new enoi();
        }
        if (iOrdinal == 4) {
            return new enoh();
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
        synchronized (enoi.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
