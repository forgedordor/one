package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enwy extends evsn implements evui {
    public static final enwy a;
    private static volatile evuo g;
    public int b;
    public int c;
    public int d;
    public int e;
    public enpl f;

    static {
        enwy enwyVar = new enwy();
        a = enwyVar;
        evsn.registerDefaultInstance(enwy.class, enwyVar);
    }

    private enwy() {
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
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဉ\u0003", new Object[]{"b", "c", evsvVar, "d", evsvVar, "e", ewrr.a, "f"});
        }
        if (iOrdinal == 3) {
            return new enwy();
        }
        if (iOrdinal == 4) {
            return new enwx();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (enwy.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
