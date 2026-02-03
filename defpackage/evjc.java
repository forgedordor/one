package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evjc extends evsn implements evui {
    public static final evjc a;
    private static volatile evuo g;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public int f;

    static {
        evjc evjcVar = new evjc();
        a = evjcVar;
        evsn.registerDefaultInstance(evjc.class, evjcVar);
    }

    private evjc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003င\u0000\u0004င\u0001", new Object[]{"d", "c", "b", evir.class, evlf.class, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new evjc();
        }
        if (iOrdinal == 4) {
            return new evjb();
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
        synchronized (evjc.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
