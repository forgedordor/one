package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class febz extends evsn implements evui {
    public static final febz a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        febz febzVar = new febz();
        a = febzVar;
        evsn.registerDefaultInstance(febz.class, febzVar);
    }

    private febz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0000\u0002\u0005\u0004\u0000\u0000\u0000\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005?\u0000", new Object[]{"c", "b", exas.class, exau.class});
        }
        if (iOrdinal == 3) {
            return new febz();
        }
        if (iOrdinal == 4) {
            return new feby();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (febz.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
