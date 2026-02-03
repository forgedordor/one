package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evng extends evsn implements evui {
    public static final evng a;
    private static volatile evuo f;
    public int b;
    public boolean c;
    public evmf d;
    public evne e;

    static {
        evng evngVar = new evng();
        a = evngVar;
        evsn.registerDefaultInstance(evng.class, evngVar);
    }

    private evng() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0001\u0003ဉ\u0003\u0004ဇ\u0000", new Object[]{"b", "d", "e", "c"});
        }
        if (iOrdinal == 3) {
            return new evng();
        }
        if (iOrdinal == 4) {
            return new evnf();
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
        synchronized (evng.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
