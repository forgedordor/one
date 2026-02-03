package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dznn extends evsn implements evui {
    public static final dznn a;
    private static volatile evuo f;
    public boolean b;
    public int c;
    public int d;
    public int e;
    private int g;

    static {
        dznn dznnVar = new dznn();
        a = dznnVar;
        evsn.registerDefaultInstance(dznn.class, dznnVar);
    }

    private dznn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new dznn();
        }
        if (iOrdinal == 4) {
            return new dznm();
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
        synchronized (dznn.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
