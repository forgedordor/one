package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbcq extends evsn implements evui {
    public static final dbcq a;
    private static volatile evuo e;
    public int b;
    public boolean c;
    public int d;

    static {
        dbcq dbcqVar = new dbcq();
        a = dbcqVar;
        evsn.registerDefaultInstance(dbcq.class, dbcqVar);
    }

    private dbcq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new dbcq();
        }
        if (iOrdinal == 4) {
            return new dbcp();
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
        synchronized (dbcq.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
