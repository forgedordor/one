package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eowy extends evsn implements evui {
    public static final eowy a;
    private static volatile evuo c;
    public boolean b;

    static {
        eowy eowyVar = new eowy();
        a = eowyVar;
        evsn.registerDefaultInstance(eowy.class, eowyVar);
    }

    private eowy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0007", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new eowy();
        }
        if (iOrdinal == 4) {
            return new eowx();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eowy.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
