package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ethf extends evsn implements evui {
    public static final ethf a;
    private static volatile evuo g;
    public int b;
    public long d;
    public long e;
    public String c = "";
    public evqs f = evqs.b;

    static {
        ethf ethfVar = new ethf();
        a = ethfVar;
        evsn.registerDefaultInstance(ethf.class, ethfVar);
    }

    private ethf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ည\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ethf();
        }
        if (iOrdinal == 4) {
            return new ethe();
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
        synchronized (ethf.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
