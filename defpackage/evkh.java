package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evkh extends evsn implements evui {
    public static final evkh a;
    private static volatile evuo d;
    public int b;
    public int c;
    private int e;

    static {
        evkh evkhVar = new evkh();
        a = evkhVar;
        evsn.registerDefaultInstance(evkh.class, evkhVar);
    }

    private evkh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0004᠌\u0003", new Object[]{"e", "b", evkf.a, "c", evjr.a});
        }
        if (iOrdinal == 3) {
            return new evkh();
        }
        if (iOrdinal == 4) {
            return new evke();
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
        synchronized (evkh.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
