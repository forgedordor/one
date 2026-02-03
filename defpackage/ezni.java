package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezni extends evsn implements evui {
    public static final ezni a;
    private static volatile evuo e;
    public int b;
    public ezpp c;
    public int d;

    static {
        ezni ezniVar = new ezni();
        a = ezniVar;
        evsn.registerDefaultInstance(ezni.class, ezniVar);
    }

    private ezni() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0004\f", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ezni();
        }
        if (iOrdinal == 4) {
            return new eznh();
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
        synchronized (ezni.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
