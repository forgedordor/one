package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbek extends evsn implements evui {
    public static final dbek a;
    private static volatile evuo c;
    public int b;
    private int d;

    static {
        dbek dbekVar = new dbek();
        a = dbekVar;
        evsn.registerDefaultInstance(dbek.class, dbekVar);
    }

    private dbek() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new dbek();
        }
        if (iOrdinal == 4) {
            return new dbei();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (dbek.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
