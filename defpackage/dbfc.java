package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbfc extends evsn implements evui {
    public static final dbfc a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        dbfc dbfcVar = new dbfc();
        a = dbfcVar;
        evsn.registerDefaultInstance(dbfc.class, dbfcVar);
    }

    private dbfc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new dbfc();
        }
        if (iOrdinal == 4) {
            return new dbfb();
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
        synchronized (dbfc.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
