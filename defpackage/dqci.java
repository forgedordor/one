package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqci extends evsn implements evui {
    public static final dqci a;
    private static volatile evuo d;
    public dqco b;
    public int c;
    private int e;

    static {
        dqci dqciVar = new dqci();
        a = dqciVar;
        evsn.registerDefaultInstance(dqci.class, dqciVar);
    }

    private dqci() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new dqci();
        }
        if (iOrdinal == 4) {
            return new dqch();
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
        synchronized (dqci.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
