package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzgr extends evsn implements evui {
    public static final dzgr a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;

    static {
        dzgr dzgrVar = new dzgr();
        a = dzgrVar;
        evsn.registerDefaultInstance(dzgr.class, dzgrVar);
    }

    private dzgr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new dzgr();
        }
        if (iOrdinal == 4) {
            return new dzgq();
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
        synchronized (dzgr.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
