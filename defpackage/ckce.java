package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckce extends evsn implements evui {
    public static final ckce a;
    public static final evtb f = new evtb(ckcc.f, ckcc.PER_SIM_TOGGLE_STATE_UNSPECIFIED);
    private static volatile evuo g;
    public int b;
    public evub c = evub.a;
    public ckbv d;
    public int e;

    static {
        ckce ckceVar = new ckce();
        a = ckceVar;
        evsn.registerDefaultInstance(ckce.class, ckceVar);
    }

    private ckce() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0001\u0000\u0000\u0002࠲\u0003ဉ\u0000\u0004᠌\u0001", new Object[]{"b", "c", ckcd.a, ckcb.a, "d", "e", ckby.a});
        }
        if (iOrdinal == 3) {
            return new ckce();
        }
        if (iOrdinal == 4) {
            return new ckbx();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ckce.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
