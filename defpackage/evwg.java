package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evwg extends evsn implements evui {
    public static final evwg a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        evwg evwgVar = new evwg();
        a = evwgVar;
        evsn.registerDefaultInstance(evwg.class, evwgVar);
    }

    private evwg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"c", "b", evvl.class, evtu.class});
        }
        if (iOrdinal == 3) {
            return new evwg();
        }
        if (iOrdinal == 4) {
            return new evwf();
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
        synchronized (evwg.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
