package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epse extends evsn implements evui {
    public static final epse a;
    private static volatile evuo g;
    public int b;
    public epuv c;
    public evqs d = evqs.b;
    public int e;
    public int f;

    static {
        epse epseVar = new epse();
        a = epseVar;
        evsn.registerDefaultInstance(epse.class, epseVar);
    }

    private epse() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new epse();
        }
        if (iOrdinal == 4) {
            return new epsd();
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
        synchronized (epse.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
