package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbky extends evsn implements evui {
    public static final dbky a;
    private static volatile evuo e;
    public int b;
    public dbkw c;
    public String d = "";
    private int f;

    static {
        dbky dbkyVar = new dbky();
        a = dbkyVar;
        evsn.registerDefaultInstance(dbky.class, dbkyVar);
    }

    private dbky() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0004Ȉ", new Object[]{"f", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new dbky();
        }
        if (iOrdinal == 4) {
            return new dbkx();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (dbky.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
