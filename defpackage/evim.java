package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evim extends evsn implements evui {
    public static final evim a;
    private static volatile evuo c;
    public String b = "";
    private int d;

    static {
        evim evimVar = new evim();
        a = evimVar;
        evsn.registerDefaultInstance(evim.class, evimVar);
    }

    private evim() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new evim();
        }
        if (iOrdinal == 4) {
            return new evil();
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
        synchronized (evim.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
