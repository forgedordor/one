package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epjj extends evsn implements evui {
    public static final epjj a;
    private static volatile evuo e;
    public int b;
    public evqs c = evqs.b;
    public int d;

    static {
        epjj epjjVar = new epjj();
        a = epjjVar;
        evsn.registerDefaultInstance(epjj.class, epjjVar);
    }

    private epjj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\n\u0003\f", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new epjj();
        }
        if (iOrdinal == 4) {
            return new epji();
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
        synchronized (epjj.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
