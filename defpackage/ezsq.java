package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezsq extends evsn implements evui {
    public static final ezsq a;
    private static volatile evuo d;
    public int b;
    public String c = "";

    static {
        ezsq ezsqVar = new ezsq();
        a = ezsqVar;
        evsn.registerDefaultInstance(ezsq.class, ezsqVar);
    }

    private ezsq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0002\u0005\u0002\u0000\u0000\u0000\u0002\f\u0005Ȉ", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ezsq();
        }
        if (iOrdinal == 4) {
            return new ezsp();
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
        synchronized (ezsq.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
