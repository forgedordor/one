package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class empi extends evsn implements evui {
    public static final empi a;
    private static volatile evuo f;
    public int b;
    public boolean c;
    public int d;
    public int e;

    static {
        empi empiVar = new empi();
        a = empiVar;
        evsn.registerDefaultInstance(empi.class, empiVar);
    }

    private empi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new empi();
        }
        if (iOrdinal == 4) {
            return new emph();
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
        synchronized (empi.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
