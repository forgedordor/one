package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bycq extends evsn implements evui {
    public static final bycq a;
    private static volatile evuo d;
    public int b;
    public evtg c = evsn.emptyProtobufList();

    static {
        bycq bycqVar = new bycq();
        a = bycqVar;
        evsn.registerDefaultInstance(bycq.class, bycqVar);
    }

    private bycq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u0004\u0003Ț", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new bycq();
        }
        if (iOrdinal == 4) {
            return new bycp();
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
        synchronized (bycq.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
