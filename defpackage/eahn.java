package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eahn extends evsn implements evui {
    public static final eahn a;
    private static volatile evuo d;
    public int b;
    public evtg c = emptyProtobufList();
    private int e;

    static {
        eahn eahnVar = new eahn();
        a = eahnVar;
        evsn.registerDefaultInstance(eahn.class, eahnVar);
    }

    private eahn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"e", "b", "c", eaib.class});
        }
        if (iOrdinal == 3) {
            return new eahn();
        }
        if (iOrdinal == 4) {
            return new eahk();
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
        synchronized (eahn.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
