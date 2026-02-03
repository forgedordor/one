package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbkp extends evsn implements evui {
    public static final dbkp a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public evtg f = emptyProtobufList();

    static {
        dbkp dbkpVar = new dbkp();
        a = dbkpVar;
        evsn.registerDefaultInstance(dbkp.class, dbkpVar);
    }

    private dbkp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004\u001b", new Object[]{"b", "c", "d", "e", "f", dbkj.class});
        }
        if (iOrdinal == 3) {
            return new dbkp();
        }
        if (iOrdinal == 4) {
            return new dbko();
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
        synchronized (dbkp.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
