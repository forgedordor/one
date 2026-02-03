package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezqn extends evsn implements evui {
    public static final ezqn a;
    private static volatile evuo d;
    public ezrp b;
    public long c;
    private int e;

    static {
        ezqn ezqnVar = new ezqn();
        a = ezqnVar;
        evsn.registerDefaultInstance(ezqn.class, ezqnVar);
    }

    private ezqn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003\u0002", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new ezqn();
        }
        if (iOrdinal == 4) {
            return new ezqm();
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
        synchronized (ezqn.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
