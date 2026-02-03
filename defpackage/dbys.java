package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbys extends evsn implements evui {
    public static final dbys a;
    private static volatile evuo f;
    public int b;
    public dbyp c;
    public dbyr d;
    public int e;

    static {
        dbys dbysVar = new dbys();
        a = dbysVar;
        evsn.registerDefaultInstance(dbys.class, dbysVar);
    }

    private dbys() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001᠌\u0002\u0003ဉ\u0001\u0006ဉ\u0000", new Object[]{"b", "e", eyej.a, "d", "c"});
        }
        if (iOrdinal == 3) {
            return new dbys();
        }
        if (iOrdinal == 4) {
            return new dbyn();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (dbys.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
