package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enjr extends evsn implements evui {
    public static final enjr a;
    private static volatile evuo e;
    public int b;
    public int c;
    public int d;

    static {
        enjr enjrVar = new enjr();
        a = enjrVar;
        evsn.registerDefaultInstance(enjr.class, enjrVar);
    }

    private enjr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", enjo.a, "d", enjp.a});
        }
        if (iOrdinal == 3) {
            return new enjr();
        }
        if (iOrdinal == 4) {
            return new enjq();
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
        synchronized (enjr.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
