package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxnt extends evsn implements evui {
    public static final bxnt a;
    private static volatile evuo g;
    public int b;
    public long d;
    public long e;
    public String c = "";
    public String f = "";

    static {
        bxnt bxntVar = new bxnt();
        a = bxntVar;
        evsn.registerDefaultInstance(bxnt.class, bxntVar);
    }

    private bxnt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ለ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new bxnt();
        }
        if (iOrdinal == 4) {
            return new bxns();
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
        synchronized (bxnt.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
