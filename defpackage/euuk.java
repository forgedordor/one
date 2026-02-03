package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euuk extends evsn implements evui {
    public static final euuk a;
    private static volatile evuo d;
    public evrj b;
    public int c;
    private int e;

    static {
        euuk euukVar = new euuk();
        a = euukVar;
        evsn.registerDefaultInstance(euuk.class, euukVar);
    }

    private euuk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new euuk();
        }
        if (iOrdinal == 4) {
            return new euuj();
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
        synchronized (euuk.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
