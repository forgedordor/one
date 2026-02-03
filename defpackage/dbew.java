package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbew extends evsn implements evui {
    public static final dbew a;
    private static volatile evuo c;
    public String b = "";
    private int d;

    static {
        dbew dbewVar = new dbew();
        a = dbewVar;
        evsn.registerDefaultInstance(dbew.class, dbewVar);
    }

    private dbew() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new dbew();
        }
        if (iOrdinal == 4) {
            return new dbev();
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
        synchronized (dbew.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
