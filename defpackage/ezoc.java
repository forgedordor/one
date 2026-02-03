package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezoc extends evsn implements evui {
    public static final evsy a = new ezoa();
    public static final ezoc b;
    private static volatile evuo d;
    public evsx c = emptyIntList();

    static {
        ezoc ezocVar = new ezoc();
        b = ezocVar;
        evsn.registerDefaultInstance(ezoc.class, ezocVar);
    }

    private ezoc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"c"});
        }
        if (iOrdinal == 3) {
            return new ezoc();
        }
        if (iOrdinal == 4) {
            return new ezob();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezoc.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
