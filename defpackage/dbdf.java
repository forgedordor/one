package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbdf extends evsn implements evui {
    public static final dbdf a;
    private static volatile evuo b;

    static {
        dbdf dbdfVar = new dbdf();
        a = dbdfVar;
        evsn.registerDefaultInstance(dbdf.class, dbdfVar);
    }

    private dbdf() {
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
            return new dbdf();
        }
        if (iOrdinal == 4) {
            return new dbde();
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
        synchronized (dbdf.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
