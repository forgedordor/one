package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eznq extends evsn implements evui {
    public static final eznq a;
    private static volatile evuo f;
    public int b;
    public ezpr c;
    public ezns d;
    public evqs e = evqs.b;

    static {
        eznq eznqVar = new eznq();
        a = eznqVar;
        evsn.registerDefaultInstance(eznq.class, eznqVar);
    }

    private eznq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0003\b\u0003\u0000\u0000\u0000\u0003ဉ\u0000\u0004ဉ\u0001\b\n", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eznq();
        }
        if (iOrdinal == 4) {
            return new eznp();
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
        synchronized (eznq.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
