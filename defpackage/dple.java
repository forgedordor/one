package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dple extends evsn implements evui {
    public static final dple a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public evvp e;

    static {
        dple dpleVar = new dple();
        a = dpleVar;
        evsn.registerDefaultInstance(dple.class, dpleVar);
    }

    private dple() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new dple();
        }
        if (iOrdinal == 4) {
            return new dpld();
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
        synchronized (dple.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
