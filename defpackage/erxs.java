package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erxs extends evsn implements evui {
    public static final erxs a;
    private static volatile evuo d;
    public int b;
    public int c = -1;

    static {
        erxs erxsVar = new erxs();
        a = erxsVar;
        evsn.registerDefaultInstance(erxs.class, erxsVar);
    }

    private erxs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new erxs();
        }
        if (iOrdinal == 4) {
            return new erxr();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (erxs.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
