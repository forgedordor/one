package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezqr extends evsn implements evui {
    public static final ezqr a;
    private static volatile evuo g;
    public int b;
    public ezol c;
    public long d;
    public ezrp e;
    public ezot f;

    static {
        ezqr ezqrVar = new ezqr();
        a = ezqrVar;
        evsn.registerDefaultInstance(ezqr.class, ezqrVar);
    }

    private ezqr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0002\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ezqr();
        }
        if (iOrdinal == 4) {
            return new ezqq();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezqr.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
