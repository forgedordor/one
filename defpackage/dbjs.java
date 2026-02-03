package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbjs extends evsn implements evui {
    public static final dbjs a;
    private static volatile evuo h;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public int f;
    public int g;

    static {
        dbjs dbjsVar = new dbjs();
        a = dbjsVar;
        evsn.registerDefaultInstance(dbjs.class, dbjsVar);
    }

    private dbjs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new dbjs();
        }
        if (iOrdinal == 4) {
            return new dbjp();
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
        synchronized (dbjs.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
