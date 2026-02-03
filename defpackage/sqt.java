package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqt extends evsn implements evui {
    public static final sqt a;
    private static volatile evuo e;
    public float b;
    public sqp c;
    public sqf d;
    private int f;

    static {
        sqt sqtVar = new sqt();
        a = sqtVar;
        evsn.registerDefaultInstance(sqt.class, sqtVar);
    }

    private sqt() {
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
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0001\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"f", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new sqt();
        }
        if (iOrdinal == 4) {
            return new sqs();
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
        synchronized (sqt.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
