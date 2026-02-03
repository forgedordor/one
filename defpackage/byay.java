package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byay extends evsn implements evui {
    public static final byay a;
    private static volatile evuo h;
    public int b;
    public evtg c = evsn.emptyProtobufList();
    public long d;
    public long e;
    public long f;
    public int g;

    static {
        byay byayVar = new byay();
        a = byayVar;
        evsn.registerDefaultInstance(byay.class, byayVar);
    }

    private byay() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0004\u0002Ț\u0003\u0002\u0004\u0002\u0005\u0002\u0006\f", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new byay();
        }
        if (iOrdinal == 4) {
            return new byax();
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
        synchronized (byay.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
