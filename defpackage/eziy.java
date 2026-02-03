package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eziy extends evsn implements evui {
    public static final eziy a;
    private static volatile evuo e;
    public int b;
    public ezpp c;
    public evqs d = evqs.b;

    static {
        eziy eziyVar = new eziy();
        a = eziyVar;
        evsn.registerDefaultInstance(eziy.class, eziyVar);
    }

    private eziy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\n", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new eziy();
        }
        if (iOrdinal == 4) {
            return new ezix();
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
        synchronized (eziy.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
