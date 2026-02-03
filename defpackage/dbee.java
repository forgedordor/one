package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbee extends evsn implements evui {
    public static final dbee a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        dbee dbeeVar = new dbee();
        a = dbeeVar;
        evsn.registerDefaultInstance(dbee.class, dbeeVar);
    }

    private dbee() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", dbed.class});
        }
        if (iOrdinal == 3) {
            return new dbee();
        }
        if (iOrdinal == 4) {
            return new dbeb();
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
        synchronized (dbee.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
