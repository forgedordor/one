package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiay extends evsn implements evui {
    public static final eiay a;
    private static volatile evuo g;
    public int b;
    public long e;
    public long c = -1;
    public evtg d = emptyProtobufList();
    public evsx f = emptyIntList();

    static {
        eiay eiayVar = new eiay();
        a = eiayVar;
        evsn.registerDefaultInstance(eiay.class, eiayVar);
    }

    private eiay() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဂ\u0000\u0002\u001b\u0003ဂ\u0001\u0004\u0016", new Object[]{"b", "c", "d", eiaw.class, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new eiay();
        }
        if (iOrdinal == 4) {
            return new eiax();
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
        synchronized (eiay.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
