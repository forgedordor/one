package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezea extends evsn implements evui {
    public static final ezea a;
    private static volatile evuo d;
    public int b;
    public float c;

    static {
        ezea ezeaVar = new ezea();
        a = ezeaVar;
        evsn.registerDefaultInstance(ezea.class, ezeaVar);
    }

    private ezea() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0001", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ezea();
        }
        if (iOrdinal == 4) {
            return new ezdy();
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
        synchronized (ezea.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
