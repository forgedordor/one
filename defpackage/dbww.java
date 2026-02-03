package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbww extends evsn implements evui {
    public static final dbww a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        dbww dbwwVar = new dbww();
        a = dbwwVar;
        evsn.registerDefaultInstance(dbww.class, dbwwVar);
    }

    private dbww() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", dbxn.class, ebse.class});
        }
        if (iOrdinal == 3) {
            return new dbww();
        }
        if (iOrdinal == 4) {
            return new dbwv();
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
        synchronized (dbww.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
