package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbwf extends evsn implements evui {
    public static final dbwf a;
    private static volatile evuo g;
    public int b;
    public Object d;
    public int f;
    public int c = 0;
    public String e = "";

    static {
        dbwf dbwfVar = new dbwf();
        a = dbwfVar;
        evsn.registerDefaultInstance(dbwf.class, dbwfVar);
    }

    private dbwf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002င\u0001\u0003<\u0000\u0004<\u0000", new Object[]{"d", "c", "b", "e", "f", dbxg.class, ebsc.class});
        }
        if (iOrdinal == 3) {
            return new dbwf();
        }
        if (iOrdinal == 4) {
            return new dbwe();
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
        synchronized (dbwf.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
