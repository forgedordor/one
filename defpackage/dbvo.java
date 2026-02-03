package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbvo extends evsn implements evui {
    public static final dbvo a;
    private static volatile evuo d;
    public int b;
    public String c = "";
    private int e;

    static {
        dbvo dbvoVar = new dbvo();
        a = dbvoVar;
        evsn.registerDefaultInstance(dbvo.class, dbvoVar);
    }

    private dbvo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002᠌\u0001\u0003ဈ\u0002", new Object[]{"e", "b", dbvm.a, "c"});
        }
        if (iOrdinal == 3) {
            return new dbvo();
        }
        if (iOrdinal == 4) {
            return new dbvl();
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
        synchronized (dbvo.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
