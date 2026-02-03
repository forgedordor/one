package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezlr extends evsn implements evui {
    public static final ezlr a;
    private static volatile evuo h;
    public int b;
    public ezpr c;
    public boolean d;
    public ezns e;
    public ezpj f;
    public evqs g = evqs.b;

    static {
        ezlr ezlrVar = new ezlr();
        a = ezlrVar;
        evsn.registerDefaultInstance(ezlr.class, ezlrVar);
    }

    private ezlr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\r\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0005ဉ\u0001\tဉ\u0003\r\n", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new ezlr();
        }
        if (iOrdinal == 4) {
            return new ezlq();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezlr.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
