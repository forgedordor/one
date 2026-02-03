package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbkz extends evsn implements evui {
    public static final dbkz a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        dbkz dbkzVar = new dbkz();
        a = dbkzVar;
        evsn.registerDefaultInstance(dbkz.class, dbkzVar);
    }

    private dbkz() {
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
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", dbky.class});
        }
        if (iOrdinal == 3) {
            return new dbkz();
        }
        if (iOrdinal == 4) {
            return new dbju();
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
        synchronized (dbkz.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
