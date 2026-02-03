package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evcx extends evsn implements evui {
    public static final evcx a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        evcx evcxVar = new evcx();
        a = evcxVar;
        evsn.registerDefaultInstance(evcx.class, evcxVar);
    }

    private evcx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0001\u0000\u0001\n\t\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"c", "b", evdc.class, evdi.class, evbv.class, eveb.class, evct.class, eveo.class, evdo.class, evdk.class, evdm.class});
        }
        if (iOrdinal == 3) {
            return new evcx();
        }
        if (iOrdinal == 4) {
            return new evcw();
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
        synchronized (evcx.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
