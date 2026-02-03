package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbkv extends evsn implements evui {
    public static final dbkv a;
    private static volatile evuo b;

    static {
        dbkv dbkvVar = new dbkv();
        a = dbkvVar;
        evsn.registerDefaultInstance(dbkv.class, dbkvVar);
    }

    private dbkv() {
        evsn.emptyProtobufList();
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
            return new dbkv();
        }
        if (iOrdinal == 4) {
            return new dbku();
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
        synchronized (dbkv.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
