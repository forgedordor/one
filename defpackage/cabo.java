package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cabo extends evsn implements evui {
    public static final cabo a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d = 1;
    public int e;

    static {
        cabo caboVar = new cabo();
        a = caboVar;
        evsn.registerDefaultInstance(cabo.class, caboVar);
    }

    private cabo() {
        emptyIntList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001င\u0000\u0003᠌\u0002\u0007᠌\u0005", new Object[]{"b", "c", "d", cabn.a, "e", cpyn.a});
        }
        if (iOrdinal == 3) {
            return new cabo();
        }
        if (iOrdinal == 4) {
            return new cabm();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cabo.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
