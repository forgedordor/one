package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjgx extends evsn implements evui {
    public static final cjgx a;
    private static volatile evuo g;
    public int b;
    public evqe c;
    public cjjr d;
    public String e = "";
    public evtg f = emptyProtobufList();

    static {
        cjgx cjgxVar = new cjgx();
        a = cjgxVar;
        evsn.registerDefaultInstance(cjgx.class, cjgxVar);
    }

    private cjgx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0004ဈ\u0003\u0005\u001b", new Object[]{"b", "c", "d", "e", "f", cjju.class});
        }
        if (iOrdinal == 3) {
            return new cjgx();
        }
        if (iOrdinal == 4) {
            return new cjgw();
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
        synchronized (cjgx.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
