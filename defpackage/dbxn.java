package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbxn extends evsn implements evui {
    public static final dbxn a;
    private static volatile evuo g;
    public int b;
    public long c;
    public long d;
    public dbxp e;
    public evqs f = evqs.b;

    static {
        dbxn dbxnVar = new dbxn();
        a = dbxnVar;
        evsn.registerDefaultInstance(dbxn.class, dbxnVar);
    }

    private dbxn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004ည\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new dbxn();
        }
        if (iOrdinal == 4) {
            return new dbxm();
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
        synchronized (dbxn.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
