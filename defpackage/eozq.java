package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eozq extends evsn implements evui {
    public static final eozq a;
    private static volatile evuo d;
    public String b = "";
    public epes c;
    private int e;

    static {
        eozq eozqVar = new eozq();
        a = eozqVar;
        evsn.registerDefaultInstance(eozq.class, eozqVar);
    }

    private eozq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003ဉ\u0000", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new eozq();
        }
        if (iOrdinal == 4) {
            return new eozp();
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
        synchronized (eozq.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
