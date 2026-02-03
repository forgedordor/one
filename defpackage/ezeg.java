package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezeg extends evsn implements evui {
    public static final ezeg a;
    private static volatile evuo c;
    public int b;

    static {
        ezeg ezegVar = new ezeg();
        a = ezegVar;
        evsn.registerDefaultInstance(ezeg.class, ezegVar);
    }

    private ezeg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new ezeg();
        }
        if (iOrdinal == 4) {
            return new ezef();
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
        synchronized (ezeg.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
