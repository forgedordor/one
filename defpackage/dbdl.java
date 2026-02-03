package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbdl extends evsn implements evui {
    public static final dbdl a;
    private static volatile evuo c;
    public int b;
    private int d;

    static {
        dbdl dbdlVar = new dbdl();
        a = dbdlVar;
        evsn.registerDefaultInstance(dbdl.class, dbdlVar);
    }

    private dbdl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new dbdl();
        }
        if (iOrdinal == 4) {
            return new dbdk();
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
        synchronized (dbdl.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
