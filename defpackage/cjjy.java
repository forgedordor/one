package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjjy extends evsn implements evui {
    public static final cjjy a;
    private static volatile evuo f;
    public int b;
    public evqe c;
    public cjjb d;
    public cjgr e;

    static {
        cjjy cjjyVar = new cjjy();
        a = cjjyVar;
        evsn.registerDefaultInstance(cjjy.class, cjjyVar);
    }

    private cjjy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new cjjy();
        }
        if (iOrdinal == 4) {
            return new cjjx();
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
        synchronized (cjjy.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
