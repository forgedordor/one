package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbkt extends evsn implements evui {
    public static final dbkt a;
    private static volatile evuo h;
    public int b;
    public String c = "";
    public String d = "";
    public evtg e = evsn.emptyProtobufList();
    public evtg f = emptyProtobufList();
    public boolean g;

    static {
        dbkt dbktVar = new dbkt();
        a = dbktVar;
        evsn.registerDefaultInstance(dbkt.class, dbktVar);
    }

    private dbkt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003Ț\u0004\u001b\u0005ဇ\u0002", new Object[]{"b", "c", "d", "e", "f", dbkj.class, "g"});
        }
        if (iOrdinal == 3) {
            return new dbkt();
        }
        if (iOrdinal == 4) {
            return new dbks();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (dbkt.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
