package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epua extends evsn implements evui {
    public static final epua a;
    private static volatile evuo d;
    public evqs b = evqs.b;
    public int c;
    private int e;

    static {
        epua epuaVar = new epua();
        a = epuaVar;
        evsn.registerDefaultInstance(epua.class, epuaVar);
    }

    private epua() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ည\u0000\u0003ဌ\u0002", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new epua();
        }
        if (iOrdinal == 4) {
            return new eptz();
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
        synchronized (epua.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
