package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbxj extends evsn implements evui {
    public static final dbxj a;
    private static volatile evuo i;
    public int b;
    public long c;
    public String d = "";
    public evvp e;
    public int f;
    public long g;
    public long h;

    static {
        dbxj dbxjVar = new dbxj();
        a = dbxjVar;
        evsn.registerDefaultInstance(dbxj.class, dbxjVar);
    }

    private dbxj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new dbxj();
        }
        if (iOrdinal == 4) {
            return new dbxi();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (dbxj.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
