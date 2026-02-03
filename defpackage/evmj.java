package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evmj extends evsn implements evui {
    public static final evmj a;
    private static volatile evuo g;
    public int b;
    public eybi c;
    public int d;
    public evll e;
    public evll f;

    static {
        evmj evmjVar = new evmj();
        a = evmjVar;
        evsn.registerDefaultInstance(evmj.class, evmjVar);
    }

    private evmj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", evli.a, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new evmj();
        }
        if (iOrdinal == 4) {
            return new evmi();
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
        synchronized (evmj.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
