package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eynp extends evsn implements evui {
    public static final eynp a;
    private static volatile evuo e;
    public eyph b;
    public evtg c = emptyProtobufList();
    public eynr d;
    private int f;

    static {
        eynp eynpVar = new eynp();
        a = eynpVar;
        evsn.registerDefaultInstance(eynp.class, eynpVar);
    }

    private eynp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"f", "b", "c", eynn.class, "d"});
        }
        if (iOrdinal == 3) {
            return new eynp();
        }
        if (iOrdinal == 4) {
            return new eyno();
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
        synchronized (eynp.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
