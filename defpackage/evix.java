package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evix extends evsn implements evui {
    public static final evix a;
    private static volatile evuo f;
    public int b;
    public int c = 0;
    public Object d;
    public boolean e;

    static {
        evix evixVar = new evix();
        a = evixVar;
        evsn.registerDefaultInstance(evix.class, evixVar);
    }

    private evix() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"d", "c", "b", "e", evjc.class, evip.class, evjo.class, evij.class});
        }
        if (iOrdinal == 3) {
            return new evix();
        }
        if (iOrdinal == 4) {
            return new eviv();
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
        synchronized (evix.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
