package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiyp extends evsn implements evui {
    public static final eiyp a;
    private static volatile evuo e;
    public int b;
    public eizo c;
    public evtg d = emptyProtobufList();

    static {
        eiyp eiypVar = new eiyp();
        a = eiypVar;
        evsn.registerDefaultInstance(eiyp.class, eiypVar);
    }

    private eiyp() {
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001\u001b\u0004ဉ\u0000", new Object[]{"b", "d", eiyl.class, "c"});
        }
        if (iOrdinal == 3) {
            return new eiyp();
        }
        if (iOrdinal == 4) {
            return new eiym();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eiyp.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
