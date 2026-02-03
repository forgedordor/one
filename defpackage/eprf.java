package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eprf extends evsn implements evui {
    public static final eprf a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        eprf eprfVar = new eprf();
        a = eprfVar;
        evsn.registerDefaultInstance(eprf.class, eprfVar);
    }

    private eprf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0000\u0004\u0007\u0003\u0000\u0000\u0000\u0004?\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"c", "b", epsx.class, epsx.class});
        }
        if (iOrdinal == 3) {
            return new eprf();
        }
        if (iOrdinal == 4) {
            return new epre();
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
        synchronized (eprf.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
