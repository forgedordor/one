package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbdb extends evsn implements evui {
    public static final dbdb a;
    private static volatile evuo b;

    static {
        dbdb dbdbVar = new dbdb();
        a = dbdbVar;
        evsn.registerDefaultInstance(dbdb.class, dbdbVar);
    }

    private dbdb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new dbdb();
        }
        if (iOrdinal == 4) {
            return new dbda();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = b;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (dbdb.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
