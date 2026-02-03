package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbdd extends evsn implements evui {
    public static final dbdd a;
    private static volatile evuo c;
    public int b;
    private int d;

    static {
        dbdd dbddVar = new dbdd();
        a = dbddVar;
        evsn.registerDefaultInstance(dbdd.class, dbddVar);
    }

    private dbdd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new dbdd();
        }
        if (iOrdinal == 4) {
            return new dbdc();
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
        synchronized (dbdd.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
