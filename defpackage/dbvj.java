package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbvj extends evsn implements evui {
    public static final dbvj a;
    private static volatile evuo d;
    public int b;
    public dbvr c;

    static {
        dbvj dbvjVar = new dbvj();
        a = dbvjVar;
        evsn.registerDefaultInstance(dbvj.class, dbvjVar);
    }

    private dbvj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new dbvj();
        }
        if (iOrdinal == 4) {
            return new dbvi();
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
        synchronized (dbvj.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
