package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etyr extends evsn implements evui {
    public static final etyr a;
    private static volatile evuo f;
    public evtg b = evsn.emptyProtobufList();
    public evtg c = evsn.emptyProtobufList();
    public evtg d = evsn.emptyProtobufList();
    public evtg e = evsn.emptyProtobufList();

    static {
        etyr etyrVar = new etyr();
        a = etyrVar;
        evsn.registerDefaultInstance(etyr.class, etyrVar);
    }

    private etyr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0004\u0007\u0004\u0000\u0004\u0000\u0004Ț\u0005Ț\u0006Ț\u0007Ț", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new etyr();
        }
        if (iOrdinal == 4) {
            return new etyq();
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
        synchronized (etyr.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
