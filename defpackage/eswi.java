package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eswi extends evsn implements evui {
    public static final eswi a;
    private static volatile evuo e;
    public int b;
    public String c = "";
    public String d = "";

    static {
        eswi eswiVar = new eswi();
        a = eswiVar;
        evsn.registerDefaultInstance(eswi.class, eswiVar);
    }

    private eswi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004ဈ\u0000\u0005ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new eswi();
        }
        if (iOrdinal == 4) {
            return new eswh();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eswi.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
