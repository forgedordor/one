package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efws extends evsn implements evui {
    public static final efws a;
    private static volatile evuo e;
    public int b;
    public int c;
    public boolean d;

    static {
        efws efwsVar = new efws();
        a = efwsVar;
        evsn.registerDefaultInstance(efws.class, efwsVar);
    }

    private efws() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new efws();
        }
        if (iOrdinal == 4) {
            return new efwr();
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
        synchronized (efws.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
