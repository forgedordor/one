package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eytm extends evsn implements evui {
    public static final eytm a;
    private static volatile evuo g;
    public int b;
    public eysb c;
    public int d;
    public int e;
    public String f = "";

    static {
        eytm eytmVar = new eytm();
        a = eytmVar;
        evsn.registerDefaultInstance(eytm.class, eytmVar);
    }

    private eytm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002\u0004\u0003\u0004\u0004Ȉ\u0005ဉ\u0001", new Object[]{"b", "d", "e", "f", "c"});
        }
        if (iOrdinal == 3) {
            return new eytm();
        }
        if (iOrdinal == 4) {
            return new eytl();
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
        synchronized (eytm.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
