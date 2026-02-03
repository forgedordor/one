package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elmm extends evsn implements evui {
    public static final elmm a;
    private static volatile evuo h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        elmm elmmVar = new elmm();
        a = elmmVar;
        evsn.registerDefaultInstance(elmm.class, elmmVar);
    }

    private elmm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004င\u0003\u0005᠌\u0004", new Object[]{"b", "c", elmi.a, "d", elmj.a, "e", elmk.a, "f", "g", emeq.a});
        }
        if (iOrdinal == 3) {
            return new elmm();
        }
        if (iOrdinal == 4) {
            return new elml();
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
        synchronized (elmm.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
