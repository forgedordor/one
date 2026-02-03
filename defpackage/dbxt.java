package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbxt extends evsn implements evui {
    public static final dbxt a;
    private static volatile evuo d;
    public int b;
    public boolean c;

    static {
        dbxt dbxtVar = new dbxt();
        a = dbxtVar;
        evsn.registerDefaultInstance(dbxt.class, dbxtVar);
    }

    private dbxt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new dbxt();
        }
        if (iOrdinal == 4) {
            return new dbxs();
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
        synchronized (dbxt.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
