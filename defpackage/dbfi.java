package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbfi extends evsn implements evui {
    public static final dbfi a;
    private static volatile evuo c;
    public String b = "";
    private int d;

    static {
        dbfi dbfiVar = new dbfi();
        a = dbfiVar;
        evsn.registerDefaultInstance(dbfi.class, dbfiVar);
    }

    private dbfi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new dbfi();
        }
        if (iOrdinal == 4) {
            return new dbfh();
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
        synchronized (dbfi.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
