package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evoc extends evsn implements evui {
    public static final evoc a;
    private static volatile evuo e;
    public int b;
    public int c;
    public int d;

    static {
        evoc evocVar = new evoc();
        a = evocVar;
        evsn.registerDefaultInstance(evoc.class, evocVar);
    }

    private evoc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", evny.a, "d", evoa.a});
        }
        if (iOrdinal == 3) {
            return new evoc();
        }
        if (iOrdinal == 4) {
            return new evnx();
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
        synchronized (evoc.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
