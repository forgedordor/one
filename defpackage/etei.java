package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etei extends evsn implements evui {
    public static final etei a;
    private static volatile evuo f;
    public int b;
    public evqs c = evqs.b;
    public evsx d = emptyIntList();
    public evsx e = emptyIntList();

    static {
        etei eteiVar = new etei();
        a = eteiVar;
        evsn.registerDefaultInstance(etei.class, eteiVar);
    }

    private etei() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0007\n\u0003\u0000\u0002\u0000\u0007ည\u0001\t\u0016\n\u0016", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new etei();
        }
        if (iOrdinal == 4) {
            return new eteh();
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
        synchronized (etei.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
