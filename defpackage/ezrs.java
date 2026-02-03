package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezrs extends evsn implements evui {
    public static final ezrs a;
    private static volatile evuo e;
    public int b;
    public ezol c;
    public int d;

    static {
        ezrs ezrsVar = new ezrs();
        a = ezrsVar;
        evsn.registerDefaultInstance(ezrs.class, ezrsVar);
    }

    private ezrs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ezrs();
        }
        if (iOrdinal == 4) {
            return new ezrr();
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
        synchronized (ezrs.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
