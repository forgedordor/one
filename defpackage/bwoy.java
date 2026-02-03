package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwoy extends evsn implements evui {
    public static final bwoy a;
    private static volatile evuo g;
    public int b;
    public long d;
    public int e;
    public String c = "";
    public evqs f = evqs.b;

    static {
        bwoy bwoyVar = new bwoy();
        a = bwoyVar;
        evsn.registerDefaultInstance(bwoy.class, bwoyVar);
    }

    private bwoy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\f\u0004ည\u0000", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new bwoy();
        }
        if (iOrdinal == 4) {
            return new bwox();
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
        synchronized (bwoy.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
