package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evkw extends evsn implements evui {
    public static final evsy a = new evku();
    public static final evkw b;
    private static volatile evuo g;
    public int c;
    public eybm d;
    public eybm e;
    public evsx f = emptyIntList();

    static {
        evkw evkwVar = new evkw();
        b = evkwVar;
        evsn.registerDefaultInstance(evkw.class, evkwVar);
    }

    private evkw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ࠬ", new Object[]{"c", "d", "e", "f", eybd.a});
        }
        if (iOrdinal == 3) {
            return new evkw();
        }
        if (iOrdinal == 4) {
            return new evkv();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (evkw.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
