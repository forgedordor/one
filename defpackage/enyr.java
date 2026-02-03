package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enyr extends evsn implements evui {
    public static final enyr a;
    private static volatile evuo g;
    public int b;
    public int c;
    public String d = "";
    public int e;
    public int f;

    static {
        enyr enyrVar = new enyr();
        a = enyrVar;
        evsn.registerDefaultInstance(enyr.class, enyrVar);
    }

    private enyr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003င\u0002\u0004᠌\u0004", new Object[]{"b", "c", "d", "e", "f", enyq.a});
        }
        if (iOrdinal == 3) {
            return new enyr();
        }
        if (iOrdinal == 4) {
            return new enyp();
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
        synchronized (enyr.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
