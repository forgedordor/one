package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezqp extends evsn implements evui {
    public static final ezqp a;
    private static volatile evuo b;
    private int c;
    private ezrp d;

    static {
        ezqp ezqpVar = new ezqp();
        a = ezqpVar;
        evsn.registerDefaultInstance(ezqp.class, ezqpVar);
    }

    private ezqp() {
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
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0001", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new ezqp();
        }
        if (iOrdinal == 4) {
            return new ezqo();
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
        synchronized (ezqp.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
