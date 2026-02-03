package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enkh extends evsn implements evui {
    public static final enkh a;
    private static volatile evuo f;
    public int b;
    public int c = 0;
    public Object d;
    public long e;

    static {
        enkh enkhVar = new enkh();
        a = enkhVar;
        evsn.registerDefaultInstance(enkh.class, enkhVar);
    }

    private enkh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0001\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001<\u0000\u0003ဂ\u0000", new Object[]{"d", "c", "b", enkm.class, "e"});
        }
        if (iOrdinal == 3) {
            return new enkh();
        }
        if (iOrdinal == 4) {
            return new enkg();
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
        synchronized (enkh.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
