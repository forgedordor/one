package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epsp extends evsn implements evui {
    public static final epsp a;
    private static volatile evuo d;
    public epvy b;
    public evqs c = evqs.b;
    private int e;

    static {
        epsp epspVar = new epsp();
        a = epspVar;
        evsn.registerDefaultInstance(epsp.class, epspVar);
    }

    private epsp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new epsp();
        }
        if (iOrdinal == 4) {
            return new epso();
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
        synchronized (epsp.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
