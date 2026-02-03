package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbkw extends evsn implements evui {
    public static final dbkw a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        dbkw dbkwVar = new dbkw();
        a = dbkwVar;
        evsn.registerDefaultInstance(dbkw.class, dbkwVar);
    }

    private dbkw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\n\u0001\u0000\u0001\n\n\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"c", "b", dbkg.class, dbke.class, dbkp.class, dbkv.class, dbkn.class, dbkr.class, dbkl.class, dbka.class, dbkc.class, dbkt.class});
        }
        if (iOrdinal == 3) {
            return new dbkw();
        }
        if (iOrdinal == 4) {
            return new dbjv();
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
        synchronized (dbkw.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
