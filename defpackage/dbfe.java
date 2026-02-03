package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbfe extends evsn implements evui {
    public static final dbfe a;
    private static volatile evuo b;

    static {
        dbfe dbfeVar = new dbfe();
        a = dbfeVar;
        evsn.registerDefaultInstance(dbfe.class, dbfeVar);
    }

    private dbfe() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new dbfe();
        }
        if (iOrdinal == 4) {
            return new dbfd();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = b;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (dbfe.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
