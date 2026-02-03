package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezrb extends evsn implements evui {
    public static final ezrb a;
    private static volatile evuo d;
    public ezot b;
    public ezrp c;
    private int e;

    static {
        ezrb ezrbVar = new ezrb();
        a = ezrbVar;
        evsn.registerDefaultInstance(ezrb.class, ezrbVar);
    }

    private ezrb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0003\u0006\u0002\u0000\u0000\u0000\u0003ဉ\u0001\u0006ဉ\u0003", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new ezrb();
        }
        if (iOrdinal == 4) {
            return new ezra();
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
        synchronized (ezrb.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
