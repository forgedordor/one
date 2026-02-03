package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eucq extends evsn implements evui {
    public static final eucq a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        eucq eucqVar = new eucq();
        a = eucqVar;
        evsn.registerDefaultInstance(eucq.class, eucqVar);
    }

    private eucq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", eucp.class, eucn.class});
        }
        if (iOrdinal == 3) {
            return new eucq();
        }
        if (iOrdinal == 4) {
            return new eucl();
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
        synchronized (eucq.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
