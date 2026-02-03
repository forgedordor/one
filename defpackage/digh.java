package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class digh extends evsn implements evui {
    public static final digh a;
    private static volatile evuo g;
    public int b;
    public etse c;
    public etsc d;
    public evvp e;
    public evvp f;

    static {
        digh dighVar = new digh();
        a = dighVar;
        evsn.registerDefaultInstance(digh.class, dighVar);
    }

    private digh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new digh();
        }
        if (iOrdinal == 4) {
            return new digg();
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
        synchronized (digh.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
