package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbka extends evsn implements evui {
    public static final dbka a;
    private static volatile evuo d;
    public evtg b = emptyProtobufList();
    public boolean c;

    static {
        dbka dbkaVar = new dbka();
        a = dbkaVar;
        evsn.registerDefaultInstance(dbka.class, dbkaVar);
    }

    private dbka() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003\u0007", new Object[]{"b", dbjz.class, "c"});
        }
        if (iOrdinal == 3) {
            return new dbka();
        }
        if (iOrdinal == 4) {
            return new dbjw();
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
        synchronized (dbka.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
