package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elig extends evsn implements evui {
    public static final elig a;
    private static volatile evuo h;
    public int b;
    public int c;
    public int d;
    public int e;
    public evsx f = emptyIntList();
    public int g;

    static {
        elig eligVar = new elig();
        a = eligVar;
        evsn.registerDefaultInstance(elig.class, eligVar);
    }

    private elig() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ࠞ\u0005᠌\u0003", new Object[]{"b", "c", elid.a, "d", elhy.a, "e", elhz.a, "f", elhw.a, "g", elib.a});
        }
        if (iOrdinal == 3) {
            return new elig();
        }
        if (iOrdinal == 4) {
            return new elif();
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
        synchronized (elig.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
