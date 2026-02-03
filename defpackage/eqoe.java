package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqoe extends evsn implements evui {
    public static final eqoe a;
    private static volatile evuo g;
    public int b;
    public eqny c;
    public eqiz d;
    public evrw e;
    public eqmi f;

    static {
        eqoe eqoeVar = new eqoe();
        a = eqoeVar;
        evsn.registerDefaultInstance(eqoe.class, eqoeVar);
    }

    private eqoe() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001ϧ\u0004\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဉ\u0003ϧဉ\u0000", new Object[]{"b", "d", "e", "f", "c"});
        }
        if (iOrdinal == 3) {
            return new eqoe();
        }
        if (iOrdinal == 4) {
            return new eqod();
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
        synchronized (eqoe.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
