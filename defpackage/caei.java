package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caei extends evsn implements evui {
    public static final evsy a = new caeb();
    public static final caei b;
    private static volatile evuo j;
    public int c;
    public int d;
    public int e;
    public int f = 1;
    public evsx g = emptyIntList();
    public int h;
    public evvp i;

    static {
        caei caeiVar = new caei();
        b = caeiVar;
        evsn.registerDefaultInstance(caei.class, caeiVar);
    }

    private caei() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = caef.a;
            return newMessageInfo(b, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ࠞ\u0005᠌\u0003\u0006ဉ\u0004", new Object[]{"c", "d", "e", evsvVar, "f", caeh.a, "g", evsvVar, "h", caed.a, "i"});
        }
        if (iOrdinal == 3) {
            return new caei();
        }
        if (iOrdinal == 4) {
            return new caec();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (caei.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
