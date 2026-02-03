package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsde extends evsn implements evui {
    public static final dsde a;
    private static volatile evuo g;
    public int b;
    public ethk c;
    public long e;
    public String d = "";
    public String f = "";

    static {
        dsde dsdeVar = new dsde();
        a = dsdeVar;
        evsn.registerDefaultInstance(dsde.class, dsdeVar);
    }

    private dsde() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new dsde();
        }
        if (iOrdinal == 4) {
            return new dsdd();
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
        synchronized (dsde.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
