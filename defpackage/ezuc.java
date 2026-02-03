package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezuc extends evsn implements evui {
    public static final ezuc a;
    private static volatile evuo e;
    public int b;
    public String c = "";
    public int d;
    private int f;
    private ezpp g;

    static {
        ezuc ezucVar = new ezuc();
        a = ezucVar;
        evsn.registerDefaultInstance(ezuc.class, ezucVar);
    }

    private ezuc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0004Ȉ\u0005\f", new Object[]{"f", "g", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ezuc();
        }
        if (iOrdinal == 4) {
            return new ezub();
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
        synchronized (ezuc.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
