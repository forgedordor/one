package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evxt extends evsn implements evui {
    public static final evxt a;
    private static volatile evuo f;
    public evta b = emptyLongList();
    public evxf c;
    public evxf d;
    public int e;
    private int g;

    static {
        evxt evxtVar = new evxt();
        a = evxtVar;
        evsn.registerDefaultInstance(evxt.class, evxtVar);
    }

    private evxt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001%\u0002ဉ\u0000\u0003ဉ\u0001\u0004\f", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new evxt();
        }
        if (iOrdinal == 4) {
            return new evxs();
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
        synchronized (evxt.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
