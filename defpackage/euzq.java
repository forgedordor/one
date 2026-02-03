package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euzq extends evsn implements evui {
    public static final euzq a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        euzq euzqVar = new euzq();
        a = euzqVar;
        evsn.registerDefaultInstance(euzq.class, euzqVar);
    }

    private euzq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", erxs.class, erxm.class, erxk.class, erxq.class, erxo.class});
        }
        if (iOrdinal == 3) {
            return new euzq();
        }
        if (iOrdinal == 4) {
            return new euzp();
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
        synchronized (euzq.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
