package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evmx extends evsn implements evui {
    public static final evmx a;
    private static volatile evuo i;
    public int b;
    public Object d;
    public boolean e;
    public int f;
    public boolean g;
    public int c = 0;
    public evsx h = emptyIntList();

    static {
        evmx evmxVar = new evmx();
        a = evmxVar;
        evsn.registerDefaultInstance(evmx.class, evmxVar);
    }

    private evmx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\n\u0001\u0001\u0001\r\n\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0007ဇ\u0000\b᠌\u0001\tဇ\u0002\u000b\u0016\r<\u0000", new Object[]{"d", "c", "b", evmf.class, evms.class, evnk.class, evng.class, evnb.class, "e", "f", evmv.a, "g", "h", evmh.class});
        }
        if (iOrdinal == 3) {
            return new evmx();
        }
        if (iOrdinal == 4) {
            return new evmt();
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
        synchronized (evmx.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
