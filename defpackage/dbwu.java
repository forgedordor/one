package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbwu extends evsn implements evui {
    public static final dbwu a;
    private static volatile evuo e;
    public int b;
    public long c;
    public evtg d = emptyProtobufList();

    static {
        dbwu dbwuVar = new dbwu();
        a = dbwuVar;
        evsn.registerDefaultInstance(dbwu.class, dbwuVar);
    }

    private dbwu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b", new Object[]{"b", "c", "d", dbwf.class});
        }
        if (iOrdinal == 3) {
            return new dbwu();
        }
        if (iOrdinal == 4) {
            return new dbwt();
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
        synchronized (dbwu.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
