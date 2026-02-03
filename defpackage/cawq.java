package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cawq extends evsn implements evui {
    public static final cawq a;
    private static volatile evuo d;
    public evtg b = evsn.emptyProtobufList();
    public boolean c;

    static {
        cawq cawqVar = new cawq();
        a = cawqVar;
        evsn.registerDefaultInstance(cawq.class, cawqVar);
    }

    private cawq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002\u0007", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new cawq();
        }
        if (iOrdinal == 4) {
            return new cawp();
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
        synchronized (cawq.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
