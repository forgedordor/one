package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbcg extends evsn implements evui {
    public static final dbcg a;
    private static volatile evuo b;

    static {
        dbcg dbcgVar = new dbcg();
        a = dbcgVar;
        evsn.registerDefaultInstance(dbcg.class, dbcgVar);
    }

    private dbcg() {
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
            return new dbcg();
        }
        if (iOrdinal == 4) {
            return new dbcf();
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
        synchronized (dbcg.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
