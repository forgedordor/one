package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbyp extends evsn implements evui {
    public static final dbyp a;
    private static volatile evuo g;
    public int b;
    public double c;
    public int e;
    public int d = 35;
    public String f = "";

    static {
        dbyp dbypVar = new dbyp();
        a = dbypVar;
        evsn.registerDefaultInstance(dbyp.class, dbypVar);
    }

    private dbyp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001က\u0000\u0002င\u0001\u0003င\u0002\u0004ለ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new dbyp();
        }
        if (iOrdinal == 4) {
            return new dbyo();
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
        synchronized (dbyp.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
