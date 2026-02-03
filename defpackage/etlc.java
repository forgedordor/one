package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etlc extends evsn implements evui {
    public static final etlc a;
    private static volatile evuo f;
    public int b;
    public evtg c = emptyProtobufList();
    public int d;
    public int e;

    static {
        etlc etlcVar = new etlc();
        a = etlcVar;
        evsn.registerDefaultInstance(etlc.class, etlcVar);
    }

    private etlc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002င\u0000\u0003င\u0001\u0004\u001b", new Object[]{"b", "d", "e", "c", etkv.class});
        }
        if (iOrdinal == 3) {
            return new etlc();
        }
        if (iOrdinal == 4) {
            return new etlb();
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
        synchronized (etlc.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
