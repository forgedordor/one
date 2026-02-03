package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjku extends evsn implements evui {
    public static final cjku a;
    private static volatile evuo h;
    public int b;
    public evqe c;
    public cjlm d;
    public cjjb e;
    public cjjw f;
    public cjgr g;

    static {
        cjku cjkuVar = new cjku();
        a = cjkuVar;
        evsn.registerDefaultInstance(cjku.class, cjkuVar);
    }

    private cjku() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new cjku();
        }
        if (iOrdinal == 4) {
            return new cjkt();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cjku.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
