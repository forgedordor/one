package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqjq extends evsn implements evui {
    public static final eqjq a;
    private static volatile evuo f;
    public String b = "";
    public String c = "";
    public int d;
    public int e;

    static {
        eqjq eqjqVar = new eqjq();
        a = eqjqVar;
        evsn.registerDefaultInstance(eqjq.class, eqjqVar);
    }

    private eqjq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0004", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eqjq();
        }
        if (iOrdinal == 4) {
            return new eqjp();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eqjq.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
