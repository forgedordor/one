package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eusi extends evsn implements evui {
    public static final eusi a;
    private static volatile evuo i;
    public int b;
    public int c;
    public double d;
    public int e;
    public int f;
    public int g;
    public evvp h;

    static {
        eusi eusiVar = new eusi();
        a = eusiVar;
        evsn.registerDefaultInstance(eusi.class, eusiVar);
    }

    private eusi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002\u0000\u0003\u0004\u0004င\u0000\u0005င\u0001\u0006ဉ\u0002", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new eusi();
        }
        if (iOrdinal == 4) {
            return new eush();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eusi.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
