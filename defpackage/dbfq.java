package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbfq extends evsn implements evui {
    public static final dbfq a;
    private static volatile evuo c;
    public int b;
    private int d;

    static {
        dbfq dbfqVar = new dbfq();
        a = dbfqVar;
        evsn.registerDefaultInstance(dbfq.class, dbfqVar);
    }

    private dbfq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"d", "b", dbfo.a});
        }
        if (iOrdinal == 3) {
            return new dbfq();
        }
        if (iOrdinal == 4) {
            return new dbfn();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (dbfq.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
