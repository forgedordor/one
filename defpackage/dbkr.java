package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbkr extends evsn implements evui {
    public static final dbkr a;
    private static volatile evuo f;
    public boolean b;
    public String c = "";
    public evtg d = evsn.emptyProtobufList();
    public evtg e = evsn.emptyProtobufList();
    private int g;

    static {
        dbkr dbkrVar = new dbkr();
        a = dbkrVar;
        evsn.registerDefaultInstance(dbkr.class, dbkrVar);
    }

    private dbkr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဇ\u0000\u0002Ȉ\u0003Ț\u0004Ț", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new dbkr();
        }
        if (iOrdinal == 4) {
            return new dbkq();
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
        synchronized (dbkr.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
