package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eprj extends evsn implements evui {
    public static final eprj a;
    private static volatile evuo f;
    public evqs b;
    public evqs c;
    public evqs d;
    public evqs e;
    private int g;

    static {
        eprj eprjVar = new eprj();
        a = eprjVar;
        evsn.registerDefaultInstance(eprj.class, eprjVar);
    }

    private eprj() {
        evqs evqsVar = evqs.b;
        this.b = evqsVar;
        this.c = evqsVar;
        this.d = evqsVar;
        this.e = evqsVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eprj();
        }
        if (iOrdinal == 4) {
            return new epri();
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
        synchronized (eprj.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
