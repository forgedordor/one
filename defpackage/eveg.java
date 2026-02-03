package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eveg extends evsn implements evui {
    public static final eveg a;
    private static volatile evuo f;
    public int b;
    public int c;
    public evcx d;
    public String e = "";

    static {
        eveg evegVar = new eveg();
        a = evegVar;
        evsn.registerDefaultInstance(eveg.class, evegVar);
    }

    private eveg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0005ဈ\u0003", new Object[]{"b", "c", evbq.a, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eveg();
        }
        if (iOrdinal == 4) {
            return new evef();
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
        synchronized (eveg.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
