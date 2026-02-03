package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqog extends evsn implements evui {
    public static final eqog a;
    private static volatile evuo f;
    public int b;
    public eqny c;
    public eqjv d;
    public evrw e;

    static {
        eqog eqogVar = new eqog();
        a = eqogVar;
        evsn.registerDefaultInstance(eqog.class, eqogVar);
    }

    private eqog() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001ϧ\u0003\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002ϧဉ\u0000", new Object[]{"b", "d", "e", "c"});
        }
        if (iOrdinal == 3) {
            return new eqog();
        }
        if (iOrdinal == 4) {
            return new eqof();
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
        synchronized (eqog.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
