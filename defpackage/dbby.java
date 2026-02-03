package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbby extends evsn implements evui {
    public static final dbby a;
    private static volatile evuo j;
    public dbcb f;
    public int h;
    public boolean i;
    private int k;
    public evtg b = emptyProtobufList();
    public String c = "";
    public String d = "";
    public String e = "";
    public String g = "";

    static {
        dbby dbbyVar = new dbby();
        a = dbbyVar;
        evsn.registerDefaultInstance(dbby.class, dbbyVar);
    }

    private dbby() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဉ\u0003\u0006ဈ\u0004\u0007င\u0005\bဇ\u0006", new Object[]{"k", "b", dbbw.class, "c", "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new dbby();
        }
        if (iOrdinal == 4) {
            return new dbbx();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (dbby.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
