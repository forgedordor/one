package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjqu extends evsn implements evui {
    public static final cjqu a;
    private static volatile evuo g;
    public int b;
    public int c;
    public int d;
    public int e;
    public evvp f;

    static {
        cjqu cjquVar = new cjqu();
        a = cjquVar;
        evsn.registerDefaultInstance(cjqu.class, cjquVar);
    }

    private cjqu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new cjqu();
        }
        if (iOrdinal == 4) {
            return new cjqq();
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
        synchronized (cjqu.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
