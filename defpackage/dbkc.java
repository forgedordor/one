package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbkc extends evsn implements evui {
    public static final dbkc a;
    private static volatile evuo b;

    static {
        dbkc dbkcVar = new dbkc();
        a = dbkcVar;
        evsn.registerDefaultInstance(dbkc.class, dbkcVar);
    }

    private dbkc() {
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new dbkc();
        }
        if (iOrdinal == 4) {
            return new dbkb();
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
        synchronized (dbkc.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
