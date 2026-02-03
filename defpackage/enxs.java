package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enxs extends evsn implements evui {
    public static final enxs a;
    private static volatile evuo i;
    public int b;
    public int c;
    public int d;
    public long e;
    public enpl f;
    public enxm g;
    public int h;

    static {
        enxs enxsVar = new enxs();
        a = enxsVar;
        evsn.registerDefaultInstance(enxs.class, enxsVar);
    }

    private enxs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = enwq.a;
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006᠌\u0005", new Object[]{"b", "c", evsvVar, "d", evsvVar, "e", "f", "g", "h", enxd.a});
        }
        if (iOrdinal == 3) {
            return new enxs();
        }
        if (iOrdinal == 4) {
            return new enxr();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (enxs.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
