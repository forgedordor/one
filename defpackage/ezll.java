package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezll extends evsn implements evui {
    public static final ezll a;
    private static volatile evuo i;
    public int b;
    public ezpp c;
    public ezol d;
    public long e;
    public int f;
    public evqs g = evqs.b;
    public ezlj h;

    static {
        ezll ezllVar = new ezll();
        a = ezllVar;
        evsn.registerDefaultInstance(ezll.class, ezllVar);
    }

    private ezll() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0010\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0002\u0004\n\rဉ\u0002\u0010\f", new Object[]{"b", "c", "d", "e", "g", "h", "f"});
        }
        if (iOrdinal == 3) {
            return new ezll();
        }
        if (iOrdinal == 4) {
            return new ezlk();
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
        synchronized (ezll.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
