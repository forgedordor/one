package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eypj extends evsn implements evui {
    public static final eypj a;
    private static volatile evuo d;
    public int b;
    public evqe c;
    private int e;

    static {
        eypj eypjVar = new eypj();
        a = eypjVar;
        evsn.registerDefaultInstance(eypj.class, eypjVar);
    }

    private eypj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new eypj();
        }
        if (iOrdinal == 4) {
            return new eypi();
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
        synchronized (eypj.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
