package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyvr extends evsn implements evui {
    public static final eyvr a;
    private static volatile evuo g;
    public int b;
    public ezpp c;
    public eypt d;
    public eyvi e;
    public evsx f = emptyIntList();

    static {
        eyvr eyvrVar = new eyvr();
        a = eyvrVar;
        evsn.registerDefaultInstance(eyvr.class, eyvrVar);
    }

    private eyvr() {
        emptyIntList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0002\u0004ဉ\u0001\u0005,", new Object[]{"b", "c", "e", "d", "f"});
        }
        if (iOrdinal == 3) {
            return new eyvr();
        }
        if (iOrdinal == 4) {
            return new eyvq();
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
        synchronized (eyvr.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
