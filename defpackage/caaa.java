package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caaa extends evsn implements evui {
    public static final caaa a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public cayp e;

    static {
        caaa caaaVar = new caaa();
        a = caaaVar;
        evsn.registerDefaultInstance(caaa.class, caaaVar);
    }

    private caaa() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", cpyn.a, "e"});
        }
        if (iOrdinal == 3) {
            return new caaa();
        }
        if (iOrdinal == 4) {
            return new bzzz();
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
        synchronized (caaa.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
