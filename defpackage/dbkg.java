package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbkg extends evsn implements evui {
    public static final dbkg a;
    private static volatile evuo d;
    public int b;
    public evtg c = evsn.emptyProtobufList();

    static {
        dbkg dbkgVar = new dbkg();
        a = dbkgVar;
        evsn.registerDefaultInstance(dbkg.class, dbkgVar);
    }

    private dbkg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002Ț", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new dbkg();
        }
        if (iOrdinal == 4) {
            return new dbkf();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (dbkg.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
