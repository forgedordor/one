package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbyr extends evsn implements evui {
    public static final dbyr a;
    private static volatile evuo d;
    public int b;
    public double c;

    static {
        dbyr dbyrVar = new dbyr();
        a = dbyrVar;
        evsn.registerDefaultInstance(dbyr.class, dbyrVar);
    }

    private dbyr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001က\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new dbyr();
        }
        if (iOrdinal == 4) {
            return new dbyq();
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
        synchronized (dbyr.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
