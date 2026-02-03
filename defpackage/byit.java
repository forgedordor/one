package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byit extends evsn implements evui {
    public static final byit a;
    private static volatile evuo g;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f = -1;

    static {
        byit byitVar = new byit();
        a = byitVar;
        evsn.registerDefaultInstance(byit.class, byitVar);
    }

    private byit() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဂ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new byit();
        }
        if (iOrdinal == 4) {
            return new byis();
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
        synchronized (byit.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
