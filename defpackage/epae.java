package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epae extends evsn implements evui {
    public static final epae a;
    private static volatile evuo d;
    public evtg b = emptyProtobufList();
    public String c = "";

    static {
        epae epaeVar = new epae();
        a = epaeVar;
        evsn.registerDefaultInstance(epae.class, epaeVar);
    }

    private epae() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001b\u0003Ȉ", new Object[]{"b", eowd.class, "c"});
        }
        if (iOrdinal == 3) {
            return new epae();
        }
        if (iOrdinal == 4) {
            return new epad();
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
        synchronized (epae.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
