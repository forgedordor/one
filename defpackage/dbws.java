package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbws extends evsn implements evui {
    public static final dbws a;
    private static volatile evuo c;
    public long b;
    private int d;

    static {
        dbws dbwsVar = new dbws();
        a = dbwsVar;
        evsn.registerDefaultInstance(dbws.class, dbwsVar);
    }

    private dbws() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new dbws();
        }
        if (iOrdinal == 4) {
            return new dbwr();
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
        synchronized (dbws.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
