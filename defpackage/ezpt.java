package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezpt extends evsn implements evui {
    public static final ezpt a;
    private static volatile evuo e;
    public evqs b;
    public int c;
    public evqs d;

    static {
        ezpt ezptVar = new ezpt();
        a = ezptVar;
        evsn.registerDefaultInstance(ezpt.class, ezptVar);
    }

    private ezpt() {
        evqs evqsVar = evqs.b;
        this.b = evqsVar;
        emptyProtobufList();
        this.d = evqsVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\b\u0003\u0000\u0000\u0000\u0001\n\u0003\f\b\n", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ezpt();
        }
        if (iOrdinal == 4) {
            return new ezps();
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
        synchronized (ezpt.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
