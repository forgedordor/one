package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezmd extends evsn implements evui {
    public static final ezmd a;
    private static volatile evuo e;
    public int b;
    public ezol c;
    public long d;

    static {
        ezmd ezmdVar = new ezmd();
        a = ezmdVar;
        evsn.registerDefaultInstance(ezmd.class, ezmdVar);
    }

    private ezmd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0002", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ezmd();
        }
        if (iOrdinal == 4) {
            return new ezmc();
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
        synchronized (ezmd.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
