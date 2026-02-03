package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evfo extends evsn implements evui {
    public static final evfo a;
    private static volatile evuo d;
    public int b;
    public String c = "";

    static {
        evfo evfoVar = new evfo();
        a = evfoVar;
        evsn.registerDefaultInstance(evfo.class, evfoVar);
    }

    private evfo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new evfo();
        }
        if (iOrdinal == 4) {
            return new evfn();
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
        synchronized (evfo.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
