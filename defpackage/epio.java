package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epio extends evsn implements evui {
    public static final epio a;
    private static volatile evuo d;
    public evtg b = emptyProtobufList();
    public int c;

    static {
        epio epioVar = new epio();
        a = epioVar;
        evsn.registerDefaultInstance(epio.class, epioVar);
    }

    private epio() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\f", new Object[]{"b", ezgi.class, "c"});
        }
        if (iOrdinal == 3) {
            return new epio();
        }
        if (iOrdinal == 4) {
            return new epin();
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
        synchronized (epio.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
