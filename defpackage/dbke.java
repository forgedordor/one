package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbke extends evsn implements evui {
    public static final dbke a;
    private static volatile evuo h;
    public int b;
    public int d;
    public boolean f;
    public boolean g;
    private int i;
    public String c = "";
    public evtg e = evsn.emptyProtobufList();

    static {
        dbke dbkeVar = new dbke();
        a = dbkeVar;
        evsn.registerDefaultInstance(dbke.class, dbkeVar);
    }

    private dbke() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003င\u0000\u0004Ț\u0005\u0007\u0006\u0007", new Object[]{"i", "b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new dbke();
        }
        if (iOrdinal == 4) {
            return new dbkd();
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
        synchronized (dbke.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
