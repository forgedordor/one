package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbbu extends evsn implements evui {
    public static final dbbu a;
    private static volatile evuo d;
    public String b = "";
    public dbby c;
    private int e;

    static {
        dbbu dbbuVar = new dbbu();
        a = dbbuVar;
        evsn.registerDefaultInstance(dbbu.class, dbbuVar);
    }

    private dbbu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဉ\u0005\u0006ဈ\u0002", new Object[]{"e", "c", "b"});
        }
        if (iOrdinal == 3) {
            return new dbbu();
        }
        if (iOrdinal == 4) {
            return new dbbt();
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
        synchronized (dbbu.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
