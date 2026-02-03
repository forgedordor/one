package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgfq extends evsn implements evui {
    public static final cgfq a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        cgfq cgfqVar = new cgfq();
        a = cgfqVar;
        evsn.registerDefaultInstance(cgfq.class, cgfqVar);
    }

    private cgfq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", cgfp.class});
        }
        if (iOrdinal == 3) {
            return new cgfq();
        }
        if (iOrdinal == 4) {
            return new cgfn();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cgfq.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
