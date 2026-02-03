package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbeu extends evsn implements evui {
    public static final dbeu a;
    private static volatile evuo f;
    public int b;
    public int c;
    public evqs d = evqs.b;
    public int e;

    static {
        dbeu dbeuVar = new dbeu();
        a = dbeuVar;
        evsn.registerDefaultInstance(dbeu.class, dbeuVar);
    }

    private dbeu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0001\u0003ဌ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new dbeu();
        }
        if (iOrdinal == 4) {
            return new dbet();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (dbeu.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
