package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdb extends evsn implements evui {
    public static final sdb a;
    private static volatile evuo f;
    public int b;
    public String c = "";
    public evsx d = emptyIntList();
    public sda e;

    static {
        sdb sdbVar = new sdb();
        a = sdbVar;
        evsn.registerDefaultInstance(sdb.class, sdbVar);
    }

    private sdb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002'\u0003ဉ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new sdb();
        }
        if (iOrdinal == 4) {
            return new scw();
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
        synchronized (sdb.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
