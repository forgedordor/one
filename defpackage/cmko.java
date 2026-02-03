package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmko extends evsn implements evui {
    public static final cmko a;
    private static volatile evuo f;
    public int b;
    public int c;
    public evsx d = emptyIntList();
    public int e;

    static {
        cmko cmkoVar = new cmko();
        a = cmkoVar;
        evsn.registerDefaultInstance(cmko.class, cmkoVar);
    }

    private cmko() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002'\u0003ဌ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new cmko();
        }
        if (iOrdinal == 4) {
            return new cmkn();
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
        synchronized (cmko.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
