package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbdr extends evsn implements evui {
    public static final dbdr a;
    private static volatile evuo f;
    public evqs b = evqs.b;
    public String c = "";
    public dbek d;
    public evvp e;
    private int g;

    static {
        dbdr dbdrVar = new dbdr();
        a = dbdrVar;
        evsn.registerDefaultInstance(dbdr.class, dbdrVar);
    }

    private dbdr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ည\u0001\u0003ለ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new dbdr();
        }
        if (iOrdinal == 4) {
            return new dbdq();
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
        synchronized (dbdr.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
