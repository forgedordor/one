package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewkr extends evsn implements evui {
    public static final ewkr a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        ewkr ewkrVar = new ewkr();
        a = ewkrVar;
        evsn.registerDefaultInstance(ewkr.class, ewkrVar);
    }

    private ewkr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"c", "b", ewkl.class, ewke.class, ewkc.class, ewkp.class});
        }
        if (iOrdinal == 3) {
            return new ewkr();
        }
        if (iOrdinal == 4) {
            return new ewkq();
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
        synchronized (ewkr.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
